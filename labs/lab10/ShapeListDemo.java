import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class ShapeListDemo extends JFrame {
  JButton colourButton, nameButton;
  DefaultListModel<String> listModel;
  JList<String> list;
  String[] colours = new String[]{"Red", "Orange", "Yellow"}, names = new String[]{"Michael", "Anna", "John", "David"};

  public ShapeListDemo() {
    listModel = new DefaultListModel<String>();
	for (String n: colours) listModel.addElement(n);
    list = new JList<String>(listModel);
    colourButton = new JButton("Colours");
    nameButton = new JButton("Names");
    colourButton.addActionListener(new ColourListener());
    nameButton.addActionListener(new NameListener());

    JPanel buttonsPanel = new JPanel();
    buttonsPanel.add(colourButton);
    buttonsPanel.add(nameButton);
    getContentPane().add(buttonsPanel, BorderLayout.NORTH);
    getContentPane().add(list, BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 300);
    setVisible(true);
  }

class ColourListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    listModel.clear();
    for (String string : colours) {
      listModel.addElement(string);
    }
  }
}
class NameListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    listModel.clear();
    for (String string : names) {
      listModel.addElement(string);
    }
   }
}

  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() { new ShapeListDemo();}
    });
  }
}