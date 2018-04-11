package org.bds.lang.statement;

import org.antlr.v4.runtime.tree.ParseTree;
import org.bds.compile.CompilerMessage.MessageType;
import org.bds.compile.CompilerMessages;
import org.bds.lang.BdsNode;
import org.bds.lang.expression.Expression;
import org.bds.lang.type.Type;
import org.bds.lang.value.LiteralListEmpty;
import org.bds.lang.value.LiteralMapEmpty;
import org.bds.symbol.SymbolTable;

/**
 * Variable initialization
 * E.g.:
 * 			i = 3
 *
 * @author pcingola
 */
public class VariableInit extends BdsNode {

	private static final long serialVersionUID = 2385160471242254601L;
	protected boolean fieldInit; // Is this a 'field' initialization in a class declaration?
	protected String varName;
	protected Expression expression;
	protected String help;

	public static VariableInit get(BdsNode parent, String name, Expression expression) {
		VariableInit vi = new VariableInit(null, null);
		vi.parent = parent;
		vi.varName = name;
		vi.expression = expression;
		return vi;
	}

	public static VariableInit get(String name) {
		VariableInit vi = new VariableInit(null, null);
		vi.varName = name;
		return vi;
	}

	public static VariableInit get(String name, Expression expression) {
		VariableInit vi = new VariableInit(null, null);
		vi.varName = name;
		vi.expression = expression;
		return vi;
	}

	public VariableInit(BdsNode parent, ParseTree tree) {
		super(parent, tree);
		fieldInit = false;
	}

	public Expression getExpression() {
		return expression;
	}

	public String getHelp() {
		return help;
	}

	public String getVarName() {
		return varName;
	}

	public boolean isFieldInit() {
		return fieldInit;
	}

	@Override
	protected void parse(ParseTree tree) {
		int idx = 0;
		varName = tree.getChild(idx++).getText();

		// Initialization expression
		if (isTerminal(tree, idx, "=")) {
			idx++;
			expression = (Expression) factory(tree, idx++);
		}

		// Help string
		ParseTree node = tree.getChild(idx++);
		if (node != null && node.getText().startsWith("help")) {
			help = node.getText().substring("help ".length()).trim();
		}
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	public void setFieldInit(boolean fieldInit) {
		this.fieldInit = fieldInit;
	}

	public void setType(Type type) {
		returnType = type;
	}

	@Override
	public String toAsm() {
		return fieldInit ? toAsmFieldInit() : toAsmVarInit();
	}

	/**
	 * Default value initialization
	 */
	String toAsmDefaultValue() {
		if (returnType != null) {
			if (returnType.isBool()) return "pushb false\n";
			else if (returnType.isInt()) return "pushi 0\n";
			else if (returnType.isReal()) return "pushr 0.0\n";
			else if (returnType.isString()) return "pushs ''\n";
			else if (returnType.isList() || returnType.isMap() || returnType.isClass()) return "new " + returnType.toString() + "\n";
		}
		throw new RuntimeException("Unknown default value for type '" + returnType + "'");
	}

	String toAsmFieldInit() {
		return super.toAsm() //
				+ (expression != null ? expression.toAsm() : toAsmDefaultValue()) //
				+ (help != null ? "# help: " + help + "\n" : "") //
				+ "load this\n" //
				+ "setfield  " + varName + "\n"//
		;
	}

	String toAsmVarInit() {
		return super.toAsm() //
				+ (expression != null ? expression.toAsm() : toAsmDefaultValue()) //
				+ (help != null ? "# help: " + help + "\n" : "") //
				+ "store  " + varName + "\n" //
				+ "pop\n" //
		;
	}

	@Override
	public String toString() {
		return varName //
				+ (expression != null ? " = " + expression : "") //
				+ (help != null ? " help " + help : "") //
		;
	}

	@Override
	public void typeCheck(SymbolTable symtab, CompilerMessages compilerMessages) {
		// Variable type
		Type varType = symtab.getTypeLocal(varName);

		// Calculate expression type
		if (expression != null) {
			Type exprRetType = expression.returnType(symtab);

			// Compare types
			if ((varType == null) || (exprRetType == null)) {
				// Variable not found, nothing else to do
			} else if (varType.isList() && exprRetType.isList() && (expression instanceof LiteralListEmpty)) {
				// OK, Empty list literal can be assigned to any list
			} else if (varType.isMap() && exprRetType.isMap() && (expression instanceof LiteralMapEmpty)) {
				// OK, Empty map literal can be assigned to any map
			} else if (!exprRetType.canCastTo(varType)) {
				// We cannot cast expression's type to variable's type: Error
				compilerMessages.add(this, "Cannot cast " + exprRetType + " to " + varType, MessageType.ERROR);
			}
		}
	}
}
