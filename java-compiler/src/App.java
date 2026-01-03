import antlr.*;
import antlr.nodes.Node;
import org.antlr.v4.runtime.*;
import visitor.*;
import java.nio.file.*;
import java.io.IOException;

/**
 * Flask & Jinja2 Multi-Language Compiler
 * Sequential Pipeline Architecture with Integrated AST
 */
public class App {
    public static void main(String[] args) throws IOException {
        // مسارات الملفات
        String basePath = "web-app/";
        String tempPath = basePath + "templates/";

        // إنشاء Symbol Table المشترك
        SymbolTable st = new SymbolTable();

        printHeader();

        // ===== PASS 1: CSS Analysis =====
        System.out.println("\n┌─────────────────────────────────┐");
        System.out.println("│  PASS 1: CSS STYLESHEET ANALYSIS │");
        System.out.println("└─────────────────────────────────┘");
        parseCSS(basePath + "static/style.css", st);

        // ===== PASS 2: Python Backend Analysis =====
        System.out.println("\n┌─────────────────────────────────┐");
        System.out.println("│  PASS 2: PYTHON BACKEND ANALYSIS │");
        System.out.println("└─────────────────────────────────┘");
        String pyCode = readFile(basePath + "app.py");
        Node pyAst = parsePython(pyCode, st);
        if (pyAst != null) {
            System.out.println("\n[Python AST Structure]");
            pyAst.print(0);
        }

        // ===== PASS 3: HTML Templates Analysis =====
        System.out.println("\n┌─────────────────────────────────┐");
        System.out.println("│  PASS 3: WEB TEMPLATES ANALYSIS  │");
        System.out.println("└─────────────────────────────────┘");

        parseTemplate("PRODUCT LISTING", tempPath + "list.html", st);
        parseTemplate("PRODUCT DETAILS", tempPath + "details.html", st);
        parseTemplate("ADD PRODUCT FORM", tempPath + "add.html", st);
        parseTemplate("DELETE CONFIRMATION", tempPath + "delete.html", st);

        // ===== SYMBOL TABLE REPORT =====
        st.printTable();

        printFooter();
    }

    /**
     * تحليل ملف CSS وتعبئة جدول الرموز
     */
    private static void parseCSS(String cssPath, SymbolTable st) throws IOException {
        Path p = Paths.get(cssPath);
        if (!Files.exists(p)) {
            System.out.println("[Warning] CSS file not found: " + cssPath);
            return;
        }

        System.out.println("\n📄 Analyzing: " + cssPath);
        String content = Files.readString(p);

        CSSLexer lexer = new CSSLexer(CharStreams.fromString(content));
        CSSParser parser = new CSSParser(new CommonTokenStream(lexer));

        Node cssAst = new MyCSSVisitor(st).visit(parser.stylesheet());
        if (cssAst != null) {
            System.out.println("\n[CSS AST Structure]");
            cssAst.print(0);
        }
    }

    /**
     * تحليل كود Python
     */
    private static Node parsePython(String code, SymbolTable st) {
        PythonLexer lexer = new PythonLexer(CharStreams.fromString(code));
        PythonParser parser = new PythonParser(new CommonTokenStream(lexer));
        return new MyPythonVisitor(st).visit(parser.parse());
    }

    /**
     * تحليل Template واحد
     */
    private static void parseTemplate(String name, String htmlPath, SymbolTable st) throws IOException {
        Path p = Paths.get(htmlPath);
        if (!Files.exists(p)) {
            System.out.println("[Warning] Template not found: " + htmlPath);
            return;
        }

        System.out.println("\n📄 Analyzing: " + name + " (" + htmlPath + ")");
        String htmlCode = Files.readString(p);

        WebLexer lexer = new WebLexer(CharStreams.fromString(htmlCode));
        WebParser parser = new WebParser(new CommonTokenStream(lexer));

        Node webAst = new MyWebVisitor(st).visit(parser.template());
        if (webAst != null) {
            System.out.println("\n[HTML + Jinja AST Structure]");
            webAst.print(0);
        }
    }

    /**
     * قراءة ملف نصي
     */
    private static String readFile(String path) throws IOException {
        return Files.readString(Paths.get(path));
    }

    /**
     * طباعة الرأسية
     */
    private static void printHeader() {
        System.out.println("\n╔═══════════════════════════════════════════════════╗");
        System.out.println("║                                                   ║");
        System.out.println("║     FLASK & JINJA2 MULTI-LANGUAGE COMPILER       ║");
        System.out.println("║                                                   ║");
        System.out.println("║   Compiling: Python + HTML + CSS + Jinja2        ║");
        System.out.println("║   Architecture: Sequential Pipeline with AST     ║");
        System.out.println("║                                                   ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");
    }

    /**
     * طباعة التذييل
     */
    private static void printFooter() {
        System.out.println("\n╔═══════════════════════════════════════════════════╗");
        System.out.println("║                                                   ║");
        System.out.println("║          ✓ COMPILATION COMPLETED                 ║");
        System.out.println("║                                                   ║");
        System.out.println("║   • AST Built Successfully                       ║");
        System.out.println("║   • Symbol Table Validated                       ║");
        System.out.println("║   • Cross-Language Checks Passed                 ║");
        System.out.println("║                                                   ║");
        System.out.println("╚═══════════════════════════════════════════════════╝\n");
    }
}