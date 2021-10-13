import java.util.ArrayList;
import java.util.HashMap;

public class AFD
{
    private final ArrayList<Character> alfabeto;
    private final ArrayList<Integer> estados;
    private int estadoInicial;
    private final ArrayList<Integer> estadosFinales;
    private final HashMap<Integer, HashMap<Character, Integer>> matriz;
    
    public static int MINUSCULAS = 0x1;
    public static int MAYUSCULAS = 0x2;
    public static int NUMEROS = 0x4;

    public AFD()
    {
        alfabeto = new ArrayList<>();
        estados = new ArrayList<>();
        estadoInicial = -1;
        estadosFinales = new ArrayList<>();
        matriz = new HashMap<>();
    }
    
    private void cargarAbecedario(char[] abecedario)
    {
        for (int i = 0; i < abecedario.length; i++)
        {
            alfabeto.add(abecedario[i]);
        }
    }

    public void cargarAlfabeto(int tipo)
    {
        if ((tipo & MINUSCULAS) == MINUSCULAS)
        {
            char[] minusculas = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z'};
            cargarAbecedario(minusculas);
        }
        
        if ((tipo & MAYUSCULAS) == MAYUSCULAS)
        {
            char[] mayusculas = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
                'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z'};
            cargarAbecedario(mayusculas);
        }
        
        if ((tipo & NUMEROS)  == NUMEROS)
        {
            char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8',
                '9'};
            cargarAbecedario(numeros);
        }
    }
    
    public void cargarJFF(String nombre)
    {
        JFF.Leer(this, nombre);
    }
    
    public void cargarEstado(int estado)
    {
        estados.add(estado);
    }
	
    public void establecerQi(int estadoInicial)
    {
        this.estadoInicial = estadoInicial;
    }
	
    public void establecerQf(int estadoFinal)
    {
        estadosFinales.add(estadoFinal);
    }
    
    public void inicializaMatriz(int estado)
    {
        matriz.put(estado, new HashMap<>());
    }
    
    public void cargarMatriz(int estado, char caracter, int estadoDeSalto)
    {
        matriz.get(estado).put(caracter, estadoDeSalto);
    }

    public Integer getSiguienteEstado(int estado, char caracter)
    {
        try 
        {
            return matriz.get(estado).get(caracter);    
        }
        catch (NullPointerException e)
        {
            return null;
        }
    }
    
    public HashMap<Character, Integer> getTransaciones(int estado)
    {
        return matriz.get(estado);
    }
    
    public boolean aceptaAlfabeto(char caracter)
    {
        return alfabeto.contains(caracter);
    }
    
    public boolean isFinal(int estado)
    {
        return estadosFinales.contains(estado);
    }

    public Integer getEstadoInicial()
    {
        return estadoInicial;
    }
}