package antlr.nodes;
public class JinjaLogicNode extends Node {
    public String logic;
    public JinjaLogicNode(int line, String type, String logic) { super(type, line); this.logic = logic; }
    @Override public void print(int indent) { printPadding(indent); System.out.println("└── " + nodeName + ": " + logic + " [Line: " + lineNumber + "]"); for (Node c : children) c.print(indent + 1); }
}