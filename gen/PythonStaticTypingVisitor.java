// Generated from C:/Users/agamm/Teoria-kompilacji-i-kompilatory/PythonStaticTyping.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PythonStaticTypingParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PythonStaticTypingVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PythonStaticTypingParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PythonStaticTypingParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonStaticTypingParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(PythonStaticTypingParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonStaticTypingParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PythonStaticTypingParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonStaticTypingParser#function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_statement(PythonStaticTypingParser.Function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonStaticTypingParser#expression_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_statement(PythonStaticTypingParser.Expression_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonStaticTypingParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(PythonStaticTypingParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonStaticTypingParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(PythonStaticTypingParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonStaticTypingParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(PythonStaticTypingParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonStaticTypingParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(PythonStaticTypingParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonStaticTypingParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(PythonStaticTypingParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonStaticTypingParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(PythonStaticTypingParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonStaticTypingParser#typed_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyped_parameters(PythonStaticTypingParser.Typed_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonStaticTypingParser#typed_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyped_parameter(PythonStaticTypingParser.Typed_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonStaticTypingParser#class_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_definition(PythonStaticTypingParser.Class_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonStaticTypingParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(PythonStaticTypingParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonStaticTypingParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PythonStaticTypingParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonStaticTypingParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(PythonStaticTypingParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonStaticTypingParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(PythonStaticTypingParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonStaticTypingParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PythonStaticTypingParser.TypeContext ctx);
}