// Generated from PSeIntParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PSeIntParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMENTARIO_LINEA=1, ASIGNAR=2, PARENTESIS_ABRIR=3, PARENTESIS_CERRAR=4, 
		CORCHETE_ABRIR=5, CORCHETE_CERRAR=6, SIGNOIGUAL=7, COMA=8, DOSPUNTOS=9, 
		PUNTOCOMA=10, SALTOLINEA=11, MAYOR=12, MENOR=13, IGUAL=14, MENORIGUAL=15, 
		MAYORIGUAL=16, DISTINTO=17, ESPAR=18, ESIMPAR=19, ESPOSITIVO=20, ESNEGATIVO=21, 
		ESCERO=22, ESDIVISIBLE=23, ES=24, CONJUNCION=25, DISYUNCION=26, NEGACION=27, 
		SUMA=28, RESTA=29, MULTIPLICACION=30, DIVISION=31, POTENCIACION=32, MODULO=33, 
		INT=34, FLOAT=35, STRING=36, STRING_SIMPLE=37, STRING_DOBLE=38, ALGORITMO=39, 
		FINALGORITMO=40, DEFINIR=41, COMO=42, REAL=43, ENTERO=44, LOGICO=45, VERDADERO=46, 
		FALSO=47, CARACTER=48, DIMENSION=49, LEER=50, ESCRIBIR=51, BORRAR=52, 
		ESPERARTECLA=53, ESPERAR=54, SEGUNDOS=55, MILISEGUNDOS=56, SINSALTAR=57, 
		SI=58, ENTONCES=59, SINO=60, FINSI=61, SEGUN=62, HACER=63, CONPASO=64, 
		DEOTROMODO=65, FINSEGUN=66, MIENTRAS=67, FINMIENTRAS=68, REPETIR=69, HASTAQUE=70, 
		PARA=71, PARACADA=72, DESDE=73, DE=74, HASTA=75, FINPARA=76, FUNCION=77, 
		PORVALOR=78, PORREFERENCIA=79, FINFUNCION=80, PI=81, RAIZ=82, ABS=83, 
		LN=84, EXP=85, SEN=86, COS=87, TAN=88, ASEN=89, ACOS=90, ATAN=91, AZAR=92, 
		ALEATORIO=93, TRUNC=94, REDON=95, CONVERTIRANUMERO=96, CONVERTIRATEXTO=97, 
		LONGITUD=98, SUBCADENA=99, MAYUSCULAS=100, MINUSCULAS=101, CONCATENAR=102, 
		IDENTIFICADOR=103, WS=104;
	public static final int
		RULE_programa = 0, RULE_inicioalgoritmo = 1, RULE_instruccion = 2, RULE_primitiva = 3, 
		RULE_definir_var = 4, RULE_dimension_var = 5, RULE_arreglo = 6, RULE_asignacion = 7, 
		RULE_lectura = 8, RULE_escritura = 9, RULE_otras = 10, RULE_borrando = 11, 
		RULE_esperar_tecla = 12, RULE_esperar_tiempo = 13, RULE_definir_func = 14, 
		RULE_argumentos = 15, RULE_funciones = 16, RULE_funciones_arg = 17, RULE_control = 18, 
		RULE_condicional = 19, RULE_si_op = 20, RULE_segun_op = 21, RULE_repetitiva = 22, 
		RULE_mientras_op = 23, RULE_repetir_op = 24, RULE_para_op = 25, RULE_llamar_funcion = 26, 
		RULE_expr = 27, RULE_exp = 28, RULE_condicion = 29, RULE_expr_relacional = 30, 
		RULE_expr_logico = 31, RULE_mayor = 32, RULE_menor = 33, RULE_igual = 34, 
		RULE_menorigual = 35, RULE_mayorigual = 36, RULE_distinto = 37, RULE_conjuncion = 38, 
		RULE_disyuncion = 39, RULE_negacion = 40, RULE_suma = 41, RULE_resta = 42, 
		RULE_multiplicacion = 43, RULE_division = 44, RULE_potenciacion = 45, 
		RULE_modulo = 46, RULE_variable = 47, RULE_identificador = 48, RULE_asignar = 49, 
		RULE_parentesis_abrir = 50, RULE_parentesis_cerrar = 51, RULE_corchete_abrir = 52, 
		RULE_corchete_cerrar = 53, RULE_saltolinea = 54, RULE_signoigual = 55, 
		RULE_coma = 56, RULE_dospuntos = 57, RULE_puntocoma = 58, RULE_algoritmo = 59, 
		RULE_finalgoritmo = 60, RULE_definir = 61, RULE_dimension = 62, RULE_como = 63, 
		RULE_real = 64, RULE_entero = 65, RULE_logico = 66, RULE_verdadero = 67, 
		RULE_falso = 68, RULE_caracter = 69, RULE_leer = 70, RULE_escribir = 71, 
		RULE_borrar = 72, RULE_esperartecla = 73, RULE_esperar = 74, RULE_segundos = 75, 
		RULE_milisegundos = 76, RULE_sinsaltar = 77, RULE_si = 78, RULE_entonces = 79, 
		RULE_sino = 80, RULE_finsi = 81, RULE_para = 82, RULE_paracada = 83, RULE_de = 84, 
		RULE_desde = 85, RULE_hasta = 86, RULE_conpaso = 87, RULE_hacer = 88, 
		RULE_finpara = 89, RULE_mientras = 90, RULE_finmientras = 91, RULE_repetir = 92, 
		RULE_hastaque = 93, RULE_segun = 94, RULE_deotromodo = 95, RULE_finsegun = 96, 
		RULE_funcion = 97, RULE_porvalor = 98, RULE_porreferencia = 99, RULE_finfuncion = 100, 
		RULE_pi = 101, RULE_raiz = 102, RULE_abs = 103, RULE_ln = 104, RULE_expf = 105, 
		RULE_sen = 106, RULE_cos = 107, RULE_tan = 108, RULE_asen = 109, RULE_acos = 110, 
		RULE_atan = 111, RULE_trunc = 112, RULE_redon = 113, RULE_azar = 114, 
		RULE_aleatorio = 115, RULE_longitud = 116, RULE_mayusculas = 117, RULE_minusculas = 118, 
		RULE_subcadena = 119, RULE_concatenar = 120, RULE_convertiranumero = 121, 
		RULE_convertiratexto = 122, RULE_string = 123, RULE_numero = 124, RULE_valor = 125, 
		RULE_logica = 126;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "inicioalgoritmo", "instruccion", "primitiva", "definir_var", 
			"dimension_var", "arreglo", "asignacion", "lectura", "escritura", "otras", 
			"borrando", "esperar_tecla", "esperar_tiempo", "definir_func", "argumentos", 
			"funciones", "funciones_arg", "control", "condicional", "si_op", "segun_op", 
			"repetitiva", "mientras_op", "repetir_op", "para_op", "llamar_funcion", 
			"expr", "exp", "condicion", "expr_relacional", "expr_logico", "mayor", 
			"menor", "igual", "menorigual", "mayorigual", "distinto", "conjuncion", 
			"disyuncion", "negacion", "suma", "resta", "multiplicacion", "division", 
			"potenciacion", "modulo", "variable", "identificador", "asignar", "parentesis_abrir", 
			"parentesis_cerrar", "corchete_abrir", "corchete_cerrar", "saltolinea", 
			"signoigual", "coma", "dospuntos", "puntocoma", "algoritmo", "finalgoritmo", 
			"definir", "dimension", "como", "real", "entero", "logico", "verdadero", 
			"falso", "caracter", "leer", "escribir", "borrar", "esperartecla", "esperar", 
			"segundos", "milisegundos", "sinsaltar", "si", "entonces", "sino", "finsi", 
			"para", "paracada", "de", "desde", "hasta", "conpaso", "hacer", "finpara", 
			"mientras", "finmientras", "repetir", "hastaque", "segun", "deotromodo", 
			"finsegun", "funcion", "porvalor", "porreferencia", "finfuncion", "pi", 
			"raiz", "abs", "ln", "expf", "sen", "cos", "tan", "asen", "acos", "atan", 
			"trunc", "redon", "azar", "aleatorio", "longitud", "mayusculas", "minusculas", 
			"subcadena", "concatenar", "convertiranumero", "convertiratexto", "string", 
			"numero", "valor", "logica"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", "'['", "']'", "'='", "','", "':'", "';'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMENTARIO_LINEA", "ASIGNAR", "PARENTESIS_ABRIR", "PARENTESIS_CERRAR", 
			"CORCHETE_ABRIR", "CORCHETE_CERRAR", "SIGNOIGUAL", "COMA", "DOSPUNTOS", 
			"PUNTOCOMA", "SALTOLINEA", "MAYOR", "MENOR", "IGUAL", "MENORIGUAL", "MAYORIGUAL", 
			"DISTINTO", "ESPAR", "ESIMPAR", "ESPOSITIVO", "ESNEGATIVO", "ESCERO", 
			"ESDIVISIBLE", "ES", "CONJUNCION", "DISYUNCION", "NEGACION", "SUMA", 
			"RESTA", "MULTIPLICACION", "DIVISION", "POTENCIACION", "MODULO", "INT", 
			"FLOAT", "STRING", "STRING_SIMPLE", "STRING_DOBLE", "ALGORITMO", "FINALGORITMO", 
			"DEFINIR", "COMO", "REAL", "ENTERO", "LOGICO", "VERDADERO", "FALSO", 
			"CARACTER", "DIMENSION", "LEER", "ESCRIBIR", "BORRAR", "ESPERARTECLA", 
			"ESPERAR", "SEGUNDOS", "MILISEGUNDOS", "SINSALTAR", "SI", "ENTONCES", 
			"SINO", "FINSI", "SEGUN", "HACER", "CONPASO", "DEOTROMODO", "FINSEGUN", 
			"MIENTRAS", "FINMIENTRAS", "REPETIR", "HASTAQUE", "PARA", "PARACADA", 
			"DESDE", "DE", "HASTA", "FINPARA", "FUNCION", "PORVALOR", "PORREFERENCIA", 
			"FINFUNCION", "PI", "RAIZ", "ABS", "LN", "EXP", "SEN", "COS", "TAN", 
			"ASEN", "ACOS", "ATAN", "AZAR", "ALEATORIO", "TRUNC", "REDON", "CONVERTIRANUMERO", 
			"CONVERTIRATEXTO", "LONGITUD", "SUBCADENA", "MAYUSCULAS", "MINUSCULAS", 
			"CONCATENAR", "IDENTIFICADOR", "WS"
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
	public String getGrammarFileName() { return "PSeIntParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PSeIntParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public InicioalgoritmoContext inicioalgoritmo() {
			return getRuleContext(InicioalgoritmoContext.class,0);
		}
		public FinalgoritmoContext finalgoritmo() {
			return getRuleContext(FinalgoritmoContext.class,0);
		}
		public List<Definir_funcContext> definir_func() {
			return getRuleContexts(Definir_funcContext.class);
		}
		public Definir_funcContext definir_func(int i) {
			return getRuleContext(Definir_funcContext.class,i);
		}
		public List<SaltolineaContext> saltolinea() {
			return getRuleContexts(SaltolineaContext.class);
		}
		public SaltolineaContext saltolinea(int i) {
			return getRuleContext(SaltolineaContext.class,i);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCION) {
				{
				{
				setState(254);
				definir_func();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			inicioalgoritmo();
			setState(262); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(261);
				saltolinea();
				}
				}
				setState(264); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SALTOLINEA );
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (DEFINIR - 41)) | (1L << (DIMENSION - 41)) | (1L << (LEER - 41)) | (1L << (ESCRIBIR - 41)) | (1L << (BORRAR - 41)) | (1L << (ESPERARTECLA - 41)) | (1L << (ESPERAR - 41)) | (1L << (SI - 41)) | (1L << (SEGUN - 41)) | (1L << (MIENTRAS - 41)) | (1L << (REPETIR - 41)) | (1L << (PARA - 41)) | (1L << (PARACADA - 41)) | (1L << (IDENTIFICADOR - 41)))) != 0)) {
				{
				{
				setState(266);
				instruccion();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			finalgoritmo();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SALTOLINEA) {
				{
				{
				setState(273);
				saltolinea();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCION) {
				{
				{
				setState(279);
				definir_func();
				}
				}
				setState(284);
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

	public static class InicioalgoritmoContext extends ParserRuleContext {
		public AlgoritmoContext algoritmo() {
			return getRuleContext(AlgoritmoContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public InicioalgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicioalgoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterInicioalgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitInicioalgoritmo(this);
		}
	}

	public final InicioalgoritmoContext inicioalgoritmo() throws RecognitionException {
		InicioalgoritmoContext _localctx = new InicioalgoritmoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inicioalgoritmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			algoritmo();
			setState(286);
			identificador();
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

	public static class InstruccionContext extends ParserRuleContext {
		public PrimitivaContext primitiva() {
			return getRuleContext(PrimitivaContext.class,0);
		}
		public PuntocomaContext puntocoma() {
			return getRuleContext(PuntocomaContext.class,0);
		}
		public List<SaltolineaContext> saltolinea() {
			return getRuleContexts(SaltolineaContext.class);
		}
		public SaltolineaContext saltolinea(int i) {
			return getRuleContext(SaltolineaContext.class,i);
		}
		public ControlContext control() {
			return getRuleContext(ControlContext.class,0);
		}
		public Llamar_funcionContext llamar_funcion() {
			return getRuleContext(Llamar_funcionContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitInstruccion(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		int _la;
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				primitiva();
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(289);
					puntocoma();
					}
				}

				setState(293); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(292);
					saltolinea();
					}
					}
					setState(295); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SALTOLINEA );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				control();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				llamar_funcion();
				setState(300); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(299);
					saltolinea();
					}
					}
					setState(302); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SALTOLINEA );
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

	public static class PrimitivaContext extends ParserRuleContext {
		public Definir_varContext definir_var() {
			return getRuleContext(Definir_varContext.class,0);
		}
		public Dimension_varContext dimension_var() {
			return getRuleContext(Dimension_varContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public LecturaContext lectura() {
			return getRuleContext(LecturaContext.class,0);
		}
		public EscrituraContext escritura() {
			return getRuleContext(EscrituraContext.class,0);
		}
		public OtrasContext otras() {
			return getRuleContext(OtrasContext.class,0);
		}
		public PrimitivaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterPrimitiva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitPrimitiva(this);
		}
	}

	public final PrimitivaContext primitiva() throws RecognitionException {
		PrimitivaContext _localctx = new PrimitivaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_primitiva);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				definir_var();
				}
				break;
			case DIMENSION:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				dimension_var();
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				asignacion();
				}
				break;
			case LEER:
				enterOuterAlt(_localctx, 4);
				{
				setState(309);
				lectura();
				}
				break;
			case ESCRIBIR:
				enterOuterAlt(_localctx, 5);
				{
				setState(310);
				escritura();
				}
				break;
			case BORRAR:
			case ESPERARTECLA:
			case ESPERAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(311);
				otras();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Definir_varContext extends ParserRuleContext {
		public DefinirContext definir() {
			return getRuleContext(DefinirContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ComoContext como() {
			return getRuleContext(ComoContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
		public CaracterContext caracter() {
			return getRuleContext(CaracterContext.class,0);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public Definir_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definir_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterDefinir_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitDefinir_var(this);
		}
	}

	public final Definir_varContext definir_var() throws RecognitionException {
		Definir_varContext _localctx = new Definir_varContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_definir_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			definir();
			setState(315);
			variable();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(316);
				coma();
				setState(317);
				variable();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			como();
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL:
				{
				setState(325);
				real();
				}
				break;
			case ENTERO:
				{
				setState(326);
				entero();
				}
				break;
			case LOGICO:
				{
				setState(327);
				logico();
				}
				break;
			case CARACTER:
				{
				setState(328);
				caracter();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Dimension_varContext extends ParserRuleContext {
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public List<ArregloContext> arreglo() {
			return getRuleContexts(ArregloContext.class);
		}
		public ArregloContext arreglo(int i) {
			return getRuleContext(ArregloContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public PuntocomaContext puntocoma() {
			return getRuleContext(PuntocomaContext.class,0);
		}
		public Dimension_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterDimension_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitDimension_var(this);
		}
	}

	public final Dimension_varContext dimension_var() throws RecognitionException {
		Dimension_varContext _localctx = new Dimension_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dimension_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			dimension();
			setState(332);
			arreglo();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(333);
				coma();
				setState(334);
				arreglo();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(341);
				puntocoma();
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

	public static class ArregloContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Corchete_abrirContext corchete_abrir() {
			return getRuleContext(Corchete_abrirContext.class,0);
		}
		public Parentesis_abrirContext parentesis_abrir() {
			return getRuleContext(Parentesis_abrirContext.class,0);
		}
		public Corchete_cerrarContext corchete_cerrar() {
			return getRuleContext(Corchete_cerrarContext.class,0);
		}
		public Parentesis_cerrarContext parentesis_cerrar() {
			return getRuleContext(Parentesis_cerrarContext.class,0);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public ArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterArreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitArreglo(this);
		}
	}

	public final ArregloContext arreglo() throws RecognitionException {
		ArregloContext _localctx = new ArregloContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arreglo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			variable();
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CORCHETE_ABRIR:
				{
				setState(345);
				corchete_abrir();
				}
				break;
			case PARENTESIS_ABRIR:
				{
				setState(346);
				parentesis_abrir();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(349);
			expr();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(350);
				coma();
				setState(351);
				expr();
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CORCHETE_CERRAR:
				{
				setState(358);
				corchete_cerrar();
				}
				break;
			case PARENTESIS_CERRAR:
				{
				setState(359);
				parentesis_cerrar();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AsignacionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ArregloContext arreglo() {
			return getRuleContext(ArregloContext.class,0);
		}
		public AsignarContext asignar() {
			return getRuleContext(AsignarContext.class,0);
		}
		public SignoigualContext signoigual() {
			return getRuleContext(SignoigualContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(362);
				variable();
				}
				break;
			case 2:
				{
				setState(363);
				arreglo();
				}
				break;
			}
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASIGNAR:
				{
				setState(366);
				asignar();
				}
				break;
			case SIGNOIGUAL:
				{
				setState(367);
				signoigual();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(370);
			expr();
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

	public static class LecturaContext extends ParserRuleContext {
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public LecturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lectura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterLectura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitLectura(this);
		}
	}

	public final LecturaContext lectura() throws RecognitionException {
		LecturaContext _localctx = new LecturaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lectura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			leer();
			setState(373);
			variable();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(374);
				coma();
				setState(375);
				variable();
				}
				}
				setState(381);
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

	public static class EscrituraContext extends ParserRuleContext {
		public EscribirContext escribir() {
			return getRuleContext(EscribirContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<SinsaltarContext> sinsaltar() {
			return getRuleContexts(SinsaltarContext.class);
		}
		public SinsaltarContext sinsaltar(int i) {
			return getRuleContext(SinsaltarContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public EscrituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escritura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterEscritura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitEscritura(this);
		}
	}

	public final EscrituraContext escritura() throws RecognitionException {
		EscrituraContext _localctx = new EscrituraContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_escritura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			escribir();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINSALTAR) {
				{
				{
				setState(383);
				sinsaltar();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
			expr();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINSALTAR) {
				{
				{
				setState(390);
				sinsaltar();
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(396);
				coma();
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SINSALTAR) {
					{
					{
					setState(397);
					sinsaltar();
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(403);
				expr();
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SINSALTAR) {
					{
					{
					setState(404);
					sinsaltar();
					}
					}
					setState(409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(414);
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

	public static class OtrasContext extends ParserRuleContext {
		public BorrandoContext borrando() {
			return getRuleContext(BorrandoContext.class,0);
		}
		public Esperar_teclaContext esperar_tecla() {
			return getRuleContext(Esperar_teclaContext.class,0);
		}
		public Esperar_tiempoContext esperar_tiempo() {
			return getRuleContext(Esperar_tiempoContext.class,0);
		}
		public OtrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterOtras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitOtras(this);
		}
	}

	public final OtrasContext otras() throws RecognitionException {
		OtrasContext _localctx = new OtrasContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_otras);
		try {
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BORRAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				borrando();
				}
				break;
			case ESPERARTECLA:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				esperar_tecla();
				}
				break;
			case ESPERAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				esperar_tiempo();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BorrandoContext extends ParserRuleContext {
		public BorrarContext borrar() {
			return getRuleContext(BorrarContext.class,0);
		}
		public BorrandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borrando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterBorrando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitBorrando(this);
		}
	}

	public final BorrandoContext borrando() throws RecognitionException {
		BorrandoContext _localctx = new BorrandoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_borrando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			borrar();
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

	public static class Esperar_teclaContext extends ParserRuleContext {
		public EsperarteclaContext esperartecla() {
			return getRuleContext(EsperarteclaContext.class,0);
		}
		public Esperar_teclaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esperar_tecla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterEsperar_tecla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitEsperar_tecla(this);
		}
	}

	public final Esperar_teclaContext esperar_tecla() throws RecognitionException {
		Esperar_teclaContext _localctx = new Esperar_teclaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_esperar_tecla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			esperartecla();
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

	public static class Esperar_tiempoContext extends ParserRuleContext {
		public EsperarContext esperar() {
			return getRuleContext(EsperarContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SegundosContext segundos() {
			return getRuleContext(SegundosContext.class,0);
		}
		public MilisegundosContext milisegundos() {
			return getRuleContext(MilisegundosContext.class,0);
		}
		public Esperar_tiempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esperar_tiempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterEsperar_tiempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitEsperar_tiempo(this);
		}
	}

	public final Esperar_tiempoContext esperar_tiempo() throws RecognitionException {
		Esperar_tiempoContext _localctx = new Esperar_tiempoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_esperar_tiempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			esperar();
			setState(425);
			expr();
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEGUNDOS:
				{
				setState(426);
				segundos();
				}
				break;
			case MILISEGUNDOS:
				{
				setState(427);
				milisegundos();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Definir_funcContext extends ParserRuleContext {
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public FinfuncionContext finfuncion() {
			return getRuleContext(FinfuncionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<SaltolineaContext> saltolinea() {
			return getRuleContexts(SaltolineaContext.class);
		}
		public SaltolineaContext saltolinea(int i) {
			return getRuleContext(SaltolineaContext.class,i);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public AsignarContext asignar() {
			return getRuleContext(AsignarContext.class,0);
		}
		public SignoigualContext signoigual() {
			return getRuleContext(SignoigualContext.class,0);
		}
		public Definir_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definir_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterDefinir_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitDefinir_func(this);
		}
	}

	public final Definir_funcContext definir_func() throws RecognitionException {
		Definir_funcContext _localctx = new Definir_funcContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_definir_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			funcion();
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(431);
				variable();
				setState(434);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASIGNAR:
					{
					setState(432);
					asignar();
					}
					break;
				case SIGNOIGUAL:
					{
					setState(433);
					signoigual();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(438);
			identificador();
			setState(439);
			argumentos();
			setState(441); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(440);
				saltolinea();
				}
				}
				setState(443); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SALTOLINEA );
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (DEFINIR - 41)) | (1L << (DIMENSION - 41)) | (1L << (LEER - 41)) | (1L << (ESCRIBIR - 41)) | (1L << (BORRAR - 41)) | (1L << (ESPERARTECLA - 41)) | (1L << (ESPERAR - 41)) | (1L << (SI - 41)) | (1L << (SEGUN - 41)) | (1L << (MIENTRAS - 41)) | (1L << (REPETIR - 41)) | (1L << (PARA - 41)) | (1L << (PARACADA - 41)) | (1L << (IDENTIFICADOR - 41)))) != 0)) {
				{
				{
				setState(445);
				instruccion();
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
			finfuncion();
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SALTOLINEA) {
				{
				{
				setState(452);
				saltolinea();
				}
				}
				setState(457);
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

	public static class ArgumentosContext extends ParserRuleContext {
		public Parentesis_abrirContext parentesis_abrir() {
			return getRuleContext(Parentesis_abrirContext.class,0);
		}
		public Parentesis_cerrarContext parentesis_cerrar() {
			return getRuleContext(Parentesis_cerrarContext.class,0);
		}
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public List<PorvalorContext> porvalor() {
			return getRuleContexts(PorvalorContext.class);
		}
		public PorvalorContext porvalor(int i) {
			return getRuleContext(PorvalorContext.class,i);
		}
		public List<PorreferenciaContext> porreferencia() {
			return getRuleContexts(PorreferenciaContext.class);
		}
		public PorreferenciaContext porreferencia(int i) {
			return getRuleContext(PorreferenciaContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitArgumentos(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_argumentos);
		int _la;
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTESIS_ABRIR) {
					{
					setState(458);
					parentesis_abrir();
					setState(459);
					parentesis_cerrar();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				parentesis_abrir();
				setState(464);
				identificador();
				setState(467);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PORVALOR:
					{
					setState(465);
					porvalor();
					}
					break;
				case PORREFERENCIA:
					{
					setState(466);
					porreferencia();
					}
					break;
				case PARENTESIS_CERRAR:
				case COMA:
					break;
				default:
					break;
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(469);
					coma();
					setState(470);
					identificador();
					setState(473);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PORVALOR:
						{
						setState(471);
						porvalor();
						}
						break;
					case PORREFERENCIA:
						{
						setState(472);
						porreferencia();
						}
						break;
					case PARENTESIS_CERRAR:
					case COMA:
						break;
					default:
						break;
					}
					}
					}
					setState(479);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(480);
				parentesis_cerrar();
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

	public static class FuncionesContext extends ParserRuleContext {
		public PiContext pi() {
			return getRuleContext(PiContext.class,0);
		}
		public RaizContext raiz() {
			return getRuleContext(RaizContext.class,0);
		}
		public Funciones_argContext funciones_arg() {
			return getRuleContext(Funciones_argContext.class,0);
		}
		public AbsContext abs() {
			return getRuleContext(AbsContext.class,0);
		}
		public LnContext ln() {
			return getRuleContext(LnContext.class,0);
		}
		public ExpfContext expf() {
			return getRuleContext(ExpfContext.class,0);
		}
		public SenContext sen() {
			return getRuleContext(SenContext.class,0);
		}
		public CosContext cos() {
			return getRuleContext(CosContext.class,0);
		}
		public TanContext tan() {
			return getRuleContext(TanContext.class,0);
		}
		public AsenContext asen() {
			return getRuleContext(AsenContext.class,0);
		}
		public AcosContext acos() {
			return getRuleContext(AcosContext.class,0);
		}
		public AtanContext atan() {
			return getRuleContext(AtanContext.class,0);
		}
		public AzarContext azar() {
			return getRuleContext(AzarContext.class,0);
		}
		public AleatorioContext aleatorio() {
			return getRuleContext(AleatorioContext.class,0);
		}
		public Parentesis_abrirContext parentesis_abrir() {
			return getRuleContext(Parentesis_abrirContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public Parentesis_cerrarContext parentesis_cerrar() {
			return getRuleContext(Parentesis_cerrarContext.class,0);
		}
		public TruncContext trunc() {
			return getRuleContext(TruncContext.class,0);
		}
		public RedonContext redon() {
			return getRuleContext(RedonContext.class,0);
		}
		public ConvertiranumeroContext convertiranumero() {
			return getRuleContext(ConvertiranumeroContext.class,0);
		}
		public ConvertiratextoContext convertiratexto() {
			return getRuleContext(ConvertiratextoContext.class,0);
		}
		public LongitudContext longitud() {
			return getRuleContext(LongitudContext.class,0);
		}
		public SubcadenaContext subcadena() {
			return getRuleContext(SubcadenaContext.class,0);
		}
		public MayusculasContext mayusculas() {
			return getRuleContext(MayusculasContext.class,0);
		}
		public MinusculasContext minusculas() {
			return getRuleContext(MinusculasContext.class,0);
		}
		public ConcatenarContext concatenar() {
			return getRuleContext(ConcatenarContext.class,0);
		}
		public FuncionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterFunciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitFunciones(this);
		}
	}

	public final FuncionesContext funciones() throws RecognitionException {
		FuncionesContext _localctx = new FuncionesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funciones);
		try {
			setState(562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PI:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				pi();
				}
				break;
			case RAIZ:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				raiz();
				setState(486);
				funciones_arg();
				}
				break;
			case ABS:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				abs();
				setState(489);
				funciones_arg();
				}
				break;
			case LN:
				enterOuterAlt(_localctx, 4);
				{
				setState(491);
				ln();
				setState(492);
				funciones_arg();
				}
				break;
			case EXP:
				enterOuterAlt(_localctx, 5);
				{
				setState(494);
				expf();
				setState(495);
				funciones_arg();
				}
				break;
			case SEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(497);
				sen();
				setState(498);
				funciones_arg();
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 7);
				{
				setState(500);
				cos();
				setState(501);
				funciones_arg();
				}
				break;
			case TAN:
				enterOuterAlt(_localctx, 8);
				{
				setState(503);
				tan();
				setState(504);
				funciones_arg();
				}
				break;
			case ASEN:
				enterOuterAlt(_localctx, 9);
				{
				setState(506);
				asen();
				setState(507);
				funciones_arg();
				}
				break;
			case ACOS:
				enterOuterAlt(_localctx, 10);
				{
				setState(509);
				acos();
				setState(510);
				funciones_arg();
				}
				break;
			case ATAN:
				enterOuterAlt(_localctx, 11);
				{
				setState(512);
				atan();
				setState(513);
				funciones_arg();
				}
				break;
			case AZAR:
				enterOuterAlt(_localctx, 12);
				{
				setState(515);
				azar();
				setState(516);
				funciones_arg();
				}
				break;
			case ALEATORIO:
				enterOuterAlt(_localctx, 13);
				{
				setState(518);
				aleatorio();
				setState(519);
				parentesis_abrir();
				setState(520);
				expr();
				setState(521);
				coma();
				setState(522);
				expr();
				setState(523);
				parentesis_cerrar();
				}
				break;
			case TRUNC:
				enterOuterAlt(_localctx, 14);
				{
				setState(525);
				trunc();
				setState(526);
				funciones_arg();
				}
				break;
			case REDON:
				enterOuterAlt(_localctx, 15);
				{
				setState(528);
				redon();
				setState(529);
				funciones_arg();
				}
				break;
			case CONVERTIRANUMERO:
				enterOuterAlt(_localctx, 16);
				{
				setState(531);
				convertiranumero();
				setState(532);
				funciones_arg();
				}
				break;
			case CONVERTIRATEXTO:
				enterOuterAlt(_localctx, 17);
				{
				setState(534);
				convertiratexto();
				setState(535);
				funciones_arg();
				}
				break;
			case LONGITUD:
				enterOuterAlt(_localctx, 18);
				{
				setState(537);
				longitud();
				setState(538);
				funciones_arg();
				}
				break;
			case SUBCADENA:
				enterOuterAlt(_localctx, 19);
				{
				setState(540);
				subcadena();
				setState(541);
				parentesis_abrir();
				setState(542);
				expr();
				setState(543);
				coma();
				setState(544);
				expr();
				setState(545);
				coma();
				setState(546);
				expr();
				setState(547);
				parentesis_cerrar();
				}
				break;
			case MAYUSCULAS:
				enterOuterAlt(_localctx, 20);
				{
				setState(549);
				mayusculas();
				setState(550);
				funciones_arg();
				}
				break;
			case MINUSCULAS:
				enterOuterAlt(_localctx, 21);
				{
				setState(552);
				minusculas();
				setState(553);
				funciones_arg();
				}
				break;
			case CONCATENAR:
				enterOuterAlt(_localctx, 22);
				{
				setState(555);
				concatenar();
				setState(556);
				parentesis_abrir();
				setState(557);
				expr();
				setState(558);
				coma();
				setState(559);
				expr();
				setState(560);
				parentesis_cerrar();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Funciones_argContext extends ParserRuleContext {
		public Parentesis_abrirContext parentesis_abrir() {
			return getRuleContext(Parentesis_abrirContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Parentesis_cerrarContext parentesis_cerrar() {
			return getRuleContext(Parentesis_cerrarContext.class,0);
		}
		public Funciones_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funciones_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterFunciones_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitFunciones_arg(this);
		}
	}

	public final Funciones_argContext funciones_arg() throws RecognitionException {
		Funciones_argContext _localctx = new Funciones_argContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_funciones_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			parentesis_abrir();
			setState(565);
			expr();
			setState(566);
			parentesis_cerrar();
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

	public static class ControlContext extends ParserRuleContext {
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public RepetitivaContext repetitiva() {
			return getRuleContext(RepetitivaContext.class,0);
		}
		public ControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitControl(this);
		}
	}

	public final ControlContext control() throws RecognitionException {
		ControlContext _localctx = new ControlContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_control);
		try {
			setState(570);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SI:
			case SEGUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				condicional();
				}
				break;
			case MIENTRAS:
			case REPETIR:
			case PARA:
			case PARACADA:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				repetitiva();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CondicionalContext extends ParserRuleContext {
		public Si_opContext si_op() {
			return getRuleContext(Si_opContext.class,0);
		}
		public Segun_opContext segun_op() {
			return getRuleContext(Segun_opContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condicional);
		try {
			setState(574);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SI:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				si_op();
				}
				break;
			case SEGUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				segun_op();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Si_opContext extends ParserRuleContext {
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public FinsiContext finsi() {
			return getRuleContext(FinsiContext.class,0);
		}
		public EntoncesContext entonces() {
			return getRuleContext(EntoncesContext.class,0);
		}
		public List<PuntocomaContext> puntocoma() {
			return getRuleContexts(PuntocomaContext.class);
		}
		public PuntocomaContext puntocoma(int i) {
			return getRuleContext(PuntocomaContext.class,i);
		}
		public List<SaltolineaContext> saltolinea() {
			return getRuleContexts(SaltolineaContext.class);
		}
		public SaltolineaContext saltolinea(int i) {
			return getRuleContext(SaltolineaContext.class,i);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public Si_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterSi_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitSi_op(this);
		}
	}

	public final Si_opContext si_op() throws RecognitionException {
		Si_opContext _localctx = new Si_opContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_si_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			si();
			setState(577);
			condicion();
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENTONCES) {
				{
				setState(578);
				entonces();
				}
			}

			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTOCOMA) {
				{
				setState(581);
				puntocoma();
				}
			}

			setState(585); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(584);
				saltolinea();
				}
				}
				setState(587); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SALTOLINEA );
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (DEFINIR - 41)) | (1L << (DIMENSION - 41)) | (1L << (LEER - 41)) | (1L << (ESCRIBIR - 41)) | (1L << (BORRAR - 41)) | (1L << (ESPERARTECLA - 41)) | (1L << (ESPERAR - 41)) | (1L << (SI - 41)) | (1L << (SEGUN - 41)) | (1L << (MIENTRAS - 41)) | (1L << (REPETIR - 41)) | (1L << (PARA - 41)) | (1L << (PARACADA - 41)) | (1L << (IDENTIFICADOR - 41)))) != 0)) {
				{
				{
				setState(589);
				instruccion();
				}
				}
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(595);
				sino();
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(596);
					puntocoma();
					}
				}

				setState(600); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(599);
					saltolinea();
					}
					}
					setState(602); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SALTOLINEA );
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (DEFINIR - 41)) | (1L << (DIMENSION - 41)) | (1L << (LEER - 41)) | (1L << (ESCRIBIR - 41)) | (1L << (BORRAR - 41)) | (1L << (ESPERARTECLA - 41)) | (1L << (ESPERAR - 41)) | (1L << (SI - 41)) | (1L << (SEGUN - 41)) | (1L << (MIENTRAS - 41)) | (1L << (REPETIR - 41)) | (1L << (PARA - 41)) | (1L << (PARACADA - 41)) | (1L << (IDENTIFICADOR - 41)))) != 0)) {
					{
					{
					setState(604);
					instruccion();
					}
					}
					setState(609);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(612);
			finsi();
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTOCOMA) {
				{
				setState(613);
				puntocoma();
				}
			}

			setState(617); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(616);
				saltolinea();
				}
				}
				setState(619); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SALTOLINEA );
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

	public static class Segun_opContext extends ParserRuleContext {
		public SegunContext segun() {
			return getRuleContext(SegunContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FinsegunContext finsegun() {
			return getRuleContext(FinsegunContext.class,0);
		}
		public HacerContext hacer() {
			return getRuleContext(HacerContext.class,0);
		}
		public List<PuntocomaContext> puntocoma() {
			return getRuleContexts(PuntocomaContext.class);
		}
		public PuntocomaContext puntocoma(int i) {
			return getRuleContext(PuntocomaContext.class,i);
		}
		public List<SaltolineaContext> saltolinea() {
			return getRuleContexts(SaltolineaContext.class);
		}
		public SaltolineaContext saltolinea(int i) {
			return getRuleContext(SaltolineaContext.class,i);
		}
		public List<DospuntosContext> dospuntos() {
			return getRuleContexts(DospuntosContext.class);
		}
		public DospuntosContext dospuntos(int i) {
			return getRuleContext(DospuntosContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<DeotromodoContext> deotromodo() {
			return getRuleContexts(DeotromodoContext.class);
		}
		public DeotromodoContext deotromodo(int i) {
			return getRuleContext(DeotromodoContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public Segun_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segun_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterSegun_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitSegun_op(this);
		}
	}

	public final Segun_opContext segun_op() throws RecognitionException {
		Segun_opContext _localctx = new Segun_opContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_segun_op);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			segun();
			setState(622);
			variable();
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HACER) {
				{
				setState(623);
				hacer();
				}
			}

			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTOCOMA) {
				{
				setState(626);
				puntocoma();
				}
			}

			setState(630); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(629);
				saltolinea();
				}
				}
				setState(632); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SALTOLINEA );
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTESIS_ABRIR) | (1L << NEGACION) | (1L << RESTA) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << VERDADERO) | (1L << FALSO))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEOTROMODO - 65)) | (1L << (PI - 65)) | (1L << (RAIZ - 65)) | (1L << (ABS - 65)) | (1L << (LN - 65)) | (1L << (EXP - 65)) | (1L << (SEN - 65)) | (1L << (COS - 65)) | (1L << (TAN - 65)) | (1L << (ASEN - 65)) | (1L << (ACOS - 65)) | (1L << (ATAN - 65)) | (1L << (AZAR - 65)) | (1L << (ALEATORIO - 65)) | (1L << (TRUNC - 65)) | (1L << (REDON - 65)) | (1L << (CONVERTIRANUMERO - 65)) | (1L << (CONVERTIRATEXTO - 65)) | (1L << (LONGITUD - 65)) | (1L << (SUBCADENA - 65)) | (1L << (MAYUSCULAS - 65)) | (1L << (MINUSCULAS - 65)) | (1L << (CONCATENAR - 65)) | (1L << (IDENTIFICADOR - 65)))) != 0)) {
				{
				{
				setState(636);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PARENTESIS_ABRIR:
				case NEGACION:
				case RESTA:
				case INT:
				case FLOAT:
				case STRING:
				case VERDADERO:
				case FALSO:
				case PI:
				case RAIZ:
				case ABS:
				case LN:
				case EXP:
				case SEN:
				case COS:
				case TAN:
				case ASEN:
				case ACOS:
				case ATAN:
				case AZAR:
				case ALEATORIO:
				case TRUNC:
				case REDON:
				case CONVERTIRANUMERO:
				case CONVERTIRATEXTO:
				case LONGITUD:
				case SUBCADENA:
				case MAYUSCULAS:
				case MINUSCULAS:
				case CONCATENAR:
				case IDENTIFICADOR:
					{
					setState(634);
					expr();
					}
					break;
				case DEOTROMODO:
					{
					setState(635);
					deotromodo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(638);
					coma();
					setState(641);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PARENTESIS_ABRIR:
					case NEGACION:
					case RESTA:
					case INT:
					case FLOAT:
					case STRING:
					case VERDADERO:
					case FALSO:
					case PI:
					case RAIZ:
					case ABS:
					case LN:
					case EXP:
					case SEN:
					case COS:
					case TAN:
					case ASEN:
					case ACOS:
					case ATAN:
					case AZAR:
					case ALEATORIO:
					case TRUNC:
					case REDON:
					case CONVERTIRANUMERO:
					case CONVERTIRATEXTO:
					case LONGITUD:
					case SUBCADENA:
					case MAYUSCULAS:
					case MINUSCULAS:
					case CONCATENAR:
					case IDENTIFICADOR:
						{
						setState(639);
						expr();
						}
						break;
					case DEOTROMODO:
						{
						setState(640);
						deotromodo();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(647);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(648);
				dospuntos();
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SALTOLINEA) {
					{
					{
					setState(649);
					saltolinea();
					}
					}
					setState(654);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(658);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(655);
						instruccion();
						}
						} 
					}
					setState(660);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				}
				}
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(666);
			finsegun();
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTOCOMA) {
				{
				setState(667);
				puntocoma();
				}
			}

			setState(671); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(670);
				saltolinea();
				}
				}
				setState(673); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SALTOLINEA );
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

	public static class RepetitivaContext extends ParserRuleContext {
		public Mientras_opContext mientras_op() {
			return getRuleContext(Mientras_opContext.class,0);
		}
		public Repetir_opContext repetir_op() {
			return getRuleContext(Repetir_opContext.class,0);
		}
		public Para_opContext para_op() {
			return getRuleContext(Para_opContext.class,0);
		}
		public RepetitivaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetitiva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterRepetitiva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitRepetitiva(this);
		}
	}

	public final RepetitivaContext repetitiva() throws RecognitionException {
		RepetitivaContext _localctx = new RepetitivaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_repetitiva);
		try {
			setState(678);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIENTRAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				mientras_op();
				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				repetir_op();
				}
				break;
			case PARA:
			case PARACADA:
				enterOuterAlt(_localctx, 3);
				{
				setState(677);
				para_op();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Mientras_opContext extends ParserRuleContext {
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public FinmientrasContext finmientras() {
			return getRuleContext(FinmientrasContext.class,0);
		}
		public HacerContext hacer() {
			return getRuleContext(HacerContext.class,0);
		}
		public List<SaltolineaContext> saltolinea() {
			return getRuleContexts(SaltolineaContext.class);
		}
		public SaltolineaContext saltolinea(int i) {
			return getRuleContext(SaltolineaContext.class,i);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public PuntocomaContext puntocoma() {
			return getRuleContext(PuntocomaContext.class,0);
		}
		public Mientras_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterMientras_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitMientras_op(this);
		}
	}

	public final Mientras_opContext mientras_op() throws RecognitionException {
		Mientras_opContext _localctx = new Mientras_opContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mientras_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			mientras();
			setState(681);
			condicion();
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HACER) {
				{
				setState(682);
				hacer();
				}
			}

			setState(686); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(685);
				saltolinea();
				}
				}
				setState(688); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SALTOLINEA );
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (DEFINIR - 41)) | (1L << (DIMENSION - 41)) | (1L << (LEER - 41)) | (1L << (ESCRIBIR - 41)) | (1L << (BORRAR - 41)) | (1L << (ESPERARTECLA - 41)) | (1L << (ESPERAR - 41)) | (1L << (SI - 41)) | (1L << (SEGUN - 41)) | (1L << (MIENTRAS - 41)) | (1L << (REPETIR - 41)) | (1L << (PARA - 41)) | (1L << (PARACADA - 41)) | (1L << (IDENTIFICADOR - 41)))) != 0)) {
				{
				{
				setState(690);
				instruccion();
				}
				}
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(696);
			finmientras();
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTOCOMA) {
				{
				setState(697);
				puntocoma();
				}
			}

			setState(701); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(700);
				saltolinea();
				}
				}
				setState(703); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SALTOLINEA );
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

	public static class Repetir_opContext extends ParserRuleContext {
		public RepetirContext repetir() {
			return getRuleContext(RepetirContext.class,0);
		}
		public HastaqueContext hastaque() {
			return getRuleContext(HastaqueContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public List<PuntocomaContext> puntocoma() {
			return getRuleContexts(PuntocomaContext.class);
		}
		public PuntocomaContext puntocoma(int i) {
			return getRuleContext(PuntocomaContext.class,i);
		}
		public List<SaltolineaContext> saltolinea() {
			return getRuleContexts(SaltolineaContext.class);
		}
		public SaltolineaContext saltolinea(int i) {
			return getRuleContext(SaltolineaContext.class,i);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public Repetir_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetir_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterRepetir_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitRepetir_op(this);
		}
	}

	public final Repetir_opContext repetir_op() throws RecognitionException {
		Repetir_opContext _localctx = new Repetir_opContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_repetir_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			repetir();
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTOCOMA) {
				{
				setState(706);
				puntocoma();
				}
			}

			setState(710); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(709);
				saltolinea();
				}
				}
				setState(712); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SALTOLINEA );
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (DEFINIR - 41)) | (1L << (DIMENSION - 41)) | (1L << (LEER - 41)) | (1L << (ESCRIBIR - 41)) | (1L << (BORRAR - 41)) | (1L << (ESPERARTECLA - 41)) | (1L << (ESPERAR - 41)) | (1L << (SI - 41)) | (1L << (SEGUN - 41)) | (1L << (MIENTRAS - 41)) | (1L << (REPETIR - 41)) | (1L << (PARA - 41)) | (1L << (PARACADA - 41)) | (1L << (IDENTIFICADOR - 41)))) != 0)) {
				{
				{
				setState(714);
				instruccion();
				}
				}
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(720);
			hastaque();
			setState(721);
			condicion();
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTOCOMA) {
				{
				setState(722);
				puntocoma();
				}
			}

			setState(726); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(725);
				saltolinea();
				}
				}
				setState(728); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SALTOLINEA );
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

	public static class Para_opContext extends ParserRuleContext {
		public FinparaContext finpara() {
			return getRuleContext(FinparaContext.class,0);
		}
		public HacerContext hacer() {
			return getRuleContext(HacerContext.class,0);
		}
		public List<SaltolineaContext> saltolinea() {
			return getRuleContexts(SaltolineaContext.class);
		}
		public SaltolineaContext saltolinea(int i) {
			return getRuleContext(SaltolineaContext.class,i);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public PuntocomaContext puntocoma() {
			return getRuleContext(PuntocomaContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public HastaContext hasta() {
			return getRuleContext(HastaContext.class,0);
		}
		public ParacadaContext paracada() {
			return getRuleContext(ParacadaContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public DeContext de() {
			return getRuleContext(DeContext.class,0);
		}
		public AsignarContext asignar() {
			return getRuleContext(AsignarContext.class,0);
		}
		public SignoigualContext signoigual() {
			return getRuleContext(SignoigualContext.class,0);
		}
		public DesdeContext desde() {
			return getRuleContext(DesdeContext.class,0);
		}
		public ConpasoContext conpaso() {
			return getRuleContext(ConpasoContext.class,0);
		}
		public Para_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterPara_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitPara_op(this);
		}
	}

	public final Para_opContext para_op() throws RecognitionException {
		Para_opContext _localctx = new Para_opContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_para_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARA:
				{
				{
				setState(730);
				para();
				setState(731);
				variable();
				setState(734);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASIGNAR:
					{
					setState(732);
					asignar();
					}
					break;
				case SIGNOIGUAL:
					{
					setState(733);
					signoigual();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(736);
				expr();
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DESDE) {
					{
					setState(737);
					desde();
					setState(738);
					expr();
					}
				}

				setState(742);
				hasta();
				setState(743);
				expr();
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONPASO) {
					{
					setState(744);
					conpaso();
					setState(745);
					expr();
					}
				}

				}
				}
				break;
			case PARACADA:
				{
				{
				setState(749);
				paracada();
				setState(750);
				identificador();
				setState(751);
				de();
				setState(752);
				variable();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HACER) {
				{
				setState(756);
				hacer();
				}
			}

			setState(760); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(759);
				saltolinea();
				}
				}
				setState(762); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SALTOLINEA );
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (DEFINIR - 41)) | (1L << (DIMENSION - 41)) | (1L << (LEER - 41)) | (1L << (ESCRIBIR - 41)) | (1L << (BORRAR - 41)) | (1L << (ESPERARTECLA - 41)) | (1L << (ESPERAR - 41)) | (1L << (SI - 41)) | (1L << (SEGUN - 41)) | (1L << (MIENTRAS - 41)) | (1L << (REPETIR - 41)) | (1L << (PARA - 41)) | (1L << (PARACADA - 41)) | (1L << (IDENTIFICADOR - 41)))) != 0)) {
				{
				{
				setState(764);
				instruccion();
				}
				}
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(770);
			finpara();
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTOCOMA) {
				{
				setState(771);
				puntocoma();
				}
			}

			setState(775); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(774);
				saltolinea();
				}
				}
				setState(777); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SALTOLINEA );
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

	public static class Llamar_funcionContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Parentesis_abrirContext parentesis_abrir() {
			return getRuleContext(Parentesis_abrirContext.class,0);
		}
		public Parentesis_cerrarContext parentesis_cerrar() {
			return getRuleContext(Parentesis_cerrarContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PuntocomaContext puntocoma() {
			return getRuleContext(PuntocomaContext.class,0);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public Llamar_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamar_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterLlamar_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitLlamar_funcion(this);
		}
	}

	public final Llamar_funcionContext llamar_funcion() throws RecognitionException {
		Llamar_funcionContext _localctx = new Llamar_funcionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_llamar_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			identificador();
			setState(780);
			parentesis_abrir();
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTESIS_ABRIR) | (1L << NEGACION) | (1L << RESTA) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << VERDADERO) | (1L << FALSO))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (PI - 81)) | (1L << (RAIZ - 81)) | (1L << (ABS - 81)) | (1L << (LN - 81)) | (1L << (EXP - 81)) | (1L << (SEN - 81)) | (1L << (COS - 81)) | (1L << (TAN - 81)) | (1L << (ASEN - 81)) | (1L << (ACOS - 81)) | (1L << (ATAN - 81)) | (1L << (AZAR - 81)) | (1L << (ALEATORIO - 81)) | (1L << (TRUNC - 81)) | (1L << (REDON - 81)) | (1L << (CONVERTIRANUMERO - 81)) | (1L << (CONVERTIRATEXTO - 81)) | (1L << (LONGITUD - 81)) | (1L << (SUBCADENA - 81)) | (1L << (MAYUSCULAS - 81)) | (1L << (MINUSCULAS - 81)) | (1L << (CONCATENAR - 81)) | (1L << (IDENTIFICADOR - 81)))) != 0)) {
				{
				setState(781);
				expr();
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(782);
					coma();
					setState(783);
					expr();
					}
					}
					setState(789);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(792);
			parentesis_cerrar();
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(793);
				puntocoma();
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

	public static class ExprContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(796);
				exp(0);
				}
				break;
			case 2:
				{
				setState(797);
				condicion();
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

	public static class ExpContext extends ParserRuleContext {
		public FuncionesContext funciones() {
			return getRuleContext(FuncionesContext.class,0);
		}
		public Llamar_funcionContext llamar_funcion() {
			return getRuleContext(Llamar_funcionContext.class,0);
		}
		public Parentesis_abrirContext parentesis_abrir() {
			return getRuleContext(Parentesis_abrirContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Parentesis_cerrarContext parentesis_cerrar() {
			return getRuleContext(Parentesis_cerrarContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public ArregloContext arreglo() {
			return getRuleContext(ArregloContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PotenciacionContext potenciacion() {
			return getRuleContext(PotenciacionContext.class,0);
		}
		public MultiplicacionContext multiplicacion() {
			return getRuleContext(MultiplicacionContext.class,0);
		}
		public DivisionContext division() {
			return getRuleContext(DivisionContext.class,0);
		}
		public ModuloContext modulo() {
			return getRuleContext(ModuloContext.class,0);
		}
		public SumaContext suma() {
			return getRuleContext(SumaContext.class,0);
		}
		public RestaContext resta() {
			return getRuleContext(RestaContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(801);
				funciones();
				}
				break;
			case 2:
				{
				setState(802);
				llamar_funcion();
				}
				break;
			case 3:
				{
				setState(803);
				parentesis_abrir();
				setState(804);
				exp(0);
				setState(805);
				parentesis_cerrar();
				}
				break;
			case 4:
				{
				setState(807);
				valor();
				}
				break;
			case 5:
				{
				setState(808);
				arreglo();
				}
				break;
			case 6:
				{
				setState(809);
				variable();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(833);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(831);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(812);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(813);
						potenciacion();
						setState(814);
						exp(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(816);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(820);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MULTIPLICACION:
							{
							setState(817);
							multiplicacion();
							}
							break;
						case DIVISION:
							{
							setState(818);
							division();
							}
							break;
						case MODULO:
							{
							setState(819);
							modulo();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(822);
						exp(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(824);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(827);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case SUMA:
							{
							setState(825);
							suma();
							}
							break;
						case RESTA:
							{
							setState(826);
							resta();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(829);
						exp(5);
						}
						break;
					}
					} 
				}
				setState(835);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CondicionContext extends ParserRuleContext {
		public Parentesis_abrirContext parentesis_abrir() {
			return getRuleContext(Parentesis_abrirContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public Parentesis_cerrarContext parentesis_cerrar() {
			return getRuleContext(Parentesis_cerrarContext.class,0);
		}
		public NegacionContext negacion() {
			return getRuleContext(NegacionContext.class,0);
		}
		public List<Expr_logicoContext> expr_logico() {
			return getRuleContexts(Expr_logicoContext.class);
		}
		public Expr_logicoContext expr_logico(int i) {
			return getRuleContext(Expr_logicoContext.class,i);
		}
		public Expr_relacionalContext expr_relacional() {
			return getRuleContext(Expr_relacionalContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_condicion);
		int _la;
		try {
			int _alt;
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEGACION) {
					{
					setState(836);
					negacion();
					}
				}

				setState(839);
				parentesis_abrir();
				setState(840);
				condicion();
				setState(841);
				parentesis_cerrar();
				setState(845);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(842);
						expr_logico();
						}
						} 
					}
					setState(847);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEGACION) {
					{
					setState(848);
					negacion();
					}
				}

				setState(851);
				expr_relacional();
				setState(855);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(852);
						expr_logico();
						}
						} 
					}
					setState(857);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
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

	public static class Expr_relacionalContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public MayorContext mayor() {
			return getRuleContext(MayorContext.class,0);
		}
		public MenorContext menor() {
			return getRuleContext(MenorContext.class,0);
		}
		public MenorigualContext menorigual() {
			return getRuleContext(MenorigualContext.class,0);
		}
		public MayorigualContext mayorigual() {
			return getRuleContext(MayorigualContext.class,0);
		}
		public DistintoContext distinto() {
			return getRuleContext(DistintoContext.class,0);
		}
		public ConjuncionContext conjuncion() {
			return getRuleContext(ConjuncionContext.class,0);
		}
		public DisyuncionContext disyuncion() {
			return getRuleContext(DisyuncionContext.class,0);
		}
		public SignoigualContext signoigual() {
			return getRuleContext(SignoigualContext.class,0);
		}
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public Expr_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterExpr_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitExpr_relacional(this);
		}
	}

	public final Expr_relacionalContext expr_relacional() throws RecognitionException {
		Expr_relacionalContext _localctx = new Expr_relacionalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expr_relacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			exp(0);
			setState(872);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAYOR:
				{
				setState(861);
				mayor();
				}
				break;
			case MENOR:
				{
				setState(862);
				menor();
				}
				break;
			case SIGNOIGUAL:
			case IGUAL:
				{
				setState(865);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SIGNOIGUAL:
					{
					setState(863);
					signoigual();
					}
					break;
				case IGUAL:
					{
					setState(864);
					igual();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case MENORIGUAL:
				{
				setState(867);
				menorigual();
				}
				break;
			case MAYORIGUAL:
				{
				setState(868);
				mayorigual();
				}
				break;
			case DISTINTO:
				{
				setState(869);
				distinto();
				}
				break;
			case CONJUNCION:
				{
				setState(870);
				conjuncion();
				}
				break;
			case DISYUNCION:
				{
				setState(871);
				disyuncion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(874);
			exp(0);
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

	public static class Expr_logicoContext extends ParserRuleContext {
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public ConjuncionContext conjuncion() {
			return getRuleContext(ConjuncionContext.class,0);
		}
		public DisyuncionContext disyuncion() {
			return getRuleContext(DisyuncionContext.class,0);
		}
		public Expr_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterExpr_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitExpr_logico(this);
		}
	}

	public final Expr_logicoContext expr_logico() throws RecognitionException {
		Expr_logicoContext _localctx = new Expr_logicoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expr_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(878);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONJUNCION:
				{
				setState(876);
				conjuncion();
				}
				break;
			case DISYUNCION:
				{
				setState(877);
				disyuncion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(880);
			condicion();
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

	public static class MayorContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(PSeIntParser.MAYOR, 0); }
		public MayorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mayor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterMayor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitMayor(this);
		}
	}

	public final MayorContext mayor() throws RecognitionException {
		MayorContext _localctx = new MayorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mayor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(MAYOR);
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

	public static class MenorContext extends ParserRuleContext {
		public TerminalNode MENOR() { return getToken(PSeIntParser.MENOR, 0); }
		public MenorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterMenor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitMenor(this);
		}
	}

	public final MenorContext menor() throws RecognitionException {
		MenorContext _localctx = new MenorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_menor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(MENOR);
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

	public static class IgualContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(PSeIntParser.IGUAL, 0); }
		public IgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitIgual(this);
		}
	}

	public final IgualContext igual() throws RecognitionException {
		IgualContext _localctx = new IgualContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			match(IGUAL);
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

	public static class MenorigualContext extends ParserRuleContext {
		public TerminalNode MENORIGUAL() { return getToken(PSeIntParser.MENORIGUAL, 0); }
		public MenorigualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menorigual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterMenorigual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitMenorigual(this);
		}
	}

	public final MenorigualContext menorigual() throws RecognitionException {
		MenorigualContext _localctx = new MenorigualContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_menorigual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(MENORIGUAL);
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

	public static class MayorigualContext extends ParserRuleContext {
		public TerminalNode MAYORIGUAL() { return getToken(PSeIntParser.MAYORIGUAL, 0); }
		public MayorigualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mayorigual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterMayorigual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitMayorigual(this);
		}
	}

	public final MayorigualContext mayorigual() throws RecognitionException {
		MayorigualContext _localctx = new MayorigualContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_mayorigual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(MAYORIGUAL);
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

	public static class DistintoContext extends ParserRuleContext {
		public TerminalNode DISTINTO() { return getToken(PSeIntParser.DISTINTO, 0); }
		public DistintoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterDistinto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitDistinto(this);
		}
	}

	public final DistintoContext distinto() throws RecognitionException {
		DistintoContext _localctx = new DistintoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_distinto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			match(DISTINTO);
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

	public static class ConjuncionContext extends ParserRuleContext {
		public TerminalNode CONJUNCION() { return getToken(PSeIntParser.CONJUNCION, 0); }
		public ConjuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterConjuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitConjuncion(this);
		}
	}

	public final ConjuncionContext conjuncion() throws RecognitionException {
		ConjuncionContext _localctx = new ConjuncionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_conjuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			match(CONJUNCION);
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

	public static class DisyuncionContext extends ParserRuleContext {
		public TerminalNode DISYUNCION() { return getToken(PSeIntParser.DISYUNCION, 0); }
		public DisyuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disyuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterDisyuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitDisyuncion(this);
		}
	}

	public final DisyuncionContext disyuncion() throws RecognitionException {
		DisyuncionContext _localctx = new DisyuncionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_disyuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			match(DISYUNCION);
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

	public static class NegacionContext extends ParserRuleContext {
		public TerminalNode NEGACION() { return getToken(PSeIntParser.NEGACION, 0); }
		public NegacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterNegacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitNegacion(this);
		}
	}

	public final NegacionContext negacion() throws RecognitionException {
		NegacionContext _localctx = new NegacionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_negacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			match(NEGACION);
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

	public static class SumaContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(PSeIntParser.SUMA, 0); }
		public SumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitSuma(this);
		}
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_suma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			match(SUMA);
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

	public static class RestaContext extends ParserRuleContext {
		public TerminalNode RESTA() { return getToken(PSeIntParser.RESTA, 0); }
		public RestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterResta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitResta(this);
		}
	}

	public final RestaContext resta() throws RecognitionException {
		RestaContext _localctx = new RestaContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_resta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			match(RESTA);
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

	public static class MultiplicacionContext extends ParserRuleContext {
		public TerminalNode MULTIPLICACION() { return getToken(PSeIntParser.MULTIPLICACION, 0); }
		public MultiplicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterMultiplicacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitMultiplicacion(this);
		}
	}

	public final MultiplicacionContext multiplicacion() throws RecognitionException {
		MultiplicacionContext _localctx = new MultiplicacionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_multiplicacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			match(MULTIPLICACION);
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

	public static class DivisionContext extends ParserRuleContext {
		public TerminalNode DIVISION() { return getToken(PSeIntParser.DIVISION, 0); }
		public DivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_division; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitDivision(this);
		}
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			match(DIVISION);
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

	public static class PotenciacionContext extends ParserRuleContext {
		public TerminalNode POTENCIACION() { return getToken(PSeIntParser.POTENCIACION, 0); }
		public PotenciacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potenciacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterPotenciacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitPotenciacion(this);
		}
	}

	public final PotenciacionContext potenciacion() throws RecognitionException {
		PotenciacionContext _localctx = new PotenciacionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_potenciacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			match(POTENCIACION);
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

	public static class ModuloContext extends ParserRuleContext {
		public TerminalNode MODULO() { return getToken(PSeIntParser.MODULO, 0); }
		public ModuloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitModulo(this);
		}
	}

	public final ModuloContext modulo() throws RecognitionException {
		ModuloContext _localctx = new ModuloContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_modulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(MODULO);
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

	public static class VariableContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			identificador();
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

	public static class IdentificadorContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(PSeIntParser.IDENTIFICADOR, 0); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			match(IDENTIFICADOR);
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

	public static class AsignarContext extends ParserRuleContext {
		public TerminalNode ASIGNAR() { return getToken(PSeIntParser.ASIGNAR, 0); }
		public AsignarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterAsignar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitAsignar(this);
		}
	}

	public final AsignarContext asignar() throws RecognitionException {
		AsignarContext _localctx = new AsignarContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_asignar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			match(ASIGNAR);
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

	public static class Parentesis_abrirContext extends ParserRuleContext {
		public TerminalNode PARENTESIS_ABRIR() { return getToken(PSeIntParser.PARENTESIS_ABRIR, 0); }
		public Parentesis_abrirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentesis_abrir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterParentesis_abrir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitParentesis_abrir(this);
		}
	}

	public final Parentesis_abrirContext parentesis_abrir() throws RecognitionException {
		Parentesis_abrirContext _localctx = new Parentesis_abrirContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_parentesis_abrir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			match(PARENTESIS_ABRIR);
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

	public static class Parentesis_cerrarContext extends ParserRuleContext {
		public TerminalNode PARENTESIS_CERRAR() { return getToken(PSeIntParser.PARENTESIS_CERRAR, 0); }
		public Parentesis_cerrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentesis_cerrar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterParentesis_cerrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitParentesis_cerrar(this);
		}
	}

	public final Parentesis_cerrarContext parentesis_cerrar() throws RecognitionException {
		Parentesis_cerrarContext _localctx = new Parentesis_cerrarContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_parentesis_cerrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			match(PARENTESIS_CERRAR);
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

	public static class Corchete_abrirContext extends ParserRuleContext {
		public TerminalNode CORCHETE_ABRIR() { return getToken(PSeIntParser.CORCHETE_ABRIR, 0); }
		public Corchete_abrirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corchete_abrir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterCorchete_abrir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitCorchete_abrir(this);
		}
	}

	public final Corchete_abrirContext corchete_abrir() throws RecognitionException {
		Corchete_abrirContext _localctx = new Corchete_abrirContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_corchete_abrir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			match(CORCHETE_ABRIR);
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

	public static class Corchete_cerrarContext extends ParserRuleContext {
		public TerminalNode CORCHETE_CERRAR() { return getToken(PSeIntParser.CORCHETE_CERRAR, 0); }
		public Corchete_cerrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corchete_cerrar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterCorchete_cerrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitCorchete_cerrar(this);
		}
	}

	public final Corchete_cerrarContext corchete_cerrar() throws RecognitionException {
		Corchete_cerrarContext _localctx = new Corchete_cerrarContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_corchete_cerrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			match(CORCHETE_CERRAR);
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

	public static class SaltolineaContext extends ParserRuleContext {
		public TerminalNode SALTOLINEA() { return getToken(PSeIntParser.SALTOLINEA, 0); }
		public SaltolineaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saltolinea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterSaltolinea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitSaltolinea(this);
		}
	}

	public final SaltolineaContext saltolinea() throws RecognitionException {
		SaltolineaContext _localctx = new SaltolineaContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_saltolinea);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(SALTOLINEA);
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

	public static class SignoigualContext extends ParserRuleContext {
		public TerminalNode SIGNOIGUAL() { return getToken(PSeIntParser.SIGNOIGUAL, 0); }
		public SignoigualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signoigual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterSignoigual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitSignoigual(this);
		}
	}

	public final SignoigualContext signoigual() throws RecognitionException {
		SignoigualContext _localctx = new SignoigualContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_signoigual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			match(SIGNOIGUAL);
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

	public static class ComaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(PSeIntParser.COMA, 0); }
		public ComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitComa(this);
		}
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			match(COMA);
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

	public static class DospuntosContext extends ParserRuleContext {
		public TerminalNode DOSPUNTOS() { return getToken(PSeIntParser.DOSPUNTOS, 0); }
		public DospuntosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dospuntos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterDospuntos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitDospuntos(this);
		}
	}

	public final DospuntosContext dospuntos() throws RecognitionException {
		DospuntosContext _localctx = new DospuntosContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_dospuntos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			match(DOSPUNTOS);
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

	public static class PuntocomaContext extends ParserRuleContext {
		public TerminalNode PUNTOCOMA() { return getToken(PSeIntParser.PUNTOCOMA, 0); }
		public PuntocomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puntocoma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterPuntocoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitPuntocoma(this);
		}
	}

	public final PuntocomaContext puntocoma() throws RecognitionException {
		PuntocomaContext _localctx = new PuntocomaContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_puntocoma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			match(PUNTOCOMA);
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

	public static class AlgoritmoContext extends ParserRuleContext {
		public TerminalNode ALGORITMO() { return getToken(PSeIntParser.ALGORITMO, 0); }
		public AlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitAlgoritmo(this);
		}
	}

	public final AlgoritmoContext algoritmo() throws RecognitionException {
		AlgoritmoContext _localctx = new AlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_algoritmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			match(ALGORITMO);
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

	public static class FinalgoritmoContext extends ParserRuleContext {
		public TerminalNode FINALGORITMO() { return getToken(PSeIntParser.FINALGORITMO, 0); }
		public FinalgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalgoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterFinalgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitFinalgoritmo(this);
		}
	}

	public final FinalgoritmoContext finalgoritmo() throws RecognitionException {
		FinalgoritmoContext _localctx = new FinalgoritmoContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_finalgoritmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			match(FINALGORITMO);
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

	public static class DefinirContext extends ParserRuleContext {
		public TerminalNode DEFINIR() { return getToken(PSeIntParser.DEFINIR, 0); }
		public DefinirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterDefinir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitDefinir(this);
		}
	}

	public final DefinirContext definir() throws RecognitionException {
		DefinirContext _localctx = new DefinirContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_definir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			match(DEFINIR);
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

	public static class DimensionContext extends ParserRuleContext {
		public TerminalNode DIMENSION() { return getToken(PSeIntParser.DIMENSION, 0); }
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitDimension(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			match(DIMENSION);
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

	public static class ComoContext extends ParserRuleContext {
		public TerminalNode COMO() { return getToken(PSeIntParser.COMO, 0); }
		public ComoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_como; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterComo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitComo(this);
		}
	}

	public final ComoContext como() throws RecognitionException {
		ComoContext _localctx = new ComoContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_como);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			match(COMO);
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

	public static class RealContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(PSeIntParser.REAL, 0); }
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitReal(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			match(REAL);
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

	public static class EnteroContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(PSeIntParser.ENTERO, 0); }
		public EnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitEntero(this);
		}
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_entero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			match(ENTERO);
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

	public static class LogicoContext extends ParserRuleContext {
		public TerminalNode LOGICO() { return getToken(PSeIntParser.LOGICO, 0); }
		public LogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitLogico(this);
		}
	}

	public final LogicoContext logico() throws RecognitionException {
		LogicoContext _localctx = new LogicoContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			match(LOGICO);
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

	public static class VerdaderoContext extends ParserRuleContext {
		public TerminalNode VERDADERO() { return getToken(PSeIntParser.VERDADERO, 0); }
		public VerdaderoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verdadero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterVerdadero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitVerdadero(this);
		}
	}

	public final VerdaderoContext verdadero() throws RecognitionException {
		VerdaderoContext _localctx = new VerdaderoContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_verdadero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(VERDADERO);
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

	public static class FalsoContext extends ParserRuleContext {
		public TerminalNode FALSO() { return getToken(PSeIntParser.FALSO, 0); }
		public FalsoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_falso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterFalso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitFalso(this);
		}
	}

	public final FalsoContext falso() throws RecognitionException {
		FalsoContext _localctx = new FalsoContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_falso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(FALSO);
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

	public static class CaracterContext extends ParserRuleContext {
		public TerminalNode CARACTER() { return getToken(PSeIntParser.CARACTER, 0); }
		public CaracterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caracter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterCaracter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitCaracter(this);
		}
	}

	public final CaracterContext caracter() throws RecognitionException {
		CaracterContext _localctx = new CaracterContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_caracter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			match(CARACTER);
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

	public static class LeerContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(PSeIntParser.LEER, 0); }
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterLeer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitLeer(this);
		}
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			match(LEER);
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

	public static class EscribirContext extends ParserRuleContext {
		public TerminalNode ESCRIBIR() { return getToken(PSeIntParser.ESCRIBIR, 0); }
		public EscribirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escribir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterEscribir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitEscribir(this);
		}
	}

	public final EscribirContext escribir() throws RecognitionException {
		EscribirContext _localctx = new EscribirContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_escribir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(ESCRIBIR);
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

	public static class BorrarContext extends ParserRuleContext {
		public TerminalNode BORRAR() { return getToken(PSeIntParser.BORRAR, 0); }
		public BorrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borrar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterBorrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitBorrar(this);
		}
	}

	public final BorrarContext borrar() throws RecognitionException {
		BorrarContext _localctx = new BorrarContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_borrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			match(BORRAR);
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

	public static class EsperarteclaContext extends ParserRuleContext {
		public TerminalNode ESPERARTECLA() { return getToken(PSeIntParser.ESPERARTECLA, 0); }
		public EsperarteclaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esperartecla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterEsperartecla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitEsperartecla(this);
		}
	}

	public final EsperarteclaContext esperartecla() throws RecognitionException {
		EsperarteclaContext _localctx = new EsperarteclaContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_esperartecla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			match(ESPERARTECLA);
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

	public static class EsperarContext extends ParserRuleContext {
		public TerminalNode ESPERAR() { return getToken(PSeIntParser.ESPERAR, 0); }
		public EsperarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esperar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterEsperar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitEsperar(this);
		}
	}

	public final EsperarContext esperar() throws RecognitionException {
		EsperarContext _localctx = new EsperarContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_esperar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			match(ESPERAR);
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

	public static class SegundosContext extends ParserRuleContext {
		public TerminalNode SEGUNDOS() { return getToken(PSeIntParser.SEGUNDOS, 0); }
		public SegundosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segundos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterSegundos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitSegundos(this);
		}
	}

	public final SegundosContext segundos() throws RecognitionException {
		SegundosContext _localctx = new SegundosContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_segundos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			match(SEGUNDOS);
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

	public static class MilisegundosContext extends ParserRuleContext {
		public TerminalNode MILISEGUNDOS() { return getToken(PSeIntParser.MILISEGUNDOS, 0); }
		public MilisegundosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_milisegundos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterMilisegundos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitMilisegundos(this);
		}
	}

	public final MilisegundosContext milisegundos() throws RecognitionException {
		MilisegundosContext _localctx = new MilisegundosContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_milisegundos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			match(MILISEGUNDOS);
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

	public static class SinsaltarContext extends ParserRuleContext {
		public TerminalNode SINSALTAR() { return getToken(PSeIntParser.SINSALTAR, 0); }
		public SinsaltarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinsaltar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterSinsaltar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitSinsaltar(this);
		}
	}

	public final SinsaltarContext sinsaltar() throws RecognitionException {
		SinsaltarContext _localctx = new SinsaltarContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_sinsaltar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			match(SINSALTAR);
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

	public static class SiContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(PSeIntParser.SI, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitSi(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(SI);
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

	public static class EntoncesContext extends ParserRuleContext {
		public TerminalNode ENTONCES() { return getToken(PSeIntParser.ENTONCES, 0); }
		public EntoncesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entonces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterEntonces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitEntonces(this);
		}
	}

	public final EntoncesContext entonces() throws RecognitionException {
		EntoncesContext _localctx = new EntoncesContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_entonces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			match(ENTONCES);
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

	public static class SinoContext extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(PSeIntParser.SINO, 0); }
		public SinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterSino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitSino(this);
		}
	}

	public final SinoContext sino() throws RecognitionException {
		SinoContext _localctx = new SinoContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_sino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(SINO);
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

	public static class FinsiContext extends ParserRuleContext {
		public TerminalNode FINSI() { return getToken(PSeIntParser.FINSI, 0); }
		public FinsiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finsi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterFinsi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitFinsi(this);
		}
	}

	public final FinsiContext finsi() throws RecognitionException {
		FinsiContext _localctx = new FinsiContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_finsi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			match(FINSI);
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

	public static class ParaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(PSeIntParser.PARA, 0); }
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitPara(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			match(PARA);
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

	public static class ParacadaContext extends ParserRuleContext {
		public TerminalNode PARACADA() { return getToken(PSeIntParser.PARACADA, 0); }
		public ParacadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paracada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterParacada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitParacada(this);
		}
	}

	public final ParacadaContext paracada() throws RecognitionException {
		ParacadaContext _localctx = new ParacadaContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_paracada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			match(PARACADA);
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

	public static class DeContext extends ParserRuleContext {
		public TerminalNode DE() { return getToken(PSeIntParser.DE, 0); }
		public DeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_de; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitDe(this);
		}
	}

	public final DeContext de() throws RecognitionException {
		DeContext _localctx = new DeContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_de);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			match(DE);
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

	public static class DesdeContext extends ParserRuleContext {
		public TerminalNode DESDE() { return getToken(PSeIntParser.DESDE, 0); }
		public DesdeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterDesde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitDesde(this);
		}
	}

	public final DesdeContext desde() throws RecognitionException {
		DesdeContext _localctx = new DesdeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_desde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			match(DESDE);
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

	public static class HastaContext extends ParserRuleContext {
		public TerminalNode HASTA() { return getToken(PSeIntParser.HASTA, 0); }
		public HastaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hasta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterHasta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitHasta(this);
		}
	}

	public final HastaContext hasta() throws RecognitionException {
		HastaContext _localctx = new HastaContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_hasta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(HASTA);
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

	public static class ConpasoContext extends ParserRuleContext {
		public TerminalNode CONPASO() { return getToken(PSeIntParser.CONPASO, 0); }
		public ConpasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conpaso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterConpaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitConpaso(this);
		}
	}

	public final ConpasoContext conpaso() throws RecognitionException {
		ConpasoContext _localctx = new ConpasoContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_conpaso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			match(CONPASO);
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

	public static class HacerContext extends ParserRuleContext {
		public TerminalNode HACER() { return getToken(PSeIntParser.HACER, 0); }
		public HacerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hacer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterHacer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitHacer(this);
		}
	}

	public final HacerContext hacer() throws RecognitionException {
		HacerContext _localctx = new HacerContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_hacer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			match(HACER);
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

	public static class FinparaContext extends ParserRuleContext {
		public TerminalNode FINPARA() { return getToken(PSeIntParser.FINPARA, 0); }
		public FinparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finpara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterFinpara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitFinpara(this);
		}
	}

	public final FinparaContext finpara() throws RecognitionException {
		FinparaContext _localctx = new FinparaContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_finpara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			match(FINPARA);
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

	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(PSeIntParser.MIENTRAS, 0); }
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitMientras(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			match(MIENTRAS);
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

	public static class FinmientrasContext extends ParserRuleContext {
		public TerminalNode FINMIENTRAS() { return getToken(PSeIntParser.FINMIENTRAS, 0); }
		public FinmientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finmientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterFinmientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitFinmientras(this);
		}
	}

	public final FinmientrasContext finmientras() throws RecognitionException {
		FinmientrasContext _localctx = new FinmientrasContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_finmientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(FINMIENTRAS);
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

	public static class RepetirContext extends ParserRuleContext {
		public TerminalNode REPETIR() { return getToken(PSeIntParser.REPETIR, 0); }
		public RepetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterRepetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitRepetir(this);
		}
	}

	public final RepetirContext repetir() throws RecognitionException {
		RepetirContext _localctx = new RepetirContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_repetir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			match(REPETIR);
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

	public static class HastaqueContext extends ParserRuleContext {
		public TerminalNode HASTAQUE() { return getToken(PSeIntParser.HASTAQUE, 0); }
		public HastaqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hastaque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterHastaque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitHastaque(this);
		}
	}

	public final HastaqueContext hastaque() throws RecognitionException {
		HastaqueContext _localctx = new HastaqueContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_hastaque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			match(HASTAQUE);
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

	public static class SegunContext extends ParserRuleContext {
		public TerminalNode SEGUN() { return getToken(PSeIntParser.SEGUN, 0); }
		public SegunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterSegun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitSegun(this);
		}
	}

	public final SegunContext segun() throws RecognitionException {
		SegunContext _localctx = new SegunContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_segun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(SEGUN);
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

	public static class DeotromodoContext extends ParserRuleContext {
		public TerminalNode DEOTROMODO() { return getToken(PSeIntParser.DEOTROMODO, 0); }
		public DeotromodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deotromodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterDeotromodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitDeotromodo(this);
		}
	}

	public final DeotromodoContext deotromodo() throws RecognitionException {
		DeotromodoContext _localctx = new DeotromodoContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_deotromodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			match(DEOTROMODO);
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

	public static class FinsegunContext extends ParserRuleContext {
		public TerminalNode FINSEGUN() { return getToken(PSeIntParser.FINSEGUN, 0); }
		public FinsegunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finsegun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterFinsegun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitFinsegun(this);
		}
	}

	public final FinsegunContext finsegun() throws RecognitionException {
		FinsegunContext _localctx = new FinsegunContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_finsegun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			match(FINSEGUN);
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

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode FUNCION() { return getToken(PSeIntParser.FUNCION, 0); }
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitFuncion(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			match(FUNCION);
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

	public static class PorvalorContext extends ParserRuleContext {
		public TerminalNode PORVALOR() { return getToken(PSeIntParser.PORVALOR, 0); }
		public PorvalorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_porvalor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterPorvalor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitPorvalor(this);
		}
	}

	public final PorvalorContext porvalor() throws RecognitionException {
		PorvalorContext _localctx = new PorvalorContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_porvalor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			match(PORVALOR);
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

	public static class PorreferenciaContext extends ParserRuleContext {
		public TerminalNode PORREFERENCIA() { return getToken(PSeIntParser.PORREFERENCIA, 0); }
		public PorreferenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_porreferencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterPorreferencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitPorreferencia(this);
		}
	}

	public final PorreferenciaContext porreferencia() throws RecognitionException {
		PorreferenciaContext _localctx = new PorreferenciaContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_porreferencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			match(PORREFERENCIA);
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

	public static class FinfuncionContext extends ParserRuleContext {
		public TerminalNode FINFUNCION() { return getToken(PSeIntParser.FINFUNCION, 0); }
		public FinfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finfuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterFinfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitFinfuncion(this);
		}
	}

	public final FinfuncionContext finfuncion() throws RecognitionException {
		FinfuncionContext _localctx = new FinfuncionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_finfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			match(FINFUNCION);
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

	public static class PiContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(PSeIntParser.PI, 0); }
		public PiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterPi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitPi(this);
		}
	}

	public final PiContext pi() throws RecognitionException {
		PiContext _localctx = new PiContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_pi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			match(PI);
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

	public static class RaizContext extends ParserRuleContext {
		public TerminalNode RAIZ() { return getToken(PSeIntParser.RAIZ, 0); }
		public RaizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterRaiz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitRaiz(this);
		}
	}

	public final RaizContext raiz() throws RecognitionException {
		RaizContext _localctx = new RaizContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_raiz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			match(RAIZ);
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

	public static class AbsContext extends ParserRuleContext {
		public TerminalNode ABS() { return getToken(PSeIntParser.ABS, 0); }
		public AbsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterAbs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitAbs(this);
		}
	}

	public final AbsContext abs() throws RecognitionException {
		AbsContext _localctx = new AbsContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_abs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			match(ABS);
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

	public static class LnContext extends ParserRuleContext {
		public TerminalNode LN() { return getToken(PSeIntParser.LN, 0); }
		public LnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ln; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterLn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitLn(this);
		}
	}

	public final LnContext ln() throws RecognitionException {
		LnContext _localctx = new LnContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_ln);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			match(LN);
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

	public static class ExpfContext extends ParserRuleContext {
		public TerminalNode EXP() { return getToken(PSeIntParser.EXP, 0); }
		public ExpfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterExpf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitExpf(this);
		}
	}

	public final ExpfContext expf() throws RecognitionException {
		ExpfContext _localctx = new ExpfContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_expf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			match(EXP);
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

	public static class SenContext extends ParserRuleContext {
		public TerminalNode SEN() { return getToken(PSeIntParser.SEN, 0); }
		public SenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterSen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitSen(this);
		}
	}

	public final SenContext sen() throws RecognitionException {
		SenContext _localctx = new SenContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_sen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
			match(SEN);
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

	public static class CosContext extends ParserRuleContext {
		public TerminalNode COS() { return getToken(PSeIntParser.COS, 0); }
		public CosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterCos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitCos(this);
		}
	}

	public final CosContext cos() throws RecognitionException {
		CosContext _localctx = new CosContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_cos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			match(COS);
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

	public static class TanContext extends ParserRuleContext {
		public TerminalNode TAN() { return getToken(PSeIntParser.TAN, 0); }
		public TanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterTan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitTan(this);
		}
	}

	public final TanContext tan() throws RecognitionException {
		TanContext _localctx = new TanContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_tan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			match(TAN);
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

	public static class AsenContext extends ParserRuleContext {
		public TerminalNode ASEN() { return getToken(PSeIntParser.ASEN, 0); }
		public AsenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterAsen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitAsen(this);
		}
	}

	public final AsenContext asen() throws RecognitionException {
		AsenContext _localctx = new AsenContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_asen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			match(ASEN);
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

	public static class AcosContext extends ParserRuleContext {
		public TerminalNode ACOS() { return getToken(PSeIntParser.ACOS, 0); }
		public AcosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterAcos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitAcos(this);
		}
	}

	public final AcosContext acos() throws RecognitionException {
		AcosContext _localctx = new AcosContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_acos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			match(ACOS);
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

	public static class AtanContext extends ParserRuleContext {
		public TerminalNode ATAN() { return getToken(PSeIntParser.ATAN, 0); }
		public AtanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterAtan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitAtan(this);
		}
	}

	public final AtanContext atan() throws RecognitionException {
		AtanContext _localctx = new AtanContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_atan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			match(ATAN);
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

	public static class TruncContext extends ParserRuleContext {
		public TerminalNode TRUNC() { return getToken(PSeIntParser.TRUNC, 0); }
		public TruncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterTrunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitTrunc(this);
		}
	}

	public final TruncContext trunc() throws RecognitionException {
		TruncContext _localctx = new TruncContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_trunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			match(TRUNC);
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

	public static class RedonContext extends ParserRuleContext {
		public TerminalNode REDON() { return getToken(PSeIntParser.REDON, 0); }
		public RedonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterRedon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitRedon(this);
		}
	}

	public final RedonContext redon() throws RecognitionException {
		RedonContext _localctx = new RedonContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_redon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
			match(REDON);
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

	public static class AzarContext extends ParserRuleContext {
		public TerminalNode AZAR() { return getToken(PSeIntParser.AZAR, 0); }
		public AzarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_azar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterAzar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitAzar(this);
		}
	}

	public final AzarContext azar() throws RecognitionException {
		AzarContext _localctx = new AzarContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_azar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			match(AZAR);
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

	public static class AleatorioContext extends ParserRuleContext {
		public TerminalNode ALEATORIO() { return getToken(PSeIntParser.ALEATORIO, 0); }
		public AleatorioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aleatorio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterAleatorio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitAleatorio(this);
		}
	}

	public final AleatorioContext aleatorio() throws RecognitionException {
		AleatorioContext _localctx = new AleatorioContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_aleatorio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			match(ALEATORIO);
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

	public static class LongitudContext extends ParserRuleContext {
		public TerminalNode LONGITUD() { return getToken(PSeIntParser.LONGITUD, 0); }
		public LongitudContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longitud; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterLongitud(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitLongitud(this);
		}
	}

	public final LongitudContext longitud() throws RecognitionException {
		LongitudContext _localctx = new LongitudContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_longitud);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			match(LONGITUD);
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

	public static class MayusculasContext extends ParserRuleContext {
		public TerminalNode MAYUSCULAS() { return getToken(PSeIntParser.MAYUSCULAS, 0); }
		public MayusculasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mayusculas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterMayusculas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitMayusculas(this);
		}
	}

	public final MayusculasContext mayusculas() throws RecognitionException {
		MayusculasContext _localctx = new MayusculasContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_mayusculas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			match(MAYUSCULAS);
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

	public static class MinusculasContext extends ParserRuleContext {
		public TerminalNode MINUSCULAS() { return getToken(PSeIntParser.MINUSCULAS, 0); }
		public MinusculasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minusculas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterMinusculas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitMinusculas(this);
		}
	}

	public final MinusculasContext minusculas() throws RecognitionException {
		MinusculasContext _localctx = new MinusculasContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_minusculas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			match(MINUSCULAS);
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

	public static class SubcadenaContext extends ParserRuleContext {
		public TerminalNode SUBCADENA() { return getToken(PSeIntParser.SUBCADENA, 0); }
		public SubcadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subcadena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterSubcadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitSubcadena(this);
		}
	}

	public final SubcadenaContext subcadena() throws RecognitionException {
		SubcadenaContext _localctx = new SubcadenaContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_subcadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(SUBCADENA);
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

	public static class ConcatenarContext extends ParserRuleContext {
		public TerminalNode CONCATENAR() { return getToken(PSeIntParser.CONCATENAR, 0); }
		public ConcatenarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatenar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterConcatenar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitConcatenar(this);
		}
	}

	public final ConcatenarContext concatenar() throws RecognitionException {
		ConcatenarContext _localctx = new ConcatenarContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_concatenar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			match(CONCATENAR);
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

	public static class ConvertiranumeroContext extends ParserRuleContext {
		public TerminalNode CONVERTIRANUMERO() { return getToken(PSeIntParser.CONVERTIRANUMERO, 0); }
		public ConvertiranumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convertiranumero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterConvertiranumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitConvertiranumero(this);
		}
	}

	public final ConvertiranumeroContext convertiranumero() throws RecognitionException {
		ConvertiranumeroContext _localctx = new ConvertiranumeroContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_convertiranumero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			match(CONVERTIRANUMERO);
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

	public static class ConvertiratextoContext extends ParserRuleContext {
		public TerminalNode CONVERTIRATEXTO() { return getToken(PSeIntParser.CONVERTIRATEXTO, 0); }
		public ConvertiratextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convertiratexto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterConvertiratexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitConvertiratexto(this);
		}
	}

	public final ConvertiratextoContext convertiratexto() throws RecognitionException {
		ConvertiratextoContext _localctx = new ConvertiratextoContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_convertiratexto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			match(CONVERTIRATEXTO);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PSeIntParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			match(STRING);
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

	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PSeIntParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PSeIntParser.FLOAT, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
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

	public static class ValorContext extends ParserRuleContext {
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode RESTA() { return getToken(PSeIntParser.RESTA, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public LogicaContext logica() {
			return getRuleContext(LogicaContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitValor(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_valor);
		int _la;
		try {
			setState(1074);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESTA:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1069);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RESTA) {
					{
					setState(1068);
					match(RESTA);
					}
				}

				setState(1071);
				numero();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1072);
				string();
				}
				break;
			case VERDADERO:
			case FALSO:
				enterOuterAlt(_localctx, 3);
				{
				setState(1073);
				logica();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LogicaContext extends ParserRuleContext {
		public VerdaderoContext verdadero() {
			return getRuleContext(VerdaderoContext.class,0);
		}
		public FalsoContext falso() {
			return getRuleContext(FalsoContext.class,0);
		}
		public LogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).enterLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntParserListener ) ((PSeIntParserListener)listener).exitLogica(this);
		}
	}

	public final LogicaContext logica() throws RecognitionException {
		LogicaContext _localctx = new LogicaContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_logica);
		try {
			setState(1078);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERDADERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1076);
				verdadero();
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 2);
				{
				setState(1077);
				falso();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3j\u043b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\3\2\7\2\u0102\n\2\f\2\16\2\u0105\13\2\3\2\3\2\6\2\u0109\n\2\r\2\16\2"+
		"\u010a\3\2\7\2\u010e\n\2\f\2\16\2\u0111\13\2\3\2\3\2\7\2\u0115\n\2\f\2"+
		"\16\2\u0118\13\2\3\2\7\2\u011b\n\2\f\2\16\2\u011e\13\2\3\3\3\3\3\3\3\4"+
		"\3\4\5\4\u0125\n\4\3\4\6\4\u0128\n\4\r\4\16\4\u0129\3\4\3\4\3\4\6\4\u012f"+
		"\n\4\r\4\16\4\u0130\5\4\u0133\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u013b\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\7\6\u0142\n\6\f\6\16\6\u0145\13\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u014c\n\6\3\7\3\7\3\7\3\7\3\7\7\7\u0153\n\7\f\7\16\7\u0156"+
		"\13\7\3\7\5\7\u0159\n\7\3\b\3\b\3\b\5\b\u015e\n\b\3\b\3\b\3\b\3\b\7\b"+
		"\u0164\n\b\f\b\16\b\u0167\13\b\3\b\3\b\5\b\u016b\n\b\3\t\3\t\5\t\u016f"+
		"\n\t\3\t\3\t\5\t\u0173\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u017c\n\n\f"+
		"\n\16\n\u017f\13\n\3\13\3\13\7\13\u0183\n\13\f\13\16\13\u0186\13\13\3"+
		"\13\3\13\7\13\u018a\n\13\f\13\16\13\u018d\13\13\3\13\3\13\7\13\u0191\n"+
		"\13\f\13\16\13\u0194\13\13\3\13\3\13\7\13\u0198\n\13\f\13\16\13\u019b"+
		"\13\13\7\13\u019d\n\13\f\13\16\13\u01a0\13\13\3\f\3\f\3\f\5\f\u01a5\n"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u01af\n\17\3\20\3\20\3\20"+
		"\3\20\5\20\u01b5\n\20\5\20\u01b7\n\20\3\20\3\20\3\20\6\20\u01bc\n\20\r"+
		"\20\16\20\u01bd\3\20\7\20\u01c1\n\20\f\20\16\20\u01c4\13\20\3\20\3\20"+
		"\7\20\u01c8\n\20\f\20\16\20\u01cb\13\20\3\21\3\21\3\21\5\21\u01d0\n\21"+
		"\3\21\3\21\3\21\3\21\5\21\u01d6\n\21\3\21\3\21\3\21\3\21\5\21\u01dc\n"+
		"\21\7\21\u01de\n\21\f\21\16\21\u01e1\13\21\3\21\3\21\5\21\u01e5\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0235\n\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\5\24\u023d\n\24\3\25\3\25\5\25\u0241\n\25\3\26\3\26\3"+
		"\26\5\26\u0246\n\26\3\26\5\26\u0249\n\26\3\26\6\26\u024c\n\26\r\26\16"+
		"\26\u024d\3\26\7\26\u0251\n\26\f\26\16\26\u0254\13\26\3\26\3\26\5\26\u0258"+
		"\n\26\3\26\6\26\u025b\n\26\r\26\16\26\u025c\3\26\7\26\u0260\n\26\f\26"+
		"\16\26\u0263\13\26\5\26\u0265\n\26\3\26\3\26\5\26\u0269\n\26\3\26\6\26"+
		"\u026c\n\26\r\26\16\26\u026d\3\27\3\27\3\27\5\27\u0273\n\27\3\27\5\27"+
		"\u0276\n\27\3\27\6\27\u0279\n\27\r\27\16\27\u027a\3\27\3\27\5\27\u027f"+
		"\n\27\3\27\3\27\3\27\5\27\u0284\n\27\7\27\u0286\n\27\f\27\16\27\u0289"+
		"\13\27\3\27\3\27\7\27\u028d\n\27\f\27\16\27\u0290\13\27\3\27\7\27\u0293"+
		"\n\27\f\27\16\27\u0296\13\27\7\27\u0298\n\27\f\27\16\27\u029b\13\27\3"+
		"\27\3\27\5\27\u029f\n\27\3\27\6\27\u02a2\n\27\r\27\16\27\u02a3\3\30\3"+
		"\30\3\30\5\30\u02a9\n\30\3\31\3\31\3\31\5\31\u02ae\n\31\3\31\6\31\u02b1"+
		"\n\31\r\31\16\31\u02b2\3\31\7\31\u02b6\n\31\f\31\16\31\u02b9\13\31\3\31"+
		"\3\31\5\31\u02bd\n\31\3\31\6\31\u02c0\n\31\r\31\16\31\u02c1\3\32\3\32"+
		"\5\32\u02c6\n\32\3\32\6\32\u02c9\n\32\r\32\16\32\u02ca\3\32\7\32\u02ce"+
		"\n\32\f\32\16\32\u02d1\13\32\3\32\3\32\3\32\5\32\u02d6\n\32\3\32\6\32"+
		"\u02d9\n\32\r\32\16\32\u02da\3\33\3\33\3\33\3\33\5\33\u02e1\n\33\3\33"+
		"\3\33\3\33\3\33\5\33\u02e7\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u02ee\n"+
		"\33\3\33\3\33\3\33\3\33\3\33\5\33\u02f5\n\33\3\33\5\33\u02f8\n\33\3\33"+
		"\6\33\u02fb\n\33\r\33\16\33\u02fc\3\33\7\33\u0300\n\33\f\33\16\33\u0303"+
		"\13\33\3\33\3\33\5\33\u0307\n\33\3\33\6\33\u030a\n\33\r\33\16\33\u030b"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0314\n\34\f\34\16\34\u0317\13\34"+
		"\5\34\u0319\n\34\3\34\3\34\5\34\u031d\n\34\3\35\3\35\5\35\u0321\n\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u032d\n\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0337\n\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u033e\n\36\3\36\3\36\7\36\u0342\n\36\f\36\16\36\u0345\13\36"+
		"\3\37\5\37\u0348\n\37\3\37\3\37\3\37\3\37\7\37\u034e\n\37\f\37\16\37\u0351"+
		"\13\37\3\37\5\37\u0354\n\37\3\37\3\37\7\37\u0358\n\37\f\37\16\37\u035b"+
		"\13\37\5\37\u035d\n\37\3 \3 \3 \3 \3 \5 \u0364\n \3 \3 \3 \3 \3 \5 \u036b"+
		"\n \3 \3 \3!\3!\5!\u0371\n!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'"+
		"\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3"+
		"\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38"+
		"\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D"+
		"\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O"+
		"\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3["+
		"\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3"+
		"f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3"+
		"r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3|\3|\3}\3"+
		"}\3~\3~\3\177\5\177\u0430\n\177\3\177\3\177\3\177\5\177\u0435\n\177\3"+
		"\u0080\3\u0080\5\u0080\u0439\n\u0080\3\u0080\2\3:\u0081\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\2\3\3\2$%\2\u044c\2\u0103\3\2\2\2"+
		"\4\u011f\3\2\2\2\6\u0132\3\2\2\2\b\u013a\3\2\2\2\n\u013c\3\2\2\2\f\u014d"+
		"\3\2\2\2\16\u015a\3\2\2\2\20\u016e\3\2\2\2\22\u0176\3\2\2\2\24\u0180\3"+
		"\2\2\2\26\u01a4\3\2\2\2\30\u01a6\3\2\2\2\32\u01a8\3\2\2\2\34\u01aa\3\2"+
		"\2\2\36\u01b0\3\2\2\2 \u01e4\3\2\2\2\"\u0234\3\2\2\2$\u0236\3\2\2\2&\u023c"+
		"\3\2\2\2(\u0240\3\2\2\2*\u0242\3\2\2\2,\u026f\3\2\2\2.\u02a8\3\2\2\2\60"+
		"\u02aa\3\2\2\2\62\u02c3\3\2\2\2\64\u02f4\3\2\2\2\66\u030d\3\2\2\28\u0320"+
		"\3\2\2\2:\u032c\3\2\2\2<\u035c\3\2\2\2>\u035e\3\2\2\2@\u0370\3\2\2\2B"+
		"\u0374\3\2\2\2D\u0376\3\2\2\2F\u0378\3\2\2\2H\u037a\3\2\2\2J\u037c\3\2"+
		"\2\2L\u037e\3\2\2\2N\u0380\3\2\2\2P\u0382\3\2\2\2R\u0384\3\2\2\2T\u0386"+
		"\3\2\2\2V\u0388\3\2\2\2X\u038a\3\2\2\2Z\u038c\3\2\2\2\\\u038e\3\2\2\2"+
		"^\u0390\3\2\2\2`\u0392\3\2\2\2b\u0394\3\2\2\2d\u0396\3\2\2\2f\u0398\3"+
		"\2\2\2h\u039a\3\2\2\2j\u039c\3\2\2\2l\u039e\3\2\2\2n\u03a0\3\2\2\2p\u03a2"+
		"\3\2\2\2r\u03a4\3\2\2\2t\u03a6\3\2\2\2v\u03a8\3\2\2\2x\u03aa\3\2\2\2z"+
		"\u03ac\3\2\2\2|\u03ae\3\2\2\2~\u03b0\3\2\2\2\u0080\u03b2\3\2\2\2\u0082"+
		"\u03b4\3\2\2\2\u0084\u03b6\3\2\2\2\u0086\u03b8\3\2\2\2\u0088\u03ba\3\2"+
		"\2\2\u008a\u03bc\3\2\2\2\u008c\u03be\3\2\2\2\u008e\u03c0\3\2\2\2\u0090"+
		"\u03c2\3\2\2\2\u0092\u03c4\3\2\2\2\u0094\u03c6\3\2\2\2\u0096\u03c8\3\2"+
		"\2\2\u0098\u03ca\3\2\2\2\u009a\u03cc\3\2\2\2\u009c\u03ce\3\2\2\2\u009e"+
		"\u03d0\3\2\2\2\u00a0\u03d2\3\2\2\2\u00a2\u03d4\3\2\2\2\u00a4\u03d6\3\2"+
		"\2\2\u00a6\u03d8\3\2\2\2\u00a8\u03da\3\2\2\2\u00aa\u03dc\3\2\2\2\u00ac"+
		"\u03de\3\2\2\2\u00ae\u03e0\3\2\2\2\u00b0\u03e2\3\2\2\2\u00b2\u03e4\3\2"+
		"\2\2\u00b4\u03e6\3\2\2\2\u00b6\u03e8\3\2\2\2\u00b8\u03ea\3\2\2\2\u00ba"+
		"\u03ec\3\2\2\2\u00bc\u03ee\3\2\2\2\u00be\u03f0\3\2\2\2\u00c0\u03f2\3\2"+
		"\2\2\u00c2\u03f4\3\2\2\2\u00c4\u03f6\3\2\2\2\u00c6\u03f8\3\2\2\2\u00c8"+
		"\u03fa\3\2\2\2\u00ca\u03fc\3\2\2\2\u00cc\u03fe\3\2\2\2\u00ce\u0400\3\2"+
		"\2\2\u00d0\u0402\3\2\2\2\u00d2\u0404\3\2\2\2\u00d4\u0406\3\2\2\2\u00d6"+
		"\u0408\3\2\2\2\u00d8\u040a\3\2\2\2\u00da\u040c\3\2\2\2\u00dc\u040e\3\2"+
		"\2\2\u00de\u0410\3\2\2\2\u00e0\u0412\3\2\2\2\u00e2\u0414\3\2\2\2\u00e4"+
		"\u0416\3\2\2\2\u00e6\u0418\3\2\2\2\u00e8\u041a\3\2\2\2\u00ea\u041c\3\2"+
		"\2\2\u00ec\u041e\3\2\2\2\u00ee\u0420\3\2\2\2\u00f0\u0422\3\2\2\2\u00f2"+
		"\u0424\3\2\2\2\u00f4\u0426\3\2\2\2\u00f6\u0428\3\2\2\2\u00f8\u042a\3\2"+
		"\2\2\u00fa\u042c\3\2\2\2\u00fc\u0434\3\2\2\2\u00fe\u0438\3\2\2\2\u0100"+
		"\u0102\5\36\20\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3"+
		"\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106"+
		"\u0108\5\4\3\2\u0107\u0109\5n8\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2"+
		"\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010f\3\2\2\2\u010c\u010e"+
		"\5\6\4\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0116\5z"+
		">\2\u0113\u0115\5n8\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011c\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011b\5\36\20\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3"+
		"\2\2\2\u011c\u011d\3\2\2\2\u011d\3\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120"+
		"\5x=\2\u0120\u0121\5b\62\2\u0121\5\3\2\2\2\u0122\u0124\5\b\5\2\u0123\u0125"+
		"\5v<\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126"+
		"\u0128\5n8\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2"+
		"\2\u0129\u012a\3\2\2\2\u012a\u0133\3\2\2\2\u012b\u0133\5&\24\2\u012c\u012e"+
		"\5\66\34\2\u012d\u012f\5n8\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0122\3\2"+
		"\2\2\u0132\u012b\3\2\2\2\u0132\u012c\3\2\2\2\u0133\7\3\2\2\2\u0134\u013b"+
		"\5\n\6\2\u0135\u013b\5\f\7\2\u0136\u013b\5\20\t\2\u0137\u013b\5\22\n\2"+
		"\u0138\u013b\5\24\13\2\u0139\u013b\5\26\f\2\u013a\u0134\3\2\2\2\u013a"+
		"\u0135\3\2\2\2\u013a\u0136\3\2\2\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013a\u0139\3\2\2\2\u013b\t\3\2\2\2\u013c\u013d\5|?\2\u013d\u0143"+
		"\5`\61\2\u013e\u013f\5r:\2\u013f\u0140\5`\61\2\u0140\u0142\3\2\2\2\u0141"+
		"\u013e\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u014b\5\u0080A\2\u0147"+
		"\u014c\5\u0082B\2\u0148\u014c\5\u0084C\2\u0149\u014c\5\u0086D\2\u014a"+
		"\u014c\5\u008cG\2\u014b\u0147\3\2\2\2\u014b\u0148\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014b\u014a\3\2\2\2\u014c\13\3\2\2\2\u014d\u014e\5~@\2\u014e"+
		"\u0154\5\16\b\2\u014f\u0150\5r:\2\u0150\u0151\5\16\b\2\u0151\u0153\3\2"+
		"\2\2\u0152\u014f\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0159\5v"+
		"<\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\r\3\2\2\2\u015a\u015d"+
		"\5`\61\2\u015b\u015e\5j\66\2\u015c\u015e\5f\64\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0165\58\35\2\u0160\u0161\5r"+
		":\2\u0161\u0162\58\35\2\u0162\u0164\3\2\2\2\u0163\u0160\3\2\2\2\u0164"+
		"\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u016a\3\2"+
		"\2\2\u0167\u0165\3\2\2\2\u0168\u016b\5l\67\2\u0169\u016b\5h\65\2\u016a"+
		"\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016b\17\3\2\2\2\u016c\u016f\5`\61"+
		"\2\u016d\u016f\5\16\b\2\u016e\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016f"+
		"\u0172\3\2\2\2\u0170\u0173\5d\63\2\u0171\u0173\5p9\2\u0172\u0170\3\2\2"+
		"\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\58\35\2\u0175\21"+
		"\3\2\2\2\u0176\u0177\5\u008eH\2\u0177\u017d\5`\61\2\u0178\u0179\5r:\2"+
		"\u0179\u017a\5`\61\2\u017a\u017c\3\2\2\2\u017b\u0178\3\2\2\2\u017c\u017f"+
		"\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\23\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u0180\u0184\5\u0090I\2\u0181\u0183\5\u009cO\2\u0182\u0181"+
		"\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u018b\58\35\2\u0188\u018a\5\u009c"+
		"O\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u019e\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0192\5r"+
		":\2\u018f\u0191\5\u009cO\2\u0190\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2"+
		"\2\2\u0195\u0199\58\35\2\u0196\u0198\5\u009cO\2\u0197\u0196\3\2\2\2\u0198"+
		"\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019d\3\2"+
		"\2\2\u019b\u0199\3\2\2\2\u019c\u018e\3\2\2\2\u019d\u01a0\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\25\3\2\2\2\u01a0\u019e\3\2\2"+
		"\2\u01a1\u01a5\5\30\r\2\u01a2\u01a5\5\32\16\2\u01a3\u01a5\5\34\17\2\u01a4"+
		"\u01a1\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5\27\3\2\2"+
		"\2\u01a6\u01a7\5\u0092J\2\u01a7\31\3\2\2\2\u01a8\u01a9\5\u0094K\2\u01a9"+
		"\33\3\2\2\2\u01aa\u01ab\5\u0096L\2\u01ab\u01ae\58\35\2\u01ac\u01af\5\u0098"+
		"M\2\u01ad\u01af\5\u009aN\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af"+
		"\35\3\2\2\2\u01b0\u01b6\5\u00c4c\2\u01b1\u01b4\5`\61\2\u01b2\u01b5\5d"+
		"\63\2\u01b3\u01b5\5p9\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5"+
		"\u01b7\3\2\2\2\u01b6\u01b1\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\3\2"+
		"\2\2\u01b8\u01b9\5b\62\2\u01b9\u01bb\5 \21\2\u01ba\u01bc\5n8\2\u01bb\u01ba"+
		"\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01c2\3\2\2\2\u01bf\u01c1\5\6\4\2\u01c0\u01bf\3\2\2\2\u01c1\u01c4\3\2"+
		"\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4"+
		"\u01c2\3\2\2\2\u01c5\u01c9\5\u00caf\2\u01c6\u01c8\5n8\2\u01c7\u01c6\3"+
		"\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca"+
		"\37\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01cd\5f\64\2\u01cd\u01ce\5h\65"+
		"\2\u01ce\u01d0\3\2\2\2\u01cf\u01cc\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01e5"+
		"\3\2\2\2\u01d1\u01d2\5f\64\2\u01d2\u01d5\5b\62\2\u01d3\u01d6\5\u00c6d"+
		"\2\u01d4\u01d6\5\u00c8e\2\u01d5\u01d3\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01df\3\2\2\2\u01d7\u01d8\5r:\2\u01d8\u01db\5b\62"+
		"\2\u01d9\u01dc\5\u00c6d\2\u01da\u01dc\5\u00c8e\2\u01db\u01d9\3\2\2\2\u01db"+
		"\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01d7\3\2"+
		"\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u01e2\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\5h\65\2\u01e3\u01e5\3\2"+
		"\2\2\u01e4\u01cf\3\2\2\2\u01e4\u01d1\3\2\2\2\u01e5!\3\2\2\2\u01e6\u0235"+
		"\5\u00ccg\2\u01e7\u01e8\5\u00ceh\2\u01e8\u01e9\5$\23\2\u01e9\u0235\3\2"+
		"\2\2\u01ea\u01eb\5\u00d0i\2\u01eb\u01ec\5$\23\2\u01ec\u0235\3\2\2\2\u01ed"+
		"\u01ee\5\u00d2j\2\u01ee\u01ef\5$\23\2\u01ef\u0235\3\2\2\2\u01f0\u01f1"+
		"\5\u00d4k\2\u01f1\u01f2\5$\23\2\u01f2\u0235\3\2\2\2\u01f3\u01f4\5\u00d6"+
		"l\2\u01f4\u01f5\5$\23\2\u01f5\u0235\3\2\2\2\u01f6\u01f7\5\u00d8m\2\u01f7"+
		"\u01f8\5$\23\2\u01f8\u0235\3\2\2\2\u01f9\u01fa\5\u00dan\2\u01fa\u01fb"+
		"\5$\23\2\u01fb\u0235\3\2\2\2\u01fc\u01fd\5\u00dco\2\u01fd\u01fe\5$\23"+
		"\2\u01fe\u0235\3\2\2\2\u01ff\u0200\5\u00dep\2\u0200\u0201\5$\23\2\u0201"+
		"\u0235\3\2\2\2\u0202\u0203\5\u00e0q\2\u0203\u0204\5$\23\2\u0204\u0235"+
		"\3\2\2\2\u0205\u0206\5\u00e6t\2\u0206\u0207\5$\23\2\u0207\u0235\3\2\2"+
		"\2\u0208\u0209\5\u00e8u\2\u0209\u020a\5f\64\2\u020a\u020b\58\35\2\u020b"+
		"\u020c\5r:\2\u020c\u020d\58\35\2\u020d\u020e\5h\65\2\u020e\u0235\3\2\2"+
		"\2\u020f\u0210\5\u00e2r\2\u0210\u0211\5$\23\2\u0211\u0235\3\2\2\2\u0212"+
		"\u0213\5\u00e4s\2\u0213\u0214\5$\23\2\u0214\u0235\3\2\2\2\u0215\u0216"+
		"\5\u00f4{\2\u0216\u0217\5$\23\2\u0217\u0235\3\2\2\2\u0218\u0219\5\u00f6"+
		"|\2\u0219\u021a\5$\23\2\u021a\u0235\3\2\2\2\u021b\u021c\5\u00eav\2\u021c"+
		"\u021d\5$\23\2\u021d\u0235\3\2\2\2\u021e\u021f\5\u00f0y\2\u021f\u0220"+
		"\5f\64\2\u0220\u0221\58\35\2\u0221\u0222\5r:\2\u0222\u0223\58\35\2\u0223"+
		"\u0224\5r:\2\u0224\u0225\58\35\2\u0225\u0226\5h\65\2\u0226\u0235\3\2\2"+
		"\2\u0227\u0228\5\u00ecw\2\u0228\u0229\5$\23\2\u0229\u0235\3\2\2\2\u022a"+
		"\u022b\5\u00eex\2\u022b\u022c\5$\23\2\u022c\u0235\3\2\2\2\u022d\u022e"+
		"\5\u00f2z\2\u022e\u022f\5f\64\2\u022f\u0230\58\35\2\u0230\u0231\5r:\2"+
		"\u0231\u0232\58\35\2\u0232\u0233\5h\65\2\u0233\u0235\3\2\2\2\u0234\u01e6"+
		"\3\2\2\2\u0234\u01e7\3\2\2\2\u0234\u01ea\3\2\2\2\u0234\u01ed\3\2\2\2\u0234"+
		"\u01f0\3\2\2\2\u0234\u01f3\3\2\2\2\u0234\u01f6\3\2\2\2\u0234\u01f9\3\2"+
		"\2\2\u0234\u01fc\3\2\2\2\u0234\u01ff\3\2\2\2\u0234\u0202\3\2\2\2\u0234"+
		"\u0205\3\2\2\2\u0234\u0208\3\2\2\2\u0234\u020f\3\2\2\2\u0234\u0212\3\2"+
		"\2\2\u0234\u0215\3\2\2\2\u0234\u0218\3\2\2\2\u0234\u021b\3\2\2\2\u0234"+
		"\u021e\3\2\2\2\u0234\u0227\3\2\2\2\u0234\u022a\3\2\2\2\u0234\u022d\3\2"+
		"\2\2\u0235#\3\2\2\2\u0236\u0237\5f\64\2\u0237\u0238\58\35\2\u0238\u0239"+
		"\5h\65\2\u0239%\3\2\2\2\u023a\u023d\5(\25\2\u023b\u023d\5.\30\2\u023c"+
		"\u023a\3\2\2\2\u023c\u023b\3\2\2\2\u023d\'\3\2\2\2\u023e\u0241\5*\26\2"+
		"\u023f\u0241\5,\27\2\u0240\u023e\3\2\2\2\u0240\u023f\3\2\2\2\u0241)\3"+
		"\2\2\2\u0242\u0243\5\u009eP\2\u0243\u0245\5<\37\2\u0244\u0246\5\u00a0"+
		"Q\2\u0245\u0244\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0248\3\2\2\2\u0247"+
		"\u0249\5v<\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b\3\2\2"+
		"\2\u024a\u024c\5n8\2\u024b\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024b"+
		"\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0252\3\2\2\2\u024f\u0251\5\6\4\2\u0250"+
		"\u024f\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2"+
		"\2\2\u0253\u0264\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0257\5\u00a2R\2\u0256"+
		"\u0258\5v<\2\u0257\u0256\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025a\3\2\2"+
		"\2\u0259\u025b\5n8\2\u025a\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025a"+
		"\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u0261\3\2\2\2\u025e\u0260\5\6\4\2\u025f"+
		"\u025e\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2"+
		"\2\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0264\u0255\3\2\2\2\u0264"+
		"\u0265\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0268\5\u00a4S\2\u0267\u0269"+
		"\5v<\2\u0268\u0267\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a"+
		"\u026c\5n8\2\u026b\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026b\3\2\2"+
		"\2\u026d\u026e\3\2\2\2\u026e+\3\2\2\2\u026f\u0270\5\u00be`\2\u0270\u0272"+
		"\5`\61\2\u0271\u0273\5\u00b2Z\2\u0272\u0271\3\2\2\2\u0272\u0273\3\2\2"+
		"\2\u0273\u0275\3\2\2\2\u0274\u0276\5v<\2\u0275\u0274\3\2\2\2\u0275\u0276"+
		"\3\2\2\2\u0276\u0278\3\2\2\2\u0277\u0279\5n8\2\u0278\u0277\3\2\2\2\u0279"+
		"\u027a\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u0299\3\2"+
		"\2\2\u027c\u027f\58\35\2\u027d\u027f\5\u00c0a\2\u027e\u027c\3\2\2\2\u027e"+
		"\u027d\3\2\2\2\u027f\u0287\3\2\2\2\u0280\u0283\5r:\2\u0281\u0284\58\35"+
		"\2\u0282\u0284\5\u00c0a\2\u0283\u0281\3\2\2\2\u0283\u0282\3\2\2\2\u0284"+
		"\u0286\3\2\2\2\u0285\u0280\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u0285\3\2"+
		"\2\2\u0287\u0288\3\2\2\2\u0288\u028a\3\2\2\2\u0289\u0287\3\2\2\2\u028a"+
		"\u028e\5t;\2\u028b\u028d\5n8\2\u028c\u028b\3\2\2\2\u028d\u0290\3\2\2\2"+
		"\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0294\3\2\2\2\u0290\u028e"+
		"\3\2\2\2\u0291\u0293\5\6\4\2\u0292\u0291\3\2\2\2\u0293\u0296\3\2\2\2\u0294"+
		"\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0298\3\2\2\2\u0296\u0294\3\2"+
		"\2\2\u0297\u027e\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u029e\5\u00c2"+
		"b\2\u029d\u029f\5v<\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a1"+
		"\3\2\2\2\u02a0\u02a2\5n8\2\u02a1\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3"+
		"\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4-\3\2\2\2\u02a5\u02a9\5\60\31"+
		"\2\u02a6\u02a9\5\62\32\2\u02a7\u02a9\5\64\33\2\u02a8\u02a5\3\2\2\2\u02a8"+
		"\u02a6\3\2\2\2\u02a8\u02a7\3\2\2\2\u02a9/\3\2\2\2\u02aa\u02ab\5\u00b6"+
		"\\\2\u02ab\u02ad\5<\37\2\u02ac\u02ae\5\u00b2Z\2\u02ad\u02ac\3\2\2\2\u02ad"+
		"\u02ae\3\2\2\2\u02ae\u02b0\3\2\2\2\u02af\u02b1\5n8\2\u02b0\u02af\3\2\2"+
		"\2\u02b1\u02b2\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b7"+
		"\3\2\2\2\u02b4\u02b6\5\6\4\2\u02b5\u02b4\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7"+
		"\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02ba\3\2\2\2\u02b9\u02b7\3\2"+
		"\2\2\u02ba\u02bc\5\u00b8]\2\u02bb\u02bd\5v<\2\u02bc\u02bb\3\2\2\2\u02bc"+
		"\u02bd\3\2\2\2\u02bd\u02bf\3\2\2\2\u02be\u02c0\5n8\2\u02bf\u02be\3\2\2"+
		"\2\u02c0\u02c1\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\61"+
		"\3\2\2\2\u02c3\u02c5\5\u00ba^\2\u02c4\u02c6\5v<\2\u02c5\u02c4\3\2\2\2"+
		"\u02c5\u02c6\3\2\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02c9\5n8\2\u02c8\u02c7"+
		"\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb"+
		"\u02cf\3\2\2\2\u02cc\u02ce\5\6\4\2\u02cd\u02cc\3\2\2\2\u02ce\u02d1\3\2"+
		"\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2\3\2\2\2\u02d1"+
		"\u02cf\3\2\2\2\u02d2\u02d3\5\u00bc_\2\u02d3\u02d5\5<\37\2\u02d4\u02d6"+
		"\5v<\2\u02d5\u02d4\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d8\3\2\2\2\u02d7"+
		"\u02d9\5n8\2\u02d8\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02d8\3\2\2"+
		"\2\u02da\u02db\3\2\2\2\u02db\63\3\2\2\2\u02dc\u02dd\5\u00a6T\2\u02dd\u02e0"+
		"\5`\61\2\u02de\u02e1\5d\63\2\u02df\u02e1\5p9\2\u02e0\u02de\3\2\2\2\u02e0"+
		"\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e6\58\35\2\u02e3\u02e4\5\u00ac"+
		"W\2\u02e4\u02e5\58\35\2\u02e5\u02e7\3\2\2\2\u02e6\u02e3\3\2\2\2\u02e6"+
		"\u02e7\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\5\u00aeX\2\u02e9\u02ed"+
		"\58\35\2\u02ea\u02eb\5\u00b0Y\2\u02eb\u02ec\58\35\2\u02ec\u02ee\3\2\2"+
		"\2\u02ed\u02ea\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f5\3\2\2\2\u02ef\u02f0"+
		"\5\u00a8U\2\u02f0\u02f1\5b\62\2\u02f1\u02f2\5\u00aaV\2\u02f2\u02f3\5`"+
		"\61\2\u02f3\u02f5\3\2\2\2\u02f4\u02dc\3\2\2\2\u02f4\u02ef\3\2\2\2\u02f5"+
		"\u02f7\3\2\2\2\u02f6\u02f8\5\u00b2Z\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8"+
		"\3\2\2\2\u02f8\u02fa\3\2\2\2\u02f9\u02fb\5n8\2\u02fa\u02f9\3\2\2\2\u02fb"+
		"\u02fc\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u0301\3\2"+
		"\2\2\u02fe\u0300\5\6\4\2\u02ff\u02fe\3\2\2\2\u0300\u0303\3\2\2\2\u0301"+
		"\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0304\3\2\2\2\u0303\u0301\3\2"+
		"\2\2\u0304\u0306\5\u00b4[\2\u0305\u0307\5v<\2\u0306\u0305\3\2\2\2\u0306"+
		"\u0307\3\2\2\2\u0307\u0309\3\2\2\2\u0308\u030a\5n8\2\u0309\u0308\3\2\2"+
		"\2\u030a\u030b\3\2\2\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c\65"+
		"\3\2\2\2\u030d\u030e\5b\62\2\u030e\u0318\5f\64\2\u030f\u0315\58\35\2\u0310"+
		"\u0311\5r:\2\u0311\u0312\58\35\2\u0312\u0314\3\2\2\2\u0313\u0310\3\2\2"+
		"\2\u0314\u0317\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0319"+
		"\3\2\2\2\u0317\u0315\3\2\2\2\u0318\u030f\3\2\2\2\u0318\u0319\3\2\2\2\u0319"+
		"\u031a\3\2\2\2\u031a\u031c\5h\65\2\u031b\u031d\5v<\2\u031c\u031b\3\2\2"+
		"\2\u031c\u031d\3\2\2\2\u031d\67\3\2\2\2\u031e\u0321\5:\36\2\u031f\u0321"+
		"\5<\37\2\u0320\u031e\3\2\2\2\u0320\u031f\3\2\2\2\u03219\3\2\2\2\u0322"+
		"\u0323\b\36\1\2\u0323\u032d\5\"\22\2\u0324\u032d\5\66\34\2\u0325\u0326"+
		"\5f\64\2\u0326\u0327\5:\36\2\u0327\u0328\5h\65\2\u0328\u032d\3\2\2\2\u0329"+
		"\u032d\5\u00fc\177\2\u032a\u032d\5\16\b\2\u032b\u032d\5`\61\2\u032c\u0322"+
		"\3\2\2\2\u032c\u0324\3\2\2\2\u032c\u0325\3\2\2\2\u032c\u0329\3\2\2\2\u032c"+
		"\u032a\3\2\2\2\u032c\u032b\3\2\2\2\u032d\u0343\3\2\2\2\u032e\u032f\f\b"+
		"\2\2\u032f\u0330\5\\/\2\u0330\u0331\5:\36\t\u0331\u0342\3\2\2\2\u0332"+
		"\u0336\f\7\2\2\u0333\u0337\5X-\2\u0334\u0337\5Z.\2\u0335\u0337\5^\60\2"+
		"\u0336\u0333\3\2\2\2\u0336\u0334\3\2\2\2\u0336\u0335\3\2\2\2\u0337\u0338"+
		"\3\2\2\2\u0338\u0339\5:\36\b\u0339\u0342\3\2\2\2\u033a\u033d\f\6\2\2\u033b"+
		"\u033e\5T+\2\u033c\u033e\5V,\2\u033d\u033b\3\2\2\2\u033d\u033c\3\2\2\2"+
		"\u033e\u033f\3\2\2\2\u033f\u0340\5:\36\7\u0340\u0342\3\2\2\2\u0341\u032e"+
		"\3\2\2\2\u0341\u0332\3\2\2\2\u0341\u033a\3\2\2\2\u0342\u0345\3\2\2\2\u0343"+
		"\u0341\3\2\2\2\u0343\u0344\3\2\2\2\u0344;\3\2\2\2\u0345\u0343\3\2\2\2"+
		"\u0346\u0348\5R*\2\u0347\u0346\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349"+
		"\3\2\2\2\u0349\u034a\5f\64\2\u034a\u034b\5<\37\2\u034b\u034f\5h\65\2\u034c"+
		"\u034e\5@!\2\u034d\u034c\3\2\2\2\u034e\u0351\3\2\2\2\u034f\u034d\3\2\2"+
		"\2\u034f\u0350\3\2\2\2\u0350\u035d\3\2\2\2\u0351\u034f\3\2\2\2\u0352\u0354"+
		"\5R*\2\u0353\u0352\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0355\3\2\2\2\u0355"+
		"\u0359\5> \2\u0356\u0358\5@!\2\u0357\u0356\3\2\2\2\u0358\u035b\3\2\2\2"+
		"\u0359\u0357\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035d\3\2\2\2\u035b\u0359"+
		"\3\2\2\2\u035c\u0347\3\2\2\2\u035c\u0353\3\2\2\2\u035d=\3\2\2\2\u035e"+
		"\u036a\5:\36\2\u035f\u036b\5B\"\2\u0360\u036b\5D#\2\u0361\u0364\5p9\2"+
		"\u0362\u0364\5F$\2\u0363\u0361\3\2\2\2\u0363\u0362\3\2\2\2\u0364\u036b"+
		"\3\2\2\2\u0365\u036b\5H%\2\u0366\u036b\5J&\2\u0367\u036b\5L\'\2\u0368"+
		"\u036b\5N(\2\u0369\u036b\5P)\2\u036a\u035f\3\2\2\2\u036a\u0360\3\2\2\2"+
		"\u036a\u0363\3\2\2\2\u036a\u0365\3\2\2\2\u036a\u0366\3\2\2\2\u036a\u0367"+
		"\3\2\2\2\u036a\u0368\3\2\2\2\u036a\u0369\3\2\2\2\u036b\u036c\3\2\2\2\u036c"+
		"\u036d\5:\36\2\u036d?\3\2\2\2\u036e\u0371\5N(\2\u036f\u0371\5P)\2\u0370"+
		"\u036e\3\2\2\2\u0370\u036f\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0373\5<"+
		"\37\2\u0373A\3\2\2\2\u0374\u0375\7\16\2\2\u0375C\3\2\2\2\u0376\u0377\7"+
		"\17\2\2\u0377E\3\2\2\2\u0378\u0379\7\20\2\2\u0379G\3\2\2\2\u037a\u037b"+
		"\7\21\2\2\u037bI\3\2\2\2\u037c\u037d\7\22\2\2\u037dK\3\2\2\2\u037e\u037f"+
		"\7\23\2\2\u037fM\3\2\2\2\u0380\u0381\7\33\2\2\u0381O\3\2\2\2\u0382\u0383"+
		"\7\34\2\2\u0383Q\3\2\2\2\u0384\u0385\7\35\2\2\u0385S\3\2\2\2\u0386\u0387"+
		"\7\36\2\2\u0387U\3\2\2\2\u0388\u0389\7\37\2\2\u0389W\3\2\2\2\u038a\u038b"+
		"\7 \2\2\u038bY\3\2\2\2\u038c\u038d\7!\2\2\u038d[\3\2\2\2\u038e\u038f\7"+
		"\"\2\2\u038f]\3\2\2\2\u0390\u0391\7#\2\2\u0391_\3\2\2\2\u0392\u0393\5"+
		"b\62\2\u0393a\3\2\2\2\u0394\u0395\7i\2\2\u0395c\3\2\2\2\u0396\u0397\7"+
		"\4\2\2\u0397e\3\2\2\2\u0398\u0399\7\5\2\2\u0399g\3\2\2\2\u039a\u039b\7"+
		"\6\2\2\u039bi\3\2\2\2\u039c\u039d\7\7\2\2\u039dk\3\2\2\2\u039e\u039f\7"+
		"\b\2\2\u039fm\3\2\2\2\u03a0\u03a1\7\r\2\2\u03a1o\3\2\2\2\u03a2\u03a3\7"+
		"\t\2\2\u03a3q\3\2\2\2\u03a4\u03a5\7\n\2\2\u03a5s\3\2\2\2\u03a6\u03a7\7"+
		"\13\2\2\u03a7u\3\2\2\2\u03a8\u03a9\7\f\2\2\u03a9w\3\2\2\2\u03aa\u03ab"+
		"\7)\2\2\u03aby\3\2\2\2\u03ac\u03ad\7*\2\2\u03ad{\3\2\2\2\u03ae\u03af\7"+
		"+\2\2\u03af}\3\2\2\2\u03b0\u03b1\7\63\2\2\u03b1\177\3\2\2\2\u03b2\u03b3"+
		"\7,\2\2\u03b3\u0081\3\2\2\2\u03b4\u03b5\7-\2\2\u03b5\u0083\3\2\2\2\u03b6"+
		"\u03b7\7.\2\2\u03b7\u0085\3\2\2\2\u03b8\u03b9\7/\2\2\u03b9\u0087\3\2\2"+
		"\2\u03ba\u03bb\7\60\2\2\u03bb\u0089\3\2\2\2\u03bc\u03bd\7\61\2\2\u03bd"+
		"\u008b\3\2\2\2\u03be\u03bf\7\62\2\2\u03bf\u008d\3\2\2\2\u03c0\u03c1\7"+
		"\64\2\2\u03c1\u008f\3\2\2\2\u03c2\u03c3\7\65\2\2\u03c3\u0091\3\2\2\2\u03c4"+
		"\u03c5\7\66\2\2\u03c5\u0093\3\2\2\2\u03c6\u03c7\7\67\2\2\u03c7\u0095\3"+
		"\2\2\2\u03c8\u03c9\78\2\2\u03c9\u0097\3\2\2\2\u03ca\u03cb\79\2\2\u03cb"+
		"\u0099\3\2\2\2\u03cc\u03cd\7:\2\2\u03cd\u009b\3\2\2\2\u03ce\u03cf\7;\2"+
		"\2\u03cf\u009d\3\2\2\2\u03d0\u03d1\7<\2\2\u03d1\u009f\3\2\2\2\u03d2\u03d3"+
		"\7=\2\2\u03d3\u00a1\3\2\2\2\u03d4\u03d5\7>\2\2\u03d5\u00a3\3\2\2\2\u03d6"+
		"\u03d7\7?\2\2\u03d7\u00a5\3\2\2\2\u03d8\u03d9\7I\2\2\u03d9\u00a7\3\2\2"+
		"\2\u03da\u03db\7J\2\2\u03db\u00a9\3\2\2\2\u03dc\u03dd\7L\2\2\u03dd\u00ab"+
		"\3\2\2\2\u03de\u03df\7K\2\2\u03df\u00ad\3\2\2\2\u03e0\u03e1\7M\2\2\u03e1"+
		"\u00af\3\2\2\2\u03e2\u03e3\7B\2\2\u03e3\u00b1\3\2\2\2\u03e4\u03e5\7A\2"+
		"\2\u03e5\u00b3\3\2\2\2\u03e6\u03e7\7N\2\2\u03e7\u00b5\3\2\2\2\u03e8\u03e9"+
		"\7E\2\2\u03e9\u00b7\3\2\2\2\u03ea\u03eb\7F\2\2\u03eb\u00b9\3\2\2\2\u03ec"+
		"\u03ed\7G\2\2\u03ed\u00bb\3\2\2\2\u03ee\u03ef\7H\2\2\u03ef\u00bd\3\2\2"+
		"\2\u03f0\u03f1\7@\2\2\u03f1\u00bf\3\2\2\2\u03f2\u03f3\7C\2\2\u03f3\u00c1"+
		"\3\2\2\2\u03f4\u03f5\7D\2\2\u03f5\u00c3\3\2\2\2\u03f6\u03f7\7O\2\2\u03f7"+
		"\u00c5\3\2\2\2\u03f8\u03f9\7P\2\2\u03f9\u00c7\3\2\2\2\u03fa\u03fb\7Q\2"+
		"\2\u03fb\u00c9\3\2\2\2\u03fc\u03fd\7R\2\2\u03fd\u00cb\3\2\2\2\u03fe\u03ff"+
		"\7S\2\2\u03ff\u00cd\3\2\2\2\u0400\u0401\7T\2\2\u0401\u00cf\3\2\2\2\u0402"+
		"\u0403\7U\2\2\u0403\u00d1\3\2\2\2\u0404\u0405\7V\2\2\u0405\u00d3\3\2\2"+
		"\2\u0406\u0407\7W\2\2\u0407\u00d5\3\2\2\2\u0408\u0409\7X\2\2\u0409\u00d7"+
		"\3\2\2\2\u040a\u040b\7Y\2\2\u040b\u00d9\3\2\2\2\u040c\u040d\7Z\2\2\u040d"+
		"\u00db\3\2\2\2\u040e\u040f\7[\2\2\u040f\u00dd\3\2\2\2\u0410\u0411\7\\"+
		"\2\2\u0411\u00df\3\2\2\2\u0412\u0413\7]\2\2\u0413\u00e1\3\2\2\2\u0414"+
		"\u0415\7`\2\2\u0415\u00e3\3\2\2\2\u0416\u0417\7a\2\2\u0417\u00e5\3\2\2"+
		"\2\u0418\u0419\7^\2\2\u0419\u00e7\3\2\2\2\u041a\u041b\7_\2\2\u041b\u00e9"+
		"\3\2\2\2\u041c\u041d\7d\2\2\u041d\u00eb\3\2\2\2\u041e\u041f\7f\2\2\u041f"+
		"\u00ed\3\2\2\2\u0420\u0421\7g\2\2\u0421\u00ef\3\2\2\2\u0422\u0423\7e\2"+
		"\2\u0423\u00f1\3\2\2\2\u0424\u0425\7h\2\2\u0425\u00f3\3\2\2\2\u0426\u0427"+
		"\7b\2\2\u0427\u00f5\3\2\2\2\u0428\u0429\7c\2\2\u0429\u00f7\3\2\2\2\u042a"+
		"\u042b\7&\2\2\u042b\u00f9\3\2\2\2\u042c\u042d\t\2\2\2\u042d\u00fb\3\2"+
		"\2\2\u042e\u0430\7\37\2\2\u042f\u042e\3\2\2\2\u042f\u0430\3\2\2\2\u0430"+
		"\u0431\3\2\2\2\u0431\u0435\5\u00fa~\2\u0432\u0435\5\u00f8}\2\u0433\u0435"+
		"\5\u00fe\u0080\2\u0434\u042f\3\2\2\2\u0434\u0432\3\2\2\2\u0434\u0433\3"+
		"\2\2\2\u0435\u00fd\3\2\2\2\u0436\u0439\5\u0088E\2\u0437\u0439\5\u008a"+
		"F\2\u0438\u0436\3\2\2\2\u0438\u0437\3\2\2\2\u0439\u00ff\3\2\2\2g\u0103"+
		"\u010a\u010f\u0116\u011c\u0124\u0129\u0130\u0132\u013a\u0143\u014b\u0154"+
		"\u0158\u015d\u0165\u016a\u016e\u0172\u017d\u0184\u018b\u0192\u0199\u019e"+
		"\u01a4\u01ae\u01b4\u01b6\u01bd\u01c2\u01c9\u01cf\u01d5\u01db\u01df\u01e4"+
		"\u0234\u023c\u0240\u0245\u0248\u024d\u0252\u0257\u025c\u0261\u0264\u0268"+
		"\u026d\u0272\u0275\u027a\u027e\u0283\u0287\u028e\u0294\u0299\u029e\u02a3"+
		"\u02a8\u02ad\u02b2\u02b7\u02bc\u02c1\u02c5\u02ca\u02cf\u02d5\u02da\u02e0"+
		"\u02e6\u02ed\u02f4\u02f7\u02fc\u0301\u0306\u030b\u0315\u0318\u031c\u0320"+
		"\u032c\u0336\u033d\u0341\u0343\u0347\u034f\u0353\u0359\u035c\u0363\u036a"+
		"\u0370\u042f\u0434\u0438";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}