import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class JFF
{
    public static void Leer(AFD afd, String nombre)
    {
        File fichero = new File(nombre);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try
        {
            builder = factory.newDocumentBuilder();
            Document doc = builder.parse(fichero);
            Element raiz = doc.getDocumentElement();
            
            NodeList nodos = raiz.getElementsByTagName("state");
            
            // Para cada nodo cargar su estado estableciendo inicial y finales
            // además de iniciar la matriz para cada estado
            for (int i = 0; i < nodos.getLength(); i++)
            {
                Node nodo = nodos.item(i);
                
                Element elemento = (Element) nodo;
                int estado = Integer.valueOf(elemento.getAttribute("id"));
                afd.cargarEstado(estado);
                afd.inicializaMatriz(estado);
                
                NodeList nodoInicial = elemento.getElementsByTagName("initial");
                boolean esInicial = nodoInicial.getLength() == 1;
                
                if (esInicial)
                {
                    afd.establecerQi(estado);
                }
                
                NodeList nodoFinal = elemento.getElementsByTagName("final");
                boolean esFinal = nodoFinal.getLength() == 1;
                
                if (esFinal)
                {
                    afd.establecerQf(estado);
                }
            }   
            
            nodos = raiz.getElementsByTagName("transition");
            
            // Recorrer los nodos para cargar cada transicción
            for (int i = 0; i < nodos.getLength(); i++)
            {
                Node nodo = nodos.item(i);
                Element elemento = (Element) nodo;
                
                Node from = elemento.getElementsByTagName("from").item(0);
                int estado = Integer.parseInt(from.getTextContent());
                
                Node to = elemento.getElementsByTagName("to").item(0);
                int estadoDeSalto = Integer.parseInt(to.getTextContent());
                
                Node read = elemento.getElementsByTagName("read").item(0);
                char caracter = read.getTextContent().charAt(0);
                
                afd.cargarMatriz(estado, caracter, estadoDeSalto);
            }
        }
        catch (ParserConfigurationException | SAXException | IOException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
