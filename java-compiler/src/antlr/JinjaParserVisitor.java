// Generated from C:/Users/digital world/Documents/intelijProjects/compiler-project/java-compiler/grammar/JinjaParser.g4 by ANTLR 4.13.2

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JinjaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JinjaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JinjaParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(JinjaParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JinjaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(JinjaParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JinjaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JinjaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(JinjaParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(JinjaParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(JinjaParser.ContentContext ctx);
}