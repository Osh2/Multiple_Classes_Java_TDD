import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower chris;
    private Library theCellar;
    private Book lor;

    @Before
    public void before(){
        chris = new Borrower();
        theCellar = new Library(4);
        lor = new Book("Lord of Ring", "Tolk", "Fantasy");
        theCellar.addBook(lor);
    }

    @Test
    public void hasNoBooks(){
        assertEquals(0,  chris.getBooks());
    }

    @Test
    public void canTakeBooks(){
        assertEquals(0, chris.getBooks());
        chris.borrowBook(lor);
        assertEquals(1, chris.getBooks());
    }
    @Test
    public void borrowerCanGetBookFromLibrary(){
        assertEquals(0, chris.getBooks());
        chris.borrowBookFromLib(theCellar);
        assertEquals(1, chris.getBooks());
        assertEquals(0, theCellar.getBookCount());
    }
}
