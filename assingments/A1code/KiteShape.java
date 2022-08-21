import java.awt.*;
import java.util.Arrays;

class KiteShape extends Shape{
    Polygon poly;

    public KiteShape(){super();
        int[] x_list = {this.x+(this.width/2), this.x+ this.width, this.x+(this.width/2),this.x};
        int[] y_list = {this.y, this.y + (this.height/3), this.y+height, this.y + (this.height/3)};
        poly = new Polygon(x_list,y_list,x_list.length);

        }

    public KiteShape(int x_in,int y_in,int width_in,int height_in , int panelWidth_in, int panelHeight_in,Color color_in,PathType path_in){
        super(x_in, y_in, width_in, height_in, panelWidth_in, panelHeight_in, color_in, path_in);
        int[] x_list = {this.x+(this.width/2), this.x+ this.width, this.x+(this.width/2),this.x};
        int[] y_list = {this.y, this.y + (this.height/3), this.y+height, this.y + (this.height/3)};
        poly = new Polygon(x_list,y_list,x_list.length);

    }
    public void printCoordinates(){
        int[] x_list = {this.x+(this.width/2), this.x+ this.width, this.x+(this.width/2),this.x};
        int[] y_list = {this.y, this.y + (this.height/3), this.y+height, this.y + (this.height/3)};
        System.out.printf("%s\n%s\n",Arrays.toString(x_list),Arrays.toString(y_list));
        
    }

    public void draw(Graphics g) {
        if (inverted) {
            System.out.println("java.awt.Color[r=0,g=0,b=0]");
            System.out.println(toString());
        } else {
            System.out.println(this.color);
            System.out.println(toString());
        }

        int[] x_list = {this.x+(this.width/2), this.x+ this.width, this.x+(this.width/2),this.x};
        int[] y_list = {this.y, this.y + (this.height/3), this.y+height, this.y + (this.height/3)};
        poly = new Polygon(x_list,y_list,x_list.length);

    }

    public boolean contains(Point mousePt) {
        return poly.contains(mousePt);
    }

    public double getArea(){
        return (this.height*this.width)/2;
    }
}
