import java_cup.runtime.Symbol;

public class SymbolValue {
	private Symbol symbol;
	private String value;

	public SymbolValue() {
		super();

	}

	public SymbolValue(Symbol symbol, String value) {
		this.symbol = symbol;
		this.value = "test";
		generateValue(symbol.sym);
	}

	public Symbol getSymbol() {
		return symbol;
	}

	public SymbolValue setSymbol(Symbol symbol) {
		this.symbol = symbol;
		generateValue(symbol.sym);
		return this;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void generateValue(Integer num) {
		HashDataAnalyzer hash = new HashDataAnalyzer();
		this.setValue(hash.getHm().get(num));
	}

}
