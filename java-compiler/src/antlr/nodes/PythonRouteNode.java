package antlr.nodes;
public class PythonRouteNode extends Node {
    public String decorator, functionName;
    public PythonRouteNode(int line, String dec, String fn) { super("PYTHON_ROUTE", line); this.decorator = dec; this.functionName = fn; }
    @Override public void print(int indent) {
        printPadding(indent); System.out.println("└── Flask Route: " + decorator + " [Line: " + lineNumber + "]");
        printPadding(indent + 1); System.out.println("└── Function: " + functionName + "()");
        for (Node child : children) child.print(indent + 2);
    }
}