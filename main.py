from antlr4 import InputStream
from antlr4 import CommonTokenStream
from gen.PythonStaticTypingLexer import PythonStaticTypingLexer
from gen.PythonStaticTypingParser import PythonStaticTypingParser

# Input text to parse
input_text = """def elo() -> int:
    kicha: int = 3
    kacha: string = '3'
    return 3
    
    
    
elo()


seba: int = 33

"""

# Create an input stream
input_stream = InputStream(input_text)

# Create a lexer
lexer = PythonStaticTypingLexer(input_stream)

# Create a token stream
token_stream = CommonTokenStream(lexer)
parser = PythonStaticTypingParser(token_stream)
tree = parser.program()
print(tree.toStringTree())

# Print out tokens
# token_stream.fill()
# for token in token_stream.tokens:
#     print(token)
