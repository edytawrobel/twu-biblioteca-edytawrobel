package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by edytawrobel on 07/06/2017.
 */
public class LibraryTest {

    private Library library = new Library();
//    private Book aBook = new Book("Mikhail Bulgakov", "The Master and Margarita", 1967);
//    private List<Book> booksCatalogue = new ArrayList<Book>();

    @Test
    public void formatBooksCatalogue() throws Exception {
//        booksCatalogue.add(aBook);
        assertEquals("The Master and Margarita, Mikhail Bulgakov, 1967\nThe Little Prince, Antoine de Saint-Exupéry, 1943\nPan Tadeusz, Adam Mickiewicz, 1834\n", library.formatBooksCatalogue());
    }

}