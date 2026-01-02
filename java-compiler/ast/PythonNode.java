import visitor.ASTVisitor;

public class PythonNode extends ASTNode {

    private String statement;

    public PythonNode(String statement, int lineNumber) {
        super("Python", lineNumber);
        this.statement = statement;
    }

    public String getStatement() {
        return statement;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitPython(this);
    }
}
