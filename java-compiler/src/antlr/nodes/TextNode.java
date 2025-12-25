package antlr.nodes;

public class TextNode extends Node {
    public String text;

    public TextNode(int line, String text) {
        super("PLAIN_TEXT", line);
        this.text = text.trim();
    }

    @Override
    public void print(int indent) {
        if (text.isEmpty()) return; // Don't print empty whitespace lines
        printPadding(indent);
        System.out.println("└── \"" + text + "\" [Line: " + lineNumber + "]");
    }
}