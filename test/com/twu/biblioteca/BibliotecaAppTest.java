package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BibliotecaAppTest {
    @Test
    public void main() throws Exception {
        BibliotecaApp biblioteca = new BibliotecaApp();
        biblioteca.start();
        assertEquals("Welcome to the Bangalore Public Library", "Welcome to the Bangalore Public Library");
    }

}