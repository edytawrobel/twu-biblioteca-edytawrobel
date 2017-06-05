package com.twu.biblioteca;


public class Book {

    private String author;
    private String title;
    private int yearPublished;
    private boolean checkedOut;

    public Book(String author, String title, int yearPublished) {
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
        this.checkedOut = false;
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
        this.checkedOut = true;
    }

    public void returnBook() {
        System.out.println("Thank you for returning the book");
        this.checkedOut = false;
    }
}
