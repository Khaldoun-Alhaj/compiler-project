// Generated from C:/Users/digital world/Documents/intelijProjects/compiler-project/java-compiler/grammar/WebParser.g4 by ANTLR 4.13.2
 package antlr; 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WebParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WebParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WebParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(WebParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#textNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextNode(WebParser.TextNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(WebParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(WebParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(WebParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#jinjaElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaElement(WebParser.JinjaElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(WebParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(WebParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(WebParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(WebParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(WebParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#cssBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBlock(WebParser.CssBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#styleAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleAttr(WebParser.StyleAttrContext ctx);
}