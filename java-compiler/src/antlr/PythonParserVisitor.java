// Generated from C:/Users/digital world/Documents/intelijProjects/compiler-project/java-compiler/grammar/PythonParser.g4 by ANTLR 4.13.2
 package antlr; 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PythonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PythonParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(PythonParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#routeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouteDefinition(PythonParser.RouteDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#statementBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(PythonParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PythonParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(PythonParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(PythonParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(PythonParser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#dictLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictLiteral(PythonParser.DictLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(PythonParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(PythonParser.ElementContext ctx);
}