package visitor;

import antlr.PythonParser;
import antlr.PythonParserBaseVisitor;
import antlr.SymbolTable;
import antlr.nodes.Node;
import antlr.nodes.PythonRouteNode;
import org.antlr.v4.runtime.tree.ParseTree; // Required for the loop

/**
 * Senior Developer Fix:
 * 1. Changed PythonBaseVisitor to PythonParserBaseVisitor (matches your grammar filename).
 * 2. Replaced 'auto' with 'ParseTree' (Java syntax).
 * 3. Added null check for children.
 */
public class MyPythonVisitor extends PythonParserBaseVisitor<Node> {
    private SymbolTable st;

    public MyPythonVisitor(SymbolTable st) {
        this.st = st;
    }

    @Override
    public Node visitParse(PythonParser.ParseContext ctx) {
        // Build the root node for Python
        Node root = new Node("PYTHON_BACKEND", ctx.getStart().getLine()) {
            @Override
            public void print(int i) {
                printPadding(i);
                System.out.println("└── Python Flask Backend [Line: " + lineNumber + "]");
                for (Node c : children) c.print(i + 1);
            }
        };

        // Java Fix: Use ParseTree instead of auto
        if (ctx.children != null) {
            for (ParseTree childCtx : ctx.children) {
                Node childNode = visit(childCtx);
                if (childNode != null) {
                    root.addChild(childNode);
                }
            }
        }
        return root;
    }

    @Override
    public Node visitAssignment(PythonParser.AssignmentContext ctx) {
        String varName = ctx.ID().getText();

        // Requirement 4: Symbol Table integration
        st.define(varName, "PYTHON_GLOBAL_VARIABLE");

        return new Node("PY_ASSIGN", ctx.getStart().getLine()) {
            @Override
            public void print(int i) {
                printPadding(i);
                System.out.println("└── Define Variable: " + varName);
            }
        };
    }

    @Override
    public Node visitRouteDefinition(PythonParser.RouteDefinitionContext ctx) {
        // Create the custom Route Node we defined earlier
        PythonRouteNode routeNode = new PythonRouteNode(
                ctx.getStart().getLine(),
                ctx.DECORATOR().getText(),
                ctx.ID().getText()
        );

        // Recursively visit the assignments inside the function
        if (ctx.statementBlock() != null) {
            Node body = visit(ctx.statementBlock());
            routeNode.addChild(body);
        }

        return routeNode;
    }
}