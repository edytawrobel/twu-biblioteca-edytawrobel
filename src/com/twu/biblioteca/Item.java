package com.twu.biblioteca;

/**
 * Created by edytawrobel on 18/06/2017.
 */
public class Item {

    private String author;
    private String title;
    private int yearPublished;
    private boolean checkedOut;

    public Item(String author, String title, int yearPublished) {
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
        this.checkedOut = false;
    }

    public Item() {}

    public void setTitle(String title) {
        this.title = title;
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

    public void checkoutItem() {
        checkedOut = true;
    }

    public void returnItem() {
        checkedOut = false;
    }


}
