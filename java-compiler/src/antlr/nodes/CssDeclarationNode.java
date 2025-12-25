package antlr.nodes;

public class CssDeclarationNode extends Node {
    public String property;
    public String value;

    public CssDeclarationNode(int line, String property, String value) {
        super("CSS_DECLARATION", line);
        this.property = property;
        this.value = value;
    }

    @Override
    public void print(int indent) {
        printPadding(indent);
        System.out.println("└── Property: " + property + " = " + value + " [Line: " + lineNumber + "]");
    }
}