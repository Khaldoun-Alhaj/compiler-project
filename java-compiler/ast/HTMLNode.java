import visitor.ASTVisitor;

public class HTMLNode extends ASTNode {

    private String tagName;

    public HTMLNode(String tagName, int lineNumber) {
        super("HTML", lineNumber);
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitHTML(this);
    }
}
