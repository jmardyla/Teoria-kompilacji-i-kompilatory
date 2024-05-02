from antlr4 import InputStream, CommonTokenStream
from gen.PythonStaticTypingLexer import PythonStaticTypingLexer
from gen.PythonStaticTypingParser import PythonStaticTypingParser


def colorize_syntax(input_text: str, output_file: str):
    # Tworzenie strumienia wejściowego
    input_stream = InputStream(input_text)

    # Tworzenie leksera
    lexer = PythonStaticTypingLexer(input_stream)

    # Tworzenie strumienia tokenów
    token_stream = CommonTokenStream(lexer)
    parser = PythonStaticTypingParser(token_stream)
    tree = parser.program()

    # Wyświetlenie tokenów w drzewie parsowania
    print_tokens_in_tree(tree)
    # Tworzenie wyjścia HTML
    html_output = "<pre>\n"

    # Kolorowanie tokenów
    for child in tree.children:
        html_chunk = colorize_node(child)
        if html_chunk is not None:
            html_output += html_chunk

    # Zapisywanie znacznika zamykającego
    html_output += "</pre>"

    # Zapisywanie wyjścia HTML do pliku
    with open(output_file, 'w') as file:
        file.write(html_output)


def print_tokens_in_tree(node):
    for child in node.children:
        if hasattr(child, 'symbol') and child.symbol is not None:
            token_type = child.symbol.type
            token_value = child.getText()
            print(f"Token type: {token_type}, Token value: {token_value}")
        else:
            print_tokens_in_tree(child)


def colorize_node(node):
    if hasattr(node, 'symbol') and node.symbol is not None:
        token_type = node.symbol.type
        token_value = node.getText()

        # Mapowanie typów tokenów na kolory HTML
        color_mapping = {
            PythonStaticTypingLexer.IDENTIFIER: 'blue',
            PythonStaticTypingLexer.NUMBER: 'green',
            PythonStaticTypingLexer.STRING: 'magenta',
            PythonStaticTypingLexer.TYPE_ANNOTATION: 'maroon',
            PythonStaticTypingLexer.INT: 'purple',
            PythonStaticTypingLexer.DEF: 'red',
            PythonStaticTypingLexer.CLASS: 'red',
            PythonStaticTypingLexer.IF: 'red',
            PythonStaticTypingLexer.ELSE: 'red',
            PythonStaticTypingLexer.RETURN: 'red',
            PythonStaticTypingLexer.FOR: 'red',
            PythonStaticTypingLexer.IN: 'red',
        }

        # Użycie koloru domyślnego, jeśli nie znaleziono mapowania
        color = color_mapping.get(token_type, 'black')

        # Generowanie HTML z kolorem
        return f"<span style='color: {color}'>{token_value}</span>"
    elif hasattr(node, 'symbol') and node.symbol is None and node.getText() == "<EOF>":
        # Obsługa specjalnego przypadku dla <EOF>
        return None
    else:
        # Rekurencyjne kolorowanie podrzędnych węzłów
        result = ""
        for child in node.children:
            result += colorize_node(child)
        return result


# Przykładowe użycie
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

colorize_syntax(input_text, "output.html")
