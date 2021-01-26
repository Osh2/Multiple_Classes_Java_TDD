import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library bookHouse;
    private Book lotr;

    @Before
    public void before(){
        bookHouse = new Library(5);
        lotr = new Book("Lord of Ring", "Tolkien", "Fantasy");
    }

    @Test
    public void newLibraryHasNaeBooks(){
        assertEquals(0, bookHouse.getBookCount());
    }

    @Test
    public void shouldHaveBookCap(){
        assertEquals(5, bookHouse.getBookCap());
    }

    @Test
    public void canAddBooks(){
        assertEquals(0, bookHouse.getBookCount());
        bookHouse.addBook(lotr);
        assertEquals(1, bookHouse.getBookCount());
    }

    @Test
    public void addBookIfSpace_true(){
        assertEquals(0, bookHouse.getBookCount());
        bookHouse.addBook(lotr);
        Book hp = new Book("HP and the Sauce", "Mrs Terf", "Kids Fiction");
        bookHouse.addBook(hp);
        Book bible = new Book("Bible", "Jesus", "Childrens Fiction");
        bookHouse.addBook(bible);
        assertEquals(3, bookHouse.getBookCount());
    }

    @Test
    public void addBookIfSpace_false(){
        Library bookNook = new Library(0);
        assertEquals(0, bookNook.getBookCount());
        bookNook.addBook(lotr);
        assertEquals(0, bookNook.getBookCount());
    }

    @Test
    public void shouldHaveGenreInfo(){
        int numberOfFan = bookHouse.getGenreDetails("Fantasy");
        assertEquals(10, numberOfFan);
        int numberOfCrime = bookHouse.getGenreDetails("Crime");
        assertEquals(5, numberOfCrime);
        int numberOfRomance = bookHouse.getGenreDetails("Romance");
        assertEquals(3, numberOfRomance);
    }



}
