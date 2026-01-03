import visitor.ASTVisitor;

/**
 * ExpressionNode:
 * هذه العقدة تمثل أي تعبير (Expression) في البرنامج.
 * يمكن أن يكون تعبير حسابي، منطقي، أو أي قيمة.
 */
public class ExpressionNode extends ASTNode {

    private String expression; // نص التعبير كما ورد في الكود

    public ExpressionNode(String expression, int lineNumber) {
        super("Expression", lineNumber);
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * طريقة قبول الـ Visitor
     * هذه الطريقة تحقق Polymorphism
     */
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitExpression(this);
    }
}
