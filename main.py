from antlr4 import CommonTokenStream, InputStream

from gen.PythonStaticTypingLexer import PythonStaticTypingLexer
from gen.PythonStaticTypingParser import PythonStaticTypingParser
from gen.PythonStaticTypingVisitor import PythonStaticTypingVisitor

input_text = """
print('Hello world')
"""

input_stream = InputStream(input_text)

lexer = PythonStaticTypingLexer(input_stream)
stream = CommonTokenStream(lexer)
parser = PythonStaticTypingParser(stream)
tree = parser.program()

visitor = PythonStaticTypingVisitor()
visitor.visit(tree)
