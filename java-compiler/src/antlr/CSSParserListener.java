// Generated from C:/Users/digital world/Documents/intelijProjects/compiler-project/java-compiler/grammar/CSSParser.g4 by ANTLR 4.13.2
 package antlr; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSSParser}.
 */
public interface CSSParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(CSSParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(CSSParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#css_rule}.
	 * @param ctx the parse tree
	 */
	void enterCss_rule(CSSParser.Css_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#css_rule}.
	 * @param ctx the parse tree
	 */
	void exitCss_rule(CSSParser.Css_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(CSSParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(CSSParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#selector_part}.
	 * @param ctx the parse tree
	 */
	void enterSelector_part(CSSParser.Selector_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#selector_part}.
	 * @param ctx the parse tree
	 */
	void exitSelector_part(CSSParser.Selector_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CSSParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CSSParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(CSSParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(CSSParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#value_list}.
	 * @param ctx the parse tree
	 */
	void enterValue_list(CSSParser.Value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#value_list}.
	 * @param ctx the parse tree
	 */
	void exitValue_list(CSSParser.Value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CSSParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CSSParser.ValueContext ctx);
}