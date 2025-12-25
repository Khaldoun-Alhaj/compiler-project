// Generated from C:/Users/digital world/Documents/intelijProjects/compiler-project/java-compiler/grammar/HTMLParser.g4 by ANTLR 4.13.2

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(HTMLParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#tagElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagElement(HTMLParser.TagElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#emptyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyElement(HTMLParser.EmptyElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(HTMLParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(HTMLParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#jinjaElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaElement(HTMLParser.JinjaElementContext ctx);
}