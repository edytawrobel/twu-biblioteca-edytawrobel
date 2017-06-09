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
        assertEquals("[1. List Books, 2. Return a Book, 3. Checkout a Book, 4. Quit]", menu.displayOptions());
    }

    @Test
    public void noExceptionIsThrownWhenUserQuits() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        menu.actOnChoice(4, library);
        String expectedOutputSubstr  = "Good bye";
        assertTrue(outContent.toString().contains(expectedOutputSubstr));
    }



}