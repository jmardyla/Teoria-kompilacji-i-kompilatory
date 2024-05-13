import ast
from antlr4 import *
from gen.PythonStaticTypingLexer import PythonStaticTypingLexer
from gen.PythonStaticTypingParser import PythonStaticTypingParser
from gen.PythonStaticTypingVisitor import PythonStaticTypingVisitor

class SimpleInterpreter(PythonStaticTypingVisitor):
    def __init__(self):
        self.variables = {}

    def visit_Module(self, node):
        for statement in node.body:
            self.visit(statement)

    def visit_Expr(self, node):
        value = self.visit(node.value)
        print(value)

    def visit_BinOp(self, node):
        left = self.visit(node.left)
        right = self.visit(node.right)
        op = node.op
        if isinstance(op, ast.Add):
            return left + right
        elif isinstance(op, ast.Sub):
            return left - right
        elif isinstance(op, ast.Mult):
            return left * right
        elif isinstance(op, ast.Div):
            return left / right

    def visit_Num(self, node):
        return node.n

    def visit_Name(self, node):
        return self.variables.get(node.id, None)

    def visit_Assign(self, node):
        identifier = node.targets[0].id
        value = self.visit(node.value)
        self.variables[identifier] = value

    def visit_Print(self, node):
        value = self.visit(node.values[0])
        print(value)

    def visit_Compare(self, node):
        left = self.visit(node.left)
        right = self.visit(node.comparators[0])
        op = node.ops[0]
        if isinstance(op, ast.Eq):
            return left == right
        elif isinstance(op, ast.NotEq):
            return left != right
        elif isinstance(op, ast.Lt):
            return left < right
        elif isinstance(op, ast.LtE):
            return left <= right
        elif isinstance(op, ast.Gt):
            return left > right
        elif isinstance(op, ast.GtE):
            return left >= right

def interpret(code):
    lexer = PythonStaticTypingLexer(InputStream(code))
    tokens = CommonTokenStream(lexer)
    parser = PythonStaticTypingParser(tokens)
    tree = parser.program()
    interpreter = SimpleInterpreter()
    interpreter.visit(tree)

# Example usage:
code = """
x = 10
y = 20
print(x + y)
"""

interpret(code)
