import visitor.ASTVisitor;

public class CSSNode extends ASTNode {

    private String selector;

    public CSSNode(String selector, int lineNumber) {
        super("CSS", lineNumber);
        this.selector = selector;
    }

    public String getSelector() {
        return selector;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitCSS(this);
    }
}
