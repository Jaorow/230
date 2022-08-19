import java.awt.*;

class MyRectangle extends MyQuadrilateral{

    public MyRectangle(){
        sideA = 10;       
        sideB = 10;
        sideC = 10;
        sideD = 10;
        height = 10;  
}

    public MyRectangle(Point topLeft,Point bottomRight){
        this.sideA = bottomRight.x - topLeft.x;
        this.sideB = bottomRight.x - topLeft.x;
        this.sideC = bottomRight.y - topLeft.y;
        this.sideD = bottomRight.y - topLeft.y;
        this.height = bottomRight.y - topLeft.y;
    }

    public double getArea(){return sideA*sideC;}

}
