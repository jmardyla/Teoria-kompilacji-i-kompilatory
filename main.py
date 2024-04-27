from antlr4 import InputStream
from antlr4 import CommonTokenStream
from gen.PythonStaticTypingLexer import PythonStaticTypingLexer
from gen.PythonStaticTypingParser import PythonStaticTypingParser

# Input text to parse
input_text = "if x == 5:\n    print('x is 5')"

# Create an input stream
input_stream = InputStream(input_text)

# Create a lexer
lexer = PythonStaticTypingLexer(input_stream)

# Create a token stream
token_stream = CommonTokenStream(lexer)

# Print out tokens
token_stream.fill()
for token in token_stream.tokens:
    print(token)
