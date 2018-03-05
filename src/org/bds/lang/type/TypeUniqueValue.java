package org.bds.lang.type;

import org.bds.lang.value.Value;

/**
 * A type that does not have values
 *
 * @author pcingola
 *
 */
public class TypeUniqueValue extends Type {

	public TypeUniqueValue(PrimitiveType primitiveType) {
		super(primitiveType);
	}

	@Override
	public boolean canCastTo(Type type) {
		return true;
	}

	/**
	 * Cast a map 'v' to this type
	 */
	@Override
	public Value cast(Value v) {
		return v;
	}

	@Override
	public Object castNativeObject(Object o) {
		throw new RuntimeException("Cannot cast native object '" + o.getClass().getCanonicalName() + "' to type '" + this + "'");
	}

	@Override
	public Value newValue() {
		throw new RuntimeException("Cannot create new map of type '" + primitiveType.toString() + "'");
	}

}
