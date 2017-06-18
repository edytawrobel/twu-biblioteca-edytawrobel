package com.twu.biblioteca;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;


public class BookTest {

    private Book aBook;

    @Before
    public void setup() {
        aBook = new Book("Mikhail Bulgakov", "The Master and Margarita", 1967);
    }

    @Test
    public void canCreateBookWithAuthorTitleYearPublished() throws Exception {
        assertEquals("The Master and Margarita", aBook.getTitle());
        assertEquals("Mikhail Bulgakov", aBook.getAuthor());
        assertEquals(1967, aBook.getYearPublished());
    }

    @Test
    public void canCheckoutBook() throws Exception {
        assertEquals(false, aBook.isCheckedOut());
        aBook.checkoutItem();
        assertEquals(true, aBook.isCheckedOut());
    }

    @Test
    public void canReturnBook() throws Exception {
        aBook.checkoutItem();
        assertEquals(true, aBook.isCheckedOut());
        aBook.returnItem();
        assertEquals(false, aBook.isCheckedOut());
    }

}
