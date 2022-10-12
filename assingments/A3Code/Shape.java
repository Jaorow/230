/* ==============================================
 *  Shape.java : The superclass of all shapes.
 *  A shape defines various properties, including selected, colour, width and height.
 *  YOUR UPI: ANSWER
 *  ===============================================================================
 */
import java.awt.*;
abstract class Shape {
    public static final PathType DEFAULT_PATHTYPE = PathType.BOUNCE;
    public static final ShapeType DEFAULT_SHAPETYPE = ShapeType.RECTANGLE;
    public static final int DEFAULT_X = 0, DEFAULT_Y = 0, DEFAULT_WIDTH=80, DEFAULT_HEIGHT=60, DEFAULT_PANEL_WIDTH=600, DEFAULT_PANEL_HEIGHT=800;
    public static final Color DEFAULT_COLOR=Color.orange;
    public int x, y, width=DEFAULT_WIDTH, height=DEFAULT_HEIGHT, panelWidth=DEFAULT_PANEL_WIDTH, panelHeight=DEFAULT_PANEL_HEIGHT; // the bouncing area
    protected MovingPath path = new BouncingPath(1, 2);            // the moving path
    protected Color color=DEFAULT_COLOR;
    protected boolean selected = false;    // draw handles if selected

	//A3 Add parent, getParent, setParent, getPath etc
    protected NestedShape parent;

    public NestedShape getParent(){
        return this.parent;
    }
    public void setParent(NestedShape s){
        this.parent = s;
    }
    public Shape[] getPath(){
        return getPathToRoot(this, 0);
    }

    public Shape[] getPathToRoot(Shape aShape, int depth) {
        Shape[] returnShapes;
        if (aShape == null) {
          if(depth == 0) return null;
          else returnShapes = new Shape[depth];
        }
        else {
          depth++;
          returnShapes = getPathToRoot(aShape.getParent(), depth);
          returnShapes[returnShapes.length - depth] = aShape;
        }
        return returnShapes;
      }
      


    public Shape() {}
    public Shape(int x, int y, int w, int h, int pw, int ph, Color c, PathType pt) {
        this.x = x;
        this.y = y;
        panelWidth = pw;
        panelHeight = ph;
        width = w;
        height = h;
        color = c;
		switch (pt) {
			case BOUNCE : {
				path = new BouncingPath(1, 2);
				break;
			} case FALL: {
				path = new FallingPath(2);
				break;
			}
		}
    }
    public String toString() {
		return String.format("%s,(x=%d,y=%d,w=%d,h=%d,pw=%d,ph=%d,c=%s,path=%s", this.getClass().getName(),x,y,width,height,panelWidth,panelHeight,color,path);
	}
    
    public int getX() { return this.x; }
	public void setX(int x) { this.x = x; }
    public int getY() { return this.y;}
	public void setY(int y) { this.y = y; }
	public int getWidth() { return width; }
	public int getHeight() {return height; }
    public boolean isSelected() { return selected; }
    public void setSelected(boolean s) { selected = s; }
	public Color getColor() { return color; }
    public void setColor(Color fc) { color = fc; }
    public void setPanelSize(int w, int h) {
		panelWidth = w;
		panelHeight = h;
	}
    public void drawHandles(Graphics g) {
	 if (isSelected()) {
		 g.setColor(Color.black);
		 g.fillRect(x -2, y-2, 4, 4);
		 g.fillRect(x + width -2, y + height -2, 4, 4);
		 g.fillRect(x -2, y + height -2, 4, 4);
		 g.fillRect(x + width -2, y-2, 4, 4);
	}
    }
    public abstract boolean contains(Point p);
    public abstract void draw(Graphics g);

    public void move() {
        path.move();
    }
    /* Inner class ===================================================================== Inner class
     *    MovingPath : The superclass of all paths. It is an inner class.
     *    A path can change the current position of the shape.
     *    =============================================================================== */
    abstract class MovingPath {
        protected int deltaX, deltaY; // moving distance
        public MovingPath(int dx, int dy) { deltaX=dx; deltaY=dy; }
        public MovingPath() { }
        public abstract void move();
        public String toString() { return getClass().getSimpleName(); };
    }
    class BouncingPath extends MovingPath {
        public BouncingPath(int dx, int dy) {
            super(dx, dy);
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
    class FallingPath extends MovingPath {
		public FallingPath(int dy) {
			deltaY = dy;
		 }
		public void move() {
			 y = y + deltaY;
			 if(y + height > panelHeight) {
				 y = 0;
			 }
		}
    }

}