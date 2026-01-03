package visitor;

import antlr.WebParser;
import antlr.WebParserBaseVisitor;
import antlr.SymbolTable;
import antlr.nodes.*;
import visitor.web.JinjaLogicVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyWebVisitor extends WebParserBaseVisitor<Node> {
    private final SymbolTable st;
    private final JinjaLogicVisitor jinjaVisitor;

    public MyWebVisitor(SymbolTable st) {
        this.st = st;
        this.jinjaVisitor = new JinjaLogicVisitor(this, st);
    }

    @Override
    public Node visitTemplate(WebParser.TemplateContext ctx) {
        Node root = new Node("WEB_DOCUMENT", ctx.getStart().getLine()) {
            @Override public void print(int i) {
                printPadding(i);
                System.out.println("└── Web Page Root [Integrated AST]");
                for (Node c : children) c.print(i + 1);
            }
        };
        for (int i = 0; i < ctx.getChildCount(); i++) {
            Node res = visit(ctx.getChild(i));
            if (res != null) root.addChild(res);
        }
        return root;
    }

    @Override
    public Node visitElement(WebParser.ElementContext ctx) {
        String tag = ctx.HTML_ID(0).getText();
        HtmlElementNode node = new HtmlElementNode(ctx.getStart().getLine(), tag);

        ctx.attribute().forEach(attr -> {
            String name = attr.HTML_ID().getText();
            String val = "true"; // القيمة الافتراضية
            if (attr.ATTR_VALUE() != null) {
                val = attr.ATTR_VALUE().getText().replace("\"", "").replace("'", "");
            }
            node.attributes.put(name, val);

            if (name.equals("class")) {
                for (String c : val.split("\\s+")) {
                    if (!c.isEmpty() && !c.contains("{{") && !st.isCssDefined(c)) {
                        System.out.println("[Warning] Line " + ctx.getStart().getLine() + ": CSS class '" + c + "' undefined.");
                    }
                }
            }
        });

        // زيارة المحتوى وإضافته كأبناء للتاق
        if (ctx.content() != null) {
            Node contentRes = visit(ctx.content());
            if (contentRes != null && contentRes.children != null) {
                for (Node child : contentRes.children) node.addChild(child);
            }
        }
        return node;
    }

    @Override public Node visitIfStmt(WebParser.IfStmtContext ctx) { return jinjaVisitor.handleIf(ctx); }
    @Override public Node visitForLoop(WebParser.ForLoopContext ctx) { return jinjaVisitor.handleFor(ctx); }

    @Override
    public Node visitJinjaElement(WebParser.JinjaElementContext ctx) {
        if (ctx.variable() != null) return new JinjaLogicNode(ctx.getStart().getLine(), "JINJA_EXPR", ctx.variable().getText());
        return visitChildren(ctx);
    }

    @Override public Node visitContent(WebParser.ContentContext ctx) {
        Node col = new Node("COL", 0) { @Override public void print(int i) {} };
        for (int i = 0; i < ctx.getChildCount(); i++) {
            Node r = visit(ctx.getChild(i));
            if (r != null) col.addChild(r);
        }
        return col;
    }

    @Override public Node visitTextNode(WebParser.TextNodeContext ctx) { return new TextNode(ctx.getStart().getLine(), ctx.getText()); }
    @Override public Node visitTerminal(TerminalNode node) { return null; }
}