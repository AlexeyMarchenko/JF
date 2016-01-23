import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java_cup.runtime.Symbol;

public class Cla {

	public static void main(String[] args) {
		String dirFile = "test.txt";
		String fileName = "test";
		lexicalAnalyzer(dirFile, fileName);
	}

	/**
	 * Lexical Analyzer function
	 * 
	 * @param dirFile
	 * @param fileName
	 */
	public static void lexicalAnalyzer(String dirFile, String fileName) {
		Symbol sym;
		SymbolValue symbolValue = new SymbolValue();
		try {
			CplAnalyzer1 lexer = new CplAnalyzer1(new FileReader(dirFile));
			PrintWriter writer = new PrintWriter(fileName + ".tok", "UTF-8");
		//	Parser parser = new Parser(lexer);
			writer.println("Line" + "\t\t\tToken" + "\t\t\tValue");
			for (sym = lexer.next_token(); sym.sym != 0; sym = lexer.next_token()) {
				writer.println(sym.left + "\t\t\t\t" + symbolValue.setSymbol(sym).getValue() + "\t\t\t" + sym.value);
				System.out.println("test");
			}
			writer.close();
			SecondLoop loop = new SecondLoop(new FileReader(dirFile));
			PrintWriter secondWriter = new PrintWriter(fileName + ".lex", "UTF-8");
			for (sym = loop.next_token(); sym.sym != 0; sym = loop.next_token()) {
				secondWriter.print(sym.value);
			}
			secondWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}