package com.twu.biblioteca;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by edytawrobel on 07/06/2017.
 */
public class Library {

    private static Scanner sc = new Scanner(System.in);
    Book book = new Book();

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


    public void listAvailableBooks() {
        System.out.println("Please find below the list of the available books:\n");

        for (Book book : booksCatalogue) {
            if(!(book.isCheckedOut())) {
                System.out.println(book.getTitle().toString() + "\n");
            }
        }
    }

    public void returnBook() {
        Book usersBook = bookOnFile();
        System.out.println("usersbook " + usersBook.getTitle());

        for (Book book : booksCatalogue) {
            if (!(booksCatalogue.contains(usersBook))) {
                book.returnBook();
                booksCatalogue.add(usersBook);
                break;
            } else {
                System.out.println("Invalid book to return");
                break;
            }
        }
    }


    public void checkoutBook() {
        String usersBook = getUsersBook();

        for (Book book: booksCatalogue) {
            if (usersBook.equals(book.getTitle())) {
                book.checkoutBook();
            }
        }
    }

    public String booksCatalogue() {
        System.out.println("Here is the library's catalogue of books:\n");
        String allBooks = "";
        for (Book book: booksCatalogue) {
            if (!(book.isCheckedOut())) {
                allBooks += book.getAuthor() + ", " + book.getTitle() + ", " + book.getYearPublished() + "\n";
            }
        }
        System.out.println(allBooks);
        return allBooks;
    }

    private Book bookOnFile() {
        String usersBook = getUsersBook();

        for (Book book : booksCatalogue) {
            if (book.getTitle().equals(usersBook)) {
                return book;
            }
        }
        return book;
    }

    private String getUsersBook() {
        System.out.println("Please enter the title of the book: ");
        String usersBook = sc.nextLine();
        book.setTitle(usersBook);
        return usersBook;
    }




}
