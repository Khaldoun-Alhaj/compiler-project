package antlr.nodes;
public class TextNode extends Node {
    public String text;
    public TextNode(int line, String raw) {
        super("TEXT", line); this.text = (raw != null) ? raw.trim() : "";
    }
    @Override public void print(int indent) {
        if (text.isEmpty()) return;
        printPadding(indent);
        System.out.println("└── TEXT: \"" + text + "\" [Line: " + lineNumber + "]");
    }
}