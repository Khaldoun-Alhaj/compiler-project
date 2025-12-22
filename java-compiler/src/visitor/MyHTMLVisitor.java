// package
package visitor;

// import
import antlr.HTMLParser;
import antlr.HTMLParserBaseVisitor; // لاحظ: استدعينا Visitor وليس Listener
import java.util.List;

public class MyHTMLVisitor extends HTMLParserBaseVisitor<Void> {

    private int indentLevel = 0;

    private void printIndent() {
        for (int i = 0; i < indentLevel; i++) {
            System.out.print("    ");
        }
    }

    @Override
    public Void visitTagElement(HTMLParser.TagElementContext ctx) {
        String tagName = ctx.TAG_NAME(0).getText();

        printIndent();
        System.out.print("Start Tag: <" + tagName + ">");

        printAttributes(ctx.attribute());
        System.out.println();

        indentLevel++;
        visitChildren(ctx);
        indentLevel--;

        printIndent();
        System.out.println("End Tag: </" + tagName + ">");
        return null;
    }

    @Override
    public Void visitEmptyElement(HTMLParser.EmptyElementContext ctx) {
        String tagName = ctx.TAG_NAME().getText();

        printIndent();
        System.out.print("Empty Tag: <" + tagName + "/>");
        printAttributes(ctx.attribute());
        System.out.println();

        return null;
    }

    private void printAttributes(List<HTMLParser.AttributeContext> attributes) {
        if (attributes == null || attributes.isEmpty()) return;

        System.out.print(" [Attributes: ");
        for (HTMLParser.AttributeContext attr : attributes) {
            String name = attr.TAG_NAME().getText();
            String value = attr.ATT_VALUE().getText();
            System.out.print(name + "=" + value + " ");
        }
        System.out.print("]");
    }

    @Override
    public Void visitElement(HTMLParser.ElementContext ctx) {
        if (ctx.HTML_TEXT() != null) {
            String text = ctx.HTML_TEXT().getText().trim();
            if (!text.isEmpty()) {
                printIndent();
                System.out.println("Text Content: \"" + text + "\"");
            }
        }
        return visitChildren(ctx);
    }
}