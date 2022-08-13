enum PathType{
    BOUNCE, DIAGONAL;
    private static PathType[] values = values();
    public PathType next(){
        return values[(this.ordinal() + 1) % values.length];
    }
}