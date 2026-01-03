import visitor.ASTVisitor;

public class ProgramNode extends ASTNode {

    public ProgramNode() {
        super("Program", 0);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitProgram(this);
    }
}
