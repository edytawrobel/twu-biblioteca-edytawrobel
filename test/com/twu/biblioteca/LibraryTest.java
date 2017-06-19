package com.twu.biblioteca;

import org.junit.Before;
import org.mockito.Mock;

import java.util.List;

/**
 * Created by edytawrobel on 07/06/2017.
 */
public class LibraryTest {

    @Mock
    Book book;

    @Before
    public void setup() {

        Library library = new Library();

        List<Book> books;
        book = new Book("Antoine de Saint-Exupéry", "The Little Prince",1943);
        String sampleOutput = "Antoine de Saint-Exupéry, The Little Prince, 1943";
    }




}