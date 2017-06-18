package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by edytawrobel on 18/06/2017.
 */
public class MovieTest {

    private Movie aMovie;

    @Before
    public void setup() {
        aMovie = new Movie("Roman Polanski", "The Pianist", 2002, 9);;
    }

    @Test
    public void canCreateBookWithAuthorTitleYearPublished() throws Exception {
        assertEquals("The Pianist", aMovie.getTitle());
        assertEquals("Roman Polanski", aMovie.getAuthor());
        assertEquals(2002, aMovie.getYearPublished());
    }

    @Test
    public void canCheckoutAmovie() throws Exception {
        assertEquals(false, aMovie.isCheckedOut());
        aMovie.checkoutItem();
        assertEquals(true, aMovie.isCheckedOut());
    }

    @Test
    public void canReturnAmovie() throws Exception {
        aMovie.checkoutItem();
        assertEquals(true, aMovie.isCheckedOut());
        aMovie.returnItem();
        assertEquals(false, aMovie.isCheckedOut());
    }

}

