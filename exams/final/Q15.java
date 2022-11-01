import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.util.*;
class Artist {
  private ArrayList<Song> songs = new ArrayList<Song>();
  private String name = "Unknown";
  public Artist(String name) { this.name = name;}
  public void addSong(Song s) { songs.add(s); }
  public void removeSong(int index) { songs.remove(index); }
  public String getName() { return name; }
  public String toString() { return String.format("%s(%d)", name,songs.size() ); }
  public ArrayList<Song> getSongs() { return songs; }
}
class Song {
  private String title;
  private int duration;
  public Song(String title, int duration) {
    this.title = title;
    this.duration = duration;
  }
  public String getTitle() {return this.title;}
  public int getDuration() { return this.duration; }
  public String toString() { return String.format("%s(%d)", title, duration); }
}

class ArtistSongDemo extends JFrame {
  SongAbstractTableModel tableModel;
  JTable table;

  public ArtistSongDemo() {
    Artist a1 = new Artist("Wiz Khalifa");
    a1.addSong(new Song("See You Again", 229));
    a1.addSong(new Song("We Own It", 227));
    a1.addSong(new Song("Something New", 200));
    tableModel = new SongAbstractTableModel(a1);
    table = new JTable(tableModel);
    getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800, 300);
    setVisible(true);
  }

  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() { new ArtistSongDemo(); }
    });
  }
}

class SongAbstractTableModel extends AbstractTableModel{
    private String[] columnNames = new String[]{"Title", "Duration"};
    private ArrayList<Song> songs;
    public SongAbstractTableModel(Artist a){
        songs = new ArrayList<Song>();
        for (Song song : a.getSongs()) {
            songs.add(song);
        }
    }
    public int getRowCount() {
        return songs.size()/getColumnCount();
    }

    public int getColumnCount() {
        return columnNames.length;
    }
    public String getColumnName(int colIndex) {
        return columnNames[colIndex];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return songs.get(rowIndex).getTitle();
        } if (columnIndex == 1){
            return songs.get(rowIndex).getDuration();
        }
        return null;
    }
    
}