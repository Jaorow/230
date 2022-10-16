import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

class Song {
  private String title,artist;
  public Song(String title, String artist) {
    this.title = title;
    this.artist = artist;
  }
  public String getTitle() {return this.title;}
  public String getArtist() { return this.artist; }
  public String toString() { return String.format("%s(by %s)", title, artist); }
}

class SongDefaultTreeDemo extends JFrame {
  JTextField titleTextField;
  JTree tree;
  DefaultTreeModel treeModel;
  DefaultMutableTreeNode root;

  public SongDefaultTreeDemo() {
    root =  new DefaultMutableTreeNode("Songs");
    root.add(new DefaultMutableTreeNode(new Song("Kiss The Dirt", "INXS")));
    root.add(new DefaultMutableTreeNode(new Song("Butter", "BTS")));
    root.add(new DefaultMutableTreeNode(new Song("Shape of You", "Ed Sheeran")));
    root.add(new DefaultMutableTreeNode(new Song("Uptown Funk", "Mark Ronson")));
    root.add(new DefaultMutableTreeNode(new Song("Gangnam Style", "PSY")));
    treeModel = new DefaultTreeModel(root);
	tree = new JTree(treeModel);
	tree.addTreeSelectionListener(new MySelectionListener());
   	titleTextField = new JTextField("", 10);
    JPanel buttonsPanel = new JPanel();
    buttonsPanel.add(new JLabel("Title:"));
    buttonsPanel.add(titleTextField);
    getContentPane().add(buttonsPanel, BorderLayout.NORTH);
    getContentPane().add(new JScrollPane(tree), BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600, 200);
    setVisible(true);
  }

  class MySelectionListener implements TreeSelectionListener {
 	public void valueChanged(TreeSelectionEvent e) {
        try {
            DefaultMutableTreeNode object = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
            Song s = (Song) object.getUserObject();
            String title = s.getTitle();
            titleTextField.setText(title);
        } catch (Exception ex) {
            titleTextField.setText("ERROR: Invalid selection!");
        }
     }
  }

  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() { new SongDefaultTreeDemo();}
  	});
  }
}