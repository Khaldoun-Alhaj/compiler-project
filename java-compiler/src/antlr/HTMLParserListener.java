// Generated from C:/Users/digital world/Documents/intelijProjects/compiler-project/java-compiler/grammar/HTMLParser.g4 by ANTLR 4.13.2

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(HTMLParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(HTMLParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#tagElement}.
	 * @param ctx the parse tree
	 */
	void enterTagElement(HTMLParser.TagElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#tagElement}.
	 * @param ctx the parse tree
	 */
	void exitTagElement(HTMLParser.TagElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#emptyElement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyElement(HTMLParser.EmptyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#emptyElement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyElement(HTMLParser.EmptyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(HTMLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(HTMLParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(HTMLParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(HTMLParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#jinjaElement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaElement(HTMLParser.JinjaElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#jinjaElement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaElement(HTMLParser.JinjaElementContext ctx);
}