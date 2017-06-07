package com.twu.biblioteca;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    private Menu menu;
    private Library library;
    private Scanner sc;

    public BibliotecaApp() {
        this.menu = new Menu();
        this.library = new Library();
    }

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();
        app.launchApp();
        app.library.formatBooksCatalogue();
        app.menu.getOptions();
    }


    public String launchApp() {
        String welcomeText = "Welcome to the Bangalore Public Library! ";
        System.out.println(welcomeText);
        return welcomeText;
    }


}


