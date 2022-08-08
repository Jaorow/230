class MySquare{
    private int side;

    public MySquare(){
        side = 1;
    }
    public MySquare(int len){
        side = len;
    }
    public int getArea(){
        int va = (int) Math.pow(side, 2);
    return va;
    }
    public int getPerimeter(){
        return (side*4);
    }
    public String toString(){
        String str = String.format("MySquare, area=%d, perimeter=%d",getArea(),getPerimeter());
        return str;
    }








}