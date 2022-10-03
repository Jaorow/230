import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class PhilosophersListDemo extends JFrame {
  JButton addButton, removeButton;
  JTextField nameTextField;
  DefaultListModel<String> listModel;
  JList<String> philosophers;

  public PhilosophersListDemo() {
    String[] array = {"Socrates","Plato","Aristotle","St. Thomas Aquinas","Soren Kierkegaard","Immanuel Kant","Friedrich Nietzsche"};
    listModel = new DefaultListModel<String>();
	for (String n: array) listModel.addElement(n);
    philosophers = new JList<String>(listModel);
    addButton = new JButton("Add");
    removeButton = new JButton("Remove");
    nameTextField = new JTextField("Hannah Arendt");
    addButton.addActionListener(new AddListener());
    removeButton.addActionListener(new RemoveListener());

    JPanel buttonsPanel = new JPanel();
    buttonsPanel.add(nameTextField);
    buttonsPanel.add(addButton);
    buttonsPanel.add(removeButton);
    getContentPane().add(buttonsPanel, BorderLayout.NORTH);
    getContentPane().add(philosophers, BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 300);
    setVisible(true);
  }

class AddListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    listModel.addElement(nameTextField.getText());

  }
}
class RemoveListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    if (philosophers.getSelectedIndex() > -1) {
        listModel.removeElementAt(philosophers.getSelectedIndex());
        
    }
}
}

  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() { new PhilosophersListDemo();}
    });
  }
}