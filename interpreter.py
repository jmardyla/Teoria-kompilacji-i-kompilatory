from antlr4 import InputStream, CommonTokenStream, TokenStream
from gen.PythonStaticTypingLexer import PythonStaticTypingLexer
from gen.PythonStaticTypingParser import PythonStaticTypingParser

class PythonStaticTypingInterpreter(PythonStaticTypingParser):
    def __init__(self, input_stream, input: TokenStream):
        lexer = PythonStaticTypingLexer(input_stream)
        stream = CommonTokenStream(lexer)
        super().__init__(stream, input)
        self.variables = {}

    def visitProgram(self, ctx):
        return self.visitStatements(ctx.statements())

    def visitStatements(self, ctx):
        for statement in ctx.statement():
            self.visitStatement(statement)

    def visitStatement(self, ctx):
        if ctx.function_definition():
            self.visitFunction_definition(ctx.function_definition())
        elif ctx.assignment_statement():
            self.visitAssignment_statement(ctx.assignment_statement())
        elif ctx.if_statement():
            self.visitIf_statement(ctx.if_statement())
        elif ctx.while_statement():
            self.visitWhile_statement(ctx.while_statement())
        elif ctx.for_statement():
            self.visitFor_statement(ctx.for_statement())
        elif ctx.expression_statement():
            self.visitExpression_statement(ctx.expression_statement())
        elif ctx.function_call():
            self.visitFunction_call(ctx.function_call())

    def visitFunction_definition(self, ctx):
        # Handle function definition
        pass

    def visitAssignment_statement(self, ctx):
        identifier = ctx.IDENTIFIER().getText()
        value = self.visitExpression(ctx.expression())
        self.variables[identifier] = value

    def visitIf_statement(self, ctx):
        if_condition = self.visitExpression(ctx.expression())
        if if_condition:
            self.visitStatements(ctx.statements())

    def visitWhile_statement(self, ctx):
        while_condition = self.visitExpression(ctx.expression())
        while while_condition:
            self.visitStatements(ctx.statements())
            while_condition = self.visitExpression(ctx.expression())

    def visitFor_statement(self, ctx):
        iterable = self.visitExpression(ctx.expression())
        for item in iterable:
            self.variables[ctx.IDENTIFIER().getText()] = item
            self.visitStatements(ctx.statements())

    def visitFunction_call(self, ctx):
        function_name = ctx.IDENTIFIER().getText()
        # Assuming a simple print for now
        if function_name == 'print':
            args = ctx.expression_list().expression()
            values = [self.visitExpression(arg) for arg in args]
            print(*values)

    def visitExpression_statement(self, ctx):
        value = self.visitExpression(ctx.expression())
        print(value)  # Print the value for now

    def visitExpression(self, ctx):
        if ctx.primary():
            return self.visitPrimary(ctx.primary())
        elif ctx.PLUS():
            left = self.visitExpression(ctx.expression(0))
            right = self.visitExpression(ctx.expression(1))
            return left + right
        elif ctx.MINUS():
            left = self.visitExpression(ctx.expression(0))
            right = self.visitExpression(ctx.expression(1))
            return left - right
        elif ctx.STAR():
            left = self.visitExpression(ctx.expression(0))
            right = self.visitExpression(ctx.expression(1))
            return left * right
        elif ctx.SLASH():
            left = self.visitExpression(ctx.expression(0))
            right = self.visitExpression(ctx.expression(1))
            return left / right
        elif ctx.function_call():
            return self.visitFunction_call(ctx.function_call())

    def visitPrimary(self, ctx):
        if isinstance(ctx, list):  # If ctx is a list of primary expressions
            return [self.visitPrimary(primary) for primary in ctx]
        elif ctx.IDENTIFIER():
            return self.variables.get(ctx.IDENTIFIER().getText())
        elif ctx.NUMBER():
            return float(ctx.NUMBER().getText())
        elif ctx.STRING():
            return ctx.STRING().getText()[1:-1]  # Remove quotes from the string
        elif ctx.OPEN_PAREN():
            return self.visitExpression(ctx.expression())
        elif ctx.OPEN_BRACKET():
            return [self.visitExpression(expression) for expression in ctx.expression_list().expression()]
        elif ctx.OPEN_BRACE():
            return self.visitExpression(ctx.expression())
        elif ctx.function_call():
            return self.visitFunction_call(ctx.function_call())


def main():
    input_text = """
    print('Hello world')
    liczba: int = 2*3


    result: int = 3
    """

    input_stream = InputStream(input_text)
    interpreter = PythonStaticTypingInterpreter(input_stream, None)  # Pass None as the second argument for TokenStream
    interpreter.visitProgram(interpreter.program())

if __name__ == '__main__':
    main()


