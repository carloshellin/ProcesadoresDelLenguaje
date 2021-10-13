import java.util.ArrayList;
import java.util.Map;

public class TablaSimbolos
{
	private Funcion programa;
	private ArrayList<Funcion> funciones;
	private Funcion funcionActual;
	
	public TablaSimbolos()
	{
		this.programa = null;
		this.funciones = new ArrayList<>();
		this.funcionActual = null;
	}
	
	public void sumarPuntosFuncion(int puntos)
	{
		if (funcionActual != null)
		{
			funcionActual.sumarPuntosFuncion(puntos);
		}
		else
		{
			programa.sumarPuntosFuncion(puntos);
		}
	}
	
	public void enterControl()
	{
		if (funcionActual != null)
		{
			funcionActual.enterControl();
		}
		else
		{
			programa.enterControl();
		}
	}
	
	public void exitControl()
	{
		if (funcionActual != null)
		{
			funcionActual.exitControl();
		}
		else
		{
			programa.exitControl();
		}
	}
	
	public void enterSi(boolean sino)
	{
		if (funcionActual != null)
		{
			funcionActual.enterSi(sino);
		}
		else
		{
			programa.enterSi(sino);
		}
	}
	
	public void enterSino()
	{
		if (funcionActual != null)
		{
			funcionActual.enterSino();
		}
		else
		{
			programa.enterSino();
		}
	}
	
	public void enterFinsi()
	{
		if (funcionActual != null)
		{
			funcionActual.enterFinsi();
		}
		else
		{
			programa.enterFinsi();
		}
	}
	
	public void enterSegun()
	{
		if (funcionActual != null)
		{
			funcionActual.enterSegun();
		}
		else
		{
			programa.enterSegun();
		}
	}
	
	public void enterSegunCaso(String nombre)
	{
		if (funcionActual != null)
		{
			funcionActual.enterSegunCaso(nombre);
		}
		else
		{
			programa.enterSegunCaso(nombre);
		}
	}
	
	public void enterFinsegun()
	{
		if (funcionActual != null)
		{
			funcionActual.enterFinsegun();
		}
		else
		{
			programa.enterFinsegun();
		}
	}
	
	public void enterBucle(String nombre)
	{
		if (funcionActual != null)
		{
			funcionActual.enterBucle(nombre);
		}
		else
		{
			programa.enterBucle(nombre);
		}
	}
	
	public void enterFinBucle(String nombre)
	{
		if (funcionActual != null)
		{
			funcionActual.enterFinBucle(nombre);
		}
		else
		{
			programa.enterFinBucle(nombre);
		}
	}
	
	public void enterRepetir()
	{
		if (funcionActual != null)
		{
			funcionActual.enterRepetir();
		}
		else
		{
			programa.enterRepetir();
		}
	}
	
	public void enterHastaque()
	{
		if (funcionActual != null)
		{
			funcionActual.enterHastaque();
		}
		else
		{
			programa.enterHastaque();
		}
	}
	
	public void enterFin()
	{
		if (funcionActual != null)
		{
			funcionActual.enterFin();
			funcionActual = null;
		}
		else
		{
			programa.enterFin();
		}
	}
	
	public void addFuncion(Funcion funcion)
	{
		funciones.add(funcion);
	}
	
	public void setPrograma(Funcion programa)
	{
		this.programa = programa;
	}
	
	public Funcion getPrograma()
	{
		return programa;
	}
	
	public void setFuncionActual(Funcion funcion)
	{
		funcionActual = funcion;
	}
	
	public void addVariable(String variable)
	{
		if (funcionActual != null)
		{
			funcionActual.addVariable(variable);
		}
		else
		{
			programa.addVariable(variable);
		}
	}
	
	public void sumarLineaCodigoEfectiva()
	{
        if (funcionActual != null)
		{
            funcionActual.sumarLineaCodigoEfectiva();
		}
        else
		{
			programa.sumarLineaCodigoEfectiva();
		}
    }
	
	public void addLlamadaFunciones(String nombre)
	{
		Funcion funcion = new Funcion(nombre);
		
        if (funcionActual != null)
		{
            funcionActual.addLlamadasFunciones(funcion);
		}
        else
		{
			programa.addLlamadasFunciones(funcion);
		}
    }
	
	private void generarAristas(Grafo grafo, Funcion funcion)
	{
		for (Map.Entry<String, Integer> entrada : funcion.getLlamadasFunciones())
		{
			String llamadaFuncion = entrada.getKey();
			int aristas = entrada.getValue();
			Nodo hijo = grafo.getNodo(llamadaFuncion);
			if (hijo == null)
			{
				hijo = grafo.addNodo(llamadaFuncion);
			}
			
			for (int i = 0; i < aristas; i++)
			{
				grafo.addArista(hijo, null);
			}
		}
	}
	
	private void generarAristasRecursiva(Grafo grafo, Funcion funcion, ArrayList<String> nodosVisitados)
	{
		for (Map.Entry<String, Integer> entrada : funcion.getLlamadasFunciones())
		{
			String llamadaFuncion = entrada.getKey();
			
			for (int i = 0; i < getFuncionesSize(); i++)
			{
				Funcion llamada = getFuncion(i);
				if (llamada.getNombre().equals(llamadaFuncion) && !nodosVisitados.contains(llamadaFuncion))
				{
					nodosVisitados.add(llamadaFuncion);
					
					Nodo hijo = grafo.getNodo(llamadaFuncion);
					if (grafo.getNodoActual() != hijo)
					{
						grafo.setNodoActual(hijo);
						generarAristas(grafo, llamada);
						generarAristasRecursiva(grafo, llamada, nodosVisitados);
					}
					
					break;
				}
			}
		}
	}
	
	public void generarSVGLlamadas(Funcion funcion)
	{
		Grafo grafo = new Grafo(funcion.getNombre() + "-llamadas");
		grafo.addActual(funcion.getNombre());
		
		generarAristas(grafo, funcion);
		ArrayList<String> nodosVisitados = new ArrayList<>();
		nodosVisitados.add(funcion.getNombre());
		generarAristasRecursiva(grafo, funcion, nodosVisitados);
		
		funcion.generarSVG(grafo);
	}
	
	public int getFuncionesSize()
	{
		return funciones.size();
	}
	
	public int getFuncionIndex(String nombre)
	{
		return funciones.indexOf(nombre);
	}
	
	public Funcion getFuncion(int indice)
	{
		return funciones.get(indice);
	}
}