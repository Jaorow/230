import java.awt.*;
class SquareShape extends RectangleShape{
    public SquareShape(){
        super();
        if (this.width > this.height) {
            this.width = this.height;
        } else {
            this.height = this.width;
        }
    }

    public SquareShape(int x_in,int y_in,int side , int panelWidth_in, int panelHeight_in,Color color_in,PathType path_in){
        super(x_in, y_in, side, side, panelWidth_in, panelHeight_in, color_in, path_in);
    }
}
