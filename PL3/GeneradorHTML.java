import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GeneradorHTML
{
	private String funcionPrincipal;
	private PrintWriter salida;
	
	public GeneradorHTML(String ficheroPrograma, String funcionPrincipal, String ficheroInforme)
	{
		this.funcionPrincipal = funcionPrincipal;
		
		try
        {
			salida = new PrintWriter(ficheroInforme);
		}
		catch (FileNotFoundException ex)
        {
            Logger.getLogger(GeneradorHTML.class.getName()).log(Level.SEVERE, null, ex);
        }
		
		salida.println("<!DOCTYPE html>");
		salida.println("<html>");
		salida.println("<head>");
		salida.println("<meta charset=\"UTF-8\">");
		salida.println("<title>Informe de " + ficheroPrograma + "</title>");
		salida.println("</head>");
		salida.println("<body>");
		salida.println("<h1>Informe de " + ficheroPrograma + "</h1>");
	}
	
	private void imprimirFuncion(Funcion funcion)
	{
		String titulo = funcion.getNombre() + "(";
		
		for (int i = 0; i < funcion.getArgumentosSize(); i++)
		{
			titulo += funcion.getArgumento(i);
			if (i + 1 != funcion.getArgumentosSize())
			{
				titulo += ", ";
			}
		}
		titulo += "):" + funcion.getVariableRetorno();
		
		salida.println("<hr>");
		salida.println("<h2>FUNCIÓN " + titulo + "</h2>");
		
		salida.println("<ul>");
		
		salida.println("<li>Complejidad ciclomática V(G): <strong>" 
			+ funcion.getComplejidadCiclomatica() + "</strong></li>");
			salida.println("<li>Puntos función: <strong>" 
			+ funcion.getPuntos().toString() + "</strong></li>");
		salida.println("<li>Resumen:</li>");
		
		salida.println("<ul>");
		salida.println("<li>Variables declaradas: <strong>"
			+ funcion.getVariablesSize() + "</strong></li>");
		salida.println("<li>Líneas de código efectivas: <strong>"
			+ funcion.getLineasCodigoEfectivas() + "</strong></li>");
		salida.println("<li>Número de parámetros esperados: <strong>"
			+ funcion.getArgumentosSize() + "</strong></li>");
		salida.println("<li>Número de llamadas a funciones: <strong>"
			+ funcion.getLlamadasFuncionesSize() + "</strong></li>");
		salida.println("</ul>");
		
		salida.println("<li>Gráfico de complejidad ciclomática:</li>");
		funcion.generarSVG();
		salida.println("<img src=\"" + funcion.getNombre() + ".svg\">");
		
		salida.println("</ul>");
	}
	
	private void imprimirPrograma(TablaSimbolos tablaSimbolos)
	{
		Funcion programa = tablaSimbolos.getPrograma();
		
		int complejidadCiclomaticaTotal = programa.getComplejidadCiclomatica();
		BigInteger puntosFuncionTotal = new BigInteger(programa.getPuntos().toString());
		int lineasCodigoEfectivasTotal = programa.getLineasCodigoEfectivas();
		for (int i = 0; i < tablaSimbolos.getFuncionesSize(); i++)
		{
			Funcion funcion = tablaSimbolos.getFuncion(i);
			complejidadCiclomaticaTotal += funcion.getComplejidadCiclomatica();
			puntosFuncionTotal = puntosFuncionTotal.add(funcion.getPuntos());
			lineasCodigoEfectivasTotal += funcion.getLineasCodigoEfectivas();
		}
		
		salida.println("<hr>");
		salida.println("<h2>PROGRAMA " + programa.getNombre() + "</h2>");
		
		salida.println("<ul>");
		
		salida.println("<li>Resumen:</li>");
		
		salida.println("<ul>");
		salida.println("<li>Complejidad ciclomática completa del fichero: <strong>"
			+ complejidadCiclomaticaTotal + "</strong></li>");
		salida.println("<li>Puntos función totales: <strong>"
			+ puntosFuncionTotal.toString() + "</strong></li>");
		salida.println("<li>Líneas de código efectivas totales: <strong>"
			+ lineasCodigoEfectivasTotal + "</strong></li>");
		salida.println("</ul>");

		salida.println("<li>Complejidad ciclomática V(G) del programa "
			+ programa.getNombre() + ": <strong>"
			+ programa.getComplejidadCiclomatica() + "</strong></li>");		
		salida.println("<li>Puntos función del programa "
			+ programa.getNombre() + ": <strong>"
			+ programa.getPuntos().toString() + "</strong></li>");
		salida.println("<li>Líneas de código efectivas del programa "
			+ programa.getNombre() + ": <strong>"
			+ programa.getLineasCodigoEfectivas() + "</strong></li>");
			
		programa.generarSVG();
		salida.println("<li>Gráfico de complejidad ciclomática del programa "
			+ programa.getNombre() + ":</li>");
		salida.println("<img src=\"" + programa.getNombre() + ".svg\">");
		
		Funcion funcion = null;
		if (programa.getNombre().equals(funcionPrincipal))
		{
			funcion = programa;
		}
		else
		{
			for (int i = 0; i < tablaSimbolos.getFuncionesSize(); i++)
			{
				funcion = tablaSimbolos.getFuncion(i);
				if (funcion.getNombre().equals(funcionPrincipal))
				{
					break;
				}
			}
		}
		
		if (funcion != null)
		{
			tablaSimbolos.generarSVGLlamadas(funcion);
			salida.println("<li>Gráfico de llamadas a funciones de la función "
				+ funcion.getNombre() + ":</li>");
			salida.println("<img src=\"" + funcion.getNombre() + "-llamadas.svg\">");
		}
		
		salida.println("</ul>");
	}
	
	private void cerrar()
	{
		salida.println("</body>");
		salida.print("</html>");
		salida.close();
	}
	
	public void imprimir(TablaSimbolos tablaSimbolos)
	{
		for (int i = 0; i < tablaSimbolos.getFuncionesSize(); i++)
		{
			imprimirFuncion(tablaSimbolos.getFuncion(i));
		}
		imprimirPrograma(tablaSimbolos);
		cerrar();
	}
}