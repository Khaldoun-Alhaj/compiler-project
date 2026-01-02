package antlr;
import java.util.*;

/**
 * Senior Architect Implementation:
 * A scope-aware Symbol Table using a Stack of Maps.
 * Supports cross-language validation between Python backend and Jinja frontend.
 */
public class SymbolTable {
    private final Stack<Map<String, String>> scopes = new Stack<>();
    private final Set<String> cssDefinitions = new HashSet<>();
    // Tracks variables explicitly passed via render_template
    public final Set<String> passedToTemplate = new HashSet<>();

    public SymbolTable() { scopes.push(new HashMap<>()); } // Global Scope

    public void enterScope() { scopes.push(new HashMap<>()); }
    public void exitScope() { if (scopes.size() > 1) scopes.pop(); }

    public void define(String name, String type) { scopes.peek().put(name, type); }

    public String lookup(String name) {
        // Search from inner to outer scope (Lexical Scoping)
        for (int i = scopes.size() - 1; i >= 0; i--) {
            if (scopes.get(i).containsKey(name)) return scopes.get(i).get(name);
        }
        return null;
    }

    // Register CSS selectors (Classes, IDs, Tags)
    public void defineCss(String name) {
        cssDefinitions.add(name.replace(".", "").replace("#", "").trim());
    }

    public boolean isCssDefined(String name) { return cssDefinitions.contains(name.trim()); }

    public void printTable() {
        System.out.println("\n" + "=".repeat(30) + "\nSYMBOL TABLE STATUS\n" + "=".repeat(30));
        System.out.println("CSS Definitions: " + cssDefinitions);
        for (int i = 0; i < scopes.size(); i++) System.out.println("  Level " + i + ": " + scopes.get(i));
        System.out.println("Variables Passed to HTML: " + passedToTemplate);
        System.out.println("=".repeat(30));
    }
}