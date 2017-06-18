package com.twu.biblioteca;


public class Book extends Item {

    public Book(String author, String title, int yearPublished) {
        super(author, title, yearPublished);
    }

    public Book() {}

    @Override
    public void checkoutItem() {
        super.checkoutItem();
        System.out.println("Thank you! Enjoy the book.");
    }

    @Override
    public void returnItem() {
        super.returnItem();
        System.out.println("Thank you for returning the book");
    }



}

