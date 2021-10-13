import java.util.ArrayList;

public class Nodo
{
	private String nombre;
	private int id;
	private String color;
	private ArrayList<Nodo> hijos;
	
	public Nodo(String nombre, int id, String color)
	{
		this.nombre = nombre;
		this.color = color;
		this.hijos = new ArrayList<>();
		this.id = id;
	}
	
	public void addHijo(Nodo hijo)
	{
		hijos.add(hijo);
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public String getNombreId()
	{
		if (nombre.charAt(0) == '"')
		{
			return "\"" + nombre.replaceAll("\"", "") + id + "\"";
		}

		return nombre + id;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public int getHijosSize()
	{
		return hijos.size();
	}
	
	public Nodo getHijo(int index)
	{
		return hijos.get(index);
	}
}