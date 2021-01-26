import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book lotr;

    @Before
    public void before(){
        lotr = new Book("The Lord of Rings", "Tolkien", "Fantasy");
    }

    @Test
    public void hasName(){
        assertEquals("The Lord of Rings", lotr.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Tolkien", lotr.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Fantasy", lotr.getGenre());
    }
}
