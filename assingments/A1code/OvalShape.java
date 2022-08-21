import java.awt.*;
import java.awt.Point;

class OvalShape extends Shape{

    public OvalShape(){super();}
    public OvalShape(int x_in,int y_in,int width_in,int height_in , int panelWidth_in, int panelHeight_in,Color color_in,PathType path_in){
                super(x_in, y_in, width_in, height_in, panelWidth_in, panelHeight_in, color_in, path_in);

    }

    public void draw(Graphics g) {
        if (inverted) {
            System.out.println("java.awt.Color[r=0,g=0,b=0]");
            System.out.println(toString());
        } else {
            System.out.println(this.color);
            System.out.println(toString());
        }
        
    }

    public boolean contains(Point mousePt) {
        double dx = (2 * mousePt.getX() - this.x -(this.x + width)) / this.width;
        double dy = (2 * mousePt.getY() - this.y - (this.y + height)) / this.height;
        double d = dx * dx + dy * dy;
        if (d < 1) {
            return true;
        } else { return false;}
    }

    public double getArea() {
        double a = height/2 * width/2 * Math.PI;
        return a;
    }
    
}
