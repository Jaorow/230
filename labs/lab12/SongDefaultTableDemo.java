import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import javax.swing.table.*;
public class SongDefaultTableDemo extends JFrame  {
  JTable table;
  JButton addButton, removeButton;
  JTextField nameTextField, artistTextField;
  DefaultTableModel tableModel;
  public SongDefaultTableDemo() {
    String[] columnNames = new String[]{"Name", "Artist"};
    tableModel = new DefaultTableModel(new String[][] {
	    { "Kiss The Dirt", "INXS" }, { "Butter", "BTS" }, { "Shape of You", "Ed Sheeran" }}, columnNames);
    table = new JTable(tableModel );
    nameTextField = new JTextField("Gangnam Style", 10);
	artistTextField = new JTextField("PSY", 10);
    addButton = new JButton("Add");
    removeButton = new JButton("Remove");
	addButton.addActionListener(new AddListener());
	removeButton.addActionListener(new RemoveListener());
    JPanel buttonsPanel = new JPanel();
    buttonsPanel.add(nameTextField);
    buttonsPanel.add(artistTextField);
    buttonsPanel.add(addButton);
    buttonsPanel.add(removeButton);
    getContentPane().add(buttonsPanel, BorderLayout.NORTH);
    getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 400);
    setVisible(true);
  }

  class AddListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        tableModel.addRow(new String[]{nameTextField.getText(), artistTextField.getText()});        
    }
  }

  class RemoveListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {   
        if (table.getSelectedRow() != -1){
            tableModel.removeRow(table.getSelectedRow());
        }
    }
    
  }


  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() { new SongDefaultTableDemo(); }
    });
  }
}