// Generated from C:/Users/agamm/Teoria-kompilacji-i-kompilatory/PythonStaticTyping.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PythonStaticTypingParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RANGE=1, NUMBER=2, STRING=3, TYPE_ANNOTATION=4, IN=5, COLON=6, COMMA=7, 
		SEMI=8, PLUS=9, MINUS=10, STAR=11, SLASH=12, VBAR=13, AMPERSAND=14, LESS=15, 
		GREATER=16, EQUAL=17, DOT=18, PERCENT=19, EQEQUAL=20, NOTEQUAL=21, LESSEQUAL=22, 
		GREATEREQUAL=23, TILDE=24, PLUSEQUAL=25, MINEQUAL=26, STAREQUAL=27, SLASHEQUAL=28, 
		PERCENTEQUAL=29, EXCLAMATION=30, NULL=31, DECIMALINTLITERAL=32, BREAK=33, 
		ELSE=34, RETURN=35, CONTINUE=36, DEF=37, IF=38, WHILE=39, FOR=40, CLASS=41, 
		COMMENT=42, OPEN_PAREN=43, CLOSE_PAREN=44, OPEN_BRACKET=45, CLOSE_BRACKET=46, 
		OPEN_BRACE=47, CLOSE_BRACE=48, INT=49, STR=50, FLOAT=51, COMPLEX=52, BOOLEAN=53, 
		LIST=54, TUPLE=55, DICT=56, SET=57, IDENTIFIER=58, INDENT=59, DEDENT=60, 
		NEWLINE=61, WS=62;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_statement = 2, RULE_function_statement = 3, 
		RULE_expression_statement = 4, RULE_assignment_statement = 5, RULE_if_statement = 6, 
		RULE_while_statement = 7, RULE_for_statement = 8, RULE_function_definition = 9, 
		RULE_expression_list = 10, RULE_typed_parameters = 11, RULE_typed_parameter = 12, 
		RULE_class_definition = 13, RULE_return_statement = 14, RULE_expression = 15, 
		RULE_primary = 16, RULE_function_call = 17, RULE_type = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "statement", "function_statement", "expression_statement", 
			"assignment_statement", "if_statement", "while_statement", "for_statement", 
			"function_definition", "expression_list", "typed_parameters", "typed_parameter", 
			"class_definition", "return_statement", "expression", "primary", "function_call", 
			"type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'range'", null, null, "'->'", "'in'", "':'", "','", "';'", "'+'", 
			"'-'", "'*'", "'/'", "'|'", "'&'", "'<'", "'>'", "'='", "'.'", "'%'", 
			"'=='", "'!='", "'<='", "'>='", "'~'", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'!'", "'null'", null, "'break'", "'else'", "'return'", "'continue'", 
			"'def'", "'if'", "'while'", "'for'", "'class'", null, "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "'int'", "'str'", "'float'", "'complex'", null, 
			"'list'", "'tuple'", "'dict'", "'set'", null, "'INDENT'", "'DEDENT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RANGE", "NUMBER", "STRING", "TYPE_ANNOTATION", "IN", "COLON", 
			"COMMA", "SEMI", "PLUS", "MINUS", "STAR", "SLASH", "VBAR", "AMPERSAND", 
			"LESS", "GREATER", "EQUAL", "DOT", "PERCENT", "EQEQUAL", "NOTEQUAL", 
			"LESSEQUAL", "GREATEREQUAL", "TILDE", "PLUSEQUAL", "MINEQUAL", "STAREQUAL", 
			"SLASHEQUAL", "PERCENTEQUAL", "EXCLAMATION", "NULL", "DECIMALINTLITERAL", 
			"BREAK", "ELSE", "RETURN", "CONTINUE", "DEF", "IF", "WHILE", "FOR", "CLASS", 
			"COMMENT", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"OPEN_BRACE", "CLOSE_BRACE", "INT", "STR", "FLOAT", "COMPLEX", "BOOLEAN", 
			"LIST", "TUPLE", "DICT", "SET", "IDENTIFIER", "INDENT", "DEDENT", "NEWLINE", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PythonStaticTyping.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonStaticTypingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PythonStaticTypingParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonStaticTypingVisitor ) return ((PythonStaticTypingVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			statements();
			setState(39);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PythonStaticTypingParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonStaticTypingParser.NEWLINE, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonStaticTypingVisitor ) return ((PythonStaticTypingVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(41);
				match(NEWLINE);
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			statement();
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(49); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(48);
						match(NEWLINE);
						}
						}
						setState(51); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(53);
					statement();
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(59);
					match(NEWLINE);
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Class_definitionContext class_definition() {
			return getRuleContext(Class_definitionContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(PythonStaticTypingParser.COMMENT, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonStaticTypingVisitor ) return ((PythonStaticTypingVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				expression_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				assignment_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				while_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				for_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(70);
				function_definition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(71);
				class_definition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(72);
				match(COMMENT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_statementContext extends ParserRuleContext {
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(PythonStaticTypingParser.COMMENT, 0); }
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Function_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).enterFunction_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).exitFunction_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonStaticTypingVisitor ) return ((PythonStaticTypingVisitor<? extends T>)visitor).visitFunction_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_statementContext function_statement() throws RecognitionException {
		Function_statementContext _localctx = new Function_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_statement);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				expression_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				assignment_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				while_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				for_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				match(COMMENT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
				return_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonStaticTypingParser.NEWLINE, 0); }
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).exitExpression_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonStaticTypingVisitor ) return ((PythonStaticTypingVisitor<? extends T>)visitor).visitExpression_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			expression();
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(85);
				match(NEWLINE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonStaticTypingParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(PythonStaticTypingParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(PythonStaticTypingParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PythonStaticTypingParser.SEMI, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).exitAssignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonStaticTypingVisitor ) return ((PythonStaticTypingVisitor<? extends T>)visitor).visitAssignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(IDENTIFIER);
			setState(89);
			match(COLON);
			setState(90);
			type();
			setState(91);
			match(EQUAL);
			setState(92);
			expression();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(93);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PythonStaticTypingParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(PythonStaticTypingParser.OPEN_BRACE, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonStaticTypingParser.NEWLINE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(PythonStaticTypingParser.CLOSE_BRACE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonStaticTypingVisitor ) return ((PythonStaticTypingVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(IF);
			setState(97);
			expression();
			setState(98);
			match(OPEN_BRACE);
			setState(99);
			match(NEWLINE);
			setState(100);
			statements();
			setState(101);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PythonStaticTypingParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(PythonStaticTypingParser.OPEN_BRACE, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonStaticTypingParser.NEWLINE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(PythonStaticTypingParser.CLOSE_BRACE, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonStaticTypingVisitor ) return ((PythonStaticTypingVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(WHILE);
			setState(104);
			expression();
			setState(105);
			match(OPEN_BRACE);
			setState(106);
			match(NEWLINE);
			setState(107);
			statements();
			setState(108);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PythonStaticTypingParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonStaticTypingParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(PythonStaticTypingParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(PythonStaticTypingParser.OPEN_BRACE, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonStaticTypingParser.NEWLINE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(PythonStaticTypingParser.CLOSE_BRACE, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonStaticTypingVisitor ) return ((PythonStaticTypingVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(FOR);
			setState(111);
			match(IDENTIFIER);
			setState(112);
			match(IN);
			setState(113);
			expression();
			setState(114);
			match(OPEN_BRACE);
			setState(115);
			match(NEWLINE);
			setState(116);
			statements();
			setState(117);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_definitionContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PythonStaticTypingParser.DEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonStaticTypingParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PythonStaticTypingParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PythonStaticTypingParser.CLOSE_PAREN, 0); }
		public TerminalNode TYPE_ANNOTATION() { return getToken(PythonStaticTypingParser.TYPE_ANNOTATION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(PythonStaticTypingParser.OPEN_BRACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(PythonStaticTypingParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonStaticTypingParser.NEWLINE, i);
		}
		public List<Function_statementContext> function_statement() {
			return getRuleContexts(Function_statementContext.class);
		}
		public Function_statementContext function_statement(int i) {
			return getRuleContext(Function_statementContext.class,i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(PythonStaticTypingParser.CLOSE_BRACE, 0); }
		public Typed_parametersContext typed_parameters() {
			return getRuleContext(Typed_parametersContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).exitFunction_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonStaticTypingVisitor ) return ((PythonStaticTypingVisitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(DEF);
			setState(120);
			match(IDENTIFIER);
			setState(121);
			match(OPEN_PAREN);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(122);
				typed_parameters();
				}
			}

			setState(125);
			match(CLOSE_PAREN);
			setState(126);
			match(TYPE_ANNOTATION);
			setState(127);
			type();
			setState(128);
			match(OPEN_BRACE);
			setState(129);
			match(NEWLINE);
			setState(130);
			function_statement();
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(131);
					match(NEWLINE);
					setState(132);
					function_statement();
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(138);
				match(NEWLINE);
				}
			}

			setState(141);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonStaticTypingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonStaticTypingParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonStaticTypingVisitor ) return ((PythonStaticTypingVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			expression();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(144);
				match(COMMA);
				setState(145);
				expression();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Typed_parametersContext extends ParserRuleContext {
		public List<Typed_parameterContext> typed_parameter() {
			return getRuleContexts(Typed_parameterContext.class);
		}
		public Typed_parameterContext typed_parameter(int i) {
			return getRuleContext(Typed_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonStaticTypingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonStaticTypingParser.COMMA, i);
		}
		public Typed_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).enterTyped_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).exitTyped_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonStaticTypingVisitor ) return ((PythonStaticTypingVisitor<? extends T>)visitor).visitTyped_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typed_parametersContext typed_parameters() throws RecognitionException {
		Typed_parametersContext _localctx = new Typed_parametersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typed_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			typed_parameter();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(152);
				match(COMMA);
				setState(153);
				typed_parameter();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Typed_parameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonStaticTypingParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(PythonStaticTypingParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Typed_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).enterTyped_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).exitTyped_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonStaticTypingVisitor ) return ((PythonStaticTypingVisitor<? extends T>)visitor).visitTyped_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typed_parameterContext typed_parameter() throws RecognitionException {
		Typed_parameterContext _localctx = new Typed_parameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typed_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(IDENTIFIER);
			setState(160);
			match(COLON);
			setState(161);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_definitionContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(PythonStaticTypingParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonStaticTypingParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(PythonStaticTypingParser.OPEN_BRACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(PythonStaticTypingParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonStaticTypingParser.NEWLINE, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(PythonStaticTypingParser.CLOSE_BRACE, 0); }
		public Class_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).enterClass_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).exitClass_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonStaticTypingVisitor ) return ((PythonStaticTypingVisitor<? extends T>)visitor).visitClass_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_definitionContext class_definition() throws RecognitionException {
		Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_class_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(CLASS);
			setState(164);
			match(IDENTIFIER);
			setState(165);
			match(OPEN_BRACE);
			setState(166);
			match(NEWLINE);
			setState(167);
			statements();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(168);
				match(NEWLINE);
				}
			}

			setState(171);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PythonStaticTypingParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PythonStaticTypingParser.SEMI, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonStaticTypingVisitor ) return ((PythonStaticTypingVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(RETURN);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288415094105178124L) != 0)) {
				{
				setState(174);
				expression();
				}
			}

			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(177);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(PythonStaticTypingParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PythonStaticTypingParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(PythonStaticTypingParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(PythonStaticTypingParser.MINUS, i);
		}
		public List<TerminalNode> STAR() { return getTokens(PythonStaticTypingParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PythonStaticTypingParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(PythonStaticTypingParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(PythonStaticTypingParser.SLASH, i);
		}
		public List<TerminalNode> AMPERSAND() { return getTokens(PythonStaticTypingParser.AMPERSAND); }
		public TerminalNode AMPERSAND(int i) {
			return getToken(PythonStaticTypingParser.AMPERSAND, i);
		}
		public List<TerminalNode> LESS() { return getTokens(PythonStaticTypingParser.LESS); }
		public TerminalNode LESS(int i) {
			return getToken(PythonStaticTypingParser.LESS, i);
		}
		public List<TerminalNode> GREATER() { return getTokens(PythonStaticTypingParser.GREATER); }
		public TerminalNode GREATER(int i) {
			return getToken(PythonStaticTypingParser.GREATER, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(PythonStaticTypingParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(PythonStaticTypingParser.PERCENT, i);
		}
		public List<TerminalNode> EQEQUAL() { return getTokens(PythonStaticTypingParser.EQEQUAL); }
		public TerminalNode EQEQUAL(int i) {
			return getToken(PythonStaticTypingParser.EQEQUAL, i);
		}
		public List<TerminalNode> NOTEQUAL() { return getTokens(PythonStaticTypingParser.NOTEQUAL); }
		public TerminalNode NOTEQUAL(int i) {
			return getToken(PythonStaticTypingParser.NOTEQUAL, i);
		}
		public List<TerminalNode> LESSEQUAL() { return getTokens(PythonStaticTypingParser.LESSEQUAL); }
		public TerminalNode LESSEQUAL(int i) {
			return getToken(PythonStaticTypingParser.LESSEQUAL, i);
		}
		public List<TerminalNode> GREATEREQUAL() { return getTokens(PythonStaticTypingParser.GREATEREQUAL); }
		public TerminalNode GREATEREQUAL(int i) {
			return getToken(PythonStaticTypingParser.GREATEREQUAL, i);
		}
		public List<TerminalNode> PLUSEQUAL() { return getTokens(PythonStaticTypingParser.PLUSEQUAL); }
		public TerminalNode PLUSEQUAL(int i) {
			return getToken(PythonStaticTypingParser.PLUSEQUAL, i);
		}
		public List<TerminalNode> MINEQUAL() { return getTokens(PythonStaticTypingParser.MINEQUAL); }
		public TerminalNode MINEQUAL(int i) {
			return getToken(PythonStaticTypingParser.MINEQUAL, i);
		}
		public List<TerminalNode> STAREQUAL() { return getTokens(PythonStaticTypingParser.STAREQUAL); }
		public TerminalNode STAREQUAL(int i) {
			return getToken(PythonStaticTypingParser.STAREQUAL, i);
		}
		public List<TerminalNode> SLASHEQUAL() { return getTokens(PythonStaticTypingParser.SLASHEQUAL); }
		public TerminalNode SLASHEQUAL(int i) {
			return getToken(PythonStaticTypingParser.SLASHEQUAL, i);
		}
		public List<TerminalNode> PERCENTEQUAL() { return getTokens(PythonStaticTypingParser.PERCENTEQUAL); }
		public TerminalNode PERCENTEQUAL(int i) {
			return getToken(PythonStaticTypingParser.PERCENTEQUAL, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonStaticTypingVisitor ) return ((PythonStaticTypingVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			primary();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1056562688L) != 0)) {
				{
				{
				setState(181);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1056562688L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(182);
				primary();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonStaticTypingParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(PythonStaticTypingParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(PythonStaticTypingParser.STRING, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PythonStaticTypingParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PythonStaticTypingParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(PythonStaticTypingParser.OPEN_BRACKET, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(PythonStaticTypingParser.CLOSE_BRACKET, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(PythonStaticTypingParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(PythonStaticTypingParser.CLOSE_BRACE, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonStaticTypingVisitor ) return ((PythonStaticTypingVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_primary);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				match(OPEN_PAREN);
				setState(192);
				expression();
				setState(193);
				match(CLOSE_PAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				match(OPEN_BRACKET);
				setState(196);
				expression_list();
				setState(197);
				match(CLOSE_BRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(199);
				match(OPEN_BRACE);
				setState(200);
				expression();
				setState(201);
				match(CLOSE_BRACE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(203);
				function_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonStaticTypingParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PythonStaticTypingParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PythonStaticTypingParser.CLOSE_PAREN, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonStaticTypingVisitor ) return ((PythonStaticTypingVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(IDENTIFIER);
			setState(207);
			match(OPEN_PAREN);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288415094105178124L) != 0)) {
				{
				setState(208);
				expression_list();
				}
			}

			setState(211);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PythonStaticTypingParser.INT, 0); }
		public TerminalNode STR() { return getToken(PythonStaticTypingParser.STR, 0); }
		public TerminalNode FLOAT() { return getToken(PythonStaticTypingParser.FLOAT, 0); }
		public TerminalNode COMPLEX() { return getToken(PythonStaticTypingParser.COMPLEX, 0); }
		public TerminalNode BOOLEAN() { return getToken(PythonStaticTypingParser.BOOLEAN, 0); }
		public TerminalNode LIST() { return getToken(PythonStaticTypingParser.LIST, 0); }
		public TerminalNode TUPLE() { return getToken(PythonStaticTypingParser.TUPLE, 0); }
		public TerminalNode DICT() { return getToken(PythonStaticTypingParser.DICT, 0); }
		public TerminalNode SET() { return getToken(PythonStaticTypingParser.SET, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonStaticTypingListener ) ((PythonStaticTypingListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonStaticTypingVisitor ) return ((PythonStaticTypingVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 287667426198290432L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u00d8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001+\b\u0001"+
		"\n\u0001\f\u0001.\t\u0001\u0001\u0001\u0001\u0001\u0004\u00012\b\u0001"+
		"\u000b\u0001\f\u00013\u0001\u0001\u0005\u00017\b\u0001\n\u0001\f\u0001"+
		":\t\u0001\u0001\u0001\u0005\u0001=\b\u0001\n\u0001\f\u0001@\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002J\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003S\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0003\u0004W\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005_\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t|\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u0086\b\t\n\t\f\t\u0089\t\t\u0001\t\u0003\t\u008c\b\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n\u0093\b\n\n\n\f\n\u0096\t\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u009b\b\u000b\n\u000b"+
		"\f\u000b\u009e\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00aa\b\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00b0\b\u000e\u0001\u000e\u0003\u000e\u00b3"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00b8\b\u000f"+
		"\n\u000f\f\u000f\u00bb\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00cd\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00d2\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0000\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0002\u0004\u0000\t\f\u000e"+
		"\u0010\u0013\u0017\u0019\u001d\u0001\u000019\u00e7\u0000&\u0001\u0000"+
		"\u0000\u0000\u0002,\u0001\u0000\u0000\u0000\u0004I\u0001\u0000\u0000\u0000"+
		"\u0006R\u0001\u0000\u0000\u0000\bT\u0001\u0000\u0000\u0000\nX\u0001\u0000"+
		"\u0000\u0000\f`\u0001\u0000\u0000\u0000\u000eg\u0001\u0000\u0000\u0000"+
		"\u0010n\u0001\u0000\u0000\u0000\u0012w\u0001\u0000\u0000\u0000\u0014\u008f"+
		"\u0001\u0000\u0000\u0000\u0016\u0097\u0001\u0000\u0000\u0000\u0018\u009f"+
		"\u0001\u0000\u0000\u0000\u001a\u00a3\u0001\u0000\u0000\u0000\u001c\u00ad"+
		"\u0001\u0000\u0000\u0000\u001e\u00b4\u0001\u0000\u0000\u0000 \u00cc\u0001"+
		"\u0000\u0000\u0000\"\u00ce\u0001\u0000\u0000\u0000$\u00d5\u0001\u0000"+
		"\u0000\u0000&\'\u0003\u0002\u0001\u0000\'(\u0005\u0000\u0000\u0001(\u0001"+
		"\u0001\u0000\u0000\u0000)+\u0005=\u0000\u0000*)\u0001\u0000\u0000\u0000"+
		"+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/8\u0003\u0004"+
		"\u0002\u000002\u0005=\u0000\u000010\u0001\u0000\u0000\u000023\u0001\u0000"+
		"\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u000057\u0003\u0004\u0002\u000061\u0001\u0000\u0000\u0000"+
		"7:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u00009>\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;=\u0005=\u0000"+
		"\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?\u0003\u0001\u0000\u0000\u0000"+
		"@>\u0001\u0000\u0000\u0000AJ\u0003\b\u0004\u0000BJ\u0003\n\u0005\u0000"+
		"CJ\u0003\f\u0006\u0000DJ\u0003\u000e\u0007\u0000EJ\u0003\u0010\b\u0000"+
		"FJ\u0003\u0012\t\u0000GJ\u0003\u001a\r\u0000HJ\u0005*\u0000\u0000IA\u0001"+
		"\u0000\u0000\u0000IB\u0001\u0000\u0000\u0000IC\u0001\u0000\u0000\u0000"+
		"ID\u0001\u0000\u0000\u0000IE\u0001\u0000\u0000\u0000IF\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000J\u0005\u0001"+
		"\u0000\u0000\u0000KS\u0003\b\u0004\u0000LS\u0003\n\u0005\u0000MS\u0003"+
		"\f\u0006\u0000NS\u0003\u000e\u0007\u0000OS\u0003\u0010\b\u0000PS\u0005"+
		"*\u0000\u0000QS\u0003\u001c\u000e\u0000RK\u0001\u0000\u0000\u0000RL\u0001"+
		"\u0000\u0000\u0000RM\u0001\u0000\u0000\u0000RN\u0001\u0000\u0000\u0000"+
		"RO\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000"+
		"\u0000S\u0007\u0001\u0000\u0000\u0000TV\u0003\u001e\u000f\u0000UW\u0005"+
		"=\u0000\u0000VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\t\u0001"+
		"\u0000\u0000\u0000XY\u0005:\u0000\u0000YZ\u0005\u0006\u0000\u0000Z[\u0003"+
		"$\u0012\u0000[\\\u0005\u0011\u0000\u0000\\^\u0003\u001e\u000f\u0000]_"+
		"\u0005\b\u0000\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_\u000b\u0001\u0000\u0000\u0000`a\u0005&\u0000\u0000ab\u0003\u001e\u000f"+
		"\u0000bc\u0005/\u0000\u0000cd\u0005=\u0000\u0000de\u0003\u0002\u0001\u0000"+
		"ef\u00050\u0000\u0000f\r\u0001\u0000\u0000\u0000gh\u0005\'\u0000\u0000"+
		"hi\u0003\u001e\u000f\u0000ij\u0005/\u0000\u0000jk\u0005=\u0000\u0000k"+
		"l\u0003\u0002\u0001\u0000lm\u00050\u0000\u0000m\u000f\u0001\u0000\u0000"+
		"\u0000no\u0005(\u0000\u0000op\u0005:\u0000\u0000pq\u0005\u0005\u0000\u0000"+
		"qr\u0003\u001e\u000f\u0000rs\u0005/\u0000\u0000st\u0005=\u0000\u0000t"+
		"u\u0003\u0002\u0001\u0000uv\u00050\u0000\u0000v\u0011\u0001\u0000\u0000"+
		"\u0000wx\u0005%\u0000\u0000xy\u0005:\u0000\u0000y{\u0005+\u0000\u0000"+
		"z|\u0003\u0016\u000b\u0000{z\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}~\u0005,\u0000\u0000~\u007f\u0005\u0004"+
		"\u0000\u0000\u007f\u0080\u0003$\u0012\u0000\u0080\u0081\u0005/\u0000\u0000"+
		"\u0081\u0082\u0005=\u0000\u0000\u0082\u0087\u0003\u0006\u0003\u0000\u0083"+
		"\u0084\u0005=\u0000\u0000\u0084\u0086\u0003\u0006\u0003\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008b"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008c"+
		"\u0005=\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0005"+
		"0\u0000\u0000\u008e\u0013\u0001\u0000\u0000\u0000\u008f\u0094\u0003\u001e"+
		"\u000f\u0000\u0090\u0091\u0005\u0007\u0000\u0000\u0091\u0093\u0003\u001e"+
		"\u000f\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000"+
		"\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0015\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0097\u009c\u0003\u0018\f\u0000\u0098\u0099\u0005\u0007\u0000"+
		"\u0000\u0099\u009b\u0003\u0018\f\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u0017\u0001\u0000\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0005:\u0000\u0000\u00a0"+
		"\u00a1\u0005\u0006\u0000\u0000\u00a1\u00a2\u0003$\u0012\u0000\u00a2\u0019"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005)\u0000\u0000\u00a4\u00a5\u0005"+
		":\u0000\u0000\u00a5\u00a6\u0005/\u0000\u0000\u00a6\u00a7\u0005=\u0000"+
		"\u0000\u00a7\u00a9\u0003\u0002\u0001\u0000\u00a8\u00aa\u0005=\u0000\u0000"+
		"\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u00050\u0000\u0000\u00ac"+
		"\u001b\u0001\u0000\u0000\u0000\u00ad\u00af\u0005#\u0000\u0000\u00ae\u00b0"+
		"\u0003\u001e\u000f\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00b3"+
		"\u0005\b\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b3\u001d\u0001\u0000\u0000\u0000\u00b4\u00b9\u0003"+
		" \u0010\u0000\u00b5\u00b6\u0007\u0000\u0000\u0000\u00b6\u00b8\u0003 \u0010"+
		"\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"+
		"\u0000\u00ba\u001f\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bc\u00cd\u0005:\u0000\u0000\u00bd\u00cd\u0005\u0002\u0000\u0000"+
		"\u00be\u00cd\u0005\u0003\u0000\u0000\u00bf\u00c0\u0005+\u0000\u0000\u00c0"+
		"\u00c1\u0003\u001e\u000f\u0000\u00c1\u00c2\u0005,\u0000\u0000\u00c2\u00cd"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005-\u0000\u0000\u00c4\u00c5\u0003"+
		"\u0014\n\u0000\u00c5\u00c6\u0005.\u0000\u0000\u00c6\u00cd\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0005/\u0000\u0000\u00c8\u00c9\u0003\u001e\u000f"+
		"\u0000\u00c9\u00ca\u00050\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cd\u0003\"\u0011\u0000\u00cc\u00bc\u0001\u0000\u0000\u0000\u00cc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00cc\u00be\u0001\u0000\u0000\u0000\u00cc"+
		"\u00bf\u0001\u0000\u0000\u0000\u00cc\u00c3\u0001\u0000\u0000\u0000\u00cc"+
		"\u00c7\u0001\u0000\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd"+
		"!\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005:\u0000\u0000\u00cf\u00d1\u0005"+
		"+\u0000\u0000\u00d0\u00d2\u0003\u0014\n\u0000\u00d1\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0005,\u0000\u0000\u00d4#\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0007\u0001\u0000\u0000\u00d6%\u0001\u0000\u0000\u0000\u0013"+
		",38>IRV^{\u0087\u008b\u0094\u009c\u00a9\u00af\u00b2\u00b9\u00cc\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}