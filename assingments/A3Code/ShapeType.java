/*
 *	===============================================================================
 *	ShapeType represents the type of a shape
 *  YOUR UPI: JDUN349
 *	=============================================================================== */

enum ShapeType { RECTANGLE, OVAL, NESTED;
	public ShapeType next() {
		return values()[(ordinal() + 1) % values().length];
	}
}