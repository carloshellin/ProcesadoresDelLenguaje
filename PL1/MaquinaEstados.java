import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MaquinaEstados
{
    private int estadoActual;
    private Integer estadotmp;

    private final AFD afd;
    private final PrintWriter salida;
	
    public MaquinaEstados(AFD afd, PrintWriter salida)
    {
            this.afd = afd;
            this.salida = salida;
    }

    private void inicializar()
    {
            estadoActual = afd.getEstadoInicial();
    }

    private void acepta(char caracter) throws Exception
    {            
        // El carácter debe estar incluido en el alfabeto
        if (afd.aceptaAlfabeto(caracter))
        {           
            estadotmp = afd.getSiguienteEstado(estadoActual, caracter);
            
            if (estadotmp != null)
            {
                estadoActual = estadotmp;
            }
            else
            {
            throw new Exception("ERROR: El carácter " + caracter
                    + " ha intentado saltar a un estado que no existe");
            }
        }
        else
        {
            throw new Exception("ERROR: El carácter " + caracter
                    + " no se encuentra en el alfabeto");
        }
    }

    private boolean isFinal()
    {
            return afd.isFinal(estadoActual);
    }
    
    private boolean isCadenaCompletada(int i, String cadena)
    {
        return i == (cadena.length() - 1);
    }

    public boolean compruebaCadena(String cadena)
    {
            inicializar();
            
            int i = 0;
            
            try
            {
                for (i = 0; i < cadena.length(); i++)
                {
                    char caracter = cadena.charAt(i);
                    acepta(caracter);
                    if (isFinal() && isCadenaCompletada(i, cadena))
                    {
                        // Es final y la cadena que se tiene que comprobar
                        // se ha reccorido completamente.
                        return true;
                    }
                }
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage() + " de la posición " + (i + 1)
                        + " en la cadena introducida: \"" + cadena +"\"");
            }
            
            return false;
    }
    
    private void generarCadenas(int n, int longitud, ArrayList cadenas,
            String cadena, int estado)
    {
        if (cadenas.size() == n || (cadena.length() - 1) == longitud)
        {
            // Cuando se ha llegado al número de cadenas totales o longitud máx
            return;
        }

        if (afd.isFinal(estado) && !cadenas.contains(cadena))
        {
            // Es final y la cadena generada no ha sido generada anteriormente
            cadenas.add(cadena);
            salida.println(cadenas.size() + "- \"" + cadena + "\"");
        }

        HashMap<Character, Integer> transaciones = afd.getTransaciones(estado);

        Iterator it = transaciones.entrySet().iterator(); 
        while (it.hasNext())
        {
            Map.Entry transacion = (Map.Entry) it.next();
            char caracter = (char) transacion.getKey();
            int estadoSiguiente = (int) transacion.getValue();

            generarCadenas(n, longitud, cadenas, cadena + caracter, 
                    estadoSiguiente);
        }
    }
    
    
    public void generarCadenas(int n, int longitud)
    {
        ArrayList<String> cadenas = new ArrayList<>();
        // Llamada a función recursiva para recorrer todos los nodos
        generarCadenas(n, longitud, cadenas, "", afd.getEstadoInicial());
    }
}