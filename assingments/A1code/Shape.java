/*
 *    ===============================================================================
 *    Shape.java : The superclass of all shapes.
 *    A shape defines various properties, including selected, colour, width and height.
 *    YOUR UPI: ANSWER
 *    ===============================================================================
 */
import java.awt.*;
abstract class Shape {
    public static final int DEFAULT_PATHTYPE = 0;
    public static final int DEFAULT_SHAPETYPE = 0;
    public static final int DEFAULT_X = 0, DEFAULT_Y = 0, DEFAULT_WIDTH=80, DEFAULT_HEIGHT=60, DEFAULT_PANEL_WIDTH=600, DEFAULT_PANEL_HEIGHT=800;
    public static final Color DEFAULT_COLOR=Color.orange;
    public int x, y, width=DEFAULT_WIDTH, height=DEFAULT_HEIGHT, panelWidth=DEFAULT_PANEL_WIDTH, panelHeight=DEFAULT_PANEL_HEIGHT; // the bouncing area
    protected MovingPath path = new BouncingPath(1, 2);            // the moving path
    protected Color color = DEFAULT_COLOR; // the border colour
    protected boolean selected = false, inverted = false;    // draw handles if selected, invert color

	//constructors

    public void move() {
		//complete the move() method
    }

	//tostring() method

	//3 abstract methods
	public abstract void draw(Graphics g);

 	public int getX() { return this.x; }
    public int getY() { return this.y;}
    public int getWidth() { return width; }
    public int getHeight() {return height; }
	public Color getColor() { return color; }
    public void setColor(Color fc) { color = fc; }
    public boolean isSelected() { return selected; }
    public void setSelected(boolean s) { selected = s; }
    public boolean getInverted() { return inverted; }

    public void resetPanelSize(int w, int h) {
		panelWidth = w;
		panelHeight = h;
	}
 	public void drawHandles(Graphics obj) {
		Graphics2D g = (Graphics2D) obj;
        if (selected) {
			System.out.println("Draw 4 handles");
        }
    }
    /* Inner class ===================================================================== Inner class
     *    MovingPath : The superclass of all paths. It is an inner class.
     *    A path can change the current position of the shape.
     *    =============================================================================== */
    abstract class MovingPath {
        protected int deltaX, deltaY; // moving distance
        public MovingPath() { }
        public abstract void move();
    }
    class BouncingPath extends MovingPath {
        public BouncingPath(int dx, int dy) {
            deltaX = dx;
            deltaY = dy;
         }
        public void move() {
             x = x + deltaX;
             y = y + deltaY;
             if ((x < 0) && (deltaX < 0)) {
                 deltaX = -deltaX;
                 x = 0;
             }
             else if ((x + width > panelWidth) && (deltaX > 0)) {
                 deltaX = -deltaX;
                 x = panelWidth - width;
             }
             if ((y< 0) && (deltaY < 0)) {
                 deltaY = -deltaY;
                 y = 0;
             }
             else if((y + height > panelHeight) && (deltaY > 0)) {
                 deltaY = -deltaY;
                 y = panelHeight - height;
             }
        }
    }
}