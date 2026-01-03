package antlr.nodes;
public class CssRuleNode extends Node {
    public String selector;
    public CssRuleNode(int line, String sel) { super("CSS_RULE", line); this.selector = sel; }
    @Override public void print(int indent) { printPadding(indent); System.out.println("└── CSS_RULE: [" + selector + "] [Line: " + lineNumber + "]"); for (Node c : children) c.print(indent + 1); }
}