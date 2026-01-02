package visitor;

import antlr.HTMLParser;
import antlr.HTMLParserBaseVisitor;
import antlr.SymbolTable;
import antlr.nodes.*;

/**
 * Senior Developer Implementation:
 * This visitor transforms the Parse Tree into a custom AST (Node hierarchy).
 * It also manages scopes in the Symbol Table when encountering Jinja2 loops.
 */
public class MyHTMLVisitor extends HTMLParserBaseVisitor<Node> {

    private SymbolTable symbolTable;

    public MyHTMLVisitor(SymbolTable st) {
        this.symbolTable = st;
    }

    // 1. Visit the Root Document
    @Override
    public Node visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx) {
        // Requirement 2b: Store Line Number and Node Name
        Node root = new HtmlElementNode(ctx.getStart().getLine(), "DOCUMENT_ROOT");

        for (HTMLParser.ElementContext element : ctx.element()) {
            Node child = visit(element);
            if (child != null) {
                root.addChild(child);
            }
        }
        return root;
    }

    // 2. Visit HTML Tags (e.g., <div> ... </div>)
    @Override
    public Node visitTagElement(HTMLParser.TagElementContext ctx) {
        String tagName = ctx.TAG_NAME(0).getText();
        HtmlElementNode node = new HtmlElementNode(ctx.getStart().getLine(), tagName);

        // Traverse inner content (Recursion for AST building)
        if (ctx.content() != null) {
            for (HTMLParser.ElementContext childCtx : ctx.content().element()) {
                node.addChild(visit(childCtx));
            }
        }
        return node;
    }

    // 3. Visit Jinja2 Logic (The "Brain" - Requirement 1 & 4)
    @Override
    public Node visitJinjaElement(HTMLParser.JinjaElementContext ctx) {
        String text = ctx.getText().trim();
        int line = ctx.getStart().getLine();

        if (ctx.JINJA_STMT() != null) {
            // 1. Clean the braces so we only have the logic: "for item in products"
            String cleaned = text.replace("{%", "").replace("%}", "").trim();
            String[] parts = cleaned.split("\\s+");

            // 2. Use .equals() instead of .contains() to avoid the "endfor" trap
            if (parts[0].equals("for")) {
                symbolTable.enterScope();

                // In "for item in products", parts[1] is "item"
                if (parts.length > 1) {
                    String loopVar = parts[1];
                    symbolTable.define(loopVar, "JINJA_LOOP_VARIABLE");
                }
            }
            else if (parts[0].equals("endfor")) {
                symbolTable.exitScope();
            }

            return new JinjaLogicNode(line, "JINJA_STATEMENT", text);
        }

        // Handle Expressions: {{ product.name }}
        else if (ctx.JINJA_EXPR() != null) {
            String varName = text.replace("{{", "").replace("}}", "").trim();

            // Check if the variable exists (Split by '.' for objects like product.name)
            String baseVar = varName.split("\\.")[0];
            String type = symbolTable.lookup(baseVar);

            String validation = (type != null) ? " [Validated]" : " [Semantic Warning: Variable not defined in Python]";

            return new JinjaLogicNode(line, "JINJA_EXPRESSION", text + validation);
        }

        return null;
    }



    // 4. Visit Plain Text and Mixed Elements
    @Override
    public Node visitElement(HTMLParser.ElementContext ctx) {
        // If it's a standard Tag or Jinja element, use default visitor
        if (ctx.tagElement() != null) return visit(ctx.tagElement());
        if (ctx.jinjaElement() != null) return visit(ctx.jinjaElement());
        if (ctx.emptyElement() != null) return visit(ctx.emptyElement());

        // Requirement 2: Create TextNode for raw HTML text
        if (ctx.HTML_TEXT() != null) {
            String text = ctx.HTML_TEXT().getText().trim();
            if (!text.isEmpty()) {
                return new TextNode(ctx.getStart().getLine(), text);
            }
        }
        return null;
    }
}