package visitor;

import antlr.PythonParser;
import antlr.PythonParserBaseVisitor;
import antlr.SymbolTable;
import antlr.nodes.*;
import visitor.python.PythonExpressionVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyPythonVisitor extends PythonParserBaseVisitor<Node> {
    private final SymbolTable st;
    private final PythonExpressionVisitor exprVisitor;

    public MyPythonVisitor(SymbolTable st) {
        this.st = st;
        this.exprVisitor = new PythonExpressionVisitor(this, st);
    }

    @Override
    public Node visitParse(PythonParser.ParseContext ctx) {
        Node root = new Node("PYTHON_ROOT", ctx.getStart().getLine()) {
            @Override public void print(int i) {
                System.out.println("└── Python Backend Analysis [Line: " + lineNumber + "]");
                for (Node c : children) c.print(i + 1);
            }
        };
        for (ParseTree child : ctx.children) {
            Node n = visit(child);
            if (n != null) root.addChild(n);
        }
        return root;
    }

    @Override
    public Node visitAssignment(PythonParser.AssignmentContext ctx) {
        if (ctx == null) return null;

        // الحل الذكي: نأخذ النص قبل أي قوس [ لضمان تخزين اسم المتغير الصافي
        String rawName = ctx.expression(0).getText();
        String varName = rawName.split("\\[")[0].trim();

        st.define(varName, "PYTHON_VARIABLE");

        Node node = new Node("ASSIGN", ctx.getStart().getLine()) {
            @Override public void print(int i) {
                printPadding(i);
                System.out.println("└── Var: " + varName + " [Line: " + lineNumber + "]");
                for (Node c : children) c.print(i + 1);
            }
        };

        if (ctx.expression(1) != null) {
            node.addChild(visit(ctx.expression(1)));
        }
        return node;
    }

    @Override
    public Node visitRouteDefinition(PythonParser.RouteDefinitionContext ctx) {
        PythonRouteNode routeNode = new PythonRouteNode(ctx.getStart().getLine(), ctx.DECORATOR().getText(), ctx.ID().getText());
        if (ctx.statementBlock() != null) {
            Node res = visit(ctx.statementBlock());
            if (res != null && res.children != null) {
                for (Node child : res.children) routeNode.addChild(child);
            }
        }
        return routeNode;
    }

    // --- دعم التسلسل (Trailers) ---
    @Override
    public Node visitPrimary(PythonParser.PrimaryContext ctx) {
        Node atomNode = visit(ctx.atom());
        if (ctx.trailers() != null) {
            for (ParseTree t : ctx.trailers().children) {
                Node trailer = visit(t);
                if (trailer != null) atomNode.addChild(trailer);
            }
        }
        return atomNode;
    }

    @Override public Node visitCallTrailer(PythonParser.CallTrailerContext ctx) {
        return exprVisitor.handleCall(ctx);
    }

    @Override public Node visitIndexTrailer(PythonParser.IndexTrailerContext ctx) {
        Node node = new Node("INDEX_ACCESS", ctx.getStart().getLine()) {
            @Override public void print(int i) {
                printPadding(i); System.out.println("└── [Access Index]");
                for (Node c : children) c.print(i + 1);
            }
        };
        node.addChild(visit(ctx.expression()));
        return node;
    }

    @Override public Node visitAttrTrailer(PythonParser.AttrTrailerContext ctx) {
        return new Node("ATTR", ctx.getStart().getLine()) {
            @Override public void print(int i) { printPadding(i); System.out.println("└── Property: ." + ctx.ID().getText()); }
        };
    }

    // --- بقية التوابع المنطقية ---
    @Override public Node visitIfStmt(PythonParser.IfStmtContext ctx) {
        Node ifNode = new Node("IF_STMT", ctx.getStart().getLine()) {
            @Override public void print(int i) { printPadding(i); System.out.println("└── IF Block [Line: " + lineNumber + "]"); for (Node c : children) c.print(i + 1); }
        };
        ifNode.addChild(visit(ctx.expression(0)));
        Node body = visit(ctx.statementBlock(0));
        if (body != null) body.children.forEach(ifNode::addChild);
        return ifNode;
    }

    @Override public Node visitAddSub(PythonParser.AddSubContext ctx) { return exprVisitor.handleArithmetic(ctx.getChild(1).getText(), ctx.expression(0), ctx.expression(1), ctx.getStart().getLine()); }
    @Override public Node visitMulDiv(PythonParser.MulDivContext ctx) { return exprVisitor.handleArithmetic(ctx.getChild(1).getText(), ctx.expression(0), ctx.expression(1), ctx.getStart().getLine()); }
    @Override public Node visitComparison(PythonParser.ComparisonContext ctx) { return exprVisitor.handleArithmetic(ctx.getChild(1).getText(), ctx.expression(0), ctx.expression(1), ctx.getStart().getLine()); }

    @Override public Node visitIdLiteral(PythonParser.IdLiteralContext ctx) { return createLeaf("ID", ctx.getText(), ctx.getStart().getLine()); }
    @Override public Node visitNumberLiteral(PythonParser.NumberLiteralContext ctx) { return createLeaf("NUM", ctx.getText(), ctx.getStart().getLine()); }
    @Override public Node visitStringLiteral(PythonParser.StringLiteralContext ctx) { return createLeaf("STR", ctx.getText(), ctx.getStart().getLine()); }
    @Override public Node visitBoolTrue(PythonParser.BoolTrueContext ctx) { return createLeaf("BOOL", "True", ctx.getStart().getLine()); }

    private Node createLeaf(String type, String val, int line) {
        return new Node(type, line) { @Override public void print(int i) { printPadding(i); System.out.println("└── " + val + " [Line: " + lineNumber + "]"); } };
    }

    @Override public Node visitStatementBlock(PythonParser.StatementBlockContext ctx) {
        Node col = new Node("BLOCK", 0) { @Override public void print(int i) {} };
        for (ParseTree c : ctx.children) { Node n = visit(c); if (n != null) col.addChild(n); }
        return col;
    }
    @Override public Node visitTerminal(TerminalNode node) { return null; }
}