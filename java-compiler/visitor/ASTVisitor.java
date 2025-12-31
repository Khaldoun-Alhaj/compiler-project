package visitor;

import ast.*;

public interface ASTVisitor<T> {

    T visitProgram(ProgramNode node);

    T visitHTML(HTMLNode node);
    T visitCSS(CSSNode node);
    T visitPython(PythonNode node);
    T visitJinja(JinjaNode node);
}
