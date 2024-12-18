/*
 * ==========================================================================================
 * AnimationViewer.java : Moves shapes around on the screen according to different paths.
 * It is the main drawing area where shapes are added and manipulated.
 * YOUR UPI: Jdun349
 * ==========================================================================================
 */

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.tree.*;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.event.ListDataListener;
import java.lang.reflect.Field;

class AnimationViewer extends JComponent implements Runnable, TreeModel {
	private Thread animationThread = null;		// the thread for animation
	private static int DELAY = 120;				 // the current animation speed
	private ShapeType currentShapeType=Shape.DEFAULT_SHAPETYPE; // the current shape type,
	private PathType currentPathType=Shape.DEFAULT_PATHTYPE;	// the current path type
	private Color currentColor=Shape.DEFAULT_COLOR; // the current fill colour of a shape
	private int currentPanelWidth=Shape.DEFAULT_PANEL_WIDTH, currentPanelHeight = Shape.DEFAULT_PANEL_HEIGHT, currentWidth=Shape.DEFAULT_WIDTH, currentHeight=Shape.DEFAULT_HEIGHT;
	
	private NestedShape root;

	public AnimationViewer() {
		root = new NestedShape(currentPanelWidth,currentPanelHeight);
		start();
		addMouseListener(new MyMouseAdapter());
	}

	
	public NestedShape getRoot(){
		return this.root;
	}


	class MyMouseAdapter extends MouseAdapter {
		public void mouseClicked( MouseEvent e ) {
			boolean found = false;
			for ( Shape currentShape: root.getAllInnerShapes() )
				if ( currentShape.contains( e.getPoint() ) ) { 
					// if the mousepoint is within a shape, then set the shape to be selected/deselected
					currentShape.setSelected( ! currentShape.isSelected() );
					found = true;
				}
			if (!found){
				// createNewShape(e.getX(), e.getY());
				Shape s = root.createInnerShape(e.getX(), e.getY(), currentWidth,currentHeight, currentColor, currentPathType, currentShapeType);
				insertNodeInto(s, root);
			}
		}
	}
	public void setCurrentColor(Color bc) {
		currentColor = bc;
		for (Shape currentShape: root.getAllInnerShapes())
			if ( currentShape.isSelected())
				currentShape.setColor(currentColor);
	}
	public final void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Shape currentShape: root.getAllInnerShapes()) {
		currentShape.move();
		currentShape.draw(g);
		currentShape.drawHandles(g);
		}
	}
	public void resetMarginSize() {
		currentPanelWidth = getWidth();
		currentPanelHeight = getHeight() ;
		for (Shape currentShape: root.getAllInnerShapes())
			currentShape.setPanelSize(currentPanelWidth,currentPanelHeight );
	}


	public boolean isLeaf(Object node){
		return !(node instanceof NestedShape);
	}

	public boolean isRoot(Shape selectedNode){
		Shape[] s = selectedNode.getPath();
		if (s.length == 1){
			return true;
		}
		return false;
	}

	public Shape getChild(Object parent, int index){
		try {
			if ((parent instanceof NestedShape)) {
				return ((NestedShape) parent).getInnerShapeAt(index);
			}
		} catch (Exception e){ return null; }
		return null;
	}
	public int getIndexOfChild(Object parent, Object child){
		try {
			if ((parent instanceof NestedShape)) {
				NestedShape p = (NestedShape) parent;
				return p.indexOf((Shape) child);
			}
		} catch (Exception e){ return -1; }
		return -1;
	}

	public int getChildCount(Object parent){
		int count = 0;
		if ((parent instanceof NestedShape)) {
			NestedShape p = (NestedShape) parent;
			boolean end = false;
			int index = p.indexOf(p);
			
			while (end == false) {
				try {
					p.getInnerShapeAt(index+1);
					count ++;
					index ++;					
				} catch (Exception e) {
					end = true;
					return count;
				}
			}
			return count;
		}		
		return count;
	}

	private ArrayList<TreeModelListener> treeModelListeners = new ArrayList<TreeModelListener>();


	public void addTreeModelListener(final TreeModelListener tml){
		treeModelListeners.add(tml);
	}

	public void removeTreeModelListener(final TreeModelListener tml){
		treeModelListeners.remove(tml);
	}

	public void valueForPathChanged(TreePath path, Object newValue){}

	public void fireTreeNodesInserted(Object source, Object[] path,int[] childIndices,Object[] children){
		TreeModelEvent tme = new TreeModelEvent(source, path,childIndices,children);
		for (TreeModelListener  listner: treeModelListeners) {
			listner.treeNodesInserted(tme);
		}
	}

	public void insertNodeInto(Shape newChild, NestedShape parent){
		fireTreeNodesInserted(this, parent.getPath(), new int[]{getIndexOfChild(parent, newChild)},new Object[]{newChild});
	}

	public void addShapeNode(NestedShape selectedNode){
		if(isRoot(selectedNode)){
			Shape s = selectedNode.createInnerShape(0, 0, currentWidth,currentHeight, currentColor, currentPathType, currentShapeType);
			this.insertNodeInto(s, selectedNode);
		}else{
			Shape s = selectedNode.createInnerShape(0, 0, currentWidth/2,currentHeight/2, currentColor, currentPathType, currentShapeType);
			this.insertNodeInto(s, selectedNode);
		}
	}

	public void fireTreeNodesRemoved(Object source, Object[] path, int[] childIndices,Object[] children){
		TreeModelEvent tme = new TreeModelEvent(source, path,childIndices,children);
		for (TreeModelListener tml : treeModelListeners) {
			tml.treeNodesRemoved(tme);
		}
	}

	public void removeNodeFromParent(Shape selectedNode){
		NestedShape p = selectedNode.getParent();
		int[] index = new int[]{p.indexOf(selectedNode)};
		p.removeInnerShape(selectedNode);
		fireTreeNodesRemoved(this, p.getPath(), index, new Object[]{selectedNode});
	}
	

	// you don't need to make any changes after this line ______________
	public void setCurrentShapeType(ShapeType value) { currentShapeType = value; }
	public void setCurrentPathType(PathType value) { currentPathType = value; }
	public ShapeType getCurrentShapeType() { return currentShapeType; }
	public PathType getCurrentPathType() { return currentPathType; }
	public int getCurrentWidth() { return currentWidth; }
	public int getCurrentHeight() { return currentHeight; }
	public Color getCurrentColor() { return currentColor; }
	public void update(Graphics g){ paint(g); }
	public void start() {
		animationThread = new Thread(this);
		animationThread.start();
	}
	public void stop() {
		if (animationThread != null) {
			animationThread = null;
		}
	}
	public void run() {
		Thread myThread = Thread.currentThread();
		while(animationThread==myThread) {
			repaint();
			pause(DELAY);
		}
	}
	private void pause(int milliseconds) {
		try {
			Thread.sleep((long)milliseconds);
		} catch(InterruptedException ie) {}
	}
}
