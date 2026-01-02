package visitor;

import antlr.CSSParser;
import antlr.CSSParserBaseVisitor;
import antlr.SymbolTable;
import antlr.nodes.*;
import org.antlr.v4.runtime.RuleContext;
import java.util.stream.Collectors;

public class MyCSSVisitor extends CSSParserBaseVisitor<Node> {
    private final SymbolTable st;

    public MyCSSVisitor(SymbolTable st) {
        this.st = st;
    }

    @Override
    public Node visitStylesheet(CSSParser.StylesheetContext ctx) {
        Node root = new Node("CSS_ROOT", ctx.getStart().getLine()) {
            @Override public void print(int i) {
                for (Node c : children) c.print(i);
            }
        };

        if (ctx.css_rule() != null) {
            for (CSSParser.Css_ruleContext ruleCtx : ctx.css_rule()) {
                Node ruleNode = visit(ruleCtx);
                if (ruleNode != null) root.addChild(ruleNode);
            }
        }
        return root;
    }

    @Override
    public Node visitCss_rule(CSSParser.Css_ruleContext ctx) {
        // 1. تجميع المحددات للعرض في الشجرة (بمسافات يدوية لضمان الشكل)
        String treeDisplaySelectors = ctx.selector().stream()
                .map(sel -> sel.selector_part().stream()
                        .map(org.antlr.v4.runtime.RuleContext::getText)
                        .collect(Collectors.joining(" ")))
                .collect(Collectors.joining(", "));

        // 2. الحل الجذري لتعبئة جدول الرموز بدون دمج الكلمات
        if (st != null) {
            for (CSSParser.SelectorContext selCtx : ctx.selector()) {
                // بدلاً من getText() للمحدد كاملاً، نمر على كل جزء فيه بشكل مستقل
                for (CSSParser.Selector_partContext partCtx : selCtx.selector_part()) {
                    String partText = partCtx.getText()
                            .replace(".", "")
                            .replace("#", "")
                            .trim();

                    if (!partText.isEmpty()) {
                        st.defineCss(partText); // سيخزن "card" ثم "img" ثم "id" بشكل منفصل تماماً
                    }
                }
            }
        }

        CssRuleNode ruleNode = new CssRuleNode(ctx.getStart().getLine(), treeDisplaySelectors);
        if (ctx.declaration() != null) {
            for (CSSParser.DeclarationContext declCtx : ctx.declaration()) {
                Node declNode = visit(declCtx);
                if (declNode != null) ruleNode.addChild(declNode);
            }
        }
        return ruleNode;
    }

    @Override
    public Node visitDeclaration(CSSParser.DeclarationContext ctx) {
        String property = ctx.property().getText();
        // تجميع كل القيم (IDENT, NUMBER, LPAREN, etc.) في نص واحد
        String val = ctx.value_list().value().stream()
                .map(org.antlr.v4.runtime.RuleContext::getText)
                .collect(java.util.stream.Collectors.joining(" "));

        return new CssDeclarationNode(ctx.getStart().getLine(), property, val);
    }
}