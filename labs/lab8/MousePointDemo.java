import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;

public class MousePointDemo extends JFrame {
	// private ArrayList<Point> points = new ArrayList<Point>();
	private JTextArea textArea;
	private JPanel contents;
	public MousePointDemo() {
		textArea = new JTextArea("Points:\n",10, 20);
		contents = new JPanel();
		contents.addMouseListener(new MyMouseAdapter());

	JSplitPane mainSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, textArea, contents);
		setContentPane(mainSplitPane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Mouse-Click Demo");
		setSize(600, 300);
		setVisible(true);
	}

	class MyMouseAdapter extends MouseAdapter {
		public void mouseClicked(MouseEvent evt){			
		Point p = evt.getPoint();
		textArea.append(String.valueOf(p));
		textArea.append("\n");
	}
}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { new MousePointDemo(); }
		});
	}
}