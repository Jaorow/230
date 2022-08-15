import java.awt.*;

class MySubSquare extends MySubRectangle{
    public MySubSquare(){
        sideA = 10;
        sideB = 10;
        sideC = 10;
        sideD = 10;
    }
    public MySubSquare(Point topLeft,Point bottomRight){
        sideA = bottomRight.x - topLeft.x;
        sideB = bottomRight.x - topLeft.x;
        sideC = bottomRight.y - topLeft.y;
        sideD = bottomRight.y - topLeft.y;
    }

}