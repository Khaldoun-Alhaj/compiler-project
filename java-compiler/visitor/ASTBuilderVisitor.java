package visitor;

import ast.*;
import grammar.*; // ملفات ANTLR

public class ASTBuilderVisitor extends MiniLangBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitProgram(MiniLangParser.ProgramContext ctx) {
        ProgramNode program = new ProgramNode();

        ctx.children.forEach(child -> {
            ASTNode node = visit(child);
            if (node != null)
                program.addChild(node);
        });

        return program;
    }

    // HTML
    @Override
    public ASTNode visitHtmlElement(MiniLangParser.HtmlElementContext ctx) {
        HTMLNode html = new HTMLNode(
                ctx.TAG_NAME().getText(),
                ctx.start.getLine()
        );
        return html;
    }

    // Jinja
    @Override
    public ASTNode visitJinjaExpr(MiniLangParser.JinjaExprContext ctx) {
        return new JinjaNode(
                ctx.getText(),
                ctx.start.getLine()
        );
    }
}
