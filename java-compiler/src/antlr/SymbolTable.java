package antlr;

import java.util.*;

public class SymbolTable {
    // Stack of Maps to handle nested scopes (Requirement 4)
    private Stack<Map<String, String>> scopes = new Stack<>();

    public SymbolTable() {
        scopes.push(new HashMap<>()); // Initial global scope
    }

    public void enterScope() {
        scopes.push(new HashMap<>());
    }

    public void exitScope() {
        if (scopes.size() > 1) {
            scopes.pop();
        }
    }

    public void define(String name, String type) {
        scopes.peek().put(name, type);
    }

    public String lookup(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            if (scopes.get(i).containsKey(name)) {
                return scopes.get(i).get(name);
            }
        }
        return null;
    }

    // Helper for Requirement 5 (Printing the table)
    public void printTable() {
        System.out.println("\n===== SYMBOL TABLE CONTENT =====");
        for (int i = 0; i < scopes.size(); i++) {
            System.out.println("Scope Level " + i + ": " + scopes.get(i));
        }
        System.out.println("================================\n");
    }
}