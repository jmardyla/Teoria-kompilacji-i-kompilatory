import tkinter as tk
from tkinter import scrolledtext
import io
import sys
import traceback

from antlr4 import CommonTokenStream, InputStream
from gen.PythonStaticTypingLexer import PythonStaticTypingLexer
from gen.PythonStaticTypingParser import PythonStaticTypingParser
from gen.PythonStaticTypingVisitor import PythonStaticTypingVisitor
from antlr4.error.Errors import RecognitionException, InputMismatchException
from antlr4.error.ErrorListener import ErrorListener

class ANTLRConsoleErrorListener(ErrorListener):
    def __init__(self, result_text_widget):
        super(ANTLRConsoleErrorListener, self).__init__()
        self.result_text_widget = result_text_widget

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        error_message = f"Syntax Error at line {line}, column {column}: {msg}\n"
        self.result_text_widget.tag_config("error", foreground="red")
        self.result_text_widget.insert(tk.END, error_message, "error")

class CodeExecutorApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Code Executor")
        self.root.configure(bg="gray36")

        self.frame = tk.Frame(self.root)
        self.frame.grid(row=0, column=0, padx=5, pady=5)

        self.line_numbers_text = tk.Text(self.frame, wrap=tk.NONE, width=4, bg="gray20", fg="white")
        self.line_numbers_text.grid(row=0, column=0, sticky="nsew")

        self.text_area = scrolledtext.ScrolledText(self.frame, wrap=tk.WORD, width=40, height=40, bg="gray20", fg="dark orange")
        self.text_area.grid(row=0, column=1, padx=(0, 5), sticky="nsew")

        self.frame.rowconfigure(0, weight=1)
        self.frame.columnconfigure(1, weight=1)

        self.result_label = tk.Label(self.root, text="Result:", bg="gray36", fg="white")
        self.result_label.grid(row=0, column=1, padx=5, pady=5)

        self.result_text = scrolledtext.ScrolledText(self.root, wrap=tk.WORD, width=80, height=40, bg="gray20", fg="white")
        self.result_text.grid(row=0, column=2, padx=5, pady=5)

        self.execute_button = tk.Button(self.root, text="Execute", command=self.execute_code, bg="lawn green", fg="black")
        self.execute_button.grid(row=1, column=0, columnspan=3, pady=5)

        self.text_area.bind("<Key>", self.update_line_numbers)
        self.result_text.tag_config("error", foreground="red")

    def update_line_numbers(self, event=None):
        line_numbers = self.get_line_numbers()
        self.line_numbers_text.config(state="normal")
        self.line_numbers_text.delete("1.0", tk.END)
        self.line_numbers_text.insert("1.0", line_numbers)
        self.line_numbers_text.config(state="disabled")

        # Clear the result text when code changes
        self.result_text.delete("1.0", tk.END)

    def get_line_numbers(self):
        line_count = self.text_area.get("1.0", tk.END).count("\n")
        line_numbers = "\n".join(str(i) for i in range(1, line_count + 1))
        return line_numbers

    def execute_code(self):
        code = self.text_area.get("1.0", tk.END)

        # Przechwycenie standardowego wyjścia i błędów
        stdout_backup = sys.stdout
        stderr_backup = sys.stderr
        sys.stdout = io.StringIO()
        sys.stderr = io.StringIO()

        try:
            # Analiza kodu za pomocą ANTLR
            input_stream = InputStream(code)
            lexer = PythonStaticTypingLexer(input_stream)
            token_stream = CommonTokenStream(lexer)
            parser = PythonStaticTypingParser(token_stream)

            # Dodajemy własny handler do wyświetlania błędów
            parser.removeErrorListeners()
            parser.addErrorListener(ANTLRConsoleErrorListener(self.result_text))

            tree = parser.program()

            # Wykonanie kodu za pomocą odwiedzającego
            visitor = PythonStaticTypingVisitor()
            visitor.visitProgram(tree)

            # Pobranie wyniku z przechwyconego wyjścia
            result = sys.stdout.getvalue()

            # Pobranie błędów z przechwyconego wyjścia błędów
            errors = sys.stderr.getvalue()

            if errors:
                # Jeśli wystąpiły błędy, wyświetl je na czerwono
                self.result_text.tag_config("error", foreground="red")
                self.result_text.insert(tk.END, errors, "error")
            else:
                # W przeciwnym razie wyświetl wynik
                self.result_text.insert(tk.END, result)
        except InputMismatchException as ime:
            error_line = ime.offendingToken.line if ime.offendingToken else -1
            error_message = "Mismatched input"
            self.result_text.delete("1.0", tk.END)
            self.result_text.insert(tk.END, f"Syntax Error in line {error_line}: {error_message}\n", "error")
        except RecognitionException as re:
            error_line = re.offendingToken.line if re.offendingToken else -1
            error_message = re.message
            self.result_text.delete("1.0", tk.END)
            self.result_text.insert(tk.END, f"Syntax Error in line {error_line}: {error_message}\n", "error")
        except Exception as e:
            current_line_number = int(self.text_area.index(tk.INSERT).split('.')[0])
            self.result_text.delete("1.0", tk.END)
            self.result_text.insert(tk.END, f"Error in line {current_line_number}: {e}\n", "error")
            # Also capture the full traceback
            self.result_text.insert(tk.END, "\n" + traceback.format_exc(), "error")
        finally:
            # Przywrócenie standardowego wyjścia i błędów
            sys.stdout = stdout_backup
            sys.stderr = stderr_backup

if __name__ == "__main__":
    root = tk.Tk()
    app = CodeExecutorApp(root)
    root.mainloop()
