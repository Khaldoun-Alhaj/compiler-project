package visitor.web;
import antlr.SymbolTable;
import antlr.WebParser;
import antlr.nodes.*;
import visitor.MyWebVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.List;

public class JinjaLogicVisitor {
    private final MyWebVisitor main;
    private final SymbolTable st;
    public JinjaLogicVisitor(MyWebVisitor main, SymbolTable st) { this.main = main; this.st = st; }

    public Node handleIf(WebParser.IfStmtContext ctx) {
        JinjaLogicNode ifNode = new JinjaLogicNode(ctx.getStart().getLine(), "JINJA_IF", "if " + ctx.condition(0).getText());
        Node mainContent = main.visit(ctx.content(0));
        if (mainContent != null) for (Node c : mainContent.children) ifNode.addChild(c);
        List<TerminalNode> elifs = ctx.ELIF();
        for (int i = 0; i < elifs.size(); i++) {
            JinjaLogicNode elifNode = new JinjaLogicNode(elifs.get(i).getSymbol().getLine(), "JINJA_ELIF", "elif " + ctx.condition(i + 1).getText());
            Node c = main.visit(ctx.content(i + 1));
            if (c != null) for (Node child : c.children) elifNode.addChild(child);
            ifNode.addChild(elifNode);
        }
        if (ctx.ELSE() != null) {
            JinjaLogicNode elseNode = new JinjaLogicNode(ctx.ELSE().getSymbol().getLine(), "JINJA_ELSE", "else");
            Node c = main.visit(ctx.content(ctx.content().size() - 1));
            if (c != null) for (Node child : c.children) elseNode.addChild(child);
            ifNode.addChild(elseNode);
        }
        return ifNode;
    }
    public Node handleFor(WebParser.ForLoopContext ctx) {
        String listVar = ctx.ID(1).getText();
        if (st.lookup(listVar) == null) {
            System.out.println("[Error] Line " + ctx.getStart().getLine() + ": variable '" + listVar + "' undefined.");
        }

        st.enterScope();
        st.define(ctx.ID(0).getText(), "JINJA_ITERATOR");

        JinjaLogicNode node = new JinjaLogicNode(ctx.getStart().getLine(), "JINJA_FOR", "for " + ctx.ID(0).getText() + " in " + listVar);

        // التحسين الجوهري: زيارة المحتوى وإضافة الأبناء يدوياً لعقدة الـ For
        Node content = main.visit(ctx.content());
        if (content != null && content.children != null) {
            for (Node child : content.children) {
                node.addChild(child); // ربط المحتوى (مثل البطاقات) داخل حلقة الـ For
            }
        }

        st.exitScope();
        return node;
    }
}