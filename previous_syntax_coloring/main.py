from enum import Enum
import re


class Token(Enum):
    LICZBA = "(([1-9][0-9]*)|0)"
    IDENTYFIKATOR = "[a-zA-Z][a-zA-Z0-9]*"
    PLUS = "\+"
    MINUS = "-"
    MNOZENIE = "\*"
    DZIEL = "/"
    NAWIAS_L = "\("
    NAWIAS_P = "\)"
    STRING = "[\'\"].*[\'\"]"
    RESERVED_WORD = ['False', 'None', 'True', 'and', 'as', 'assert', 'async', 'await', 'break', 'class', 'continue',
                     'def', 'del', 'elif', 'else', 'except', 'finally', 'for', 'from', 'global', 'if', 'import', 'in',
                     'is', 'lambda', 'nonlocal', 'not', 'or', 'pass', 'raise', 'return', 'try', 'while', 'with',
                     'yield', 'case', 'match']
    FUNCTION_CALL = "[a-zA-Z][a-zA-Z0-9]*\("
    INIT = "__INIT__"
    END = "__END__"
    ERROR = "__?__"
    WHITESPACE = " "
    TYPE_ANNOTATION = ": <type>"
    SELF = 'self'
    COMMENT = "#.*\n"


class Scaner:
    def __init__(self, expr: str):
        self.expr = expr
        self.it: int = 0
        self.counter: int = 0

    def scan(self) -> (Token, str):
        if self.it >= len(self.expr):
            return Token.END, ""

        current: str = self.expr[self.it]

        # while current == ' ':
        #     self.it += 1
        #     if self.it >= len(self.expr):
        #         return Token.END, ""
        #     current = self.expr[self.it]
        # if self.counter < 10:
        #     print(current)
        #     self.counter += 1

        if current == "#":
            buffer = current
            self.it += 1
            current = self.expr[self.it]
            while current != "\n":
                buffer += current
                self.it += 1
                if self.it >= len(self.expr):
                    break
                current = self.expr[self.it]

            self.it += 1
            buffer += "\n"
            return Token.COMMENT, buffer

        if current == "'":
            buffer = "'"
            self.it += 1
            current = self.expr[self.it]
            escape_char = False
            while current != "\'" or escape_char is True and current == "\'":
                if current == "\\" and escape_char is False:
                    escape_char = True
                else:
                    escape_char = False
                buffer += current
                self.it += 1
                if self.it >= len(self.expr):
                    break
                current = self.expr[self.it]

            self.it += 1
            buffer += "'"
            return Token.STRING, buffer

        if current == "\"":
            buffer = "\""
            self.it += 1
            current = self.expr[self.it]
            escape_char = False
            while current != "\"" or escape_char is True and current == "\"":
                if current == "\\" and escape_char is False:
                    escape_char = True
                else:
                    escape_char = False
                buffer += current
                self.it += 1
                if self.it >= len(self.expr):
                    break
                current = self.expr[self.it]

            self.it += 1
            buffer += "\""
            return Token.STRING, buffer

        if re.match(r'[a-zA-Z]', current):
            buffer = ""
            while re.match(r'[a-zA-Z0-9]', current):
                buffer += current
                self.it += 1
                if self.it >= len(self.expr):
                    break
                current = self.expr[self.it]

            if current == '(':
                return Token.FUNCTION_CALL, buffer

            if buffer in Token.RESERVED_WORD.value:
                return Token.RESERVED_WORD, buffer

            elif buffer == Token.SELF.value:
                return Token.SELF, buffer

            return Token.IDENTYFIKATOR, buffer

        if re.match(r'\d', current):
            buffer = ""
            while re.match(r'\d', current):
                buffer += current
                self.it += 1
                if self.it >= len(self.expr):
                    break
                current = self.expr[self.it]

            return Token.LICZBA, buffer

        if current == ' ':
            self.it += 1
            if self.it >= len(self.expr):
                return Token.END, ""
            current = self.expr[self.it]
            return Token.WHITESPACE, " "

        self.it += 1
        match current:
            case "+":
                return Token.PLUS, current
            case "-":
                return Token.MINUS, current
            case "*":
                return Token.MNOZENIE, current
            case "/":
                return Token.DZIEL, current
            case ")":
                return Token.NAWIAS_P, current
            case "(":
                return Token.NAWIAS_L, current
            case ":":
                buffer = ":"
                if self.expr[self.it] != "\n" and self.expr[self.it + 1] != "\n":
                    if self.expr[self.it] == " ":
                        buffer += " "
                        self.it += 1
                    current = self.expr[self.it]
                    if re.match(r'[a-zA-Z]', current):
                        while re.match(r'[a-zA-Z0-9]', current):
                            buffer += current
                            self.it += 1
                            if self.it >= len(self.expr):
                                break
                            current = self.expr[self.it]

                        return Token.TYPE_ANNOTATION, buffer
                return Token.ERROR, current
            case _:
                return Token.ERROR, current


def colorize_syntax(input_file: str, output_file: str):
    with open(input_file, 'r') as file:
        expression = file.read()

    scaner = Scaner(expression)

    with open(output_file, 'w') as file:
        file.write("<pre>\n")
        indentation_level = 0
        while True:
            token, value = scaner.scan()
            # if token != Token.WHITESPACE:
            # print(token, value)

            if token == Token.END:
                break
            if token == Token.ERROR:
                file.write(f"<span style='color: black'>{value}</span>")
            elif token == Token.IDENTYFIKATOR:
                file.write(f"<span style='color: blue'>{value}</span>")
            elif token == Token.RESERVED_WORD:
                file.write(f"<span style='color: orange'>{value}</span>")
            elif token == Token.LICZBA:
                file.write(f"<span style='color: green'>{value}</span>")
            elif token == Token.STRING:
                file.write(f"<span style='color: magenta'>{value}</span>")
            elif token == Token.TYPE_ANNOTATION:
                file.write(f"<span style='color: maroon'>{value}</span>")
            elif token == Token.SELF:
                file.write(f"<span style='color: darkgoldenrod'>{value}</span>")
            elif token == Token.FUNCTION_CALL:
                file.write(f"<span style='color: darkcyan'>{value}</span>")
            elif token == Token.COMMENT:
                file.write(f"<span style='color: gray'>{value}</span>")
            else:
                file.write(value)
                if value == '(':
                    indentation_level += 1
                elif value == ')':
                    indentation_level -= 1
                elif token == Token.WHITESPACE:
                    file.write("&nbsp;")
        file.write("\n</pre>")


def main():
    # expression = "x4*2+3+(76+8/3)1234  *xy1+s12*(9-3)"
    # scaner = Scaner(expression)
    #
    # print("Tokeny zeskanowane z wyrażenia:")
    # while True:
    #     tkn = scaner.scan()
    #     if tkn[0] == Token.END:
    #         break
    #     print(tkn[0].name, tkn[1])

    print("\nZapisywanie kolorowanego kodu do pliku output.html...")
    colorize_syntax("large_input.txt", "output.html")
    print("Gotowe!")


if __name__ == "__main__":
    main()
