import java.util.ArrayList;
import java.util.List;
import visitor.ASTVisitor;

public abstract class ASTNode {

    protected String nodeType;
    protected int lineNumber;
    protected List<ASTNode> children;

    public ASTNode(String nodeType, int lineNumber) {
        this.nodeType = nodeType;
        this.lineNumber = lineNumber;
        this.children = new ArrayList<>();
    }

    public void addChild(ASTNode child) {
        children.add(child);
    }

    public List<ASTNode> getChildren() {
        return children;
    }

    public String getNodeType() {
        return nodeType;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    // Polymorphism
    public abstract <T> T accept(ASTVisitor<T> visitor);
}
