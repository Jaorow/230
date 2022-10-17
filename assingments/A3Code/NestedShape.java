/*
 * ==========================================================================================
 * NestedShape.java : a class to create and eddit nested shapes 
 * YOUR UPI: JDUN349
 * ==========================================================================================
 */


import java.util.ArrayList;
import java.awt.*;

class NestedShape extends RectangleShape {
    private ArrayList<Shape> innerShapes = new ArrayList<Shape>();

    public NestedShape(){
        createInnerShape(0, 0, this.width/2, this.height/2, this.color, PathType.BOUNCE, ShapeType.RECTANGLE);
    }

    public NestedShape(int x, int y, int w, int h, int pw, int ph, Color c, PathType pt) {
        super(x, y, w, h, pw, ph, c, pt);
        this.createInnerShape(0, 0, w/2, h/2, c, pt, ShapeType.RECTANGLE);
    }

    public NestedShape(int width, int height){
        super(0, 0, width, height , DEFAULT_PANEL_WIDTH , DEFAULT_PANEL_HEIGHT, Color.black, PathType.BOUNCE);
    }

    public Shape createInnerShape(int x, int y, int w, int h, Color c, PathType pt, ShapeType st){
        Shape shape = null;
        switch(st) {
			case RECTANGLE: {
				shape = new RectangleShape(x, y, w, h, width, height, c, pt);
				break;
			} case OVAL: {
				shape = new OvalShape(x, y, w, h, width, height, c, pt);
				break;
			} case NESTED: {
				shape = new NestedShape(x, y, w, h, width, height, c, pt);
				break;
			}
		}
        shape.setParent(this);
        
        innerShapes.add(shape);
        return shape;
    }

    public int getSize() {
		return innerShapes.size();
	}

	public Shape getInnerShapeAt(int index) {
		return innerShapes.get(index);
	}

    public int indexOf(Shape s){
        return innerShapes.indexOf(s);
    }

    public void addInnerShape(Shape s){
        s.setParent(this);
        innerShapes.add(s);
    }

    public void removeInnerShape(Shape s){
        s.setParent(null);
        innerShapes.remove(s);
    }

    public void removeInnerShapeAt(int index){
        getInnerShapeAt(index).setParent(null);
        innerShapes.remove(index);
    }

    public ArrayList<Shape> getAllInnerShapes(){
        return innerShapes;
    }

    public void setColor(Color c){
        this.color = c;
        for (Shape shape : innerShapes) {
            shape.color = c;
        }
    }

    public void draw(Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(x, y, width, height);
        g.translate(x, y);
        for (Shape shape : innerShapes) {
            shape.draw(g);
        }
        g.translate(-x, -y);
    }
    public void move(){
        super.move();
        for (Shape shape : innerShapes) {
            shape.move();
        }
    }

}
