import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.time.*;
import java.util.*;
public class SumofLastThreeDigitsApp extends JFrame {
  private JTextField usernameField;
  private JButton showButton;
  private JLabel resultLabel;
  public SumofLastThreeDigitsApp() {
    usernameField = new JTextField("abcd123", 10);
    showButton = new JButton("Show");
    resultLabel = new JLabel("The sum is ...");
    JPanel commandpanel = new JPanel();
    commandpanel.add(new JLabel("Enter a date"));
    commandpanel.add(usernameField);
    commandpanel.add(showButton);
    commandpanel.add(resultLabel);
    getContentPane().add(commandpanel, BorderLayout.NORTH);
    showButton.addActionListener( new MyListener() );
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600, 100);
    setVisible(true);
  }
  class MyListener implements  ActionListener{
    public void actionPerformed(ActionEvent e) {
      String username = usernameField.getText();
      String[] split = username.split("");
      int sum = 0;

      for (String string : split) {
        try{
          int num = Integer.parseInt(string);
          sum += num;
        } catch (NumberFormatException error) {
        }
      }

      String m = String.format("The sum is: %d",sum);
      resultLabel.setText(m);
      if (sum == 0) {
        resultLabel.setText("ERROR: Invalid username!");
      }
    
    }
  }

  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {new SumofLastThreeDigitsApp();}
    });
    
  }
}