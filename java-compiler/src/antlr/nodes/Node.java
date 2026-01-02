package antlr.nodes;

import java.util.ArrayList;
import java.util.List;

public abstract class Node {
    public String nodeName;
    public int lineNumber;
    public List<Node> children = new ArrayList<>();

    public Node(String nodeName, int lineNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
    }

    public void addChild(Node child) {
        if (child != null) this.children.add(child);
    }

    // Requirement 5: Print function for the whole tree
    public abstract void print(int indent);

    protected void printPadding(int indent) {
        for (int i = 0; i < indent; i++) System.out.print("  ");
    }
}