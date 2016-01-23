import java.util.HashMap;

public class HashDataAnalyzer {
	public HashMap<Integer, String> hm;

	public HashDataAnalyzer() {
		hm = new HashMap<Integer, String>();
		generateHashData();
	}

	public HashMap<Integer, String> getHm() {
		return hm;
	}

	public void setHm(HashMap<Integer, String> hm) {
		this.hm = hm;
	}

	public void generateHashData() {

		hm.put(SymLexer.BREAK, "break");
		hm.put(SymLexer.CASE, "case");
		hm.put(SymLexer.CONST, "const");
		hm.put(SymLexer.DEFAULT, "default");
		hm.put(SymLexer.DO, "do\t");
		hm.put(SymLexer.ELSE, "else");
		hm.put(SymLexer.FOR, "for\t");
		hm.put(SymLexer.IF, "if\t");
		hm.put(SymLexer.INT, "int\t");
		hm.put(SymLexer.IVAL, "ival");
		hm.put(SymLexer.MAIN, "main");
		hm.put(SymLexer.PRINT, "print");
		hm.put(SymLexer.REAL, "real");
		hm.put(SymLexer.READ, "read");
		hm.put(SymLexer.RVAL, "rval");
		hm.put(SymLexer.START, "start");
		hm.put(SymLexer.SWITCH, "switch");
		hm.put(SymLexer.THEN, "then");
		hm.put(SymLexer.TRATS, "trats");
		hm.put(SymLexer.VAR, "var\t");
		hm.put(SymLexer.WHILE, "while");
		hm.put(SymLexer.WHEN, "when");
		hm.put(SymLexer.IDENTIFIER, "id\t");
		hm.put(SymLexer.INTEGER_LITERAL, "num\t");
		hm.put(SymLexer.RELOP, "relop");
		hm.put(SymLexer.ADDLOP, "addlop");
		hm.put(SymLexer.MULOP, "mulop");
		hm.put(SymLexer.ASSIGNOP, "assiglop");
		hm.put(SymLexer.OROP, "orop");
		hm.put(SymLexer.ANDOP, "andop");
		hm.put(SymLexer.ERROR, "error");
		hm.put(SymLexer.LEFT_BRECKET, "left_brecket");
		hm.put(SymLexer.RIGHT_BRECKET, "right_brecket");
		hm.put(SymLexer.COMMA, "comma");
		hm.put(SymLexer.SEMICOLON, "semicolon");
		hm.put(SymLexer.COLON, "colon");
		hm.put(SymLexer.LEFT_PT, "left_pt");
		hm.put(SymLexer.RIGHT_PT, "right_pt");
		hm.put(SymLexer.LETTER, "letter");
		hm.put(SymLexer.COMMENT,"comment");
	}
}
