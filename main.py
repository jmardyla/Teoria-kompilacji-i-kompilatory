import tkinter as tk
from tkinter import scrolledtext
import io
import sys
import traceback

from antlr4 import CommonTokenStream, InputStream
from gen.PythonStaticTypingLexer import PythonStaticTypingLexer
from gen.PythonStaticTypingParser import PythonStaticTypingParser
from gen.PythonStaticTypingVisitor import PythonStaticTypingVisitor

class CodeExecutorApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Code Executor")
        self.root.configure(bg="gray36")

        self.text_area = scrolledtext.ScrolledText(self.root, wrap=tk.WORD, width=40, height=40, bg="gray20", fg="dark orange")
        self.text_area.grid(row=0, column=0, padx=5, pady=5)

        self.result_label = tk.Label(self.root, text="Result:", bg="gray36", fg="white")
        self.result_label.grid(row=0, column=1, padx=5, pady=5)

        self.result_text = scrolledtext.ScrolledText(self.root, wrap=tk.WORD, width=80, height=40, bg="gray20", fg="white")
        self.result_text.grid(row=0, column=2, padx=5, pady=5)

        self.execute_button = tk.Button(self.root, text="Execute", command=self.execute_code, bg="lawn green", fg="black")
        self.execute_button.grid(row=1, column=0, columnspan=3, pady=5)

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
                self.result_text.insert(tk.END, errors)
            else:
                self.result_text.delete("1.0", tk.END)
                self.result_text.insert(tk.END, result)
                self.result_text.tag_config("success", foreground="yellow green")
                self.result_text.tag_add("success", "1.0", "end")
        except Exception as e:
            # Jeśli wystąpi wyjątek, wyświetl jego szczegóły
            self.result_text.tag_config("error", foreground="red")
            self.result_text.insert(tk.END, "Exception in Tkinter callback:\n")
            self.result_text.insert(tk.END, traceback.format_exc(), "error")
        finally:
            # Przywrócenie standardowego wyjścia i błędów
            sys.stdout = stdout_backup
            sys.stderr = stderr_backup

if __name__ == "__main__":
    root = tk.Tk()
    app = CodeExecutorApp(root)
    root.mainloop()
