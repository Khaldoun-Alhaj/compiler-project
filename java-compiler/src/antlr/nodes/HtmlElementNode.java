package antlr.nodes;
import java.util.*;
public class HtmlElementNode extends Node {
    public String tagName;
    public Map<String, String> attributes = new LinkedHashMap<>();
    public HtmlElementNode(int line, String tagName) { super("HTML_TAG", line); this.tagName = tagName; }
    @Override public void print(int indent) {
        printPadding(indent);
        String attrString = attributes.isEmpty() ? "" : " " + attributes.toString();
        System.out.println("└── HTML_TAG: <" + tagName + ">" + attrString + " [Line: " + lineNumber + "]");
        for (Node child : children) child.print(indent + 1);
    }
}