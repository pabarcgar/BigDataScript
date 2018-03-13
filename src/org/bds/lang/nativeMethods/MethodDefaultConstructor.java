package org.bds.lang.nativeMethods;

import org.bds.lang.Parameters;
import org.bds.lang.type.Type;
import org.bds.lang.type.TypeClass;
import org.bds.run.BdsThread;

/**
 * A method to create objects (default constructor) for all classes
 * The method takes no arguments except 'this', which is an empty object
 *
 * Initialization using a default (empty) constructor does nothing.
 *
 * @author pcingola
 */
public class MethodDefaultConstructor extends MethodNative {

	public MethodDefaultConstructor(Type classType) {
		super(classType);
	}

	@Override
	protected void initMethod() {
		TypeClass ct = (TypeClass) classType;
		functionName = ct.getClassName();
		returnType = classType;

		String argNames[] = { "this" };
		Type argTypes[] = { classType };
		parameters = Parameters.get(argTypes, argNames);
		addNativeMethodToClassScope();
	}

	@Override
	public void runFunction(BdsThread bdsThread) {
		// Default empty constructor: Nothing to do
	}
}