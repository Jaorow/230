import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.util.*;


class WordAbstractTableModel extends AbstractTableModel {
  	String word;
    private String[] columnNames = {"index", "letter"};
    public WordAbstractTableModel(String word) {this.word = word;}
    public int getColumnCount() { return columnNames.length;}
    public String getColumnName(int col) {return columnNames[col];}
    public int getRowCount() { return word.length(); }
    public Object getValueAt(int row, int col) {
      if (col == 0)
        return "" + row;
      else if (col == 1)
        return "" + word.charAt(row);
      else return null;
    }
}
class WordDemo extends JFrame {
  WordAbstractTableModel tableModel;
  JTable table;
  JList<String> list;
  DefaultListModel<String> listModel;

  public WordDemo() {
	listModel = new DefaultListModel<String>();
  	listModel.addElement("hello");
  	listModel.addElement("compsci230");
  	listModel.addElement("CodeRunner");
  	listModel.addElement("well done");
    tableModel = new WordAbstractTableModel("hello");
    table = new JTable(tableModel);
    list = new JList<String>(listModel);
    list.addListSelectionListener(new SelectListener());
	JSplitPane mainSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, list, new JScrollPane(table));
	mainSplitPane.setResizeWeight(0.5);
	mainSplitPane.setOneTouchExpandable(true);
	mainSplitPane.setContinuousLayout(true);
    getContentPane().add(mainSplitPane, BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800, 300);
    setVisible(true);
  }

  class SelectListner implements ListSelectionListener{
    public void valueChanged(ListSelectionEvent e) {
        table.setModel(new WordAbstractTableModel(list.getSelectedValue()));
    }
  }
  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() { new WordDemo(); }
    });
  }
}