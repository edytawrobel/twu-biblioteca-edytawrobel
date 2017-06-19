package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mock;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by edytawrobel on 07/06/2017.
 */
public class MenuTest {

    Menu menu = new Menu();

    @Mock
    Library library;


    @Test
    public void canPrintAvailableOptions() throws Exception {
        assertEquals("[1. List Books, 2.Print User Info, 3. Return a Book, 4. Checkout a Book, 5. List Movies, 6. Return a Movie, 7. Checkout a Movie, 8. Quit]", menu.displayOptions());
    }

    @Test
    public void noExceptionIsThrownWhenUserQuits() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        menu.actOnChoice(8, library);
        String expectedOutputSubstr  = "Good bye";
        assertTrue(outContent.toString().contains(expectedOutputSubstr));
    }



}