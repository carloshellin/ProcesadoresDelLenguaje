import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class Main
{
	public static void main(String [] args) throws Exception
	{
		if (args.length != 3)
		{
			System.out.println("Faltan argumentos. La invocacion es: java Main fichero.psc nombrefuncionprincipal nombreficheroinforme.html");
			System.exit(-1);
		}
		
		String ficheroPrograma = args[0];
		String funcionPrincipal = args[1];
		String ficheroInforme = args[2];
		
		InputStream is = System.in;
		is = new FileInputStream(ficheroPrograma);
		
		ANTLRInputStream input = new ANTLRInputStream(is);		
		PSeIntLexer lexer = new PSeIntLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PSeIntParser parser = new PSeIntParser(tokens);
		parser.setBuildParseTree(true);
		ParseTree tree = parser.programa();
		
		ParseTreeWalker walker = new ParseTreeWalker();
		TablaSimbolos tablaSimbolos = new TablaSimbolos();
		Listener escuchador = new Listener(tablaSimbolos);
		walker.walk(escuchador, tree);
		
		GeneradorHTML generadorHTML = new GeneradorHTML(ficheroPrograma, funcionPrincipal, ficheroInforme);
		generadorHTML.imprimir(tablaSimbolos);
	}
}