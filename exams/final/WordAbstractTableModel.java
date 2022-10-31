import javax.swing.table.*;
class WordAbstractTableModel extends AbstractTableModel {
  String word;
  private String[] columnNames = { "index", "letter" };
  public WordAbstractTableModel(String word) { this.word = word; }
  public int getColumnCount() { return columnNames.length;}
  public String getColumnName(int col) { return columnNames[col]; }
  public int getRowCount() { return word.length(); }
  public Object getValueAt(int row, int col) {
    if (col == 0)
      return "" + row;
    else if (col == 1)
      return "" + word.charAt(row);
    else return null;
  }
}