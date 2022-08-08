class  MyParallelogram{
    private int sideA,sideB,angle;

    public MyParallelogram(){
        sideA = 1;sideB = 1;angle = 30;
    }
    public MyParallelogram(int A, int B,int D){
        sideA = A;sideB=B;angle=D;
    }
    public double getArea(){
        double ang = Math.toRadians(angle);
        return sideA*sideB*Math.sin(ang);
    }
    public int getPerimeter(){
    return 2*(sideA+sideB);
    }
    public String toString(){
        String str = String.format("MyParallelogram, area=%.2f, perimeter=%d",getArea(),getPerimeter());
        return str;
    }

}