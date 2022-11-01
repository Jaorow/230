import java.util.ArrayList;

class Book {
    private String bookname = "Unknown";
    private String isbn = "N/A";
    private double price;
    public Book() {}
    public Book(String name, String isbn,  double price) {
        bookname = name;
        this.isbn = isbn;
        this.price = price;
    }
    public String toString() {return String.format("%s(%s),$%.2f", bookname, isbn, price);}
}

public class readbooks {
    public static ArrayList<Book> readBooks(String[] sentences){
        ArrayList<Book> books = new ArrayList<Book>();

        for (String string : sentences) {
            try {
                String[] s = string.split(",");
                Book b = new Book(s[0],s[1],Double.parseDouble(s[2]));
                books.add(b);
            } catch (Exception e) {
                System.out.printf("ERROR: Invalid book: '%s'",string);
            }
        }
        return books;
    }
}
