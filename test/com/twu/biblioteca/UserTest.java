package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;


public class UserTest {


    User user = new User("Edyta", "ew@examaple.com", 7577000, "password", 210-5644);

    @Test
    public void verifyLibraryID() throws Exception {
        assertEquals(true, user.verifyLibraryID(210-5644));
    }

    @Test
    public void verifyPassword() throws Exception {
        assertEquals(true, user.verifyPassword("password"));
    }

    @Test
    public void testPrintOutFormat() throws Exception {
        assertEquals(user.toString(), "" +
                "Name  | Edyta       \n" +
                "Email | ew@examaple.com\n" +
                "Phone | 7577000     ");
    }
}