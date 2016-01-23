import java_cup.runtime.Symbol;

public class TestScanner {
	/* single lookahead character */
	protected static int next_char;

	/* advance input by one character */
	protected static void advance() throws java.io.IOException {
		next_char = System.in.read();
	}

	/* initialize the scanner */
	public static void init() throws java.io.IOException {
		advance();
	}

	/* recognize and return the next complete token */
	public static Symbol next_token() throws java.io.IOException {
		Symbol s = new Symbol(3);
		return s;
	}
};