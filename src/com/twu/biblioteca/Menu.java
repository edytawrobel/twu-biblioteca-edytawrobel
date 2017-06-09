package com.twu.biblioteca;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by edytawrobel on 07/06/2017.
 */
public class Menu {

    private Library library = new Library();
    private Book book = new Book("Mikhail Bulgakov", "The Master and Margarita", 1967, false);

    public void runMenu() {
        displayOptions();
        actOnChoice(getUserMenuOption(), library);
    }

    public String displayOptions() {
        System.out.println("What would you like to do next?");
        String[] options = {"1. List Books", "2. Return a Book", "3. Checkout a Book", "4. Quit"};
        System.out.println(Arrays.toString(options));

        return Arrays.toString(options);
    }

    private int getUserMenuOption() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for your choice: \n <<");
        int choice = sc.nextInt();
        return choice;
    }

    public String bookReturn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a title of the book to return: \n << ");
        String bookToReturn = sc.nextLine();
        return bookToReturn;
    }

    public String bookCheckout() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a title of the book to checkout: \n << ");
        String bookToCheckout = sc.nextLine();
        return bookToCheckout;
    }


    public void actOnChoice(int choice, Library library) {

        switch (choice) {
            case 1:
                library.formatBooksCatalogue();
                break;
            case 2:
                bookReturn();
                book.returnBook();
                break;
            case 3:
                bookCheckout();
                book.checkoutBook();
                break;
            case 4:
                System.out.println("Good bye!");
                return;
            default:
                System.out.println("Select a valid option!");
        }
        runMenu();
    }


}
