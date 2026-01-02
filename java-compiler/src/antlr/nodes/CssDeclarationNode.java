package antlr.nodes;
public class CssDeclarationNode extends Node {
    public String property, value;
    public CssDeclarationNode(int line, String p, String v) { super("CSS_DECL", line); this.property = p; this.value = v; }
    @Override public void print(int indent) { printPadding(indent); System.out.println("└── CSS_DECL: " + property + " = " + value + " [Line: " + lineNumber + "]"); }
}