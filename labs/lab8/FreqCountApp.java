import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class FreqCountApp extends JFrame {
  private JTextField sentenceField , searchField;
  private JLabel resultLabel;
  private JButton countButton;
  public FreqCountApp() {
	sentenceField  = new JTextField("apple", 10);
	searchField = new JTextField("p", 5);
    resultLabel = new JLabel("2 ");
    countButton = new JButton("Count");
    JPanel commandpanel = new JPanel();
    commandpanel.add(new JLabel("Enter a sentence:"));
    commandpanel.add(sentenceField );
    commandpanel.add(new JLabel("Enter a letter:"));
    commandpanel.add(searchField);
    commandpanel.add(countButton);
    commandpanel.add(new JLabel("Occurrences :"));
    commandpanel.add(resultLabel);
    getContentPane().add(commandpanel, BorderLayout.NORTH);
    countButton.addActionListener( new MyListener() );
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600, 150);
    setVisible(true);
  }

class MyListener implements  ActionListener{
  public void actionPerformed(ActionEvent e) {
    int count = 0;
  for (String c : sentenceField.getText().split("")) {
    if (c.equals(searchField.getText())) {
      count += 1;
    }
  }
  resultLabel.setText(String.valueOf(count));
  }
}

  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {new FreqCountApp();}
    });
  }
}