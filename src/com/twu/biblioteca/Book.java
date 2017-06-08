package com.twu.biblioteca;


import java.util.ArrayList;

public class Book {

    private String author;
    private String title;
    private int yearPublished;
    private boolean checkedOut;

    public Book(String author, String title, int yearPublished, boolean checkedOut) {
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
        this.checkedOut = checkedOut;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkoutBook() {
        System.out.println("Thank you! Enjoy the book.");
        checkedOut = true;
    }

    public void returnBook() {
        System.out.println("Thank you for returning the book");
        checkedOut = false;
    }

}

