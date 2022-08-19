import java.awt.*;
class MyParallelogram extends MyQuadrilateral{

    public MyParallelogram(){super();}

    public MyParallelogram(Point p1, Point p2,Point p3){
        this.sideA = p2.x-p1.x;
        this.sideB = sideA;
        this.sideC = Point.distance(p1.x, p1.y, p3.x, p3.y);
        this.sideD = sideC;
        this.height = p3.y-p1.y;
    }

    public double getArea(){return sideA * height;}
} 