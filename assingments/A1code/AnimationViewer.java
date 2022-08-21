/*
 * ==========================================================================================
 *  AnimationPanel.java : Moves shapes around on the screen according to different paths.
 *  It is the main drawing area where shapes are added and manipulated.
 *  YOUR UPI: Jdun349
 *  =========================================================================================
 */


import java.awt.*;
import java.util.ArrayList;

class AnimationViewer  {
		private ArrayList<Shape> shapes = new ArrayList<Shape>(); //create the ArrayList to store shapes
		private ShapeType currentShapeType=Shape.DEFAULT_SHAPETYPE; // the current shape type,
		private PathType currentPathType=Shape.DEFAULT_PATHTYPE;  // the current path type
		private Color currentColor=Shape.DEFAULT_COLOR;  // the current fill colour of a shape
		private int currentPanelWidth=Shape.DEFAULT_PANEL_WIDTH, currentPanelHeight = Shape.DEFAULT_PANEL_HEIGHT, currentWidth=Shape.DEFAULT_WIDTH, currentHeight=Shape.DEFAULT_HEIGHT;

		protected void createNewShape(int x, int y) {

				switch(currentShapeType){
					case SQUARE:
							int side;
					        if (currentWidth > currentHeight) {
								side = currentHeight;
							} else {
								side = currentWidth;
							}
						SquareShape s = new SquareShape(x, y, side, currentPanelWidth, currentPanelHeight, currentColor, currentPathType);
						shapes.add(s);
						break;
					case RECTANGLE:
						RectangleShape r = new RectangleShape(x, y, currentWidth, currentHeight, currentPanelWidth, currentPanelHeight, currentColor, currentPathType);
						shapes.add(r);
						break;
					
					case OVAL:
						OvalShape o = new OvalShape(x, y, currentWidth, currentHeight, currentPanelWidth, currentPanelHeight, currentColor, currentPathType);
						shapes.add(o);
						break;
					
					case KITE:
						KiteShape k = new KiteShape(x, y, currentWidth, currentHeight, currentPanelWidth, currentPanelHeight, currentColor, currentPathType);
						shapes.add(k);
						break;
						
					default:
						break;
				}
			
				this.currentShapeType = currentShapeType.next();				
				this.currentPathType = currentPathType.next();

	}
	
	public AnimationViewer() {}
		public void setCurrentWidth(int w) {currentWidth=w;}
		public void setCurrentHeight(int h) {currentHeight=h;}
		public void setPanelWidth(int w) {currentPanelHeight=w;}
		public void setPanelHeight(int h) {currentPanelHeight=h;}
		public void setCurrentColor(Color c){currentColor = c;}

		public void paintComponent(Graphics g) {
		for (Shape currentShape: shapes) {
			currentShape.move();
			currentShape.draw(g);
			currentShape.drawHandles(g);
		}
		}
}