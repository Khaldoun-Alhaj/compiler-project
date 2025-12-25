package antlr.nodes;

public class PythonRouteNode extends Node {
    public String decorator;
    public String functionName;

    public PythonRouteNode(int line, String decorator, String functionName) {
        super("PYTHON_ROUTE", line);
        this.decorator = decorator;
        this.functionName = functionName;
    }

    @Override
    public void print(int indent) {
        printPadding(indent);
        System.out.println("└── Flask Route: " + decorator + " [Line: " + lineNumber + "]");
        printPadding(indent + 1);
        System.out.println("└── Function: " + functionName + "()");
        for (Node child : children) {
            child.print(indent + 2);
        }
    }
}