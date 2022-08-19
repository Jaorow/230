import java.awt.*;
class MySubParallelogram extends MySubRectangle{
    private double height;
    protected double sideA, sideB, sideC, sideD;
    
    public MySubParallelogram(){
        height = 10; 
        sideA = 10 ; sideB = 10; sideC = 10; sideD = 10;
    }
    public MySubParallelogram(Point p1, Point p2,Point p3){
    sideA = p2.x-p1.x;
    sideB = sideA;
    sideC = Point.distance(p1.x, p1.y, p3.x, p3.y);
    sideD = sideC;
    height = p3.y-p1.y;
    }

    public double getArea(){return sideA * height;}
    public double getPerimeter(){return 2*sideA + sideC;}

    public double getSideA(){return sideA;}
    public double getSideB(){return sideB;}
    public double getSideC(){return sideC;}
    public double getSideD(){return sideD;}

}