import java.util.*;
class Artist {
  private ArrayList<Song> songs = new ArrayList<Song>();
  private String name = "Unknown";
  public Artist(String name) {
    this.name = name;
  }
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