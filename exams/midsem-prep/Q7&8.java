import java.awt.*;
class MyCircle{
    private Point centre;
    private int radius;
    public MyCircle(){
        this.centre = new Point(0,0);
        this.radius = 1;
    }
    public MyCircle(int x, int y, int r){
        this.centre = new Point(x,y);
        this.radius = r;
    }
    public String toString(){
        return String.format("Circle at (%d, %d), radius=%d",this.centre.x,this.centre.y,this.radius);
    }
    public boolean contains(Point other){
    if (other.distance(this.centre)<this.radius) {
        return true;
    }else{return false;}
        
    }
}

class MySubCircle extends Point{

    private int radius;

    public MySubCircle(){
        super();
    }

    public MySubCircle(int x, int y, int r){
        new Point(x,y);
        this.radius = r;}

    public boolean contains(Point other){
    if (other.distance(this.centre)<this.radius) {
        return true;
    }else{return false;}


}
