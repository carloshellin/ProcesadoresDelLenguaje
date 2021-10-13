import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Listener extends PSeIntParserBaseListener
{
	private TablaSimbolos tablaSimbolos;
	
	public Listener(TablaSimbolos tablaSimbolos)
	{
		this.tablaSimbolos = tablaSimbolos;
	}
	
	@Override public void enterInicioalgoritmo(PSeIntParser.InicioalgoritmoContext ctx)
	{
		Funcion programa = new Funcion(ctx.identificador().getText());
		tablaSimbolos.setPrograma(programa);
	}
	
	@Override public void enterFinalgoritmo(PSeIntParser.FinalgoritmoContext ctx)
	{
		tablaSimbolos.enterFin();
	}
	
	@Override public void enterInstruccion(PSeIntParser.InstruccionContext ctx)
	{
		// Línea de código efectiva (aquellas que ejecutan algo)
		tablaSimbolos.sumarLineaCodigoEfectiva();
	}
	
	@Override public void enterDefinir_var(PSeIntParser.Definir_varContext ctx)
	{
		for (int i = 0; i < ctx.variable().size(); i++)
		{
			tablaSimbolos.addVariable(ctx.variable(i).getText());
		}
	}
	
	@Override public void enterEscritura(PSeIntParser.EscrituraContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("Escribir");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + ctx.expr().size());
	}
	
	@Override public void enterBorrando(PSeIntParser.BorrandoContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("Borrando");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2);
	
	}
	
	@Override public void enterEsperar_tecla(PSeIntParser.Esperar_teclaContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("EsperarTecla");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2);
	}
	
	@Override public void enterEsperar_tiempo(PSeIntParser.Esperar_tiempoContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("Esperar");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + 1);
	}
	
	@Override public void enterLlamar_funcion(PSeIntParser.Llamar_funcionContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones(ctx.identificador().getText());
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + ctx.expr().size());
	}
	
	@Override public void enterAsignacion(PSeIntParser.AsignacionContext ctx)
	{
		String variable = ctx.variable() != null ? ctx.variable().getText() : ctx.arreglo().getText();
		tablaSimbolos.addVariable(variable);
	}
	
	@Override public void enterLectura(PSeIntParser.LecturaContext ctx)
	{
		for (int i = 0; i < ctx.variable().size(); i++)
		{
			tablaSimbolos.addVariable(ctx.variable(i).getText());
		}
		
		tablaSimbolos.addLlamadaFunciones("Leer");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + ctx.variable().size());
	}

	@Override public void enterSuma(PSeIntParser.SumaContext ctx)
	{
		// Cada operación simple: 1 punto por cada operador
		tablaSimbolos.sumarPuntosFuncion(1);
	}
	
	@Override public void enterResta(PSeIntParser.RestaContext ctx)
	{
		// Cada operación simple: 1 punto por cada operador
		tablaSimbolos.sumarPuntosFuncion(1);
	}
	
	@Override public void enterMultiplicacion(PSeIntParser.MultiplicacionContext ctx) 
	{ 
		// Cada operación simple: 1 punto por cada operador
		tablaSimbolos.sumarPuntosFuncion(1);
	}
	
	@Override public void enterDivision(PSeIntParser.DivisionContext ctx)
	{
		// Cada operación simple: 1 punto por cada operador
		tablaSimbolos.sumarPuntosFuncion(1);
	}
	
	@Override public void enterPotenciacion(PSeIntParser.PotenciacionContext ctx)
	{
		// Cada operación simple: 1 punto por cada operador
		tablaSimbolos.sumarPuntosFuncion(1);
	}
	
	@Override public void enterModulo(PSeIntParser.ModuloContext ctx)
	{
		// Cada operación simple: 1 punto por cada operador
		tablaSimbolos.sumarPuntosFuncion(1);
	}
	
	@Override public void enterControl(PSeIntParser.ControlContext ctx)
	{
		// Cada nivel de bucle o bifurcación de código: Eleva al cuadrado los puntos interiores
		tablaSimbolos.enterControl();
	}
	
	@Override public void exitControl(PSeIntParser.ControlContext ctx)
	{
		tablaSimbolos.exitControl();
	}
	
	@Override public void enterSi_op(PSeIntParser.Si_opContext ctx)
	{
		tablaSimbolos.enterSi(ctx.sino() != null);
	}
	
	@Override public void enterSegun_op(PSeIntParser.Segun_opContext ctx)
	{
		tablaSimbolos.enterSegun();
		
		for (int i = 0; i < ctx.expr().size(); i++)
		{
			tablaSimbolos.enterSegunCaso(ctx.expr(i).getText());
		}
		
		for (int i = 0; i < ctx.deotromodo().size(); i++)
		{
			tablaSimbolos.enterSegunCaso("DeOtroModo");
		}
	}
	
	@Override public void enterFinsegun(PSeIntParser.FinsegunContext ctx)
	{
		tablaSimbolos.enterFinsegun();
	}
		
	@Override public void enterMayor(PSeIntParser.MayorContext ctx)
	{
		// Cada operación simple: 1 punto por cada operador
		tablaSimbolos.sumarPuntosFuncion(1);
	}
	
	@Override public void enterMenor(PSeIntParser.MenorContext ctx)
	{
		// Cada operación simple: 1 punto por cada operador
		tablaSimbolos.sumarPuntosFuncion(1);
	}
	
	@Override public void enterIgual(PSeIntParser.IgualContext ctx)
	{
		// Cada operación simple: 1 punto por cada operador
		tablaSimbolos.sumarPuntosFuncion(1);
	}
	
	@Override public void enterMenorigual(PSeIntParser.MenorigualContext ctx)
	{
		// Cada operación simple: 1 punto por cada operador
		tablaSimbolos.sumarPuntosFuncion(1);
	}
	
	@Override public void enterMayorigual(PSeIntParser.MayorigualContext ctx)
	{
		// Cada operación simple: 1 punto por cada operador
		tablaSimbolos.sumarPuntosFuncion(1);
	}
	
	@Override public void enterDistinto(PSeIntParser.DistintoContext ctx)
	{
		// Cada operación simple: 1 punto por cada operador
		tablaSimbolos.sumarPuntosFuncion(1);
	}
	
	@Override public void enterConjuncion(PSeIntParser.ConjuncionContext ctx)
	{
		// Cada operación simple: 1 punto por cada operador
		tablaSimbolos.sumarPuntosFuncion(1);
	}
	@Override public void enterDisyuncion(PSeIntParser.DisyuncionContext ctx)
	{
		// Cada operación simple: 1 punto por cada operador
		tablaSimbolos.sumarPuntosFuncion(1);
	}
	
	@Override public void enterNegacion(PSeIntParser.NegacionContext ctx)
	{
		// Cada operación simple: 1 punto por cada operador
		tablaSimbolos.sumarPuntosFuncion(1);
	}
	
	@Override public void enterSino(PSeIntParser.SinoContext ctx)
	{
		tablaSimbolos.enterSino();
	}
	
	@Override public void enterFinsi(PSeIntParser.FinsiContext ctx)
	{
		tablaSimbolos.enterFinsi();
	}
	
	@Override public void enterPara(PSeIntParser.ParaContext ctx)
	{
		tablaSimbolos.enterBucle("Para");
	}
	
	@Override public void enterFinpara(PSeIntParser.FinparaContext ctx)
	{
		tablaSimbolos.enterFinBucle("Para");
	}
	
	@Override public void enterMientras(PSeIntParser.MientrasContext ctx)
	{
		tablaSimbolos.enterBucle("Mientras");
	}
	
	@Override public void enterFinmientras(PSeIntParser.FinmientrasContext ctx)
	{
		tablaSimbolos.enterFinBucle("Mientras");
	}
	
	@Override public void enterRepetir(PSeIntParser.RepetirContext ctx)
	{
		tablaSimbolos.enterRepetir();
	}

	@Override public void enterHastaque(PSeIntParser.HastaqueContext ctx)
	{ 
		tablaSimbolos.enterHastaque();
	}
	
	@Override public void enterDefinir_func(PSeIntParser.Definir_funcContext ctx)
	{
		String variableRetorno = ctx.variable() != null ? ctx.variable().getText() : "void";
		String nombre = ctx.identificador().getText();
		ArrayList<String> argumentos = new ArrayList<>();
		for (int i = 0; i < ctx.argumentos().identificador().size(); i++)
		{
			argumentos.add(ctx.argumentos().identificador(i).getText());
		}
		
		Funcion funcion = new Funcion(variableRetorno, nombre, argumentos);
		tablaSimbolos.addFuncion(funcion);
		tablaSimbolos.setFuncionActual(funcion);
		
		// Línea de código efectiva (aquellas que ejecutan algo)
		tablaSimbolos.sumarLineaCodigoEfectiva();
	}
	
	@Override public void enterPi(PSeIntParser.PiContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("pi");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + 1);
	}
	
	@Override public void enterRaiz(PSeIntParser.RaizContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("raiz");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + 1);
	}

	@Override public void enterAbs(PSeIntParser.AbsContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("abs");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + 1);
	}

	@Override public void enterLn(PSeIntParser.LnContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("ln");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + 1);
	}
	
	@Override public void enterExpf(PSeIntParser.ExpfContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("expf");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + 1);
	}

	@Override public void enterSen(PSeIntParser.SenContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("sen");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + 1);
	}
	
	@Override public void enterCos(PSeIntParser.CosContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("cos");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + 1);
	}
	
	@Override public void enterTan(PSeIntParser.TanContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("tan");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + 1);
	}

	@Override public void enterAsen(PSeIntParser.AsenContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("asen");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + 1);
	}

	@Override public void enterAcos(PSeIntParser.AcosContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("acos");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + 1);
	}
	
	@Override public void enterAtan(PSeIntParser.AtanContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("atan");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + 1);
	}
	
	@Override public void enterTrunc(PSeIntParser.TruncContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("trunc");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + 1);
	}
	
	@Override public void enterRedon(PSeIntParser.RedonContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("redon");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + 1);
	}

	@Override public void enterAzar(PSeIntParser.AzarContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("azar");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + 1);
	}
	
	@Override public void enterAleatorio(PSeIntParser.AleatorioContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("aleatorio");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + 2);
	}
	
	@Override public void enterLongitud(PSeIntParser.LongitudContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("longitud");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + 1);
	}
	
	@Override public void enterMayusculas(PSeIntParser.MayusculasContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("mayusculas");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + 1);
	}
	
	@Override public void enterMinusculas(PSeIntParser.MinusculasContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("minuscuclas");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + 1);
	}
	
	@Override public void enterSubcadena(PSeIntParser.SubcadenaContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("subcadena");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + 3);
	}
	
	@Override public void enterConcatenar(PSeIntParser.ConcatenarContext ctx) 
	{
		tablaSimbolos.addLlamadaFunciones("concatenar");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + 2);
	}

	@Override public void enterConvertiranumero(PSeIntParser.ConvertiranumeroContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("convertiranumero");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + 1);
	}
	
	@Override public void enterConvertiratexto(PSeIntParser.ConvertiratextoContext ctx)
	{
		tablaSimbolos.addLlamadaFunciones("convertiratexto");
		
		// Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
		tablaSimbolos.sumarPuntosFuncion(2 + 1);
	}
	
	@Override public void enterFinfuncion(PSeIntParser.FinfuncionContext ctx)
	{
		tablaSimbolos.enterFin();
	}
	
	@Override public void enterDimension_var(PSeIntParser.Dimension_varContext ctx)
	{
		for (int i = 0; i < ctx.arreglo().size(); i++)
		{
			tablaSimbolos.addVariable(ctx.arreglo(i).variable().getText());
		}
	}
}