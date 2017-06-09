package com.twu.biblioteca;

import com.sun.tools.corba.se.idl.constExpr.Equal;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by edytawrobel on 07/06/2017.
 */
public class MenuTest {

    Menu menu = new Menu();
    Library library = new Library();


    @Test
    public void canPrintAvailableOptions() throws Exception {
        assertEquals("[1. List Books, 2. Return a Book, 3. Checkout a Book, 4. Quit]", menu.displayOptions());
    }

    @Test
//    public void bookReturn() throws Exception {
//
//        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outContent));
//        menu.bookReturn();
//        String expectedOutputSubstr  = "Pan Tadeusz";
//        assertTrue(outContent.toString().contains(expectedOutputSubstr));
//    }

    @Test
    public void noExceptionIsThrownWhenUserQuits() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        menu.actOnChoice(4, library);
        String expectedOutputSubstr  = "Good bye";
        assertTrue(outContent.toString().contains(expectedOutputSubstr));
    }



}