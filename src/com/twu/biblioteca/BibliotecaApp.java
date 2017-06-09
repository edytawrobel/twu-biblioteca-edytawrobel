package com.twu.biblioteca;

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
        app.menu.launchApp();
        app.menu.runMenu();
    }



}


