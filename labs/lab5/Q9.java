import java.awt.*;
class MyTrapezoid extends MyQuadrilateral{

    public MyTrapezoid(){super();}

    public MyTrapezoid(Point p1, Point p2,Point p3,Point p4){
        sideA = p2.x-p1.x;
        sideB = p4.x - p3.x;
        sideC = Point.distance(p1.x, p1.y, p3.x, p3.y);
        sideD = Point.distance(p2.x, p2.y, p4.x, p4.y);
        height = p3.y - p1.y;
    }

    public double getArea(){return (sideA + sideB) / 2*height;}
}