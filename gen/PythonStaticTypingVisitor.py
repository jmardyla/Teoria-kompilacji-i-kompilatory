from antlr4 import ParseTreeVisitor
from gen.PythonStaticTypingParser import PythonStaticTypingParser

class PythonStaticTypingVisitor(ParseTreeVisitor):
    def visitProgram(self, ctx: PythonStaticTypingParser.ProgramContext):
        return self.visitChildren(ctx)

    def visitStatements(self, ctx: PythonStaticTypingParser.StatementsContext):
        return self.visitChildren(ctx)

    def visitStatement(self, ctx: PythonStaticTypingParser.StatementContext):
        return self.visitChildren(ctx)

    def visitFunction_statement(self, ctx: PythonStaticTypingParser.Function_statementContext):
        return self.visitChildren(ctx)

    def visitExpression_statement(self, ctx: PythonStaticTypingParser.Expression_statementContext):
        return self.visitChildren(ctx)

    def visitAssignment_statement(self, ctx: PythonStaticTypingParser.Assignment_statementContext):
        return self.visitChildren(ctx)

    def visitIf_statement(self, ctx: PythonStaticTypingParser.If_statementContext):
        return self.visitChildren(ctx)

    def visitWhile_statement(self, ctx: PythonStaticTypingParser.While_statementContext):
        return self.visitChildren(ctx)

    def visitFor_statement(self, ctx: PythonStaticTypingParser.For_statementContext):
        return self.visitChildren(ctx)

    def visitFunction_definition(self, ctx: PythonStaticTypingParser.Function_definitionContext):
        return self.visitChildren(ctx)

    def visitExpression_list(self, ctx: PythonStaticTypingParser.Expression_listContext):
        return self.visitChildren(ctx)

    def visitTyped_parameters(self, ctx: PythonStaticTypingParser.Typed_parametersContext):
        return self.visitChildren(ctx)

    def visitTyped_parameter(self, ctx: PythonStaticTypingParser.Typed_parameterContext):
        return self.visitChildren(ctx)

    def visitClass_definition(self, ctx: PythonStaticTypingParser.Class_definitionContext):
        return self.visitChildren(ctx)

    def visitReturn_statement(self, ctx: PythonStaticTypingParser.Return_statementContext):
        return self.visitChildren(ctx)

    def visitExpression(self, ctx: PythonStaticTypingParser.ExpressionContext):
        return self.visitChildren(ctx)

    def visitPrimary(self, ctx: PythonStaticTypingParser.PrimaryContext):
        return self.visitChildren(ctx)

    def visitFunction_call(self, ctx: PythonStaticTypingParser.Function_callContext):
        return self.visitChildren(ctx)

    def visitType(self, ctx: PythonStaticTypingParser.TypeContext):
        return self.visitChildren(ctx)
