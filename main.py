from antlr4 import InputStream
from antlr4 import CommonTokenStream
import gen
from gen.HelloLexer import HelloLexer
from gen.HelloParser import HelloParser

input_text = input("> ")
input_stream = InputStream(input_text)
lexer = HelloLexer(input_stream)
stream = CommonTokenStream(lexer)
parser = HelloParser(stream)

tree = parser.r()

print(tree.toStringTree(recog=parser))
