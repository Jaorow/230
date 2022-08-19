import java.awt.*;
class MySubRectangle{
    protected double sideA,sideB,sideC,sideD;
    public MySubRectangle(){
        sideA = 10;
        sideB = 10;
        sideC = 10;
        sideD = 10;
    }
    public MySubRectangle(Point topLeft,Point bottomRight){
        sideA = bottomRight.x - topLeft.x;
        sideB = bottomRight.x - topLeft.x;
        sideC = bottomRight.y - topLeft.y;
        sideD = bottomRight.y - topLeft.y;
    }

    public double getSideA(){return sideA;}
    public double getSideB(){return sideB;}
    public double getSideC(){return sideC;}
    public double getSideD(){return sideD;}

    public double getArea(){return sideA*sideC;}
    public double getPerimeter(){return sideA+sideB+sideC+sideD;}
    public String toString(){
        String s = String.format("%s(area=%.2f, perimeter=%.2f)",getClass().getName(),getArea(),getPerimeter());
        return s;
    }
}
