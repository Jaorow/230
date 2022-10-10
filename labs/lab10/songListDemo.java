import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Song {
	 private String title,artist;
	 private int length;
	 public Song(String title, String artist, int len) {
		this.title = title;
		this.artist = artist;
		length = len;
	}
	public String getTitle() {return title;}
	public String getArtist() { return artist; }
	public int getLength() { return length; }
	public String toString() { return String.format("%s(by %s),duration=%d", title, artist,length); }
}

class SongListDemo extends JFrame {
  JButton addButton, removeButton;
  JTextField titleTextField, nameTextField, lengthTextField;
  JLabel resultLabel;
  SongListModel<Song> listModel;
  JList<Song> songsList;

  public SongListDemo() {
	listModel = new SongListModel<Song>();
	listModel.addElement(new Song("Kiss The Dirt", "INXS", 150));
	listModel.addElement(new Song("Butter", "BTS", 164));
	listModel.addElement(new Song("Shape of You", "Ed Sheeran", 233));
	songsList = new JList<Song>(listModel);
	songsList.addListSelectionListener(new MyListener());
	addButton = new JButton("Add");
	removeButton = new JButton("Remove");
	titleTextField = new JTextField("Listen Like Thieves");
	nameTextField = new JTextField("INXS");
	lengthTextField = new JTextField("120");
	resultLabel = new JLabel("The Total is: 0");
	addButton.addActionListener(new AddListener());
	removeButton.addActionListener(new RemoveListener());
	JPanel buttonsPanel = new JPanel();
	buttonsPanel.add(titleTextField);
	buttonsPanel.add(nameTextField);
	buttonsPanel.add(lengthTextField);
	buttonsPanel.add(resultLabel);
	buttonsPanel.add(addButton);
	buttonsPanel.add(removeButton);
	getContentPane().add(buttonsPanel, BorderLayout.NORTH);
	getContentPane().add(songsList, BorderLayout.CENTER);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(500, 400);
	setVisible(true);
  }

  class MyListener implements ListSelectionListener{

	public void valueChanged(ListSelectionEvent e) {
		int total = 0;
		for (Song song : songsList.getSelectedValuesList()) {
			total += song.getLength();
		}
		resultLabel.setText(String.format("The Total is:%d", total));
	}
  }

  class AddListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        listModel.addElement(new Song(titleTextField.getText(), nameTextField.getText(), Integer.parseInt(lengthTextField.getText())));
    }
    
  }
  class RemoveListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        if (songsList.getSelectedIndex() > -1) {
            listModel.removeElementAt(songsList.getSelectedIndex());
        }
    } 
  }

  public static void main(String[] args) {
	javax.swing.SwingUtilities.invokeLater(new Runnable() {
	  public void run() { new SongListDemo();}
	  
	  
	});
  }
}