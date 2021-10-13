import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Stack;
import java.util.HashMap;
import java.util.Set; 
import java.util.Map; 

public class Funcion
{
	private String variableRetorno;
	private String nombre;
	private ArrayList<String> argumentos;
	private Grafo grafo;
	private Stack<BigInteger> pilaPuntos;
	private ArrayList<String> variables;
	private int lineasCodigoEfectivas;
	private HashMap<String, Integer> llamadasFunciones;
	private Stack<Boolean> pilaSino;
	private int casos;
	
	public Funcion(String variableRetorno, String nombre, ArrayList<String> argumentos)
	{
		this.variableRetorno = variableRetorno;
		this.nombre = nombre;
		this.argumentos = argumentos;
		this.grafo = new Grafo(nombre);
		this.grafo.addActual();
		this.pilaPuntos = new Stack<>();
		this.pilaPuntos.push(new BigInteger("0"));
		this.variables = new ArrayList<>();
		this.lineasCodigoEfectivas = 0;
		this.llamadasFunciones = new HashMap<>();
		this.pilaSino = new Stack<>();
		this.casos = 0;
	}
	
	public Funcion(String nombre)
	{
		this("", nombre, null);
	}
	
	public void sumarPuntosFuncion(BigInteger puntos)
	{
		pilaPuntos.push(pilaPuntos.pop().add(puntos));
	}
	
	public void sumarPuntosFuncion(int puntos)
	{
		BigInteger p = new BigInteger(String.valueOf(puntos));
		sumarPuntosFuncion(p);
	}
	
	public void enterControl()
	{
		pilaPuntos.push(new BigInteger("0"));
	}
	
	public void exitControl()
	{
		BigInteger puntosCuadrado = pilaPuntos.pop().pow(2);
		
		sumarPuntosFuncion(puntosCuadrado);
	}
	
	public void enterSi(boolean sino)
	{
		Nodo ifn = grafo.addArista("Si", null);
		
		if (sino)
		{
			Nodo elsen = grafo.addArista("SiNo");
			grafo.pushSiguiente(elsen);
		}
		else
		{
			grafo.pushSiguiente(grafo.getNodoActual());
		}
		
		grafo.setNodoActual(ifn);
	}
	
	public void enterSino()
	{
		pilaSino.push(true);
		grafo.pushAnterior(grafo.getNodoActual());
		
		grafo.setNodoActual(grafo.popSiguiente());
	}
	
	public void enterFinsi()
	{
		Nodo hijo = grafo.addArista(grafo.getNumeroNodosS());
		
		Nodo padre = null;
		if (!pilaSino.empty())
		{
			padre = grafo.popAnterior();
			pilaSino.pop();
		}
		else
		{
			padre = grafo.popSiguiente();
		}
		
		grafo.addArista(padre, hijo, hijo);
	}
	
	public void enterSegun()
	{
		Nodo segun = grafo.addArista("Segun");
		grafo.pushAnterior(segun);
		casos = 0;
	}	
	
	public void enterSegunCaso(String nombre)
	{
		Nodo nodo = grafo.addArista(nombre, null);
		grafo.pushSiguiente(nodo);
		casos++;
	}
	
	public void enterFinsegun()
	{
		Nodo finSegun = grafo.addNodo("FinSegun");
		
		boolean deOtroModo = false;
		while (casos-- != 0)
		{
			Nodo siguiente = grafo.popSiguiente();
			if (siguiente.getNombre() == "DeOtroModo")
			{
				deOtroModo = true;
			}
			grafo.setNodoActual(siguiente);
			grafo.addArista(finSegun, null);
		}
		
		Nodo anterior = grafo.popAnterior();
		if (!deOtroModo)
		{
			grafo.setNodoActual(anterior);
			grafo.addArista(finSegun, null);
		}
		
		grafo.setNodoActual(finSegun);
	}
	
	public void enterBucle(String nombre)
	{
		Nodo nodo = grafo.addArista(nombre);
		grafo.pushAnterior(nodo);
		
		grafo.addArista(grafo.getNumeroNodosS());
	}
	
	public void enterFinBucle(String nombre)
	{
		Nodo anterior = grafo.popAnterior();
		grafo.addArista(anterior);
		
		grafo.addArista("Fin" + nombre);
	}
	
	public void enterRepetir()
	{
		Nodo nodo = grafo.addArista("Repetir");
		grafo.pushAnterior(nodo);
	}
	
	public void enterHastaque()
	{
		Nodo hastaQue = grafo.addNodo("HastaQue");
		grafo.addArista(hastaQue);
		
		Nodo anterior = grafo.popAnterior();
		grafo.addArista(anterior);
		
		grafo.setNodoActual(hastaQue);
	}
	
	public void enterFin()
	{
		grafo.cerrar();
	}
	
	public void generarSVG(Grafo grafo)
	{
		grafo.generarFicheroDot();
		
		ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "start", "/wait",
			"dot", "-Tsvg", grafo.getNombreFuncion() + ".dot", "-o",
			grafo.getNombreFuncion() + ".svg");
		try
		{
			Process p = pb.start();
			p.waitFor();
		}
		catch (IOException | InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	public void generarSVG()
	{
		generarSVG(this.grafo);
	}

	public String getVariableRetorno()
	{
		return variableRetorno;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public int getArgumentosSize()
	{
		return argumentos.size();
	}
	
	public String getArgumento(int indice)
	{
		return argumentos.get(indice);
	}
	
	public int getComplejidadCiclomatica()
	{
		return grafo.getComplejidadCiclomatica();
	}
	
	public BigInteger getPuntos()
	{
		return pilaPuntos.peek();
	}
	
	public void addVariable(String variable)
	{
		if (variables.indexOf(variable) == -1)
		{
			variables.add(variable);
			
			// Cada variable declarada: 1 punto
			sumarPuntosFuncion(1);
		}
	}
	
	public void addLlamadasFunciones(Funcion funcion)
	{
		Integer aristas = llamadasFunciones.get(funcion.getNombre());
		if (aristas == null)
		{
			llamadasFunciones.put(funcion.getNombre(), 1);
		}
		else
		{
			llamadasFunciones.replace(funcion.getNombre(), aristas.intValue() + 1);
		}
	}
	
	public void sumarLineaCodigoEfectiva()
	{
		lineasCodigoEfectivas++;
	}
	
	public int getVariablesSize()
	{
		return variables.size();
	}
	
	public int getLineasCodigoEfectivas()
	{
		return lineasCodigoEfectivas;
	}
	
	public int getLlamadasFuncionesSize()
	{
		return llamadasFunciones.size();
	}
	
	public Set<Map.Entry<String, Integer>> getLlamadasFunciones()
	{
		return llamadasFunciones.entrySet();
	}
}