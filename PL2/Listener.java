import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Listener extends PSeIntParserBaseListener
{
	private PrintWriter salida; 
	private String linea;
	private boolean error;
	
	public Listener()
	{
		try
        {
			salida = new PrintWriter("arbol.txt", "UTF-8");
		}
		catch (FileNotFoundException | UnsupportedEncodingException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
		linea = "";
		
		error = false;
	}
	
	private void mostraryEscribir(String texto)
	{
		if (!error)
		{
			System.out.println(linea + texto);
			salida.println(linea + texto);
		}
	}
	
	private void mostraryEscribirError(String texto)
	{
		System.out.println(texto);
		salida.println(texto);
	}
	
	private void actualizarLinea(String texto)
	{
		if (linea != "")
		{
			linea = linea.substring(0, linea.lastIndexOf(texto));
		}
		else
		{
			linea = "";
		}
	}
	
	@Override public void enterPrograma(PSeIntParser.ProgramaContext ctx)
	{
		mostraryEscribir("/programa");
		linea = "/programa";
	}
	
	@Override public void exitPrograma(PSeIntParser.ProgramaContext ctx)
	{
		actualizarLinea("/programa");
		salida.close();
	}
	
	@Override public void enterInicioalgoritmo(PSeIntParser.InicioalgoritmoContext ctx)
	{
		mostraryEscribir("/inicioalgoritmo");
		linea += "/inicioalgoritmo";
	}
	
	@Override public void exitInicioalgoritmo(PSeIntParser.InicioalgoritmoContext ctx)
    {
        actualizarLinea("/inicioalgoritmo");
    }
	
	@Override public void enterFinalgoritmo(PSeIntParser.FinalgoritmoContext ctx)
	{
		mostraryEscribir("/finalgoritmo:" + ctx.FINALGORITMO().getText());
		linea += "/finalgoritmo";
	}
	
	@Override public void exitFinalgoritmo(PSeIntParser.FinalgoritmoContext ctx)
	{
		actualizarLinea("/finalgoritmo");
	}
	
	@Override public void enterAlgoritmo(PSeIntParser.AlgoritmoContext ctx)
	{
		mostraryEscribir("/algoritmo:" + ctx.ALGORITMO().getText());
		linea += "/algoritmo";
	}
	
	@Override public void exitAlgoritmo(PSeIntParser.AlgoritmoContext ctx)
	{
		actualizarLinea("/algoritmo");
	}
	
	@Override public void enterIdentificador(PSeIntParser.IdentificadorContext ctx)
	{
		mostraryEscribir("/identificador:" + ctx.IDENTIFICADOR().getText());
		linea += "/identificador";
	}
	
	@Override public void exitIdentificador(PSeIntParser.IdentificadorContext ctx)
	{
		actualizarLinea("/identificador");
	}
	
	@Override public void enterInstruccion(PSeIntParser.InstruccionContext ctx)
	{
		mostraryEscribir("/instruccion");
		linea += "/instruccion";
	}
	
	@Override public void exitInstruccion(PSeIntParser.InstruccionContext ctx)
	{
		actualizarLinea("/instruccion");
	}
	
	@Override public void enterPrimitiva(PSeIntParser.PrimitivaContext ctx)
	{
		mostraryEscribir("/primitiva");
		linea += "/primitiva";
	}
	
	@Override public void exitPrimitiva(PSeIntParser.PrimitivaContext ctx)
	{
		actualizarLinea("/primitiva");
	}
	
	@Override public void enterDefinir_var(PSeIntParser.Definir_varContext ctx)
	{
		mostraryEscribir("/definir_var");
		linea += "/definir_var";
	}
	
	@Override public void exitDefinir_var(PSeIntParser.Definir_varContext ctx)
	{
		actualizarLinea("/definir_var");
	}
	
	@Override public void enterDefinir(PSeIntParser.DefinirContext ctx)
	{
		mostraryEscribir("/definir:" + ctx.DEFINIR().getText());
		linea += "/definir";
	}
	
	@Override public void exitDefinir(PSeIntParser.DefinirContext ctx)
	{
		actualizarLinea("/definir");
	}
	
	@Override public void enterVariable(PSeIntParser.VariableContext ctx)
	{
		mostraryEscribir("/variable");
		linea += "/variable";
	}
	
	@Override public void exitVariable(PSeIntParser.VariableContext ctx)
	{
		actualizarLinea("/variable");
	}
	
	@Override public void enterComo(PSeIntParser.ComoContext ctx)
	{ 
		mostraryEscribir("/como:" + ctx.COMO().getText());
		linea += "/como";
	}
	
	@Override public void exitComo(PSeIntParser.ComoContext ctx)
	{
		actualizarLinea("/como");
	}
	
	@Override public void enterCaracter(PSeIntParser.CaracterContext ctx)
	{
		mostraryEscribir("/caracter:" + ctx.CARACTER().getText());
		linea += "/caracter";
	}
	
	@Override public void exitCaracter(PSeIntParser.CaracterContext ctx)
	{
		actualizarLinea("/caracter");
	}
	
	@Override public void enterEntero(PSeIntParser.EnteroContext ctx)
	{
		mostraryEscribir("/entero:" + ctx.ENTERO().getText());
		linea += "/entero";
	}
	
	@Override public void exitEntero(PSeIntParser.EnteroContext ctx)
	{
		actualizarLinea("/entero");
	}
	
	@Override public void enterLogico(PSeIntParser.LogicoContext ctx)
	{
		mostraryEscribir("/logico:" + ctx.LOGICO().getText());
		linea += "/logico";
	}
	
	@Override public void exitLogico(PSeIntParser.LogicoContext ctx)
	{
		actualizarLinea("/logico");
	}
	
	@Override public void enterReal(PSeIntParser.RealContext ctx)
	{
		mostraryEscribir("/real:" + ctx.REAL().getText());
		linea += "/real";
	}

	@Override public void exitReal(PSeIntParser.RealContext ctx)
	{
		actualizarLinea("/real");
	}
	
	@Override public void enterNumero(PSeIntParser.NumeroContext ctx)
	{
		String entero = "";
        String flotante = "";
		
        try
        {
            entero = ctx.INT().getText();
        }
        catch (Exception e)
        {

        }
		
        try
        {
            flotante = ctx.FLOAT().getText();
        }
        catch (Exception e)
        {
        }
		
		mostraryEscribir("/numero:" + entero + flotante);
		linea += "/numero";
	}
	
	@Override public void exitNumero(PSeIntParser.NumeroContext ctx)
	{
		try
        {
            String texto = "";
            if (linea != "")
            {
                linea = linea.substring(0, linea.lastIndexOf("/numero"));
            }
        }
        catch (Exception e)
        {
        };
	}
	
	@Override public void enterEscritura(PSeIntParser.EscrituraContext ctx)
	{
		mostraryEscribir("/escritura");
		linea += "/escritura";
	}
	
	@Override public void exitEscritura(PSeIntParser.EscrituraContext ctx)
	{
		actualizarLinea("/escritura");
	}
	
	@Override public void enterEscribir(PSeIntParser.EscribirContext ctx)
	{
		mostraryEscribir("/escribir:" + ctx.ESCRIBIR().getText());
		linea += "/escribir";
	}
	
	@Override public void exitEscribir(PSeIntParser.EscribirContext ctx)
	{
		actualizarLinea("/escribir");
	}
	
	@Override public void enterOtras(PSeIntParser.OtrasContext ctx)
	{
		mostraryEscribir("/otra");
		linea += "/otra";
	}
	
	@Override public void exitOtras(PSeIntParser.OtrasContext ctx)
	{
		actualizarLinea("/otra");
	}
	
	@Override public void enterBorrando(PSeIntParser.BorrandoContext ctx)
	{
		mostraryEscribir("/borrando");
		linea += "/borrando";
	}
	
	@Override public void exitBorrando(PSeIntParser.BorrandoContext ctx)
	{
		actualizarLinea("/borrando");
	}
	
	@Override public void enterBorrar(PSeIntParser.BorrarContext ctx)
	{
		mostraryEscribir("/borrar:" + ctx.BORRAR().getText());
		linea += "/borrar";
	}

	@Override public void exitBorrar(PSeIntParser.BorrarContext ctx)
	{
		actualizarLinea("/borrar");
	}
	
	@Override public void enterEsperartecla(PSeIntParser.EsperarteclaContext ctx)
	{
		mostraryEscribir("/esperartecla:" + ctx.ESPERARTECLA().getText());
		linea += "/esperartecla";
	}
	
	@Override public void exitEsperartecla(PSeIntParser.EsperarteclaContext ctx)
	{
		actualizarLinea("/esperartecla");
	}
	
	@Override public void enterEsperar(PSeIntParser.EsperarContext ctx)
	{
		mostraryEscribir("/esperar:" + ctx.ESPERAR().getText());
		linea += "/esperar";
	}
	
	@Override public void exitEsperar(PSeIntParser.EsperarContext ctx)
	{
		actualizarLinea("/esperar");
	}
	
	@Override public void enterSegundos(PSeIntParser.SegundosContext ctx)
	{
		mostraryEscribir("/segundos:" + ctx.SEGUNDOS().getText());
		linea += "/segundos";
	}
	
	@Override public void exitSegundos(PSeIntParser.SegundosContext ctx)
	{
		actualizarLinea("/segundos");
	}
	
	@Override public void enterMilisegundos(PSeIntParser.MilisegundosContext ctx)
	{
		mostraryEscribir("/milisegundos:" + ctx.MILISEGUNDOS().getText());
		linea += "/milisegundos";
	}
	
	@Override public void exitMilisegundos(PSeIntParser.MilisegundosContext ctx)
	{
		actualizarLinea("/milisegundos");
	}
	
	@Override public void enterSinsaltar(PSeIntParser.SinsaltarContext ctx)
	{
		mostraryEscribir("/sinsaltar:" + ctx.SINSALTAR().getText());
		linea += "/sinsaltar";
	}
	
	@Override public void exitSinsaltar(PSeIntParser.SinsaltarContext ctx)
	{
		actualizarLinea("/sinsaltar");
	}
	
	@Override public void enterEsperar_tecla(PSeIntParser.Esperar_teclaContext ctx)
	{
		mostraryEscribir("/esperar_tecla");
		linea += "/esperar_tecla";
	}
	
	@Override public void exitEsperar_tecla(PSeIntParser.Esperar_teclaContext ctx)
	{ 
		actualizarLinea("/esperar_tecla");
	}
	
	@Override public void enterEsperar_tiempo(PSeIntParser.Esperar_tiempoContext ctx)
	{
		mostraryEscribir("/esperar_tiempo");
		linea += "/esperar_tiempo";
	}
	
	@Override public void exitEsperar_tiempo(PSeIntParser.Esperar_tiempoContext ctx)
	{
		actualizarLinea("/esperar_tiempo");
	}
	
	@Override public void enterExpr(PSeIntParser.ExprContext ctx)
	{
		mostraryEscribir("/expr");
		linea += "/expr";
	}

	@Override public void exitExpr(PSeIntParser.ExprContext ctx)
	{
		actualizarLinea("/expr");
	}
	
	@Override public void enterExp(PSeIntParser.ExpContext ctx)
	{
		mostraryEscribir("/exp");
		linea += "/exp";
	}
	
	@Override public void exitExp(PSeIntParser.ExpContext ctx)
	{
		actualizarLinea("/exp");
	}
	
	@Override public void enterValor(PSeIntParser.ValorContext ctx)
	{
		mostraryEscribir("/valor");
		linea += "/valor";
	}
	
	@Override public void exitValor(PSeIntParser.ValorContext ctx)
	{
		actualizarLinea("/valor");
	}
	
	@Override public void enterLogica(PSeIntParser.LogicaContext ctx)
	{
		mostraryEscribir("/logica");
		linea += "/logica";
	}

	@Override public void exitLogica(PSeIntParser.LogicaContext ctx)
	{
		actualizarLinea("/logica");
	}
	
	@Override public void enterVerdadero(PSeIntParser.VerdaderoContext ctx)
	{
		mostraryEscribir("/verdadero:" + ctx.VERDADERO().getText());
		linea += "/verdadero";
	}
	
	@Override public void exitVerdadero(PSeIntParser.VerdaderoContext ctx)
	{
		actualizarLinea("/verdadero");
	}
	
	@Override public void enterFalso(PSeIntParser.FalsoContext ctx)
	{
		mostraryEscribir("/falso:" + ctx.FALSO().getText());
		linea += "/falso";
	}

	@Override public void exitFalso(PSeIntParser.FalsoContext ctx)
	{
		actualizarLinea("/falso");
	}
	
	@Override public void enterLlamar_funcion(PSeIntParser.Llamar_funcionContext ctx)
	{
		mostraryEscribir("/llamar_funcion");
		linea += "/llamar_funcion";	
	}
	
	@Override public void exitLlamar_funcion(PSeIntParser.Llamar_funcionContext ctx)
	{
		actualizarLinea("/llamar_funcion");
	}
	
	@Override public void enterParentesis_abrir(PSeIntParser.Parentesis_abrirContext ctx)
	{
		mostraryEscribir("/parentesis_abrir:" + ctx.PARENTESIS_ABRIR().getText());
		linea += "/parentesis_abrir";
	}
	
	@Override public void exitParentesis_abrir(PSeIntParser.Parentesis_abrirContext ctx)
	{
		actualizarLinea("/parentesis_abrir");
	}
	
	@Override public void enterParentesis_cerrar(PSeIntParser.Parentesis_cerrarContext ctx)
	{
		mostraryEscribir("/parentesis_cerrar:" + ctx.PARENTESIS_CERRAR().getText());
		linea += "/parentesis_cerrar";
	}
	
	@Override public void exitParentesis_cerrar(PSeIntParser.Parentesis_cerrarContext ctx)
	{
		actualizarLinea("/parentesis_cerrar");
	}
	
	@Override public void enterCorchete_abrir(PSeIntParser.Corchete_abrirContext ctx)
	{
		mostraryEscribir("/corchete_abrir:" + ctx.CORCHETE_ABRIR().getText());
		linea += "/corchete_abrir";
	}
	
	@Override public void exitCorchete_abrir(PSeIntParser.Corchete_abrirContext ctx)
	{
		actualizarLinea("/corchete_abrir");
	}
	
	@Override public void enterCorchete_cerrar(PSeIntParser.Corchete_cerrarContext ctx)
	{
		mostraryEscribir("/corchete_cerrar:" + ctx.CORCHETE_CERRAR().getText());
		linea += "/corchete_cerrar";
	}
	
	@Override public void exitCorchete_cerrar(PSeIntParser.Corchete_cerrarContext ctx)
	{
		actualizarLinea("/corchete_cerrar");
	}
	
	@Override public void enterString(PSeIntParser.StringContext ctx)
	{
		mostraryEscribir("/string:" + ctx.STRING().getText());
		linea += "/string";
	}
	
	@Override public void exitString(PSeIntParser.StringContext ctx)
	{
		actualizarLinea("/string");
	}
	
	@Override public void enterPuntocoma(PSeIntParser.PuntocomaContext ctx)
	{
		mostraryEscribir("/puntocoma:" + ctx.PUNTOCOMA().getText());
		linea += "/puntocoma";
	}
	
	@Override public void exitPuntocoma(PSeIntParser.PuntocomaContext ctx)
	{
		actualizarLinea("/puntocoma");
	}
	
	@Override public void enterComa(PSeIntParser.ComaContext ctx)
	{
		mostraryEscribir("/coma:" + ctx.COMA().getText());
		linea += "/coma";
	}
	
	@Override public void exitComa(PSeIntParser.ComaContext ctx)
	{
		actualizarLinea("/coma");
	}
	
	@Override public void enterSaltolinea(PSeIntParser.SaltolineaContext ctx)
	{
	}
	
	@Override public void exitSaltolinea(PSeIntParser.SaltolineaContext ctx)
	{
	}
	
	@Override public void enterAsignacion(PSeIntParser.AsignacionContext ctx)
	{
		mostraryEscribir("/asignacion");
		linea += "/asignacion";
	}
	
	@Override public void exitAsignacion(PSeIntParser.AsignacionContext ctx)
	{
		actualizarLinea("/asignacion");
	}
	
	@Override public void enterAsignar(PSeIntParser.AsignarContext ctx)
	{
		mostraryEscribir("/asignar:" + ctx.ASIGNAR().getText());
		linea += "/asignar";
	}
	
	@Override public void exitAsignar(PSeIntParser.AsignarContext ctx)
	{
		actualizarLinea("/asignar");
	}
	
	@Override public void enterLectura(PSeIntParser.LecturaContext ctx)
	{
		mostraryEscribir("/lectura");
		linea += "/lectura";
	}
		
	@Override public void exitLectura(PSeIntParser.LecturaContext ctx)
	{
		actualizarLinea("/lectura");
	}
	
	@Override public void enterLeer(PSeIntParser.LeerContext ctx)
	{
		mostraryEscribir("/leer:" + ctx.LEER().getText());
		linea += "/leer";
	}
	
	@Override public void exitLeer(PSeIntParser.LeerContext ctx)
	{
		actualizarLinea("/leer");
	}
	
	@Override public void enterSuma(PSeIntParser.SumaContext ctx)
	{
		mostraryEscribir("/suma:" + ctx.SUMA().getText());
		linea += "/suma";
	}
	
	@Override public void exitSuma(PSeIntParser.SumaContext ctx)
	{
		actualizarLinea("/suma");
	}
	
	@Override public void enterResta(PSeIntParser.RestaContext ctx)
	{
		mostraryEscribir("/resta:" + ctx.RESTA().getText());
		linea += "/resta";
	}
	
	@Override public void exitResta(PSeIntParser.RestaContext ctx)
	{
		actualizarLinea("/resta");
	}
	
	@Override public void enterMultiplicacion(PSeIntParser.MultiplicacionContext ctx) 
	{ 
		mostraryEscribir("/multiplicacion:" + ctx.MULTIPLICACION().getText());
		linea += "/multiplicacion";
	}
	
	@Override public void exitMultiplicacion(PSeIntParser.MultiplicacionContext ctx)
	{
		actualizarLinea("/multiplicacion");
	}
	
	@Override public void enterDivision(PSeIntParser.DivisionContext ctx)
	{
		mostraryEscribir("/division:" + ctx.DIVISION().getText());
		linea += "/division";
	}
	
	@Override public void exitDivision(PSeIntParser.DivisionContext ctx)
	{
		actualizarLinea("/division");
	}
	
	@Override public void enterPotenciacion(PSeIntParser.PotenciacionContext ctx)
	{
		mostraryEscribir("/potenciacion:" + ctx.POTENCIACION().getText());
		linea += "/potenciacion";
	}
	
	@Override public void exitPotenciacion(PSeIntParser.PotenciacionContext ctx)
	{
		actualizarLinea("/potenciacion");
	}
	
	@Override public void enterModulo(PSeIntParser.ModuloContext ctx)
	{
		mostraryEscribir("/modulo:" + ctx.MODULO().getText());
		linea += "/modulo";
	}
	
	@Override public void exitModulo(PSeIntParser.ModuloContext ctx)
	{
		actualizarLinea("/modulo");
	}
	
	@Override public void enterControl(PSeIntParser.ControlContext ctx)
	{
		mostraryEscribir("/control");
		linea += "/control";
	}
	
	@Override public void exitControl(PSeIntParser.ControlContext ctx)
	{
		actualizarLinea("/control");
	}
	
	@Override public void enterCondicional(PSeIntParser.CondicionalContext ctx)
	{
		mostraryEscribir("/condicional");
		linea += "/condicional";
	}
	
	@Override public void exitCondicional(PSeIntParser.CondicionalContext ctx)
	{
		actualizarLinea("/condicional");
	}
	
	@Override public void enterSi_op(PSeIntParser.Si_opContext ctx)
	{
		mostraryEscribir("/si_op");
		linea += "/si_op";
	}
	
	@Override public void exitSi_op(PSeIntParser.Si_opContext ctx)
	{
		actualizarLinea("/si_op");
	}
	
	@Override public void enterSi(PSeIntParser.SiContext ctx)
	{
		mostraryEscribir("/si:" + ctx.SI().getText());
		linea += "/si";
	}
	
	@Override public void exitSi(PSeIntParser.SiContext ctx)
	{
		actualizarLinea("/si");
	}
	
	@Override public void enterCondicion(PSeIntParser.CondicionContext ctx)
	{
		mostraryEscribir("/condicion");
		linea += "/condicion";
	}
	
	@Override public void exitCondicion(PSeIntParser.CondicionContext ctx)
	{
		actualizarLinea("/condicion");
	}
	
	@Override public void enterEntonces(PSeIntParser.EntoncesContext ctx)
	{
		mostraryEscribir("/entonces:" + ctx.ENTONCES().getText());
		linea += "/entonces";
	}
	
	@Override public void exitEntonces(PSeIntParser.EntoncesContext ctx)
	{
		actualizarLinea("/entonces");
	}
	
	@Override public void enterExpr_relacional(PSeIntParser.Expr_relacionalContext ctx)
	{
		mostraryEscribir("/expr_relacional");
		linea += "/expr_relacional";
	}
	
	@Override public void exitExpr_relacional(PSeIntParser.Expr_relacionalContext ctx)
	{
		actualizarLinea("/expr_relacional");
	}
	
	@Override public void enterExpr_logico(PSeIntParser.Expr_logicoContext ctx)
	{
		mostraryEscribir("/expr_logico");
		linea += "/expr_logico";
	}
	
	@Override public void exitExpr_logico(PSeIntParser.Expr_logicoContext ctx)
	{
		actualizarLinea("/expr_logico");
	}
		
	@Override public void enterMayor(PSeIntParser.MayorContext ctx)
	{
		mostraryEscribir("/mayor:" + ctx.MAYOR().getText());
		linea += "/mayor";
	}
	
	@Override public void exitMayor(PSeIntParser.MayorContext ctx)
	{
		actualizarLinea("/mayor");
	}
	
	@Override public void enterMenor(PSeIntParser.MenorContext ctx)
	{
		mostraryEscribir("/menor:" + ctx.MENOR().getText());
		linea += "/menor";
	}
	
	@Override public void exitMenor(PSeIntParser.MenorContext ctx)
	{
		actualizarLinea("/menor");
	}
	
	@Override public void enterIgual(PSeIntParser.IgualContext ctx)
	{
		mostraryEscribir("/igual:" + ctx.IGUAL().getText());
		linea += "/igual";
	}
	
	@Override public void exitIgual(PSeIntParser.IgualContext ctx)
	{
		actualizarLinea("/igual");
	}
	
	@Override public void enterMenorigual(PSeIntParser.MenorigualContext ctx)
	{
		mostraryEscribir("/menorigual:" + ctx.MENORIGUAL().getText());
		linea += "/menorigual";
	}
	
	@Override public void exitMenorigual(PSeIntParser.MenorigualContext ctx)
	{
		actualizarLinea("/menorigual");
	}
	
	@Override public void enterMayorigual(PSeIntParser.MayorigualContext ctx)
	{
		mostraryEscribir("/mayorigual:" + ctx.MAYORIGUAL().getText());
		linea += "/mayorigual";
	}
	
	@Override public void exitMayorigual(PSeIntParser.MayorigualContext ctx)
	{
		actualizarLinea("/mayorigual");
	}
	
	@Override public void enterDistinto(PSeIntParser.DistintoContext ctx)
	{
		mostraryEscribir("/distinto:" + ctx.DISTINTO().getText());
		linea += "/distinto";
	}
	
	@Override public void exitDistinto(PSeIntParser.DistintoContext ctx)
	{
		actualizarLinea("/distinto");
	}
	
	@Override public void enterConjuncion(PSeIntParser.ConjuncionContext ctx)
	{
		mostraryEscribir("/conjuncion:" + ctx.CONJUNCION().getText());
		linea += "/conjuncion";
	}
	
	@Override public void exitConjuncion(PSeIntParser.ConjuncionContext ctx) 
	{
		actualizarLinea("/conjuncion");
	}
	
	@Override public void enterDisyuncion(PSeIntParser.DisyuncionContext ctx)
	{
		mostraryEscribir("/disyuncion:" + ctx.DISYUNCION().getText());
		linea += "/disyuncion";
	}
	
	@Override public void exitDisyuncion(PSeIntParser.DisyuncionContext ctx)
	{
		actualizarLinea("/disyuncion");
	}
	
	@Override public void enterNegacion(PSeIntParser.NegacionContext ctx)
	{
		mostraryEscribir("/negacion:" + ctx.NEGACION().getText());
		linea += "/negacion";
	}
	
	@Override public void exitNegacion(PSeIntParser.NegacionContext ctx)
	{
		actualizarLinea("/negacion");
	}
	
	@Override public void enterSino(PSeIntParser.SinoContext ctx)
	{
		mostraryEscribir("/sino:" + ctx.SINO().getText());
		linea += "/sino";
	}
	
	@Override public void exitSino(PSeIntParser.SinoContext ctx)
	{
		actualizarLinea("/sino");
	}
	
	@Override public void enterFinsi(PSeIntParser.FinsiContext ctx)
	{
		mostraryEscribir("/finsi:" + ctx.FINSI().getText());
		linea += "/finsi";
	}
	
	@Override public void exitFinsi(PSeIntParser.FinsiContext ctx)
	{
		actualizarLinea("/finsi");
	}
	
	@Override public void enterRepetitiva(PSeIntParser.RepetitivaContext ctx)
	{
		mostraryEscribir("/repetitiva");
		linea += "/repetitiva";
	}
	
	@Override public void exitRepetitiva(PSeIntParser.RepetitivaContext ctx)
	{
		actualizarLinea("/repetitiva");
	}
	
	@Override public void enterPara_op(PSeIntParser.Para_opContext ctx)
	{
		mostraryEscribir("/para_op");
		linea += "/para_op";
	}

	@Override public void exitPara_op(PSeIntParser.Para_opContext ctx)
	{
		actualizarLinea("/para_op");
	}
	
	@Override public void enterPara(PSeIntParser.ParaContext ctx)
	{
		mostraryEscribir("/para:" + ctx.PARA().getText());
		linea += "/para";
	}
	
	@Override public void exitPara(PSeIntParser.ParaContext ctx)
	{
		actualizarLinea("/para");
	}
	
	@Override public void enterParacada(PSeIntParser.ParacadaContext ctx)
	{
		mostraryEscribir("/paracada:" + ctx.PARACADA().getText());
		linea += "/paracada";
	}
	
	@Override public void exitParacada(PSeIntParser.ParacadaContext ctx)
	{
		actualizarLinea("/paracada");
	}
	
	@Override public void enterDe(PSeIntParser.DeContext ctx)
	{
		mostraryEscribir("/de:" + ctx.DE().getText());
		linea += "/de";
	}
	
	@Override public void exitDe(PSeIntParser.DeContext ctx)
	{
		actualizarLinea("/de");
	}
	
	@Override public void enterDesde(PSeIntParser.DesdeContext ctx)
	{
		mostraryEscribir("/desde:" + ctx.DESDE().getText());
		linea += "/desde";
	}
	
	@Override public void exitDesde(PSeIntParser.DesdeContext ctx)
	{
		actualizarLinea("/desde");
	}
	
	@Override public void enterFinpara(PSeIntParser.FinparaContext ctx)
	{
		mostraryEscribir("/finpara:" + ctx.FINPARA().getText());
		linea += "/finpara";
	}
	
	@Override public void exitFinpara(PSeIntParser.FinparaContext ctx)
	{
		actualizarLinea("/finpara");
	}
	
	@Override public void enterHasta(PSeIntParser.HastaContext ctx)
	{
		mostraryEscribir("/hasta:" + ctx.HASTA().getText());
		linea += "/hasta";
	}
	
	@Override public void exitHasta(PSeIntParser.HastaContext ctx)
	{
		actualizarLinea("/hasta");
	}
	
	@Override public void enterConpaso(PSeIntParser.ConpasoContext ctx)
	{
		mostraryEscribir("/conpaso:" + ctx.CONPASO().getText());
		linea += "/conpaso";
	}

	@Override public void exitConpaso(PSeIntParser.ConpasoContext ctx)
	{
		actualizarLinea("/conpaso");
	}
	
	@Override public void enterHacer(PSeIntParser.HacerContext ctx)
	{
		mostraryEscribir("/hacer:" + ctx.HACER().getText());
		linea += "/hacer";
	}
	
	@Override public void exitHacer(PSeIntParser.HacerContext ctx)
	{
		actualizarLinea("/hacer");
	}
	
	@Override public void enterMientras_op(PSeIntParser.Mientras_opContext ctx)
	{
		mostraryEscribir("/mientras_op");
		linea += "/mientras_op";
	}
	
	@Override public void exitMientras_op(PSeIntParser.Mientras_opContext ctx)
	{
		actualizarLinea("/mientras_op");
	}
	
	@Override public void enterMientras(PSeIntParser.MientrasContext ctx)
	{
		mostraryEscribir("/mientras:" + ctx.MIENTRAS().getText());
		linea += "/mientras";		
	}
	
	@Override public void exitMientras(PSeIntParser.MientrasContext ctx)
	{
		actualizarLinea("/mientras");
	}
	
	@Override public void enterFinmientras(PSeIntParser.FinmientrasContext ctx)
	{
		mostraryEscribir("/finmientras:" + ctx.FINMIENTRAS().getText());
		linea += "/finmientras";		
	}
	
	@Override public void exitFinmientras(PSeIntParser.FinmientrasContext ctx)
	{
		actualizarLinea("/finmientras");
	}
	
	@Override public void enterRepetir_op(PSeIntParser.Repetir_opContext ctx)
	{
		mostraryEscribir("/repetir_op");
		linea += "/repetir_op";
	}
	
	@Override public void exitRepetir_op(PSeIntParser.Repetir_opContext ctx)
	{
		actualizarLinea("/repetir_op");
	}
	
	@Override public void enterRepetir(PSeIntParser.RepetirContext ctx)
	{
		mostraryEscribir("/repetir:" + ctx.REPETIR().getText());
		linea += "/repetir";		
	}
	
	@Override public void exitRepetir(PSeIntParser.RepetirContext ctx)
	{
		actualizarLinea("/repetir");
	}
	
	@Override public void enterHastaque(PSeIntParser.HastaqueContext ctx)
	{ 
		mostraryEscribir("/hastaque:" + ctx.HASTAQUE().getText());
		linea += "/hastaque";		
	}
	
	@Override public void exitHastaque(PSeIntParser.HastaqueContext ctx)
	{
		actualizarLinea("/hastaque");
	}
	
	@Override public void enterSegun_op(PSeIntParser.Segun_opContext ctx)
	{
		mostraryEscribir("/segun_op");
		linea += "/segun_op";		
	}
	
	@Override public void exitSegun_op(PSeIntParser.Segun_opContext ctx)
	{
		actualizarLinea("/segun_op");
	}
	
	@Override public void enterSegun(PSeIntParser.SegunContext ctx)
	{
		mostraryEscribir("/segun:" + ctx.SEGUN().getText());
		linea += "/segun";		
	}
	
	@Override public void exitSegun(PSeIntParser.SegunContext ctx)
	{
		actualizarLinea("/segun");
	}
	
	@Override public void enterDospuntos(PSeIntParser.DospuntosContext ctx)
	{ 
		mostraryEscribir("/dospuntos:" + ctx.DOSPUNTOS().getText());
		linea += "/dospuntos";		
	}
	
	@Override public void exitDospuntos(PSeIntParser.DospuntosContext ctx)
	{
		actualizarLinea("/dospuntos");
	}
	
	@Override public void enterDeotromodo(PSeIntParser.DeotromodoContext ctx)
	{
		mostraryEscribir("/deotromodo:" + ctx.DEOTROMODO().getText());
		linea += "/deotromodo";		
	}
	
	@Override public void exitDeotromodo(PSeIntParser.DeotromodoContext ctx)
	{
		actualizarLinea("/deotromodo");
	}
	
	@Override public void enterFinsegun(PSeIntParser.FinsegunContext ctx)
	{
		mostraryEscribir("/finsegun:" + ctx.FINSEGUN().getText());
		linea += "/finsegun";		
	}
	
	@Override public void exitFinsegun(PSeIntParser.FinsegunContext ctx)
	{
		actualizarLinea("/finsegun");
	}
	
	@Override public void enterDefinir_func(PSeIntParser.Definir_funcContext ctx)
	{
		mostraryEscribir("/definir_func");
		linea += "/definir_func";		
	}
	
	@Override public void exitDefinir_func(PSeIntParser.Definir_funcContext ctx)
	{
		actualizarLinea("/definir_func");
	}
	
	@Override public void enterFuncion(PSeIntParser.FuncionContext ctx)
	{
		mostraryEscribir("/funcion:" + ctx.FUNCION().getText());
		linea += "/funcion";		
	}
	
	@Override public void exitFuncion(PSeIntParser.FuncionContext ctx)
	{
		actualizarLinea("/funcion");
	}
	
	@Override public void enterArgumentos(PSeIntParser.ArgumentosContext ctx)
	{
		mostraryEscribir("/argumentos");
		linea += "/argumentos";		
	}
	
	@Override public void exitArgumentos(PSeIntParser.ArgumentosContext ctx)
	{
		actualizarLinea("/argumentos");
	}
	
	@Override public void enterPorvalor(PSeIntParser.PorvalorContext ctx)
	{
		mostraryEscribir("/porvalor:" + ctx.PORVALOR().getText());
		linea += "/porvalor";		
	}
	
	@Override public void exitPorvalor(PSeIntParser.PorvalorContext ctx)
	{
		actualizarLinea("/porvalor");
	}
	
	@Override public void enterPorreferencia(PSeIntParser.PorreferenciaContext ctx)
	{
		mostraryEscribir("/porreferencia:" + ctx.PORREFERENCIA().getText());
		linea += "/porreferencia";		
	}
	
	@Override public void exitPorreferencia(PSeIntParser.PorreferenciaContext ctx)
	{
		actualizarLinea("/porreferencia");
	}
	
	@Override public void enterFunciones(PSeIntParser.FuncionesContext ctx)
	{
		mostraryEscribir("/funciones");
		linea += "/funciones";		
	}
	
	@Override public void exitFunciones(PSeIntParser.FuncionesContext ctx)
	{
		actualizarLinea("/funciones");
	}
	
	@Override public void enterPi(PSeIntParser.PiContext ctx)
	{
		mostraryEscribir("/pi:" + ctx.PI().getText());
		linea += "/pi";	
	}

	@Override public void exitPi(PSeIntParser.PiContext ctx) 
	{
		actualizarLinea("/pi");
	}

	@Override public void enterRaiz(PSeIntParser.RaizContext ctx)
	{
		mostraryEscribir("/raiz:" + ctx.RAIZ().getText());
		linea += "/raiz";	
	}

	@Override public void exitRaiz(PSeIntParser.RaizContext ctx)
	{
		actualizarLinea("/raiz");
	}

	@Override public void enterAbs(PSeIntParser.AbsContext ctx)
	{
		mostraryEscribir("/abs:" + ctx.ABS().getText());
		linea += "/abs";	
	}

	@Override public void exitAbs(PSeIntParser.AbsContext ctx)
	{
		actualizarLinea("/abs");
	}
	
	@Override public void enterLn(PSeIntParser.LnContext ctx)
	{
		mostraryEscribir("/ln:" + ctx.LN().getText());
		linea += "/ln";	
	}
	
	@Override public void exitLn(PSeIntParser.LnContext ctx)
	{
		actualizarLinea("/ln");
	}
	
	@Override public void enterExpf(PSeIntParser.ExpfContext ctx)
	{
		mostraryEscribir("/expf:" + ctx.EXP().getText());
		linea += "/expf";	
	}
	
	@Override public void exitExpf(PSeIntParser.ExpfContext ctx)
	{
		actualizarLinea("/expf");
	}
	
	@Override public void enterSen(PSeIntParser.SenContext ctx)
	{
		mostraryEscribir("/sen:" + ctx.SEN().getText());
		linea += "/sen";	
	}
	
	@Override public void exitSen(PSeIntParser.SenContext ctx)
	{
		actualizarLinea("/sen");
	}
	
	@Override public void enterCos(PSeIntParser.CosContext ctx)
	{
		mostraryEscribir("/cos:" + ctx.COS().getText());
		linea += "/cos";	
	}
	
	@Override public void exitCos(PSeIntParser.CosContext ctx)
	{
		actualizarLinea("/cos");
	}
	
	@Override public void enterTan(PSeIntParser.TanContext ctx)
	{
		mostraryEscribir("/tan:" + ctx.TAN().getText());
		linea += "/tan";	
	}

	@Override public void exitTan(PSeIntParser.TanContext ctx)
	{
		actualizarLinea("/tan");
	}
	
	@Override public void enterAsen(PSeIntParser.AsenContext ctx)
	{
		mostraryEscribir("/asen:" + ctx.ASEN().getText());
		linea += "/asen";	
	}
	
	@Override public void exitAsen(PSeIntParser.AsenContext ctx)
	{
		actualizarLinea("/asen");
	}
	
	@Override public void enterAcos(PSeIntParser.AcosContext ctx)
	{
		mostraryEscribir("/acos:" + ctx.ACOS().getText());
		linea += "/acos";	
	}
	
	@Override public void exitAcos(PSeIntParser.AcosContext ctx)
	{
		actualizarLinea("/acos");
	}
	
	@Override public void enterAtan(PSeIntParser.AtanContext ctx)
	{
		mostraryEscribir("/atan:" + ctx.ATAN().getText());
		linea += "/atan";	
	}
	
	@Override public void exitAtan(PSeIntParser.AtanContext ctx)
	{
		actualizarLinea("/atan");
	}
	
	@Override public void enterTrunc(PSeIntParser.TruncContext ctx)
	{
		mostraryEscribir("/trunc:" + ctx.TRUNC().getText());
		linea += "/trunc";	
	}
	
	@Override public void exitTrunc(PSeIntParser.TruncContext ctx)
	{
		actualizarLinea("/trunc");
	}
	
	@Override public void enterRedon(PSeIntParser.RedonContext ctx)
	{
		mostraryEscribir("/redon:" + ctx.REDON().getText());
		linea += "/redon";	
	}

	@Override public void exitRedon(PSeIntParser.RedonContext ctx)
	{
		actualizarLinea("/redon");
	}
	
	@Override public void enterAzar(PSeIntParser.AzarContext ctx)
	{
		mostraryEscribir("/azar:" + ctx.AZAR().getText());
		linea += "/azar";	
	}
	
	@Override public void exitAzar(PSeIntParser.AzarContext ctx)
	{
		actualizarLinea("/azar");
	}
	
	@Override public void enterAleatorio(PSeIntParser.AleatorioContext ctx)
	{
		mostraryEscribir("/aleatorio:" + ctx.ALEATORIO().getText());
		linea += "/aleatorio";	
	}
	
	@Override public void exitAleatorio(PSeIntParser.AleatorioContext ctx)
	{
		actualizarLinea("/aleatorio");
	}
	
	@Override public void enterLongitud(PSeIntParser.LongitudContext ctx)
	{
		mostraryEscribir("/longitud:" + ctx.LONGITUD().getText());
		linea += "/longitud";	
	}
	
	@Override public void exitLongitud(PSeIntParser.LongitudContext ctx)
	{
		actualizarLinea("/longitud");
	}
	
	@Override public void enterMayusculas(PSeIntParser.MayusculasContext ctx)
	{
		mostraryEscribir("/mayusculas:" + ctx.MAYUSCULAS().getText());
		linea += "/mayusculas";	
	}
	
	@Override public void exitMayusculas(PSeIntParser.MayusculasContext ctx)
	{
		actualizarLinea("/mayusculas");
	}
	
	@Override public void enterMinusculas(PSeIntParser.MinusculasContext ctx)
	{
		mostraryEscribir("/minusculas:" + ctx.MINUSCULAS().getText());
		linea += "/minusculas";	
	}
	
	@Override public void exitMinusculas(PSeIntParser.MinusculasContext ctx)
	{
		actualizarLinea("/minusculas");
	}
	
	@Override public void enterSubcadena(PSeIntParser.SubcadenaContext ctx)
	{
		mostraryEscribir("/subcadena:" + ctx.SUBCADENA().getText());
		linea += "/subcadena";	
	}
	
	@Override public void exitSubcadena(PSeIntParser.SubcadenaContext ctx)
	{
		actualizarLinea("/subcadena");
	}
	
	@Override public void enterConcatenar(PSeIntParser.ConcatenarContext ctx) 
	{
		mostraryEscribir("/concatenar:" + ctx.CONCATENAR().getText());
		linea += "/concatenar";	
	}
	
	@Override public void exitConcatenar(PSeIntParser.ConcatenarContext ctx)
	{
		actualizarLinea("/concatenar");
	}
	
	@Override public void enterConvertiranumero(PSeIntParser.ConvertiranumeroContext ctx)
	{
		mostraryEscribir("/convertiranumero:" + ctx.CONVERTIRANUMERO().getText());
		linea += "/convertiranumero";	
	}
	
	@Override public void exitConvertiranumero(PSeIntParser.ConvertiranumeroContext ctx)
	{
		actualizarLinea("/convertiranumero");
	}
	
	@Override public void enterConvertiratexto(PSeIntParser.ConvertiratextoContext ctx)
	{
		mostraryEscribir("/convertiratexto:" + ctx.CONVERTIRATEXTO().getText());
		linea += "/convertiratexto";	
	}
	
	@Override public void exitConvertiratexto(PSeIntParser.ConvertiratextoContext ctx)
	{
		actualizarLinea("/convertiratexto");
	}
	
	@Override public void enterFunciones_arg(PSeIntParser.Funciones_argContext ctx)
	{
		mostraryEscribir("/funciones_arg");
		linea += "/funciones_arg";	
	}
	
	@Override public void exitFunciones_arg(PSeIntParser.Funciones_argContext ctx)
	{
		actualizarLinea("/funciones_arg");
	}
	
	@Override public void enterFinfuncion(PSeIntParser.FinfuncionContext ctx)
	{
		mostraryEscribir("/finfuncion:" + ctx.FINFUNCION().getText());
		linea += "/finfuncion";		
	}
	
	@Override public void exitFinfuncion(PSeIntParser.FinfuncionContext ctx)
	{
		actualizarLinea("/finfuncion");
	}
	
	@Override public void enterDimension_var(PSeIntParser.Dimension_varContext ctx)
	{
		mostraryEscribir("/dimension_var");
		linea += "/dimension_var";		
	}
	
	@Override public void exitDimension_var(PSeIntParser.Dimension_varContext ctx)
	{
		actualizarLinea("/dimension_var");
	}
	
	@Override public void enterArreglo(PSeIntParser.ArregloContext ctx)
	{
		mostraryEscribir("/arreglo");
		linea += "/arreglo";		
	}
	
	@Override public void exitArreglo(PSeIntParser.ArregloContext ctx)
	{
		actualizarLinea("/arreglo");
	}
	
	@Override public void enterDimension(PSeIntParser.DimensionContext ctx)
	{
		mostraryEscribir("/dimension:" + ctx.DIMENSION().getText());
		linea += "/dimension";		
	}

	@Override public void exitDimension(PSeIntParser.DimensionContext ctx)
	{
		actualizarLinea("/dimension");
	}

	@Override public void visitErrorNode(ErrorNode node)
	{
		if (!error)
		{
			mostraryEscribirError("** Se ha encontrado un error durante el analisis del fichero. ***");
			mostraryEscribirError("Se muestra a continuacion los nodos que han dado error y ya no se muestra mas partes del arbol:");
			error = true;
		}
		
		mostraryEscribirError(node.getText());
	}
}