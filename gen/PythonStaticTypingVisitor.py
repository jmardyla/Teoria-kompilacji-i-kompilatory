# Generated from C:/Users/janek/PycharmProjects/tkik/PythonStaticTyping.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .PythonStaticTypingParser import PythonStaticTypingParser
else:
    from PythonStaticTypingParser import PythonStaticTypingParser

# This class defines a complete generic visitor for a parse tree produced by PythonStaticTypingParser.

class PythonStaticTypingVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by PythonStaticTypingParser#program.
    def visitProgram(self, ctx:PythonStaticTypingParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonStaticTypingParser#statements.
    def visitStatements(self, ctx:PythonStaticTypingParser.StatementsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonStaticTypingParser#statement.
    def visitStatement(self, ctx:PythonStaticTypingParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonStaticTypingParser#function_statement.
    def visitFunction_statement(self, ctx:PythonStaticTypingParser.Function_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonStaticTypingParser#expression_statement.
    def visitExpression_statement(self, ctx:PythonStaticTypingParser.Expression_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonStaticTypingParser#assignment_statement.
    def visitAssignment_statement(self, ctx:PythonStaticTypingParser.Assignment_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonStaticTypingParser#if_statement.
    def visitIf_statement(self, ctx:PythonStaticTypingParser.If_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonStaticTypingParser#while_statement.
    def visitWhile_statement(self, ctx:PythonStaticTypingParser.While_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonStaticTypingParser#for_statement.
    def visitFor_statement(self, ctx:PythonStaticTypingParser.For_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonStaticTypingParser#function_definition.
    def visitFunction_definition(self, ctx:PythonStaticTypingParser.Function_definitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonStaticTypingParser#expression_list.
    def visitExpression_list(self, ctx:PythonStaticTypingParser.Expression_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonStaticTypingParser#typed_parameters.
    def visitTyped_parameters(self, ctx:PythonStaticTypingParser.Typed_parametersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonStaticTypingParser#typed_parameter.
    def visitTyped_parameter(self, ctx:PythonStaticTypingParser.Typed_parameterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonStaticTypingParser#class_definition.
    def visitClass_definition(self, ctx:PythonStaticTypingParser.Class_definitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonStaticTypingParser#return_statement.
    def visitReturn_statement(self, ctx:PythonStaticTypingParser.Return_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonStaticTypingParser#expression.
    def visitExpression(self, ctx:PythonStaticTypingParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonStaticTypingParser#simple_expression.
    def visitSimple_expression(self, ctx:PythonStaticTypingParser.Simple_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonStaticTypingParser#primary.
    def visitPrimary(self, ctx:PythonStaticTypingParser.PrimaryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonStaticTypingParser#function_call.
    def visitFunction_call(self, ctx:PythonStaticTypingParser.Function_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonStaticTypingParser#type.
    def visitType(self, ctx:PythonStaticTypingParser.TypeContext):
        return self.visitChildren(ctx)



del PythonStaticTypingParser