import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Grafo
{
	private String nombreFuncion;
	private ArrayList<Nodo> nodos;
	private Nodo actual;
	private Stack<Nodo> anteriores;
	private Stack<Nodo> siguientes;
	private int aristas;
	
	public Grafo(String nombreFuncion)
	{
		this.nombreFuncion = nombreFuncion;
		this.nodos = new ArrayList<>();
		this.aristas = 0;
		this.anteriores = new Stack<>();
		this.siguientes = new Stack<>();
	}
	
	public void addActual()
	{
		this.actual = addNodo("Inicio", "red");
		addNodo("Final", "gold");
	}
	
	public void addActual(String nombre)
	{
		this.actual = addNodo(nombre, "red");
	}
	
	private Nodo addNodo(String nombre, String color)
	{
		Nodo nodo = new Nodo(nombre, nodos.size(), color);
		nodos.add(nodo);
		
		return nodo;
	}
	
	public Nodo addNodo(String nombre)
	{
		return addNodo(nombre, "white");
	}
	
	public void addArista(Nodo padre, Nodo hijo, Nodo actual)
	{
		padre.addHijo(hijo);
		aristas++;
		if (actual != null) this.actual = actual;
	}
	
	public void addArista(Nodo hijo, Nodo actual)
	{
		addArista(this.actual, hijo, actual);
	}
	
	public void addArista(Nodo hijo)
	{
		addArista(hijo, hijo);	
	}
	
	public Nodo addArista(String nombre)
	{
		Nodo hijo = addNodo(nombre);
		addArista(hijo);
		
		return hijo;
	}

	public Nodo addArista(String nombre, Nodo actual)
	{
		Nodo hijo = addNodo(nombre);
		addArista(hijo, actual);
		
		return hijo;
	}
	
	public void cerrar()
	{
		Nodo fin = getNodo(1);
		addArista(fin);
	}
	
	public void generarFicheroDot()
	{
		PrintWriter salida = null;
		try
        {
			salida = new PrintWriter(nombreFuncion + ".dot");
		}
		catch (FileNotFoundException ex)
        {
            Logger.getLogger(Grafo.class.getName()).log(Level.SEVERE, null, ex);
        }
		
		salida.println("digraph G {");
		
		for (int i = 0; i < nodos.size(); i++)
		{
			Nodo nodo = nodos.get(i);
			for (int j = 0; j < nodo.getHijosSize(); j++)
			{
				Nodo hijo = nodo.getHijo(j);
				
				salida.println(nodo.getNombreId() + " -> " + hijo.getNombreId()+ ";");
			}
		}
		
		salida.println("n0 [label=\"\", shape=none, height=.0, width=.0];");
		for (int i = 0; i < nodos.size(); i++)
		{
			Nodo nodo = nodos.get(i);
			String extra = "";
			if (nodo.getNombre().equals("Final"))
			{
				extra = " peripheries=2";
			}
			
			salida.println(nodo.getNombreId() + "[label=\"" + nodo.getNombre().replaceAll("\"", "") + "\" style=filled fillcolor=" + nodo.getColor() + extra + "];");
		}
		
		salida.print("}");
		salida.close();
	}
	
	public String getNombreFuncion()
	{
		return nombreFuncion;
	}
	
	public int getComplejidadCiclomatica()
	{
		return aristas - nodos.size() + 2;
	}
	
	public Nodo getNodo(int index)
	{
		return nodos.get(index);
	}
	
	public Nodo getNodo(String nombre)
	{
		for (int i = 0; i < nodos.size(); i++)
		{
			Nodo nodo = getNodo(i);
			if (nodo.getNombre().equals(nombre))
			{
				return nodo;
			}
		}
		
		return null;
	}
	
	public String getNumeroNodosS()
	{
		return Integer.toString(nodos.size());
	}
	
	public Nodo getNodoActual()
	{
		return actual;
	}
	
	public void setNodoActual(Nodo nodo)
	{
		this.actual = nodo;
	}
	
	public void pushAnterior(Nodo nodo)
	{
		anteriores.push(nodo);
	}
	
	public Nodo popAnterior()
	{
		return anteriores.pop();
	}
	
	public boolean vacioAnterior()
	{
		return anteriores.empty();
	}
	
	public boolean vacioSiguiente()
	{
		return siguientes.empty();
	}
	
	public void pushSiguiente(Nodo nodo)
	{
		siguientes.push(nodo);
	}
	
	public Nodo popSiguiente()
	{
		return siguientes.pop();
	}
}