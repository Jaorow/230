import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.util.*;

class Country {
  private String name = "Unknown", abbreviation = "NA";
  private int population=100;
    public Country() {}
    public Country(String name, String abb, int pop) {
        this.name = name;
        abbreviation = abb;
        population = pop;
    }
    public String getName() { return name; }
    public String getAbbreviation() {return abbreviation; }
    public int getPopulation() { return population; }
    public String toString() { return String.format("%s(%s)%d", name,abbreviation,population ); }
    public void grow(float growRate) {
		population = Math.round(population * growRate);
	}
}

class CountryAbstractTableModel extends AbstractTableModel {
    private String[] columbNames = new String[]{"Name", "Abbreviation", "Population"};
    private ArrayList<Country> countries = new ArrayList<Country>();

    public CountryAbstractTableModel(){};
    public CountryAbstractTableModel(Object[][] array){
        for (Object[] o : array) {
            countries.add(new Country(o[0].toString(),o[1].toString(),Integer.parseInt(o[2].toString())));
        }
    }
    public String getColumnName(int colIndex){
        return columbNames[colIndex];
    }
    public int getRowCount() {
        return countries.size();
    }

    public int getColumnCount() {
        return columbNames.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return countries.get(rowIndex).getName();
            case 1:
                return countries.get(rowIndex).getAbbreviation();
            case 2:
                return countries.get(rowIndex).getPopulation();
            default:
                break;
        }
        return null;
    }

    public void addRow(Country element){
        int numRow = getRowCount();
        countries.add(element);
        fireTableRowsInserted(numRow, numRow);
    }

    public void removeRow(int index){
        countries.remove(index);
        fireTableRowsDeleted(index, index);
    }
    public void calculate(float growRate){
        for (Country country : countries) {
            country.grow(growRate);
        }
    }
    
}


class CountryAbstractTableDemo extends JFrame {
  CountryAbstractTableModel tableModel;
  JTable table;
  JButton addButton, removeButton, calculateButton;
  JTextField nameTextField, abbTextField, popTextField;

  public CountryAbstractTableDemo() {
    tableModel = new CountryAbstractTableModel();
    Object[][] array = new Object[][]{ new Object[]{"New Zealand", "NZ", 4822233}, new Object[]{"Australia", "AU", 25499884}, new Object[]{"Finland", "FI", 5540720}};
    tableModel.addRow(new Country("New Zealand", "NZ", 4822233));
    tableModel.addRow(new Country("Australia", "AU", 25499884));
    tableModel.addRow(new Country("Finland", "FI", 5540720));
    table = new JTable(tableModel);
    addButton = new JButton("Add");
	removeButton = new JButton("Remove");
	calculateButton = new JButton("Calculate");
	nameTextField = new JTextField("Uruguay", 10);
	abbTextField = new JTextField("UY", 10);
	popTextField = new JTextField("3473730", 10);
	addButton.addActionListener(new AddListener());
	removeButton.addActionListener(new RemoveListener());
	calculateButton.addActionListener(new CalculateListener());
    JPanel buttonsPanel = new JPanel();
    buttonsPanel.add(nameTextField);
    buttonsPanel.add(abbTextField);
    buttonsPanel.add(popTextField);
    buttonsPanel.add(addButton);
    buttonsPanel.add(removeButton);
    buttonsPanel.add(calculateButton);
    getContentPane().add(buttonsPanel, BorderLayout.NORTH);
    getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800, 300);
    setVisible(true);
  }

  class CalculateListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        tableModel.calculate(1.1f);
    }
  }
  class AddListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        tableModel.addRow(new Country(nameTextField.getText(),abbTextField.getText(),Integer.parseInt(popTextField.getText())));
    }
  }
  class RemoveListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {   
        if (table.getSelectedRow() > -1){
            tableModel.removeRow(table.getSelectedRow());
        }
    }
  }
  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() { new CountryAbstractTableDemo(); }
    });
  }
}