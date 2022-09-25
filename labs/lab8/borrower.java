import java.util.*;
class Borrower extends Book{
    private static final int BORROWING_CAPACITY = 20;
    private List<Book> _booksOnLoan = new ArrayList<Book>(); 
    public boolean canBorrow() {
        if (!Book.isOnLoan()) {
            return _booksOnLoan.size( ) < BORROWING_CAPACITY;
        }
        return false;
    }
    public boolean borrow(Book b) {
        if( (!canBorrow())) {
            return false;
        } 
        setBorrowedBy(this); 
        _booksOnLoan.add(b); 
        return true; 
    } 
    public int getNumBooksOnLoan(){ return _booksOnLoan.size(); }
} 

class Book { 
    private Borrower borrowedBy = null; 
    public Book() {} 
    public void setBorrowedBy(Borrower b) { borrowedBy = b; } 
    public static boolean isOnLoan() { return false; } 
 }