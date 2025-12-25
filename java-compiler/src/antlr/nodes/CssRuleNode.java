package antlr.nodes;

public class CssRuleNode extends Node {
    public String selector;

    public CssRuleNode(int line, String selector) {
        super("CSS_RULE", line);
        this.selector = selector;
    }

    @Override
    public void print(int indent) {
        printPadding(indent);
        System.out.println("└── Style Rule: [" + selector + "] [Line: " + lineNumber + "]");
        for (Node child : children) {
            child.print(indent + 1);
        }
    }
}