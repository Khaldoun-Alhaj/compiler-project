package antlr.nodes;

public class HtmlElementNode extends Node {
    public String tagName;

    public HtmlElementNode(int line, String tagName) {
        super("HTML_ELEMENT", line);
        this.tagName = tagName;
    }

    @Override
    public void print(int indent) {
        printPadding(indent);
        System.out.println("└── <" + tagName + "> [Node: " + nodeName + ", Line: " + lineNumber + "]");
        for (Node child : children) {
            child.print(indent + 1);
        }
    }
}