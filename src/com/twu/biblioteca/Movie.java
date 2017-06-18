package com.twu.biblioteca;

/**
 * Created by edytawrobel on 18/06/2017.
 */
public class Movie extends Item {

    private int rating;
    private static final int MIN_RATING = 1;
    private static final int MAX_RATING = 10;

    public Movie(String author, String title, int yearPublished, int rating) {
        super(author, title, yearPublished);
        if (rating > MIN_RATING && rating <= MAX_RATING) {
            this.rating = rating;
        }
    }

    public Movie() {}

    public int getRating() {
        return rating;
    }

    @Override
    public void checkoutItem() {
        super.checkoutItem();
        System.out.println("Thank you! Enjoy the movie.");
    }

    @Override
    public void returnItem() {
        super.returnItem();
        System.out.println("Thank you for returning the movie");
    }
}
