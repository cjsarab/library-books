import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void before() {
        library = new Library();
        book1 = new Book("LotR", "JRR Tolkien", "Fantasy");
        book2 = new Book("Long Walk to Freedom", "Nelson Mandela", "Autobiography");
    }

    @Test
    public void libraryStartsEmpty() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }


}