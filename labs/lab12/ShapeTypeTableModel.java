import javax.swing.table.AbstractTableModel;

enum Shape {
    TRIANGLE(3), QUADRILATERAL(4), PENTAGON(5), HEXAGON(6), HEPTAGON(7), OCTAGON(8), NONAGON(9), DECAGON(10);
    private int numOfSides;
    private Shape(int s) {numOfSides = s;}
    public int getNumOfSides() { return numOfSides; }
   }

public class ShapeTypeTableModel extends AbstractTableModel{
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
    
}
