lexer grammar PSeIntLexer;

COMENTARIO_LINEA: '//' .*? SALTOLINEA -> skip;
//COMENTARIO_MULTILINEA: '/**' .*? '**/' -> skip; // No existen comentarios multilinea en PSeInt

// Primitivas secuenciales
ASIGNAR: '<-' | ':=';

PARENTESIS_ABRIR: '(';
PARENTESIS_CERRAR: ')';
CORCHETE_ABRIR: '[';
CORCHETE_CERRAR: ']';
SIGNOIGUAL: '=';
COMA: ',';
DOSPUNTOS: ':';
PUNTOCOMA: ';';
SALTOLINEA: [\r\n]+;

// Operadores

// Relacionales
MAYOR: '>' | (ES ' ' M A Y O R ' ' A) | (ES ' ' M A Y O R ' ' Q U E);
MENOR: '<' | (ES ' ' M E N O R ' ' A) | (ES ' ' M E N O R ' ' Q U E);
IGUAL: '==' | (ES ' ' I G U A L ' ' A) | (ES ' ' I G U A L ' ' Q U E);
MENORIGUAL: '<=' | (ES ' ' I G U A L ' | ' M E N O R ' ' A) | (ES ' ' I G U A L ' | ' M E N O R ' ' Q U E) | (ES ' ' M E N O R ' | ' I G U A L ' ' A) | (ES ' ' M E N O R ' | ' I G U A L ' ' Q U E);
MAYORIGUAL: '>=' | (ES ' ' I G U A L ' | ' M A Y O R ' ' A) | (ES ' ' I G U A L ' | ' M A Y O R ' ' Q U E) | (ES ' ' M A Y O R ' | ' I G U A L ' ' A) | (ES ' ' M A Y O R ' | ' I G U A L ' ' Q U E);
DISTINTO: '<>' | '!=' | (ES ' ' D I S T I N T [OA] ' ' A) | (ES ' ' D I S T I N T [OA] ' ' D E) ;
ESPAR: ES ' ' P A R;
ESIMPAR: ES ' ' I M P A R;
ESPOSITIVO: ES ' ' P O S I T I V [OA];
ESNEGATIVO: ES ' ' N E G A T I V [OA];
ESCERO: ES ' ' C E R O;
ESDIVISIBLE: (ES ' ' D I V I S I B L E ' ' P O R) | (ES ' ' M U L T I P L O ' ' D E);
ES: E S;

// Lógicos
CONJUNCION: ('&' | 'Y');
DISYUNCION: ('|' | 'O');
NEGACION: ('~' | 'NO' | '!');

// Algebraicos
SUMA: '+';
RESTA: '-';
MULTIPLICACION: '*';
DIVISION: '/';
POTENCIACION: '^';
MODULO: ('%' | (M O D));


// Tipos de datos simples
INT: DIGITO+;
FLOAT: DIGITO+ '.' DIGITO+;
STRING: STRING_SIMPLE | STRING_DOBLE;
STRING_SIMPLE: '\'' .*? '\'';
STRING_DOBLE: '"' .*? '"';

// Palabras reservadas
ALGORITMO: (A L G O R I T M O) | (P R O C E S O);
FINALGORITMO: F I N ' '? ALGORITMO;
DEFINIR: D E F I N I R;
COMO: C O M O;
REAL: (R E A L (E S)?) | (N U M (E | ETILDE) R I C GENERO_NUMERO) | (N (U | UTILDE) M E R O S?);
ENTERO: E N T E R GENERO_NUMERO;
LOGICO: L (O | OTILDE) G I C GENERO_NUMERO;
VERDADERO: V E R D A D E R O;
FALSO: F A L S O;
CARACTER: (C A R (A | ATILDE) C T E R) | (C A R A C T E R E R E S) | (T E X T O S?) | (C A D E N A S?);
DIMENSION: D I M E N S I (O | OTILDE) N;
LEER: L E E R;
ESCRIBIR: (E S C R I B I R) | (I M P R I M I R) | (M O S T R A R) | (I N F O R M A R);
BORRAR: ((B O R R A R) | (L I M P I A R)) ' '? P A N T A L L A;
ESPERARTECLA: ESPERAR (' '? | (' ' U N A ' ')?) T E C L A;
ESPERAR: E S P E R A R;
SEGUNDOS: S E G U N D O S?;
MILISEGUNDOS: M I L I S E G U N D O S?;
SINSALTAR: S I N ' '? ((S A L T A R) | (B A J A R));
SI: S I;
ENTONCES: E N T O N C ES;
SINO:  S I N O;
FINSI: F I N ' '? S I;
SEGUN: S E G (U | UTILDE) N;
HACER: H A C E R;
CONPASO: C O N ' ' P A S O;
DEOTROMODO: (D E ' ' O T R O ' ' M O D O) | (O T R O ' ' M O D O);
FINSEGUN: F I N ' '? SEGUN;
MIENTRAS: M I E N T R A S;
FINMIENTRAS: F I N ' '? M I E N T R A S;
REPETIR: R E P E T I R;
HASTAQUE: ((H A S T A) | (M I E N T R A S)) ' ' Q U E;
PARA: P A R A;
PARACADA: P A R A ' ' C A D A;
DESDE: D E S D E;
DE: D E;
HASTA: H A S T A;
FINPARA: F I N ' '? P A R A;
FUNCION: (F U N C I (O | OTILDE) N) | (S U B ALGORITMO);
PORVALOR: P O R ' ' V A L O R;
PORREFERENCIA: P O R ' ' R E F E R E N C I A;
FINFUNCION: F I N ' '? FUNCION;
PI: P I;
RAIZ: (R C) | (R A I Z);
ABS: A B S;
LN: L N;
EXP: E X P;
SEN: S E N;
COS: C O S;
TAN: T A N;
ASEN: A S E N;
ACOS: A C O S;
ATAN: A T A N;
AZAR: A Z A R;
ALEATORIO: A L E A T O R I O;
TRUNC: T R U N C;
REDON: R E D O N;
CONVERTIRANUMERO: C O N V E R T I R A N (U | UTILDE) M E R O; 
CONVERTIRATEXTO: C O N V E R T I R A T E X T O;
LONGITUD: L O N G I T U D;
SUBCADENA: S U B C A D E N A;
MAYUSCULAS: M A Y (U | UTILDE) S C U L A S;
MINUSCULAS: M I N (U | UTILDE) S C U L A S;
CONCATENAR: C O N C A T E N A R;

IDENTIFICADOR: (LETRATILDE | GUIONBAJO) (LETRATILDE | DIGITO | GUIONBAJO)*;

// Fragmentos
fragment LETRATILDE: LETRA | ATILDE | ETILDE | ITILDE | NTILDE | OTILDE | UTILDE | UDIERESIS;
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
fragment GUIONBAJO: '_';
fragment GENERO_NUMERO: (O | A) S?;
fragment A: [aA];
fragment ATILDE: ('\u00e1') | ('\u00c1');
fragment B: [bB];
fragment C: [cC];
fragment D: [dD];
fragment E: [eE];
fragment ETILDE: ('\u00e9') | ('\u00c9');
fragment F: [fF];
fragment G: [gG];
fragment H: [hH];
fragment I: [iI];
fragment ITILDE: ('\u00ed') | ('\u00cd');
fragment J: [jJ];
fragment K: [kK];
fragment L: [lL];
fragment M: [mM];
fragment N: [nN];
fragment NTILDE: ('\u00f1') | ('\u00d1');
fragment O: [oO];
fragment OTILDE: ('\u00f3') | ('\u00d3');
fragment P: [pP];
fragment Q: [qQ];
fragment R: [rR];
fragment S: [sS];
fragment T: [tT];
fragment U: [uU];
fragment UTILDE: ('\u00fa') | ('\u00da');
fragment UDIERESIS: ('\u00fc') | ('\u00dc');
fragment V: [vV];
fragment W: [wW];
fragment X: [xX];
fragment Y: [yY];
fragment Z: [zZ];

WS: [ \t]+ -> skip;