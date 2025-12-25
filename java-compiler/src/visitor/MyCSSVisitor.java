    package visitor;

    import antlr.CSSParser;
    import antlr.CSSParserBaseVisitor;
    import antlr.nodes.*;

    public class MyCSSVisitor extends CSSParserBaseVisitor<Node> {

        @Override
        public Node visitStylesheet(CSSParser.StylesheetContext ctx) {
            // Create the root node for CSS
            Node root = new CssRuleNode(ctx.getStart().getLine(), "CSS_ROOT");

            // FIX: Added the missing closing parenthesis ')' after ctx.rule()
            if (ctx.rule_() != null) {
                for (CSSParser.RuleContext ruleCtx : ctx.rule_()) {
                    // visit(ruleCtx) will call visitRule and return a Node
                    root.addChild(visit(ruleCtx));
                }
            }
            return root;
        }
        @Override
        public Node visitRule(CSSParser.RuleContext ctx) {
            // Get the selector (e.g., .product-card)
            String selector = ctx.selector().getText();
            CssRuleNode ruleNode = new CssRuleNode(ctx.getStart().getLine(), selector);

            // Visit each declaration (e.g., color: red;)
            for (CSSParser.DeclarationContext declCtx : ctx.declaration()) {
                ruleNode.addChild(visit(declCtx));
            }
            return ruleNode;
        }

        @Override
        public Node visitDeclaration(CSSParser.DeclarationContext ctx) {
            String property = ctx.property().getText();
            // Values can be multiple (e.g., margin: 10px 20px;)
            StringBuilder value = new StringBuilder();
            for (CSSParser.ValueContext valCtx : ctx.value()) {
                value.append(valCtx.getText()).append(" ");
            }

            return new CssDeclarationNode(
                    ctx.getStart().getLine(),
                    property,
                    value.toString().trim()
            );
        }
    }