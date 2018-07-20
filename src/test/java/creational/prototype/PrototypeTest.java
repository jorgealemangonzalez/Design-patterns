package creational.prototype;

import static org.junit.Assert.*;
import org.junit.Test;

public class PrototypeTest {

    @Test
    public void prototypeTest() {
        Registry registry = new Registry();
        Book book = (Book) registry.createItem("Book");
        Book book2 = (Book) registry.createItem("Book");
        Movie movie = (Movie) registry.createItem("Movie");

        assertNotEquals(book, book2);
        assertEquals(movie.getTitle(), "Basic Movie");
    }

}