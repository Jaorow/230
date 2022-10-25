import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import javax.swing.table.*;
public class CountryDefaultTableDemo extends JFrame  {
  JTable table;
  JButton changeButton;
  DefaultTableModel tableModel;

  public CountryDefaultTableDemo() {
  String[] columnNames = new String[]{"Country", "Population"};
  tableModel= new DefaultTableModel(new Object[][] {
	    { "New Zealand", new Integer(4822233) }, { "Australia", new Integer(25499884) }, { "Finland", new Integer(5540720) }, {"Uruguay", new Integer(3473730)}}, columnNames);
    table = new JTable(tableModel );
	changeButton = new JButton("Grow");
	changeButton.addActionListener(new ChangeListener());
    JScrollPane scrollPane = new JScrollPane(table);
    getContentPane().add(scrollPane, BorderLayout.CENTER);
    getContentPane().add(changeButton, BorderLayout.NORTH);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 200);
    setVisible(true);
  }

  class MyListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            tableModel.setValueAt(Math.round((int) tableModel.getValueAt(i, 1)*1.1f), i, 1); 
            
        }
    }
  }


  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() { new CountryDefaultTableDemo(); }
    });
  }
}