import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

enum Shape {
  TRIANGLE(3), QUADRILATERAL(4), PENTAGON(5), HEXAGON(6), HEPTAGON(7), OCTAGON(8), NONAGON(9), DECAGON(10);
  private int numOfSides;
  private Shape(int s) {numOfSides = s;}
  public int getNumOfSides() { return numOfSides; }
}


class ShapeTypeTableModel extends AbstractTableModel{
    private String[] columnNames = new String[]{"Name", "Number of Sides"};
    public ShapeTypeTableModel(){}

    public int getRowCount() {
        return Shape.values().length;
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public String getColumnName(int colIndex){
        return columnNames[colIndex];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Shape.values()[rowIndex];
            
            case 1:
                return Shape.values()[rowIndex].getNumOfSides();
            default:
                break;
        }
        return null;
    }
    

class ShapeTypeTableDemo extends JFrame {
  JLabel resultLabel;
  ShapeTypeTableModel tabelModel;
  JTable table;
  JButton getButton;

  public ShapeTypeTableDemo() {
    tabelModel = new ShapeTypeTableModel();
    table = new JTable(tabelModel);
    table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    getButton = new JButton("Get");
    getButton.addActionListener(new SelectListener());
    resultLabel = new JLabel("The number of sides is 0",10);
    JPanel buttonsPanel = new JPanel();
    buttonsPanel.add(resultLabel);
    buttonsPanel.add(getButton);
    getContentPane().add(buttonsPanel, BorderLayout.NORTH);
    getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 400);
    setVisible(true);
  }

  class SelectListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        if (table.getSelectedRow() != -1) {
            resultLabel.setText(String.format("The number of sides is: %d",tableModel.getValueAt(table.getSelectedRow(),1)));
        }
    }
  }


//   public static void main(String[] args) {
//     javax.swing.SwingUtilities.invokeLater(new Runnable() {
//       public void run() { new ShapeTypeTableDemo();}
//     });
//   }
}
}

