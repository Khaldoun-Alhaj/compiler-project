// Generated from C:/Users/digital world/Documents/intelijProjects/compiler-project/java-compiler/grammar/WebParser.g4 by ANTLR 4.13.2
 package antlr; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WebParser}.
 */
public interface WebParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WebParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(WebParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(WebParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#textNode}.
	 * @param ctx the parse tree
	 */
	void enterTextNode(WebParser.TextNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#textNode}.
	 * @param ctx the parse tree
	 */
	void exitTextNode(WebParser.TextNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(WebParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(WebParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(WebParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(WebParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(WebParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(WebParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#jinjaElement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaElement(WebParser.JinjaElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#jinjaElement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaElement(WebParser.JinjaElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(WebParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(WebParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(WebParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(WebParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(WebParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(WebParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(WebParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(WebParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(WebParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(WebParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#cssBlock}.
	 * @param ctx the parse tree
	 */
	void enterCssBlock(WebParser.CssBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#cssBlock}.
	 * @param ctx the parse tree
	 */
	void exitCssBlock(WebParser.CssBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#styleAttr}.
	 * @param ctx the parse tree
	 */
	void enterStyleAttr(WebParser.StyleAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#styleAttr}.
	 * @param ctx the parse tree
	 */
	void exitStyleAttr(WebParser.StyleAttrContext ctx);
}