import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main
{   
    public static void main(String[] args)
    {
        if (args.length == 0 || args.length < 9)
        {
            System.out.println("ERROR: Introduce los argumentos necesarios.");
            System.out.println("Ejemplo: java -jar pecl1.jar ejemplo.jff "
                    + "\"a*b?c\" -a 124 -c cadena1 cadena2 ... cadenan "
                    + "-g numeroCadenas longitudMaxima");            
            System.out.println("Para -a se usa uno o varios números según "
                    + "el alfabeto que se quiera usar:");
            System.out.println("1 - Para usar minúsculas");
            System.out.println("2 - Para usar mayúsculas");
            System.out.println("4 - Para usar números");
            return;
        }
        
        // Se crea la matriz a partir del fichero
        // que se pasa por la línea de comandos
        String fichero = args[0];
        
        AFD afd = new AFD();
        afd.cargarJFF(fichero);
        
        // Expresión regular para separar el nombre del fichero de la extensión
        String[] tokens = fichero.split("\\.(?=[^\\.]+$)");
        String base = tokens[0];
        
        PrintWriter salida;
        try
        {
            salida = new PrintWriter(base.concat(".txt"), "UTF-8");
            MaquinaEstados maquinaEstados = new MaquinaEstados(afd, salida);
            
            String er = args[1];
            salida.println("ER: " + er);
            
            if (args[2].contains("-a"))
            {
                String numeros = args[3];
                int tipo = 0;
                for (int i = 0; i < numeros.length(); i++)
                {
                    switch (numeros.charAt(i))
                    {
                        case '1':
                        {
                            tipo |= AFD.MINUSCULAS;
                        } break;
                        
                        case '2':
                        {
                            tipo |= AFD.MAYUSCULAS;
                        } break;
                        
                        case '4':
                        {
                            tipo |= AFD.NUMEROS;
                        } break;
                    }
                }
                
                afd.cargarAlfabeto(tipo);
            }

            if (args[4].contains("-c"))
            {
                // Comprobar cadenas hasta encontrar el argumento -g
                int i = 5;
                while (!args[i].contains("-g"))
                {
                    String cadena = args[i];
                    
                    boolean resultado = maquinaEstados.compruebaCadena(cadena);
                    
                    String validez = resultado ? "Válida" : "No Válida";
                    salida.println("Cadena " + (i - 4) + ": " + "\"" + cadena
                            + "\"" + " --> " + validez);
                    i++;
                }
                
                if (args[i].contains("-g"))
                {
                    // Generar cadenas según los parámetros dados
                    int n = Integer.parseInt(args[i + 1]);
                    int longitud = Integer.parseInt(args[i + 2]);
                    
                    salida.println(n + " Cadenas posibles que cumplen la ER:");
            
                    maquinaEstados.generarCadenas(n, longitud);
                }
            }
            
            salida.close();            
        }
        catch (FileNotFoundException | UnsupportedEncodingException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
