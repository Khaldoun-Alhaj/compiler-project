import antlr.*;
import antlr.nodes.Node;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Senior Software Engineer Implementation:
 * This is the system orchestrator. It executes the multi-stage compilation process:
 * 1. Backend Analysis (Python/Flask)
 * 2. Style Analysis (CSS)
 * 3. Frontend Analysis & Semantic Validation (HTML/Jinja2)
 */
public class App {

    public static void main(String[] args) {
        printHeader();

        // Requirement 4: Shared Symbol Table for cross-language semantic analysis
        SymbolTable symbolTable = new SymbolTable();

        try {
            // STEP 1: Process Python (Backend Logic)
            // This populates the Symbol Table with variables like 'products'
            System.out.println("[STAGE 1] Parsing Python Backend (Flask)...");
            String pythonPath = "web-app/app_details.py";
            String pythonContent = Files.readString(Paths.get(pythonPath));
            Node pythonAst = parsePython(pythonContent, symbolTable);

            // STEP 2: Process CSS (Styling)
            System.out.println("[STAGE 2] Parsing CSS Stylesheets...");
            String cssPath = "web-app/style.css";
            String cssContent = Files.readString(Paths.get(cssPath));
            Node cssAst = parseCSS(cssContent);

            // STEP 3: Process HTML & Jinja2 (Template Logic)
            // This visitor will VALIDATE variables against the Symbol Table filled in Stage 1
            System.out.println("[STAGE 3] Parsing HTML & Jinja2 Templates...");
            String htmlPath = "web-app/test_details.html";
            String htmlContent = Files.readString(Paths.get(htmlPath));
            Node htmlAst = parseHTML(htmlContent, symbolTable);

            // STEP 4: Requirement 5 - Output Abstract Syntax Tree (AST)
            System.out.println("\n" + "=".repeat(50));
            System.out.println("FINAL INTEGRATED ABSTRACT SYNTAX TREE (AST)");
            System.out.println("=".repeat(50));

            if (pythonAst != null) pythonAst.print(0);
            if (cssAst != null) cssAst.print(0);
            if (htmlAst != null) htmlAst.print(0);

            // STEP 5: Requirement 4 - Output Symbol Table
            symbolTable.printTable();

            System.out.println("\n[SUCCESS] Compilation and Semantic Analysis complete.");

        } catch (IOException e) {
            System.err.println("[CRITICAL ERROR] File missing: " + e.getMessage());
            System.err.println("Ensure 'test.html', 'web-app/app.py', and 'web-app/style.css' exist.");
        } catch (Exception e) {
            System.err.println("[RUNTIME ERROR] " + e.getMessage());
            e.printStackTrace();
        }
    }

    // --- Language Parsing Helper Methods (Encapsulation) ---

    private static Node parsePython(String content, SymbolTable st) {
        PythonLexer lexer = new PythonLexer(CharStreams.fromString(content));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonParser parser = new PythonParser(tokens);
        ParseTree tree = parser.parse(); // Matches 'parse' rule in PythonParser.g4

        MyPythonVisitor visitor = new MyPythonVisitor(st);
        return visitor.visit(tree);
    }

    private static Node parseCSS(String content) {
        CSSLexer lexer = new CSSLexer(CharStreams.fromString(content));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CSSParser parser = new CSSParser(tokens);
        ParseTree tree = parser.stylesheet();

        MyCSSVisitor visitor = new MyCSSVisitor();
        return visitor.visit(tree);
    }

    private static Node parseHTML(String content, SymbolTable st) {
        HTMLLexer lexer = new HTMLLexer(CharStreams.fromString(content));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HTMLParser parser = new HTMLParser(tokens);
        ParseTree tree = parser.htmlDocument();

        MyHTMLVisitor visitor = new MyHTMLVisitor(st);
        return visitor.visit(tree);
    }

    private static void printHeader() {
        System.out.println("┌────────────────────────────────────────────────────────┐");
        System.out.println("│  FLASK WEB APP COMPILER - SEMANTIC ANALYZER            │");
        System.out.println("│  Supported: Python, Jinja2, HTML, CSS                  │");
        System.out.println("└────────────────────────────────────────────────────────┘\n");
    }
}