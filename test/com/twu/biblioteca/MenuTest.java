package com.twu.biblioteca;

import com.sun.tools.corba.se.idl.constExpr.Equal;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by edytawrobel on 07/06/2017.
 */
public class MenuTest {

    Menu menu = new Menu();

    @Test
    public void canPrintAvailableOptions() throws Exception {
        assertEquals("[1. List Books, 2. Return a Book, 3. Checkout a Book, 4. Quit]", menu.getOptions());
    }

}