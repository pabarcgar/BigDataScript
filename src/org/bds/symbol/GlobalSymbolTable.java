package org.bds.symbol;

/**
 * Global SymboTable: A table of variables, functions and classes
 *
 * @author pcingola
 */
public class GlobalSymbolTable extends SymbolTable {

	private static GlobalSymbolTable globalSymbolTable = new GlobalSymbolTable();

	public static GlobalSymbolTable get() {
		if (globalSymbolTable == null) reset();
		return globalSymbolTable;
	}

	public static void reset() {
		globalSymbolTable = new GlobalSymbolTable();
	}

	private GlobalSymbolTable() {
		super(null);
	}

	@Override
	public SymbolTable getParent() {
		return null; // GlobalSYmbolTable has no parent
	}

}
