class MyRectangle{
    private int height,width;
    public MyRectangle(){
        height = 1;
        width = 1;
    }

    public MyRectangle(int h,int w){
        height = h;
        width = w;
    }

    public int getArea(){
        return width*height;
    }
    public int getPerimeter(){
        return 2*(width+height);
    }

    public String toString(){
        String str = String.format("MyRectangle, area=%d, perimeter=%d", getArea(),getPerimeter());
        return str;
    }










}