package com.twu.biblioteca;

import java.util.Arrays;
import java.util.Scanner;


public class Menu {

    private static Scanner sc = new Scanner(System.in);
    private Library library = new Library();
    private Book book = new Book("Mikhail Bulgakov", "The Master and Margarita", 1967);
    public static final String[] OPTIONS = {"1. List Books", "2. Return a Book", "3. Checkout a Book", "4. Quit"};


    public void runMenu() {
        displayOptions();
        actOnChoice(getUserMenuOption(), library);
    }

    public String launchApp() {
        String welcomeText = "Welcome to the Bangalore Public Library!\n";
        System.out.println(welcomeText);
        return welcomeText;
    }

    public String displayOptions() {
        System.out.println("What would you like to do next?");
        System.out.println(Arrays.toString(OPTIONS));

        return Arrays.toString(OPTIONS);
    }

    private int getUserMenuOption() {
        System.out.println("Enter a number for your choice: \n <<");
        int choice = sc.nextInt();
        return choice;
    }


    public void actOnChoice(int choice, Library library) {

        switch (choice) {
            case 1:
                library.formatBooksCatalogue();
                break;
            case 2:
                System.out.println("You are about to return book.");
                library.addBook();
                break;
            case 3:
                System.out.println("You are about to checkout book.");
                library.removeBook();
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
