// Generated from C:/Users/digital world/Documents/intelijProjects/compiler-project/java-compiler/grammar/JinjaParser.g4 by ANTLR 4.13.2

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JinjaParser}.
 */
public interface JinjaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JinjaParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(JinjaParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(JinjaParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JinjaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JinjaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(JinjaParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(JinjaParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JinjaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JinjaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JinjaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JinjaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(JinjaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(JinjaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(JinjaParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(JinjaParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(JinjaParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(JinjaParser.ContentContext ctx);
}