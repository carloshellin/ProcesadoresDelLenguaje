import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main
{
	public static void main(String [] args) throws Exception
	{
		String inputFile = null;
		if (args.length > 0)
		{
			inputFile = args[0];
		}
		
		InputStream is = System.in;
		if (inputFile != null)
		{
			is = new FileInputStream(inputFile);
		}
		
		ANTLRInputStream input = new ANTLRInputStream(is);		
		PSeIntLexer lexer = new PSeIntLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PSeIntParser parser = new PSeIntParser(tokens);
		parser.setBuildParseTree(true);
		ParseTree tree = parser.programa();
		
		
		ParseTreeWalker walker = new ParseTreeWalker();
		Listener escuchador = new Listener();
		walker.walk(escuchador, tree);
	}
}