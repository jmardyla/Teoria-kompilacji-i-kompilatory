from antlr4 import InputStream
from antlr4 import CommonTokenStream
from gen.PythonStaticTypingLexer import PythonStaticTypingLexer
from gen.PythonStaticTypingParser import PythonStaticTypingParser

# Input text to parse
input_text = """
print('Hello world')

def do_something(param: str, num: int) -> int {
    for i in range(num) {
        print(param)
    }
    return num
}

result: int = do_something('test', 3)

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

