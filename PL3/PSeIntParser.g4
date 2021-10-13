parser grammar PSeIntParser;

options {
	tokenVocab = PSeIntLexer;
	language = Java;
}

programa: definir_func* inicioalgoritmo saltolinea+ instruccion* finalgoritmo saltolinea* definir_func*;

inicioalgoritmo: algoritmo identificador;

instruccion: primitiva puntocoma? saltolinea+
			| control
			| llamar_funcion saltolinea+;

// Primitivas secuenciales
primitiva:
		definir_var
		| dimension_var
		| asignacion
		| lectura
		| escritura
		| otras;
		
		
definir_var: definir variable (coma variable)* como (real | entero | logico | caracter);
dimension_var: dimension arreglo (coma arreglo)* puntocoma?;
arreglo: variable (corchete_abrir | parentesis_abrir) expr (coma expr)* (corchete_cerrar | parentesis_cerrar);
asignacion: (variable | arreglo) (asignar | signoigual) expr;
lectura: leer variable (coma variable)*;
escritura: escribir sinsaltar* expr sinsaltar* (coma sinsaltar* expr sinsaltar*)*;

otras:
	borrando
	| esperar_tecla
	| esperar_tiempo;
	
borrando: borrar;
esperar_tecla: esperartecla;
esperar_tiempo: esperar expr (segundos | milisegundos);
definir_func: funcion (variable (asignar | signoigual))? identificador argumentos saltolinea+ instruccion* finfuncion saltolinea*;
argumentos: (parentesis_abrir parentesis_cerrar)?
			| parentesis_abrir identificador (porvalor | porreferencia)? (coma identificador (porvalor | porreferencia)?)* parentesis_cerrar;
funciones:
	pi
	| raiz funciones_arg
	| abs funciones_arg
	| ln funciones_arg
	| expf funciones_arg
	| sen funciones_arg
	| cos funciones_arg
	| tan funciones_arg
	| asen funciones_arg
	| acos funciones_arg
	| atan funciones_arg
	| azar funciones_arg
	| aleatorio parentesis_abrir expr coma expr parentesis_cerrar
	| trunc funciones_arg
	| redon funciones_arg
	| convertiranumero funciones_arg
	| convertiratexto funciones_arg
	| longitud funciones_arg
	| subcadena parentesis_abrir expr coma expr coma expr parentesis_cerrar
	| mayusculas funciones_arg
	| minusculas funciones_arg
	| concatenar parentesis_abrir expr coma expr parentesis_cerrar;
	
funciones_arg: parentesis_abrir expr parentesis_cerrar;

// Estructuras de Control:

control:
	condicional
	| repetitiva;

// Condicionales
condicional:
	si_op
	| segun_op;

si_op:
	si condicion entonces? puntocoma? saltolinea+ instruccion* (sino puntocoma? saltolinea+ instruccion*)? finsi puntocoma? saltolinea+;
	
segun_op:
	segun variable hacer? puntocoma? saltolinea+ ((expr | deotromodo) (coma (expr | deotromodo))* dospuntos saltolinea* instruccion*)* finsegun puntocoma? saltolinea+;

// Repetitivas
repetitiva:
	mientras_op
	| repetir_op
	| para_op;
	
mientras_op:
	mientras condicion hacer? saltolinea+ instruccion* finmientras puntocoma? saltolinea+;

repetir_op:
	repetir puntocoma? saltolinea+ instruccion* hastaque condicion puntocoma? saltolinea+;
	
para_op:
	((para variable (asignar | signoigual) expr (desde expr)? hasta expr (conpaso expr)?) | (paracada identificador de variable)) hacer? saltolinea+ instruccion* finpara puntocoma? saltolinea+;
	
llamar_funcion: identificador parentesis_abrir (expr (coma expr)*)? parentesis_cerrar puntocoma?;
	
expr: (exp | condicion);

exp:
	funciones
	| llamar_funcion
	| parentesis_abrir exp parentesis_cerrar
	| exp potenciacion exp
	| exp (multiplicacion | division | modulo) exp
	| exp (suma | resta) exp
	| valor
	| arreglo
	| variable;

condicion:
	negacion? parentesis_abrir condicion parentesis_cerrar expr_logico*
	| negacion? expr_relacional expr_logico*;
	
expr_relacional:
	exp (
		mayor
		| menor
		| (signoigual | igual)
		| menorigual
		| mayorigual
		| distinto
		| conjuncion
		| disyuncion
	) exp;
	
expr_logico: ((conjuncion | disyuncion) condicion);

// Operadores

// Relacionales
mayor: MAYOR;
menor: MENOR;
igual: IGUAL;
menorigual: MENORIGUAL;
mayorigual: MAYORIGUAL;
distinto: DISTINTO;

// Lógicos
conjuncion: CONJUNCION;
disyuncion: DISYUNCION;
negacion: NEGACION;

// Algebraicos
suma: SUMA;
resta: RESTA;
multiplicacion: MULTIPLICACION;
division: DIVISION;
potenciacion: POTENCIACION;
modulo: MODULO;

// Elementos
variable: identificador;
identificador: IDENTIFICADOR;
asignar: ASIGNAR;
parentesis_abrir: PARENTESIS_ABRIR;
parentesis_cerrar: PARENTESIS_CERRAR;
corchete_abrir: CORCHETE_ABRIR;
corchete_cerrar: CORCHETE_CERRAR;
saltolinea: SALTOLINEA;
signoigual: SIGNOIGUAL;
coma: COMA;
dospuntos: DOSPUNTOS;
puntocoma: PUNTOCOMA;

// Palabras reservadas
algoritmo: ALGORITMO;
finalgoritmo: FINALGORITMO;
definir: DEFINIR;
dimension: DIMENSION;
como: COMO;
real: REAL;
entero: ENTERO;
logico: LOGICO;
verdadero: VERDADERO;
falso: FALSO;
caracter: CARACTER;
leer: LEER;
escribir: ESCRIBIR;
borrar: BORRAR;
esperartecla: ESPERARTECLA;
esperar: ESPERAR;
segundos: SEGUNDOS;
milisegundos: MILISEGUNDOS;
sinsaltar: SINSALTAR;
si: SI;
entonces: ENTONCES;
sino: SINO;
finsi: FINSI;
para: PARA;
paracada: PARACADA;
de: DE;
desde: DESDE;
hasta: HASTA;
conpaso: CONPASO;
hacer: HACER;
finpara: FINPARA;
mientras: MIENTRAS;
finmientras: FINMIENTRAS;
repetir: REPETIR;
hastaque: HASTAQUE;
segun: SEGUN;
deotromodo: DEOTROMODO;
finsegun: FINSEGUN;
funcion: FUNCION;
porvalor: PORVALOR;
porreferencia: PORREFERENCIA;
finfuncion: FINFUNCION;
pi: PI;
raiz: RAIZ;
abs: ABS;
ln: LN;
expf: EXP;
sen: SEN;
cos: COS;
tan: TAN;
asen: ASEN;
acos: ACOS;
atan: ATAN;
trunc: TRUNC;
redon: REDON;
azar: AZAR;
aleatorio: ALEATORIO;
longitud: LONGITUD;
mayusculas: MAYUSCULAS;
minusculas: MINUSCULAS;
subcadena: SUBCADENA;
concatenar: CONCATENAR;
convertiranumero: CONVERTIRANUMERO;
convertiratexto: CONVERTIRATEXTO;

// Tipos de datos
string: STRING;
numero: INT | FLOAT;
valor: RESTA? numero | string | logica;
logica: verdadero | falso;