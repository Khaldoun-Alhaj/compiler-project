package visitor;

import  antlr.*;

public class MyCSSVisitor extends CSSParserBaseVisitor<Void> {

    @Override
    public Void visitStylesheet(CSSParser.StylesheetContext ctx) {
        System.out.println("Start Processing CSS Stylesheet");
        return visitChildren(ctx); // أكمل الزيارة للقواعد الداخلية
    }

    @Override
    public Void visitRule(CSSParser.RuleContext ctx) {
        // 1. طباعة اسم المحدد (Selector)
        String selector = ctx.selector().getText();
        System.out.println("\nRule for Selector: [" + selector + "]");
        System.out.println("{");

        // 2. المرور على جميع الخصائص داخل هذا المحدد
        for (CSSParser.DeclarationContext decl : ctx.declaration()) {
            String property = decl.property().getText();

            // تجميع القيم المتعددة (مثل: 1px solid red)
            StringBuilder fullValue = new StringBuilder();
            for (CSSParser.ValueContext val : decl.value()) {
                fullValue.append(val.getText()).append(" ");
            }

            // طباعة الخاصية وقيمتها بشكل مرتب
            System.out.println("    " + property + ": " + fullValue.toString().trim() + ";");
        }

        System.out.println("}");
        return null; // لا نحتاج لزيارة الأطفال لأننا طبعناهم يدوياً
    }
}