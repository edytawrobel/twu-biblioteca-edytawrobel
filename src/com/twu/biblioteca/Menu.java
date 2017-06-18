package com.twu.biblioteca;

import java.util.Arrays;
import java.util.Scanner;


public class Menu {

    private static Scanner sc = new Scanner(System.in);
    private Library library = new Library();
    private User user = new User();
    public static final String[] OPTIONS = {"1. List Books", "2.Print User Info", "3. Return a Book", "4. Checkout a Book", "5. List Movies", "6. Return a Movie", "7. Checkout a Movie", "8. Quit"};

    public User getUser() {
        return user;
    }

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

    private void printUserInformation() {
        try {
            System.out.println(getUser().toString());
        } catch (Exception e) {
            System.out.println("You need to be signed in!");
        }
    }


    public void actOnChoice(int choice, Library library) {

        switch (choice) {
            case 1:
                library.listAvailableBooks();
                break;
            case 2:
                printUserInformation();
                break;
            case 3:
                System.out.println("You are about to return a book.");
                library.returnBook();
                break;
            case 4:
                System.out.println("You are about to checkout a book.");
                library.checkoutBook();
                break;
            case 5:
                library.listAvailableMovies();
                break;
            case 6:
                System.out.println("You are about to return a movie.");
                library.returnMovie();
                break;
            case 7:
                System.out.println("You are about to checkout a movie.");
                library.checkoutMovie();
                break;
            case 8:
                System.out.println("Good bye!");
                return;
            default:
                System.out.println("Select a valid option!");
        }
        runMenu();
    }


}
