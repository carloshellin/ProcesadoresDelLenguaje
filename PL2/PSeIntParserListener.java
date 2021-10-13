// Generated from PSeIntParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PSeIntParser}.
 */
public interface PSeIntParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(PSeIntParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(PSeIntParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#inicioalgoritmo}.
	 * @param ctx the parse tree
	 */
	void enterInicioalgoritmo(PSeIntParser.InicioalgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#inicioalgoritmo}.
	 * @param ctx the parse tree
	 */
	void exitInicioalgoritmo(PSeIntParser.InicioalgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(PSeIntParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(PSeIntParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#primitiva}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiva(PSeIntParser.PrimitivaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#primitiva}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiva(PSeIntParser.PrimitivaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#definir_var}.
	 * @param ctx the parse tree
	 */
	void enterDefinir_var(PSeIntParser.Definir_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#definir_var}.
	 * @param ctx the parse tree
	 */
	void exitDefinir_var(PSeIntParser.Definir_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#dimension_var}.
	 * @param ctx the parse tree
	 */
	void enterDimension_var(PSeIntParser.Dimension_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#dimension_var}.
	 * @param ctx the parse tree
	 */
	void exitDimension_var(PSeIntParser.Dimension_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#arreglo}.
	 * @param ctx the parse tree
	 */
	void enterArreglo(PSeIntParser.ArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#arreglo}.
	 * @param ctx the parse tree
	 */
	void exitArreglo(PSeIntParser.ArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(PSeIntParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(PSeIntParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#lectura}.
	 * @param ctx the parse tree
	 */
	void enterLectura(PSeIntParser.LecturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#lectura}.
	 * @param ctx the parse tree
	 */
	void exitLectura(PSeIntParser.LecturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#escritura}.
	 * @param ctx the parse tree
	 */
	void enterEscritura(PSeIntParser.EscrituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#escritura}.
	 * @param ctx the parse tree
	 */
	void exitEscritura(PSeIntParser.EscrituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#otras}.
	 * @param ctx the parse tree
	 */
	void enterOtras(PSeIntParser.OtrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#otras}.
	 * @param ctx the parse tree
	 */
	void exitOtras(PSeIntParser.OtrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#borrando}.
	 * @param ctx the parse tree
	 */
	void enterBorrando(PSeIntParser.BorrandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#borrando}.
	 * @param ctx the parse tree
	 */
	void exitBorrando(PSeIntParser.BorrandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#esperar_tecla}.
	 * @param ctx the parse tree
	 */
	void enterEsperar_tecla(PSeIntParser.Esperar_teclaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#esperar_tecla}.
	 * @param ctx the parse tree
	 */
	void exitEsperar_tecla(PSeIntParser.Esperar_teclaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#esperar_tiempo}.
	 * @param ctx the parse tree
	 */
	void enterEsperar_tiempo(PSeIntParser.Esperar_tiempoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#esperar_tiempo}.
	 * @param ctx the parse tree
	 */
	void exitEsperar_tiempo(PSeIntParser.Esperar_tiempoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#definir_func}.
	 * @param ctx the parse tree
	 */
	void enterDefinir_func(PSeIntParser.Definir_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#definir_func}.
	 * @param ctx the parse tree
	 */
	void exitDefinir_func(PSeIntParser.Definir_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(PSeIntParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(PSeIntParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#funciones}.
	 * @param ctx the parse tree
	 */
	void enterFunciones(PSeIntParser.FuncionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#funciones}.
	 * @param ctx the parse tree
	 */
	void exitFunciones(PSeIntParser.FuncionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#funciones_arg}.
	 * @param ctx the parse tree
	 */
	void enterFunciones_arg(PSeIntParser.Funciones_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#funciones_arg}.
	 * @param ctx the parse tree
	 */
	void exitFunciones_arg(PSeIntParser.Funciones_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#control}.
	 * @param ctx the parse tree
	 */
	void enterControl(PSeIntParser.ControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#control}.
	 * @param ctx the parse tree
	 */
	void exitControl(PSeIntParser.ControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(PSeIntParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(PSeIntParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#si_op}.
	 * @param ctx the parse tree
	 */
	void enterSi_op(PSeIntParser.Si_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#si_op}.
	 * @param ctx the parse tree
	 */
	void exitSi_op(PSeIntParser.Si_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#segun_op}.
	 * @param ctx the parse tree
	 */
	void enterSegun_op(PSeIntParser.Segun_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#segun_op}.
	 * @param ctx the parse tree
	 */
	void exitSegun_op(PSeIntParser.Segun_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#repetitiva}.
	 * @param ctx the parse tree
	 */
	void enterRepetitiva(PSeIntParser.RepetitivaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#repetitiva}.
	 * @param ctx the parse tree
	 */
	void exitRepetitiva(PSeIntParser.RepetitivaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#mientras_op}.
	 * @param ctx the parse tree
	 */
	void enterMientras_op(PSeIntParser.Mientras_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#mientras_op}.
	 * @param ctx the parse tree
	 */
	void exitMientras_op(PSeIntParser.Mientras_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#repetir_op}.
	 * @param ctx the parse tree
	 */
	void enterRepetir_op(PSeIntParser.Repetir_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#repetir_op}.
	 * @param ctx the parse tree
	 */
	void exitRepetir_op(PSeIntParser.Repetir_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#para_op}.
	 * @param ctx the parse tree
	 */
	void enterPara_op(PSeIntParser.Para_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#para_op}.
	 * @param ctx the parse tree
	 */
	void exitPara_op(PSeIntParser.Para_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#llamar_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamar_funcion(PSeIntParser.Llamar_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#llamar_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamar_funcion(PSeIntParser.Llamar_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PSeIntParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PSeIntParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(PSeIntParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(PSeIntParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(PSeIntParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(PSeIntParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#expr_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExpr_relacional(PSeIntParser.Expr_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#expr_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExpr_relacional(PSeIntParser.Expr_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#expr_logico}.
	 * @param ctx the parse tree
	 */
	void enterExpr_logico(PSeIntParser.Expr_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#expr_logico}.
	 * @param ctx the parse tree
	 */
	void exitExpr_logico(PSeIntParser.Expr_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#mayor}.
	 * @param ctx the parse tree
	 */
	void enterMayor(PSeIntParser.MayorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#mayor}.
	 * @param ctx the parse tree
	 */
	void exitMayor(PSeIntParser.MayorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#menor}.
	 * @param ctx the parse tree
	 */
	void enterMenor(PSeIntParser.MenorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#menor}.
	 * @param ctx the parse tree
	 */
	void exitMenor(PSeIntParser.MenorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#igual}.
	 * @param ctx the parse tree
	 */
	void enterIgual(PSeIntParser.IgualContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#igual}.
	 * @param ctx the parse tree
	 */
	void exitIgual(PSeIntParser.IgualContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#menorigual}.
	 * @param ctx the parse tree
	 */
	void enterMenorigual(PSeIntParser.MenorigualContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#menorigual}.
	 * @param ctx the parse tree
	 */
	void exitMenorigual(PSeIntParser.MenorigualContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#mayorigual}.
	 * @param ctx the parse tree
	 */
	void enterMayorigual(PSeIntParser.MayorigualContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#mayorigual}.
	 * @param ctx the parse tree
	 */
	void exitMayorigual(PSeIntParser.MayorigualContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#distinto}.
	 * @param ctx the parse tree
	 */
	void enterDistinto(PSeIntParser.DistintoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#distinto}.
	 * @param ctx the parse tree
	 */
	void exitDistinto(PSeIntParser.DistintoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#conjuncion}.
	 * @param ctx the parse tree
	 */
	void enterConjuncion(PSeIntParser.ConjuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#conjuncion}.
	 * @param ctx the parse tree
	 */
	void exitConjuncion(PSeIntParser.ConjuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#disyuncion}.
	 * @param ctx the parse tree
	 */
	void enterDisyuncion(PSeIntParser.DisyuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#disyuncion}.
	 * @param ctx the parse tree
	 */
	void exitDisyuncion(PSeIntParser.DisyuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#negacion}.
	 * @param ctx the parse tree
	 */
	void enterNegacion(PSeIntParser.NegacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#negacion}.
	 * @param ctx the parse tree
	 */
	void exitNegacion(PSeIntParser.NegacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#suma}.
	 * @param ctx the parse tree
	 */
	void enterSuma(PSeIntParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#suma}.
	 * @param ctx the parse tree
	 */
	void exitSuma(PSeIntParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#resta}.
	 * @param ctx the parse tree
	 */
	void enterResta(PSeIntParser.RestaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#resta}.
	 * @param ctx the parse tree
	 */
	void exitResta(PSeIntParser.RestaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#multiplicacion}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacion(PSeIntParser.MultiplicacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#multiplicacion}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacion(PSeIntParser.MultiplicacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#division}.
	 * @param ctx the parse tree
	 */
	void enterDivision(PSeIntParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#division}.
	 * @param ctx the parse tree
	 */
	void exitDivision(PSeIntParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#potenciacion}.
	 * @param ctx the parse tree
	 */
	void enterPotenciacion(PSeIntParser.PotenciacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#potenciacion}.
	 * @param ctx the parse tree
	 */
	void exitPotenciacion(PSeIntParser.PotenciacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#modulo}.
	 * @param ctx the parse tree
	 */
	void enterModulo(PSeIntParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#modulo}.
	 * @param ctx the parse tree
	 */
	void exitModulo(PSeIntParser.ModuloContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PSeIntParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PSeIntParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(PSeIntParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(PSeIntParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#asignar}.
	 * @param ctx the parse tree
	 */
	void enterAsignar(PSeIntParser.AsignarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#asignar}.
	 * @param ctx the parse tree
	 */
	void exitAsignar(PSeIntParser.AsignarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#parentesis_abrir}.
	 * @param ctx the parse tree
	 */
	void enterParentesis_abrir(PSeIntParser.Parentesis_abrirContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#parentesis_abrir}.
	 * @param ctx the parse tree
	 */
	void exitParentesis_abrir(PSeIntParser.Parentesis_abrirContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#parentesis_cerrar}.
	 * @param ctx the parse tree
	 */
	void enterParentesis_cerrar(PSeIntParser.Parentesis_cerrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#parentesis_cerrar}.
	 * @param ctx the parse tree
	 */
	void exitParentesis_cerrar(PSeIntParser.Parentesis_cerrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#corchete_abrir}.
	 * @param ctx the parse tree
	 */
	void enterCorchete_abrir(PSeIntParser.Corchete_abrirContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#corchete_abrir}.
	 * @param ctx the parse tree
	 */
	void exitCorchete_abrir(PSeIntParser.Corchete_abrirContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#corchete_cerrar}.
	 * @param ctx the parse tree
	 */
	void enterCorchete_cerrar(PSeIntParser.Corchete_cerrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#corchete_cerrar}.
	 * @param ctx the parse tree
	 */
	void exitCorchete_cerrar(PSeIntParser.Corchete_cerrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#saltolinea}.
	 * @param ctx the parse tree
	 */
	void enterSaltolinea(PSeIntParser.SaltolineaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#saltolinea}.
	 * @param ctx the parse tree
	 */
	void exitSaltolinea(PSeIntParser.SaltolineaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#coma}.
	 * @param ctx the parse tree
	 */
	void enterComa(PSeIntParser.ComaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#coma}.
	 * @param ctx the parse tree
	 */
	void exitComa(PSeIntParser.ComaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#dospuntos}.
	 * @param ctx the parse tree
	 */
	void enterDospuntos(PSeIntParser.DospuntosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#dospuntos}.
	 * @param ctx the parse tree
	 */
	void exitDospuntos(PSeIntParser.DospuntosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#puntocoma}.
	 * @param ctx the parse tree
	 */
	void enterPuntocoma(PSeIntParser.PuntocomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#puntocoma}.
	 * @param ctx the parse tree
	 */
	void exitPuntocoma(PSeIntParser.PuntocomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterAlgoritmo(PSeIntParser.AlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitAlgoritmo(PSeIntParser.AlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#finalgoritmo}.
	 * @param ctx the parse tree
	 */
	void enterFinalgoritmo(PSeIntParser.FinalgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#finalgoritmo}.
	 * @param ctx the parse tree
	 */
	void exitFinalgoritmo(PSeIntParser.FinalgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#definir}.
	 * @param ctx the parse tree
	 */
	void enterDefinir(PSeIntParser.DefinirContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#definir}.
	 * @param ctx the parse tree
	 */
	void exitDefinir(PSeIntParser.DefinirContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(PSeIntParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(PSeIntParser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#como}.
	 * @param ctx the parse tree
	 */
	void enterComo(PSeIntParser.ComoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#como}.
	 * @param ctx the parse tree
	 */
	void exitComo(PSeIntParser.ComoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#real}.
	 * @param ctx the parse tree
	 */
	void enterReal(PSeIntParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#real}.
	 * @param ctx the parse tree
	 */
	void exitReal(PSeIntParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#entero}.
	 * @param ctx the parse tree
	 */
	void enterEntero(PSeIntParser.EnteroContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#entero}.
	 * @param ctx the parse tree
	 */
	void exitEntero(PSeIntParser.EnteroContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#logico}.
	 * @param ctx the parse tree
	 */
	void enterLogico(PSeIntParser.LogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#logico}.
	 * @param ctx the parse tree
	 */
	void exitLogico(PSeIntParser.LogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#verdadero}.
	 * @param ctx the parse tree
	 */
	void enterVerdadero(PSeIntParser.VerdaderoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#verdadero}.
	 * @param ctx the parse tree
	 */
	void exitVerdadero(PSeIntParser.VerdaderoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#falso}.
	 * @param ctx the parse tree
	 */
	void enterFalso(PSeIntParser.FalsoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#falso}.
	 * @param ctx the parse tree
	 */
	void exitFalso(PSeIntParser.FalsoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#caracter}.
	 * @param ctx the parse tree
	 */
	void enterCaracter(PSeIntParser.CaracterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#caracter}.
	 * @param ctx the parse tree
	 */
	void exitCaracter(PSeIntParser.CaracterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#leer}.
	 * @param ctx the parse tree
	 */
	void enterLeer(PSeIntParser.LeerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#leer}.
	 * @param ctx the parse tree
	 */
	void exitLeer(PSeIntParser.LeerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#escribir}.
	 * @param ctx the parse tree
	 */
	void enterEscribir(PSeIntParser.EscribirContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#escribir}.
	 * @param ctx the parse tree
	 */
	void exitEscribir(PSeIntParser.EscribirContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#borrar}.
	 * @param ctx the parse tree
	 */
	void enterBorrar(PSeIntParser.BorrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#borrar}.
	 * @param ctx the parse tree
	 */
	void exitBorrar(PSeIntParser.BorrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#esperartecla}.
	 * @param ctx the parse tree
	 */
	void enterEsperartecla(PSeIntParser.EsperarteclaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#esperartecla}.
	 * @param ctx the parse tree
	 */
	void exitEsperartecla(PSeIntParser.EsperarteclaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#esperar}.
	 * @param ctx the parse tree
	 */
	void enterEsperar(PSeIntParser.EsperarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#esperar}.
	 * @param ctx the parse tree
	 */
	void exitEsperar(PSeIntParser.EsperarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#segundos}.
	 * @param ctx the parse tree
	 */
	void enterSegundos(PSeIntParser.SegundosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#segundos}.
	 * @param ctx the parse tree
	 */
	void exitSegundos(PSeIntParser.SegundosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#milisegundos}.
	 * @param ctx the parse tree
	 */
	void enterMilisegundos(PSeIntParser.MilisegundosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#milisegundos}.
	 * @param ctx the parse tree
	 */
	void exitMilisegundos(PSeIntParser.MilisegundosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#sinsaltar}.
	 * @param ctx the parse tree
	 */
	void enterSinsaltar(PSeIntParser.SinsaltarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#sinsaltar}.
	 * @param ctx the parse tree
	 */
	void exitSinsaltar(PSeIntParser.SinsaltarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(PSeIntParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(PSeIntParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#entonces}.
	 * @param ctx the parse tree
	 */
	void enterEntonces(PSeIntParser.EntoncesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#entonces}.
	 * @param ctx the parse tree
	 */
	void exitEntonces(PSeIntParser.EntoncesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#sino}.
	 * @param ctx the parse tree
	 */
	void enterSino(PSeIntParser.SinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#sino}.
	 * @param ctx the parse tree
	 */
	void exitSino(PSeIntParser.SinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#finsi}.
	 * @param ctx the parse tree
	 */
	void enterFinsi(PSeIntParser.FinsiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#finsi}.
	 * @param ctx the parse tree
	 */
	void exitFinsi(PSeIntParser.FinsiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(PSeIntParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(PSeIntParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#paracada}.
	 * @param ctx the parse tree
	 */
	void enterParacada(PSeIntParser.ParacadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#paracada}.
	 * @param ctx the parse tree
	 */
	void exitParacada(PSeIntParser.ParacadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#de}.
	 * @param ctx the parse tree
	 */
	void enterDe(PSeIntParser.DeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#de}.
	 * @param ctx the parse tree
	 */
	void exitDe(PSeIntParser.DeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#desde}.
	 * @param ctx the parse tree
	 */
	void enterDesde(PSeIntParser.DesdeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#desde}.
	 * @param ctx the parse tree
	 */
	void exitDesde(PSeIntParser.DesdeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#hasta}.
	 * @param ctx the parse tree
	 */
	void enterHasta(PSeIntParser.HastaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#hasta}.
	 * @param ctx the parse tree
	 */
	void exitHasta(PSeIntParser.HastaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#conpaso}.
	 * @param ctx the parse tree
	 */
	void enterConpaso(PSeIntParser.ConpasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#conpaso}.
	 * @param ctx the parse tree
	 */
	void exitConpaso(PSeIntParser.ConpasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#hacer}.
	 * @param ctx the parse tree
	 */
	void enterHacer(PSeIntParser.HacerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#hacer}.
	 * @param ctx the parse tree
	 */
	void exitHacer(PSeIntParser.HacerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#finpara}.
	 * @param ctx the parse tree
	 */
	void enterFinpara(PSeIntParser.FinparaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#finpara}.
	 * @param ctx the parse tree
	 */
	void exitFinpara(PSeIntParser.FinparaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(PSeIntParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(PSeIntParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#finmientras}.
	 * @param ctx the parse tree
	 */
	void enterFinmientras(PSeIntParser.FinmientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#finmientras}.
	 * @param ctx the parse tree
	 */
	void exitFinmientras(PSeIntParser.FinmientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#repetir}.
	 * @param ctx the parse tree
	 */
	void enterRepetir(PSeIntParser.RepetirContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#repetir}.
	 * @param ctx the parse tree
	 */
	void exitRepetir(PSeIntParser.RepetirContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#hastaque}.
	 * @param ctx the parse tree
	 */
	void enterHastaque(PSeIntParser.HastaqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#hastaque}.
	 * @param ctx the parse tree
	 */
	void exitHastaque(PSeIntParser.HastaqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#segun}.
	 * @param ctx the parse tree
	 */
	void enterSegun(PSeIntParser.SegunContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#segun}.
	 * @param ctx the parse tree
	 */
	void exitSegun(PSeIntParser.SegunContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#deotromodo}.
	 * @param ctx the parse tree
	 */
	void enterDeotromodo(PSeIntParser.DeotromodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#deotromodo}.
	 * @param ctx the parse tree
	 */
	void exitDeotromodo(PSeIntParser.DeotromodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#finsegun}.
	 * @param ctx the parse tree
	 */
	void enterFinsegun(PSeIntParser.FinsegunContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#finsegun}.
	 * @param ctx the parse tree
	 */
	void exitFinsegun(PSeIntParser.FinsegunContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(PSeIntParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(PSeIntParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#porvalor}.
	 * @param ctx the parse tree
	 */
	void enterPorvalor(PSeIntParser.PorvalorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#porvalor}.
	 * @param ctx the parse tree
	 */
	void exitPorvalor(PSeIntParser.PorvalorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#porreferencia}.
	 * @param ctx the parse tree
	 */
	void enterPorreferencia(PSeIntParser.PorreferenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#porreferencia}.
	 * @param ctx the parse tree
	 */
	void exitPorreferencia(PSeIntParser.PorreferenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#finfuncion}.
	 * @param ctx the parse tree
	 */
	void enterFinfuncion(PSeIntParser.FinfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#finfuncion}.
	 * @param ctx the parse tree
	 */
	void exitFinfuncion(PSeIntParser.FinfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#pi}.
	 * @param ctx the parse tree
	 */
	void enterPi(PSeIntParser.PiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#pi}.
	 * @param ctx the parse tree
	 */
	void exitPi(PSeIntParser.PiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#raiz}.
	 * @param ctx the parse tree
	 */
	void enterRaiz(PSeIntParser.RaizContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#raiz}.
	 * @param ctx the parse tree
	 */
	void exitRaiz(PSeIntParser.RaizContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#abs}.
	 * @param ctx the parse tree
	 */
	void enterAbs(PSeIntParser.AbsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#abs}.
	 * @param ctx the parse tree
	 */
	void exitAbs(PSeIntParser.AbsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#ln}.
	 * @param ctx the parse tree
	 */
	void enterLn(PSeIntParser.LnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#ln}.
	 * @param ctx the parse tree
	 */
	void exitLn(PSeIntParser.LnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#expf}.
	 * @param ctx the parse tree
	 */
	void enterExpf(PSeIntParser.ExpfContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#expf}.
	 * @param ctx the parse tree
	 */
	void exitExpf(PSeIntParser.ExpfContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#sen}.
	 * @param ctx the parse tree
	 */
	void enterSen(PSeIntParser.SenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#sen}.
	 * @param ctx the parse tree
	 */
	void exitSen(PSeIntParser.SenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#cos}.
	 * @param ctx the parse tree
	 */
	void enterCos(PSeIntParser.CosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#cos}.
	 * @param ctx the parse tree
	 */
	void exitCos(PSeIntParser.CosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#tan}.
	 * @param ctx the parse tree
	 */
	void enterTan(PSeIntParser.TanContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#tan}.
	 * @param ctx the parse tree
	 */
	void exitTan(PSeIntParser.TanContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#asen}.
	 * @param ctx the parse tree
	 */
	void enterAsen(PSeIntParser.AsenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#asen}.
	 * @param ctx the parse tree
	 */
	void exitAsen(PSeIntParser.AsenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#acos}.
	 * @param ctx the parse tree
	 */
	void enterAcos(PSeIntParser.AcosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#acos}.
	 * @param ctx the parse tree
	 */
	void exitAcos(PSeIntParser.AcosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#atan}.
	 * @param ctx the parse tree
	 */
	void enterAtan(PSeIntParser.AtanContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#atan}.
	 * @param ctx the parse tree
	 */
	void exitAtan(PSeIntParser.AtanContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#trunc}.
	 * @param ctx the parse tree
	 */
	void enterTrunc(PSeIntParser.TruncContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#trunc}.
	 * @param ctx the parse tree
	 */
	void exitTrunc(PSeIntParser.TruncContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#redon}.
	 * @param ctx the parse tree
	 */
	void enterRedon(PSeIntParser.RedonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#redon}.
	 * @param ctx the parse tree
	 */
	void exitRedon(PSeIntParser.RedonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#azar}.
	 * @param ctx the parse tree
	 */
	void enterAzar(PSeIntParser.AzarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#azar}.
	 * @param ctx the parse tree
	 */
	void exitAzar(PSeIntParser.AzarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#aleatorio}.
	 * @param ctx the parse tree
	 */
	void enterAleatorio(PSeIntParser.AleatorioContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#aleatorio}.
	 * @param ctx the parse tree
	 */
	void exitAleatorio(PSeIntParser.AleatorioContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#longitud}.
	 * @param ctx the parse tree
	 */
	void enterLongitud(PSeIntParser.LongitudContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#longitud}.
	 * @param ctx the parse tree
	 */
	void exitLongitud(PSeIntParser.LongitudContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#mayusculas}.
	 * @param ctx the parse tree
	 */
	void enterMayusculas(PSeIntParser.MayusculasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#mayusculas}.
	 * @param ctx the parse tree
	 */
	void exitMayusculas(PSeIntParser.MayusculasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#minusculas}.
	 * @param ctx the parse tree
	 */
	void enterMinusculas(PSeIntParser.MinusculasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#minusculas}.
	 * @param ctx the parse tree
	 */
	void exitMinusculas(PSeIntParser.MinusculasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#subcadena}.
	 * @param ctx the parse tree
	 */
	void enterSubcadena(PSeIntParser.SubcadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#subcadena}.
	 * @param ctx the parse tree
	 */
	void exitSubcadena(PSeIntParser.SubcadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#concatenar}.
	 * @param ctx the parse tree
	 */
	void enterConcatenar(PSeIntParser.ConcatenarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#concatenar}.
	 * @param ctx the parse tree
	 */
	void exitConcatenar(PSeIntParser.ConcatenarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#convertiranumero}.
	 * @param ctx the parse tree
	 */
	void enterConvertiranumero(PSeIntParser.ConvertiranumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#convertiranumero}.
	 * @param ctx the parse tree
	 */
	void exitConvertiranumero(PSeIntParser.ConvertiranumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#convertiratexto}.
	 * @param ctx the parse tree
	 */
	void enterConvertiratexto(PSeIntParser.ConvertiratextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#convertiratexto}.
	 * @param ctx the parse tree
	 */
	void exitConvertiratexto(PSeIntParser.ConvertiratextoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(PSeIntParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(PSeIntParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(PSeIntParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(PSeIntParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(PSeIntParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(PSeIntParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntParser#logica}.
	 * @param ctx the parse tree
	 */
	void enterLogica(PSeIntParser.LogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntParser#logica}.
	 * @param ctx the parse tree
	 */
	void exitLogica(PSeIntParser.LogicaContext ctx);
}