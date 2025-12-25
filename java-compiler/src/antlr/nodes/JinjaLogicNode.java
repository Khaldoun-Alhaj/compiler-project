package antlr.nodes;

public class JinjaLogicNode extends Node {
    public String content;

    public JinjaLogicNode(int line, String type, String content) {
        super(type, line); // type would be "JINJA_STMT" or "JINJA_EXPR"
        this.content = content;
    }

    @Override
    public void print(int indent) {
        printPadding(indent);
        System.out.println("└── " + content + " [Type: " + nodeName + ", Line: " + lineNumber + "]");
        for (Node child : children) {
            child.print(indent + 1);
        }
    }
}