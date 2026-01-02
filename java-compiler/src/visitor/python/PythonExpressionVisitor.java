package visitor.python;

import antlr.PythonParser;
import antlr.SymbolTable;
import antlr.nodes.*;
import visitor.MyPythonVisitor;
import java.util.stream.Collectors;

public class PythonExpressionVisitor {
    private final MyPythonVisitor main;
    private final SymbolTable st;

    public PythonExpressionVisitor(MyPythonVisitor main, SymbolTable st) {
        this.main = main;
        this.st = st;
    }

    public Node handleArithmetic(String op, PythonParser.ExpressionContext l, PythonParser.ExpressionContext r, int line) {
        Node n = new Node("OP", line) { @Override public void print(int i) { printPadding(i); System.out.println("└── Op: (" + op + ") [Line: " + lineNumber + "]"); for (Node c : children) c.print(i + 1); } };
        n.addChild(main.visit(l)); n.addChild(main.visit(r));
        return n;
    }

    // SENIOR FIX: تعديل البارامتر ليكون CallTrailerContext
    public Node handleCall(PythonParser.CallTrailerContext ctx) {
        PythonParser.PrimaryContext primary = (PythonParser.PrimaryContext) ctx.getParent().getParent();
        String func = primary.atom().getText();

        if (func.equals("render_template") && ctx.argList() != null) {
            ctx.argList().argument().forEach(arg -> {
                // تتبع الأسماء الممرة مثل p=product أو p_title=p_title
                if (arg.ID() != null) {
                    st.passedToTemplate.add(arg.ID().getText());
                } else {
                    // إذا مررنا المتغير مباشرة بدون اسم
                    st.passedToTemplate.add(arg.expression().getText());
                }
            });
        }

        Node n = new Node("CALL", ctx.getStart().getLine()) {
            @Override public void print(int i) {
                printPadding(i);
                System.out.println("└── Call: " + func + "() [Line: " + lineNumber + "]");
                for (Node c : children) c.print(i + 1);
            }
        };
        if (ctx.argList() != null) ctx.argList().argument().forEach(a -> n.addChild(main.visit(a)));
        return n;
    }
}