import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int bookCap;
    private HashMap<String, Integer> booksByGenre;


    public Library(int bookCap){
        this.books = new ArrayList<>();
        this.bookCap = bookCap;
        this.booksByGenre = new HashMap<String, Integer>();
        booksByGenre.put("Fantasy", 10);
        booksByGenre.put("Crime", 5);
        booksByGenre.put("Romance", 3);
    }

    public int getBookCount(){
        return books.size();
    }

    public int getBookCap() {
        return bookCap;
    }

    public void addBook(Book book){
        if(getBookCount() < getBookCap()) {
            books.add(book);
        }
    }

    public Book lendBook(){
        return books.remove(0);
    }

    public int getGenreDetails(String genre){
       return booksByGenre.get(genre);
    }

}

