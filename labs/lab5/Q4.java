import java.awt.*;
class MySubTrapezoid extends MySubRectangle{
    protected double height;
    protected double sideA, sideB, sideC, sideD;
 
    public MySubTrapezoid(){
        height = 10; 
        sideA = 10 ; sideB = 10; sideC = 10; sideD = 10;
    }

    public MySubTrapezoid(Point p1, Point p2,Point p3,Point p4){
        sideA = p2.x-p1.x;
        sideB = p4.x - p3.x;
        sideC = Point.distance(p1.x, p1.y, p3.x, p3.y);
        sideD = Point.distance(p2.x, p2.y, p4.x, p4.y);
        height = p3.y - p1.y;
    }
    public double getSideA(){return sideA;}
    public double getSideB(){return sideB;}
    public double getSideC(){return sideC;}
    public double getSideD(){return sideD;}
    public double getArea(){
        return (sideA + sideB) / 2*height;
    }
    public double getPerimeter(){
        return sideA + sideB + sideC + sideD;
    } 
}