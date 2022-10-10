/*
 *	===============================================================================
 *	PathType represents the type of a path
 *  YOUR UPI:
 *	=============================================================================== */

enum PathType { BOUNCE, FALL;
	public PathType next() {
		return values()[(ordinal() + 1) % values().length];
	}
}
