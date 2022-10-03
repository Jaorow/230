import java.awt.*;
// import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

enum ShapeType {
  TRIANGLE(3), QUADRILATERAL(4), PENTAGON(5), HEXAGON(6), HEPTAGON(7), OCTAGON(8), NONAGON(9), DECAGON(10);
  private int numOfSides;
  private ShapeType(int s) {
	  numOfSides = s;
  }
  public int getNumOfSides() { return numOfSides; }
}

class ShapeListDemo extends JFrame {
  JLabel resultLabel;
  JList<ShapeType> shapeTypeList;

  public ShapeListDemo() {
	shapeTypeList = new JList<ShapeType>(ShapeType.values());
	resultLabel = new JLabel("The number of sides is ...");
	shapeTypeList.addListSelectionListener(new MyListener());

	JPanel buttonsPanel = new JPanel();
	buttonsPanel.add(resultLabel);
	getContentPane().add(buttonsPanel, BorderLayout.NORTH);
	getContentPane().add(shapeTypeList, BorderLayout.CENTER);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(300, 300);
	setVisible(true);
  }

class MyListener implements ListSelectionListener {
	public void valueChanged(ListSelectionEvent arg0) {
		resultLabel.setText(String.format("The number of sides is %d",shapeTypeList.getSelectedValue().getNumOfSides()));
	}
}
  public static void main(String[] args) {
	javax.swing.SwingUtilities.invokeLater(new Runnable() {
	  public void run() { new ShapeListDemo();}
	});
  }
}


