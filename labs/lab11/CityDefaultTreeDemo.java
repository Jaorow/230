import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import java.util.*;

class CityDefaultTreeDemo extends JFrame {
  JButton addButton, removeButton;
  JTextField nameTextField, districtTextField;
  JTree tree;
  DefaultTreeModel treeModel;
  DefaultMutableTreeNode root;


  public CityDefaultTreeDemo() {
        root =  new DefaultMutableTreeNode("Cities");
        String[] akl = new String[]{"Auckland City", "Franklin", "Manukau City", "North Shore City"};
        String[] wlg = new String[]{"Carterton", "Masterton", "Upper Hutt", "Lower Hutt", "Wellington"};
        // root.add(createTreeNode("Auckland",akl));
        //root.add(createTreeNode("Wellington",wlg));

        //DefaultMutableTreeNode ak = createTreeNode("Auckland",akl);
        treeModel = new DefaultTreeModel(root);
        tree = new JTree(treeModel);
        nameTextField = new JTextField("Canterbury", 10);
        districtTextField = new JTextField("Ashburton", 10);
        addButton = new JButton("Add");
        removeButton = new JButton("Remove");
        //addButton.addActionListener(new AddListener());
        //removeButton.addActionListener(new RemoveListener());
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.add(new JLabel("Enter:"));
        buttonsPanel.add(nameTextField);
        buttonsPanel.add(districtTextField);
        buttonsPanel.add(addButton);
        buttonsPanel.add(removeButton);
        getContentPane().add(buttonsPanel, BorderLayout.NORTH);
        getContentPane().add(new JScrollPane(tree), BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setVisible(true);
    }

    public DefaultMutableTreeNode createTreeNode(String name, String[] array){
        DefaultMutableTreeNode city = new DefaultMutableTreeNode();
        for (String string : array) {
            DefaultMutableTreeNode district = new DefaultMutableTreeNode(string);
            city.add(district);
        }
        return city;
    }

    class AddListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            DefaultMutableTreeNode node = createTreeNode(nameTextField.getText(), new String[]{districtTextField.getText()});
            treeModel.insertNodeInto(node, root, treeModel.getChildCount(node));
        }
    }
    class RemoveListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            try {
            Object n = tree.getLastSelectedPathComponent();
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) n;
            if (! node.isRoot()) {
                treeModel.removeNodeFromParent(node);
            }else{
                nameTextField.setText("ERROR: Do not remove the root!");
            }} catch (Exception j) {
                nameTextField.setText("ERROR: Invalid selection!");
            }
        }
        
    }

  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() { new CityDefaultTreeDemo();}
  	});
  }
}
