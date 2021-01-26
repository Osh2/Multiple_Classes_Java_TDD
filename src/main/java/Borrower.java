import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> personBooks;
    private Library library;

    public Borrower(){
        this.personBooks = new ArrayList<>();
    }

    public int getBooks(){
        return personBooks.size();
    }

    public void borrowBook( Book book){
        personBooks.add(book);
    }

    public void borrowBookFromLib(Library library){
       Book lentBook = library.lendBook();
       borrowBook(lentBook);
    }
}
