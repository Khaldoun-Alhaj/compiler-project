package visitor;

import ast.*;

public class PrintVisitor implements ASTVisitor<Void> {

    private int indent = 0;

    private void print(ASTNode node) {
        System.out.println(
                "  ".repeat(indent) +
                        node.getNodeType() +
                        " (line " + node.getLineNumber() + ")"
        );
    }

    @Override
    public Void visitProgram(ProgramNode node) {
        print(node);
        indent++;
        for (ASTNode child : node.getChildren()) {
            child.accept(this);
        }
        indent--;
        return null;
    }

    @Override
    public Void visitHTML(HTMLNode node) {
        print(node);
        return null;
    }

    @Override
    public Void visitCSS(CSSNode node) {
        print(node);
        return null;
    }

    @Override
    public Void visitPython(PythonNode node) {
        print(node);
        return null;
    }

    @Override
    public Void visitJinja(JinjaNode node) {
        print(node);
        return null;
    }
}
