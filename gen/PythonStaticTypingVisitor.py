# Generated from C:/Users/janek/PycharmProjects/tkik/PythonStaticTyping.g4 by ANTLR 4.13.1
from antlr4 import *

if "." in __name__:
    from gen.PythonStaticTypingParser import PythonStaticTypingParser
else:
    from gen.PythonStaticTypingParser import PythonStaticTypingParser


# This class defines a complete generic visitor for a parse tree produced by PythonStaticTypingParser.

class PythonStaticTypingVisitor(ParseTreeVisitor):
    def __init__(self):
        self.variables = {}
        self.functions = {}

    # Visit a parse tree produced by PythonStaticTypingParser#program.
    def visitProgram(self, ctx: PythonStaticTypingParser.ProgramContext):
        # print(ctx)
        self.visitStatements(ctx.statements())

    # Visit a parse tree produced by PythonStaticTypingParser#statements.
    def visitStatements(self, ctx: PythonStaticTypingParser.StatementsContext):
        for statement in ctx.statement():
            self.visitStatement(statement)
        # return self.visitChildren(ctx)

    # Visit a parse tree produced by PythonStaticTypingParser#statement.
    def visitStatement(self, ctx: PythonStaticTypingParser.StatementContext):
        if ctx.expression_statement():
            self.visitExpression_statement(ctx.expression_statement())
        elif ctx.assignment_statement():
            self.visitAssignment_statement(ctx.assignment_statement())
        elif ctx.reassignment_statement():
            self.visitReassignment_statement(ctx.reassignment_statement())
        elif ctx.if_statement():
            self.visitIf_statement(ctx.if_statement())
        elif ctx.while_statement():
            self.visitWhile_statement(ctx.while_statement())
        elif ctx.for_statement():
            self.visitFor_statement(ctx.for_statement())
        elif ctx.function_definition():
            self.visitFunction_definition(ctx.function_definition())
        # elif ctx.return_statement():
        #     self.visitReturn_statement(ctx.return_statement())
        return None  # We're not returning any value for individual statements

    # Visit a parse tree produced by PythonStaticTypingParser#function_statement.
    def visitFunction_statement(self, ctx: PythonStaticTypingParser.Function_statementContext):
        if ctx.expression_statement():
            self.visitExpression_statement(ctx.expression_statement())
        elif ctx.assignment_statement():
            self.visitAssignment_statement(ctx.assignment_statement())
        elif ctx.reassignment_statement():
            self.visitReassignment_statement(ctx.reassignment_statement())
        elif ctx.if_statement():
            self.visitIf_statement(ctx.if_statement())
        elif ctx.while_statement():
            self.visitWhile_statement(ctx.while_statement())
        elif ctx.for_statement():
            self.visitFor_statement(ctx.for_statement())
        elif ctx.return_statement():
            self.visitReturn_statement(ctx.return_statement())

    # Visit a parse tree produced by PythonStaticTypingParser#expression_statement.
    def visitExpression_statement(self, ctx: PythonStaticTypingParser.Expression_statementContext):
        if ctx.expression():
            self.visitExpression(ctx.expression())
        return None  # We're not returning any value for expression statements

    # Visit a parse tree produced by PythonStaticTypingParser#assignment_statement.

    def visitAssignment_statement(self, ctx: PythonStaticTypingParser.Assignment_statementContext):
        identifier = ctx.IDENTIFIER().getText()
        if identifier not in self.variables:
            value = self.visitExpression(ctx.expression())
            self.variables[identifier] = value
        else:
            raise ValueError(f"Variable {identifier} already defined")
        # Perform assignment handling here
        # return None

    def visitReassignment_statement(self, ctx: PythonStaticTypingParser.Reassignment_statementContext):
        identifier = ctx.IDENTIFIER().getText()
        if identifier in self.variables:
            value = self.visitExpression(ctx.expression())
            self.variables[identifier] = value
        else:
            raise ValueError(f"Variable {identifier} not defined")
        return None

    # Visit a parse tree produced by PythonStaticTypingParser#if_statement.
    def visitIf_statement(self, ctx: PythonStaticTypingParser.If_statementContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PythonStaticTypingParser#while_statement.
    def visitWhile_statement(self, ctx: PythonStaticTypingParser.While_statementContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PythonStaticTypingParser#for_statement.
    def visitFor_statement(self, ctx: PythonStaticTypingParser.For_statementContext):
        self.variables[ctx.IDENTIFIER().getText()] = None
        for i in self.visitExpression(ctx.expression()):
            self.variables[ctx.IDENTIFIER().getText()] = i
            self.visitStatements(ctx.statements())
        self.variables.pop(ctx.IDENTIFIER().getText())

    # Visit a parse tree produced by PythonStaticTypingParser#function_definition.
    def visitFunction_definition(self, ctx: PythonStaticTypingParser.Function_definitionContext):
        identifier = ctx.IDENTIFIER().getText()
        params = []
        if ctx.typed_parameters() is not None:
            params = self.visitTyped_parameters(ctx.typed_parameters())
        if identifier not in self.functions:
            self.functions[identifier] = (params, ctx.function_statement())
        else:
            raise ValueError(f"Variable {identifier} already defined")
        return None

    # Visit a parse tree produced by PythonStaticTypingParser#expression_list.
    def visitExpression_list(self, ctx: PythonStaticTypingParser.Expression_listContext):
        return [self.visitExpression(expression) for expression in ctx.expression()]

    # Visit a parse tree produced by PythonStaticTypingParser#typed_parameters.
    def visitTyped_parameters(self, ctx: PythonStaticTypingParser.Typed_parametersContext):
        return [self.visitTyped_parameter(param) for param in ctx.typed_parameter()]

    # Visit a parse tree produced by PythonStaticTypingParser#typed_parameter.
    def visitTyped_parameter(self, ctx: PythonStaticTypingParser.Typed_parameterContext):
        return ctx.IDENTIFIER().getText(), ctx.type_().getText()

    # Visit a parse tree produced by PythonStaticTypingParser#return_statement.
    def visitReturn_statement(self, ctx: PythonStaticTypingParser.Return_statementContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PythonStaticTypingParser#expression.
    def visitExpression(self, ctx: PythonStaticTypingParser.ExpressionContext):
        # if isinstance(ctx, list):  # If ctx is a list of expressions
        #     return [self.visitExpression(expression) for expression in ctx]
        if ctx.PLUS():
            compontents = self.visitPrimary(ctx.primary())
            left = compontents[0]
            right = compontents[1]
            return left + right
        if ctx.MINUS():
            compontents = self.visitPrimary(ctx.primary())
            left = compontents[0]
            right = compontents[1]
            return left - right
        if ctx.STAR():
            compontents = self.visitPrimary(ctx.primary())
            left = compontents[0]
            right = compontents[1]
            return left * right
        if ctx.SLASH():
            compontents = self.visitPrimary(ctx.primary())
            left = compontents[0]
            right = compontents[1]
            return left / right
        if ctx.primary():
            # print(ctx.primary())
            # print(ctx.__str__())
            return self.visitPrimary(ctx.primary())
        # return self.visitChildren(ctx)

    # Visit a parse tree produced by PythonStaticTypingParser#primary.
    def visitPrimary(self, ctx: PythonStaticTypingParser.PrimaryContext):
        if isinstance(ctx, list):  # If ctx is a list of primary expressions
            if len(ctx) == 1:
                return self.visitPrimary(ctx[0])
            return [self.visitPrimary(primary) for primary in ctx]
        if ctx.function_call():
            return self.visitFunction_call(ctx.function_call())
        if ctx.STRING():
            # print(ctx.STRING().getText()[1:-1])
            return ctx.STRING().getText()[1:-1]
        if ctx.NUMBER():
            if '.' in ctx.NUMBER().getText():
                return float(ctx.NUMBER().getText())
            return int(ctx.NUMBER().getText())
        if ctx.IDENTIFIER():
            identifier = ctx.IDENTIFIER().getText()
            if identifier in self.variables:
                return self.variables[identifier]
            raise ValueError(f"Variable {identifier} not defined")
        # return self.visitChildren(ctx)

    # Visit a parse tree produced by PythonStaticTypingParser#function_call.
    def visitFunction_call(self, ctx: PythonStaticTypingParser.Function_callContext):
        if ctx.IDENTIFIER().getText() in self.functions:
            function = self.functions[ctx.IDENTIFIER().getText()][1]
            function_params = self.functions[ctx.IDENTIFIER().getText()][0]
            for expected_param, _ in function_params:
                self.variables[expected_param] = None

            params_given = []
            if ctx.expression_list() is not None:
                params_given = self.visitExpression_list(ctx.expression_list())
            if len(params_given) != len(function_params):
                raise ValueError(f"Function {ctx.IDENTIFIER().getText()} expects {len(function_params)} parameters, {len(params_given)} were given")

            for i in range(len(params_given)):
                self.variables[function_params[i][0]] = params_given[i]

            for statement in function:
                self.visitFunction_statement(statement)

            for expected_param, _ in function_params:
                self.variables.pop(expected_param)
        if ctx.IDENTIFIER().getText() == 'print':
            args = ctx.expression_list().expression()
            values = [self.visitExpression(arg) for arg in args]
            print(*values)
            return None
        if ctx.IDENTIFIER().getText() == 'range':
            args = ctx.expression_list().expression()
            values = [self.visitExpression(arg) for arg in args]
            if len(values) == 1:
                return list(range(values[0]))
            elif len(values) == 2:
                return list(range(values[0], values[1]))
            elif len(values) == 3:
                return list(range(values[0], values[1], values[2]))
            else:
                raise ValueError("Invalid number of arguments for range")
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PythonStaticTypingParser#type.
    def visitType(self, ctx: PythonStaticTypingParser.TypeContext):
        # return self.visitChildren(ctx)
        pass

del PythonStaticTypingParser
