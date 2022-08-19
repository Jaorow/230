import java.awt.*;

class MySquare extends MyRectangle{

    public MySquare(){
        this.sideA = 10;
        this.sideB = 10;
        this.sideC = 10;
        this.sideD = 10;
        this.height = 10;
    }

    public MySquare(Point topLeft,Point bottomRight){
        super(topLeft,bottomRight);

    }
    public double getArea(){return sideA*sideB;}
}
