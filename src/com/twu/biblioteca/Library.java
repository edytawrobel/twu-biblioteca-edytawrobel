package com.twu.biblioteca;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public List<Book> getBooksCatalogue() {
        return booksCatalogue;
    }

    public void addBook() {
        String usersBook = getUsersBook();

        for (Book book: booksCatalogue) {
            if (!(usersBook.equals(book.getTitle()))) {
                book.returnBook();
            } else {
                System.out.println("That is not a valid book to return");
                return;
            }
        }
    }

    public void removeBook() {
        String usersBook = getUsersBook();

        for (Book book: booksCatalogue) {
            if (usersBook.equals(book.getTitle())) {
                book.checkoutBook();
            } else {
                System.out.println("That book is not available.");
            }
        }
    }

    public String formatBooksCatalogue() {
        System.out.println("Please find below the list of the available books:\n");
        String formattedBooksCatalogue = "";
        for (Book book: booksCatalogue) {
            if (!book.isCheckedOut()) {
                formattedBooksCatalogue += book.getAuthor() + ", " + book.getTitle() + ", " + book.getYearPublished() + "\n";
            }
        }
        System.out.println(formattedBooksCatalogue);
        return formattedBooksCatalogue;
    }

    private String getUsersBook() {
        System.out.println("Please enter the title of the book: ");
        Scanner sc = new Scanner(System.in);
        String usersBook = sc.nextLine();
        return usersBook;
    }




}
