from antlr4 import CommonTokenStream, InputStream

from gen.PythonStaticTypingLexer import PythonStaticTypingLexer
from gen.PythonStaticTypingParser import PythonStaticTypingParser
from gen.PythonStaticTypingVisitor import PythonStaticTypingVisitor

input_text = """
print('Hello world')

def do_something(param: str, num: int) -> int {
    if (num % 2 == 0) {
        sum: int = 0
        for i in range(num) {
            print(sum)
            sum = sum + 1
        }
        return sum+10
    }
    else {
        print("ELSE")
    }
    print(param * num)
    return 0
}

result: int = do_something('test', 2)
print(result)
result = do_something('nieparzysta ', 3)
print(result)

var: int = 0
while (var < 4) {
    print(var * 10)
    var = var + 1
}
"""

input_stream = InputStream(input_text)

lexer = PythonStaticTypingLexer(input_stream)
stream = CommonTokenStream(lexer)
parser = PythonStaticTypingParser(stream)
tree = parser.program()

visitor = PythonStaticTypingVisitor()
visitor.visit(tree)
