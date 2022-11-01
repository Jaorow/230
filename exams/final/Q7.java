import java.util.*;

class Item {
  protected String title;
  public Item(String title) {this.title = title;}
  public String getTitle() { return title; }
}
class Book extends Item {
  private String author;
  public Book(String title, String author) {
    super(title);
    this.author = author;
  }
  public String getAuthor() {return author;}
}
class Movie extends Item {
  private int year;
  public Movie(String title, int year) {
    super(title);
    this.year = year;
  }
  public int getYear() {return year;}
}

class Q7{
    public static <T extends Item> int getCountStartsWithTarget(ArrayList<T> list, String target) {
        int count = 0;
        for (T t : list) {
            if (t.title.substring(0,target.length()).equals(target)) {
                count ++;
            }
        }
        return count;
    }
}