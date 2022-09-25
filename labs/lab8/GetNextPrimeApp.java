import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.time.*;
import java.util.*;
public class GetNextPrimeApp extends JFrame {
  private JTextField primeField;
  private JButton getButton;
  public GetNextPrimeApp() {
    primeField = new JTextField("2", 10);
    getButton = new JButton("Get");
    JPanel commandpanel = new JPanel();
    commandpanel.add(new JLabel("Prime:"));
    commandpanel.add(primeField);
    commandpanel.add(getButton);
    getContentPane().add(commandpanel, BorderLayout.NORTH);
    getButton.addActionListener( new MyListener() );
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 100);
    setVisible(true);
  }

  class MyListener implements  ActionListener{
    public void actionPerformed(ActionEvent e) {
        int input = Integer.parseInt(primeField.getText()); 
        input ++;
    
        for(int i=2;i<input;i++) {
            if(input % i ==0  ) {
                input++;
                i=2;
            }
            else{
                continue;
            }
        }
        primeField.setText(String.valueOf(input));
    }        
    }
   //complete this
  
  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {new GetNextPrimeApp();}
    });
  }
}
