from antlr4 import InputStream, CommonTokenStream
from gen.PythonStaticTypingLexer import PythonStaticTypingLexer
from gen.PythonStaticTypingParser import PythonStaticTypingParser


def colorize_syntax(input_text: str, output_file: str):
    # Create an input stream
    input_stream = InputStream(input_text)

    # Create a lexer
    lexer = PythonStaticTypingLexer(input_stream)

    # Create a token stream
    token_stream = CommonTokenStream(lexer)
    parser = PythonStaticTypingParser(token_stream)
    tree = parser.program()

    # Create HTML output
    html_output = "<pre>\n"

    # Colorize tokens
    for child in tree.children:
        html_chunk = colorize_node(child)
        if html_chunk is not None:
            html_output += html_chunk

    # Write closing tag
    html_output += "</pre>"

    # Write HTML output to file
    with open(output_file, 'w') as file:
        file.write(html_output)


def colorize_node(node):
    if hasattr(node, 'symbol') and node.symbol is not None:
        token_type = node.symbol.type
        token_value = node.getText()

        # Map token types to HTML colors
        color_mapping = {
            PythonStaticTypingLexer.IDENTIFIER: 'blue',
            PythonStaticTypingLexer.NUMBER: 'green',
            # Add more mappings as needed for your grammar
        }

        # Use default color if no mapping found
        color = color_mapping.get(token_type, 'black')

        # Generate HTML with color
        return f"<span style='color: {color}'>{token_value}</span>"
    elif hasattr(node, 'symbol') and node.symbol is None and node.getText() == "<EOF>":
        # Handle special case for <EOF>
        return None
    else:
        # Recursively colorize child nodes
        result = ""
        for child in node.children:
            result += colorize_node(child)
        return result


# Example usage
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
