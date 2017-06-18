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
    Movie movie = new Movie();

    List <Book> booksCatalogue = new ArrayList<Book>();
    Book masterMargarita = new Book("Mikhail Bulgakov", "The Master and Margarita", 1967);
    Book littlePrince = new Book("Antoine de Saint-Exupéry", "The Little Prince", 1943);
    Book panTadeusz = new Book("Adam Mickiewicz", "Pan Tadeusz",1834);

    List<Movie> moviesCatalogue = new ArrayList<Movie>();
    Movie devilWearsPrada = new Movie("David Frankel", "The Devil Wears Prada", 2006, 7);
    Movie gifted = new Movie("Marc Webb", "Gifted", 2017, 8);
    Movie pianist = new Movie("Roman Polanski", "The Pianist", 2002, 9);

   public Library() {
       booksCatalogue.add(masterMargarita);
       booksCatalogue.add(littlePrince);
       booksCatalogue.add(panTadeusz);
       moviesCatalogue.add(devilWearsPrada);
       moviesCatalogue.add(gifted);
       moviesCatalogue.add(pianist);
   }

    public List<Book> getBookRegister() {
        return booksCatalogue;
    }

    public List<Movie> getMovieRegister() {
        return moviesCatalogue;
    }

    public void listAvailableBooks() {
        System.out.println("Please find below the list of the available books:\n");

        for (Book book : booksCatalogue) {
            if(!(book.isCheckedOut())) {
                System.out.println(book.getTitle().toString() + "\n");
            }
        }
    }

    public void listAvailableMovies() {
        System.out.println("Please find below the list of the available movies:\n");

        for (Movie movie : moviesCatalogue) {
            if(!(movie.isCheckedOut())) {
                System.out.println(movie.getTitle().toString() + "\n");
            }
        }
    }

    public void fullCatalogue() {
        System.out.println("Here is the library's catalogue:\n");
        printBooks();
        printMovies();
    }

    private String printMovies() {
        String allMovies = "";

        for (Movie movie: moviesCatalogue) {
            allMovies += movie.getAuthor() + " | " + movie.getTitle() + " | " + movie.getYearPublished() + " | " + "rating: " + movie.getRating() + "\n";

        }
        System.out.println("Movies on catalogue:" + "\n" + allMovies);
        return allMovies;
    }

    private String printBooks() {
        String allBooks = "";
        for (Book book: booksCatalogue) {
            allBooks += book.getAuthor() + " | " + book.getTitle() + " | " + book.getYearPublished() + "\n";

        }
        System.out.println("Books on catalogue:" + "\n" + allBooks);
        return allBooks;
    }

    public void returnBook() {
        Book usersBook = bookOnFile();

        for (Book book : booksCatalogue) {
            if (!(booksCatalogue.contains(usersBook))) {
                book.returnItem();
                booksCatalogue.add(usersBook);
                break;
            } else {
                System.out.println("Invalid book to return");
                break;
            }
        }
    }

    public void returnMovie() {
        Movie usersMovie = movieOnFile();

        for (Movie movie : moviesCatalogue) {
            if (!(moviesCatalogue.contains(usersMovie))) {
                movie.returnItem();
                moviesCatalogue.add(usersMovie);
                break;
            } else {
                System.out.println("Invalid book to return");
                break;
            }
        }
    }

    public void checkoutBook() {
        String usersBook = getUsersItem();

        for (Book book: booksCatalogue) {
            if (usersBook.equals(book.getTitle())) {
                book.checkoutItem();
            }
        }
    }

    public void checkoutMovie() {
        String usersMovie = getUsersItem();

        for (Movie movie: moviesCatalogue) {
            if (usersMovie.equals(movie.getTitle())) {
                movie.checkoutItem();
            }
        }
    }

    private Movie movieOnFile() {
        String usersMovie = getUsersItem();

        for (Movie movie : moviesCatalogue) {
            if (movie.getTitle().equals(usersMovie)) {
                return movie;
            }
        }
        return movie;
    }

    private Book bookOnFile() {
        String usersBook = getUsersItem();

        for (Book book : booksCatalogue) {
            if (book.getTitle().equals(usersBook)) {
                return book;
            }
        }
        return book;
    }

    private String getUsersItem() {
        System.out.println("Please enter the title:");
        String usersItem = sc.nextLine();
        book.setTitle(usersItem);
        movie.setTitle(usersItem);
        return usersItem;
    }
}
