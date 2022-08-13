enum ShapeType{
    RECTANGLE, SQUARE, OVAL, KITE;
    private static ShapeType[] values = values();
    public ShapeType next(){
        return values[(this.ordinal() + 1) % 4];
    }
}
