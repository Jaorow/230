import java.awt.*;

class RectangleShape extends Shape{

    public RectangleShape(){
        super();
    }
    public RectangleShape(int x_in,int y_in,int width_in,int height_in , int panelWidth_in, int panelHeight_in,Color color_in,PathType path_in){
        super(x_in, y_in, width_in, height_in, panelWidth_in, panelHeight_in, color_in, path_in);
    }
    public void draw(Graphics g){
        if (inverted) {
            System.out.println("java.awt.Color[r=0,g=0,b=0]");
            System.out.println(toString());
        } else {
            System.out.println(this.color);
            System.out.println(toString());
        }
    }
    public boolean contains(Point mousePt){
        if (mousePt.getX() >= this.x &&  mousePt.getY() >= this.y && mousePt.getX() <= this.x + width && mousePt.getY() <= this.y + height){
            return true;
        }else{return false;}
    }
    public double getArea(){return this.width * this.height;}
}
