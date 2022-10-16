import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import java.util.*;

class TreeDemo extends JFrame {
  JButton expandButton, collapseButton, selectButton;
  JTextField rowTextField, rowsTextField;
  JTree tree;
  DefaultMutableTreeNode root;

  public TreeDemo() {
    root =  new DefaultMutableTreeNode("Root");
    Integer[] array111 = new Integer[]{ 1111, 1112};
	Integer[] array112 = new Integer[]{ 1121, 1122};
	DefaultMutableTreeNode node111 = new DefaultMutableTreeNode(new Integer(111));
	for (Integer i: array111)
	  node111.add(new DefaultMutableTreeNode( new Integer(i)));
	DefaultMutableTreeNode node112 = new DefaultMutableTreeNode(new Integer(112));
	for (Integer i: array112)
  		node112.add(new DefaultMutableTreeNode( new Integer(i)));
  	DefaultMutableTreeNode node11 = new DefaultMutableTreeNode(new Integer(11));
  	node11.add(node111); node11.add(node112);
  	root.add(node11);
  	Integer[] array12 = new Integer[]{ 121, 122};
	DefaultMutableTreeNode node12 = new DefaultMutableTreeNode(new Integer(12));
	for (Integer i: array12)
		node12.add(new DefaultMutableTreeNode( new Integer(i)));
	root.add(node12);

	tree = new JTree(root);
	tree.addTreeSelectionListener(new MySelectionListener());
   	rowTextField = new JTextField("1", 10);
   	rowsTextField = new JTextField("[]", 10);
   	expandButton = new JButton("Expand");
   	collapseButton = new JButton("Collapse");
   	selectButton = new JButton("Select");
   	expandButton.addActionListener(new ExpandListener());
   	collapseButton.addActionListener(new CollapseListener());
   	selectButton.addActionListener(new SelectListener());
    JPanel buttonsPanel = new JPanel();
    buttonsPanel.add(new JLabel("Row:"));
    buttonsPanel.add(rowTextField);
    buttonsPanel.add(expandButton);
    buttonsPanel.add(collapseButton);
    buttonsPanel.add(selectButton);
    buttonsPanel.add(new JLabel("Selection rows:"));
    buttonsPanel.add(rowsTextField);
    getContentPane().add(buttonsPanel, BorderLayout.NORTH);
    getContentPane().add(new JScrollPane(tree), BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800, 400);
    setVisible(true);
  }
  class MySelectionListener implements TreeSelectionListener {
 	public void valueChanged(TreeSelectionEvent e) {
     }
  }
  
  class SelectListener implements ActionListener {
    public void actionPerformed(ActionEvent e) { //remove from root
        tree.setSelectionRow(Integer.parseInt(rowTextField.getText()));

    }
  }
  class ExpandListener implements ActionListener {
    public void actionPerformed(ActionEvent e) { //remove from root
        tree.expandRow(Integer.parseInt(rowTextField.getText()));
    }
  }
  class CollapseListener implements ActionListener {
    public void actionPerformed(ActionEvent e) { //remove from root
        tree.collapseRow(Integer.parseInt(rowTextField.getText()));
    }
  }
  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() { new TreeDemo();}
  	});
  }
}