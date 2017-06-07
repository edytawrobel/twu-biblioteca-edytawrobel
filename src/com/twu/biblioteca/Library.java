package com.twu.biblioteca;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by edytawrobel on 07/06/2017.
 */
public class Library {

    List <Book> booksCatalogue = new ArrayList<Book>();
    Book masterMargarita = new Book("Mikhail Bulgakov", "The Master and Margarita", 1967);
    Book littlePrince = new Book("Antoine de Saint-Exupéry", "The Little Prince", 1943);
    Book panTadeusz = new Book("Adam Mickiewicz", "Pan Tadeusz",1834);

    public Library() {
        booksCatalogue.add(masterMargarita);
        booksCatalogue.add(littlePrince);
        booksCatalogue.add(panTadeusz);
    }


    public String formatBooksCatalogue() {
        System.out.println("Please find below the list of available books: ");
        String formattedBooksCatalogue = "";
        for (Book book: booksCatalogue) {
            if (!book.isCheckedOut()) {
                formattedBooksCatalogue += book.getTitle() + ", " + book.getAuthor() + ", " + book.getYearPublished() + "\n";
            }
        }
        System.out.println(formattedBooksCatalogue);
        return formattedBooksCatalogue;
    }

}
