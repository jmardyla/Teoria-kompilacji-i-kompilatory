// Generated from C:/Users/agamm/Teoria-kompilacji-i-kompilatory/PythonStaticTyping.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonStaticTypingParser}.
 */
public interface PythonStaticTypingListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonStaticTypingParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PythonStaticTypingParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonStaticTypingParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PythonStaticTypingParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonStaticTypingParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(PythonStaticTypingParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonStaticTypingParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(PythonStaticTypingParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonStaticTypingParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PythonStaticTypingParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonStaticTypingParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PythonStaticTypingParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonStaticTypingParser#function_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_statement(PythonStaticTypingParser.Function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonStaticTypingParser#function_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_statement(PythonStaticTypingParser.Function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonStaticTypingParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(PythonStaticTypingParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonStaticTypingParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(PythonStaticTypingParser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonStaticTypingParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(PythonStaticTypingParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonStaticTypingParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(PythonStaticTypingParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonStaticTypingParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(PythonStaticTypingParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonStaticTypingParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(PythonStaticTypingParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonStaticTypingParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(PythonStaticTypingParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonStaticTypingParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(PythonStaticTypingParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonStaticTypingParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(PythonStaticTypingParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonStaticTypingParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(PythonStaticTypingParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonStaticTypingParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(PythonStaticTypingParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonStaticTypingParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(PythonStaticTypingParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonStaticTypingParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(PythonStaticTypingParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonStaticTypingParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(PythonStaticTypingParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonStaticTypingParser#typed_parameters}.
	 * @param ctx the parse tree
	 */
	void enterTyped_parameters(PythonStaticTypingParser.Typed_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonStaticTypingParser#typed_parameters}.
	 * @param ctx the parse tree
	 */
	void exitTyped_parameters(PythonStaticTypingParser.Typed_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonStaticTypingParser#typed_parameter}.
	 * @param ctx the parse tree
	 */
	void enterTyped_parameter(PythonStaticTypingParser.Typed_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonStaticTypingParser#typed_parameter}.
	 * @param ctx the parse tree
	 */
	void exitTyped_parameter(PythonStaticTypingParser.Typed_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonStaticTypingParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void enterClass_definition(PythonStaticTypingParser.Class_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonStaticTypingParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void exitClass_definition(PythonStaticTypingParser.Class_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonStaticTypingParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(PythonStaticTypingParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonStaticTypingParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(PythonStaticTypingParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonStaticTypingParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PythonStaticTypingParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonStaticTypingParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PythonStaticTypingParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonStaticTypingParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(PythonStaticTypingParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonStaticTypingParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(PythonStaticTypingParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonStaticTypingParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(PythonStaticTypingParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonStaticTypingParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(PythonStaticTypingParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonStaticTypingParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PythonStaticTypingParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonStaticTypingParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PythonStaticTypingParser.TypeContext ctx);
}