import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.time.*;
import java.util.*;

public class DateApp extends JFrame {
	private JTextField dateField;
	private JButton showButton;
	private JLabel resultLabel;
	public DateApp() {
		dateField = new JTextField("2022-07-18", 10);
		showButton = new JButton("Show");
		resultLabel = new JLabel("The date of the next day is ...");
		JPanel commandpanel = new JPanel();
		commandpanel.add(new JLabel("Enter a date"));
		commandpanel.add(dateField);
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

		//complete this
		try {
			LocalDate current = LocalDate.parse(dateField.getText());
			LocalDate next = current.plusDays(1);
			String message = String.format("The date of the next day is %s", next.toString());
			resultLabel.setText(message);    
		}
		catch (Exception t) {
			resultLabel.setText("ERROR: Invalid date!");  			  
		}
	}
	}
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {new DateApp();}
		});
	}
}