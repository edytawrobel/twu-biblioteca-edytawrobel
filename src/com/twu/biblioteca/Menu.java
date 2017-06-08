package com.twu.biblioteca;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by edytawrobel on 07/06/2017.
 */
public class Menu {

    public Scanner sc = new Scanner(System.in);
    private Library library = new Library();
    private Book book = new Book("Mikhail Bulgakov", "The Master and Margarita", 1967, false);

    public void runMenu() {
        displayOptions();
        actOnChoice(getUserChoice(), library);
    }

    public String displayOptions() {
        String[] options = {"1. List Books", "2. Return a Book", "3. Checkout a Book", "4. Quit"};
        System.out.println(Arrays.toString(options));

        return Arrays.toString(options);
    }

    private int getUserChoice() {
        System.out.println("Please pick one of the available options (Enter a number). \n <<");
        int choice = sc.nextInt();
        return choice;
    }


    public void actOnChoice(int choice, Library library) {

        switch (choice) {
            case 1:
                System.out.println("The books currently available:");
                library.formatBooksCatalogue();
                break;
            case 2:
                System.out.println("You are about to return a book");
                book.returnBook();
                break;
            case 3:
                System.out.println("You are about to checkout a book");
                book.checkoutBook();
                break;
            case 4:
                System.out.println("Good bye!");
                break;
            default:
                System.out.println("Select a valid option!");
        }
    }


}
