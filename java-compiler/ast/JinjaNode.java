import visitor.ASTVisitor;

public class JinjaNode extends ASTNode {

    private String expression;

    public JinjaNode(String expression, int lineNumber) {
        super("Jinja2", lineNumber);
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitJinja(this);
    }
}
