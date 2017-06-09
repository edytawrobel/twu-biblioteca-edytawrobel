package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
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
        InputStream in = new ByteArrayInputStream("some INVALID input\nquit".getBytes());
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        library.formatBooksCatalogue();
        String expectedOutput  = "Please find below the list of the available books:\n\n" +
                    "Mikhail Bulgakov, The Master and Margarita, 1967\n" +
                    "Antoine de Saint-Exupéry, The Little Prince, 1943\n" +
                    "Adam Mickiewicz, Pan Tadeusz, 1834\n\n";
        assertEquals(expectedOutput, outContent.toString());
    }





}