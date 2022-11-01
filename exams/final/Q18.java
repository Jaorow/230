import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

public class FormattedSequencePanel extends JPanel {
	JLabel label;
	JTextField text;
	static JComponent app;

	public FormattedSequencePanel() {
	    label = new JLabel("Enter date and code");
	    text = new JTextField(30);

	    Document encodeDocument = new FormattedSequenceDocument();
	    text.setDocument(encodeDocument);

	    add(label);
	    add(text);
	}

	private static void createAndShowGUI() {
	    JFrame frame = new JFrame("Date format and encoding App");

	    app = new FormattedSequencePanel();

	    frame.add(app);
	    frame.pack();
	    frame.setVisible(true);
	}

	public static void main(String[ ] args) {
	    createAndShowGUI();
	}
}

//Complete this class as per question requirements

class FormattedSequenceDocument extends PlainDocument{
    
    int counter = 0;
    
    int sum = 0;

	@Override
	public void insertString(int offset, String str, AttributeSet a) throws BadLocationException {
        if (str.matches("[0-9]") && counter<8) {
            super.insertString(offset, str, a);
            sum += Integer.parseInt(str);
            counter+= 1;
            if (counter == 2 || counter == 4) {
                super.insertString(offset, "@", a);
            } else if (counter == 8){
                super.insertString(offset, "#", a);
                super.insertString(offset, String.valueOf(sum), a);
            }
        }
	}
}