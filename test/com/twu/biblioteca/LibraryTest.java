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

    private Library library;
    private Book book;

    @Before
    public void setup() {

        library = new Library();
        book = new Book("Antoine de Saint-Exupéry", "The Little Prince",1943, false);
    }

    @Test
    public void formatBooksCatalogue() throws Exception {
        assertEquals("Mikhail Bulgakov, The Master and Margarita, 1967\nAntoine de Saint-Exupéry, The Little Prince, 1943\nAdam Mickiewicz, Pan Tadeusz, 1834\n", library.formatBooksCatalogue());
    }



}