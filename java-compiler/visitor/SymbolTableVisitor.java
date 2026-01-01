package visitor;

import ast.*;
import symbol.*;

import java.util.Stack;

/**
 * SymbolTableVisitor:
 * يقوم بتعبئة جدول الرموز (Symbol Table) أثناء زيارة AST.
 * يدعم المجالات المتداخلة (Scopes).
 */
public class SymbolTableVisitor implements ASTVisitor<Void> {

    private SymbolTable symbolTable;
    private Stack<Scope> scopeStack;

    public SymbolTableVisitor() {
        this.symbolTable = new SymbolTable();
        this.scopeStack = new Stack<>();
        // إنشاء المجال العام (Global Scope)
        Scope global = new Scope("global");
        scopeStack.push(global);
        symbolTable.setGlobalScope(global);
    }

    // الدخول في Scope جديد
    private void enterScope(String name) {
        Scope newScope = new Scope(name, scopeStack.peek());
        scopeStack.push(newScope);
    }

    // الخروج من Scope الحالي
    private void exitScope() {
        scopeStack.pop();
    }

    // الحصول على Scope الحالي
    private Scope currentScope() {
        return scopeStack.peek();
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    // ----- زيارة Program -----
    @Override
    public Void visitProgram(ProgramNode node) {
        // زيارة كل الأبناء
        for (ASTNode child : node.getChildren()) {
            child.accept(this);
        }
        return null;
    }

    // ----- زيارة HTMLNode -----
    @Override
    public Void visitHTML(HTMLNode node) {
        // HTML عادة لا يحتوي على متغيرات، فقط نزور الأبناء إذا موجود
        for (ASTNode child : node.getChildren()) {
            child.accept(this);
        }
        return null;
    }

    // ----- زيارة CSSNode -----
    @Override
    public Void visitCSS(CSSNode node) {
        // CSS يمكن تجاهلها في جدول الرموز، نزور الأبناء إذا موجود
        for (ASTNode child : node.getChildren()) {
            child.accept(this);
        }
        return null;
