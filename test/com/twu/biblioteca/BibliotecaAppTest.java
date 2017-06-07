package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BibliotecaAppTest {

    private BibliotecaApp biblioteca;

    @Before
    public void setup() {
        biblioteca = new BibliotecaApp();
    }

    @Test
    public void start() throws Exception {
        assertEquals("Welcome to the Bangalore Public Library", biblioteca.launchApp());
    }


}