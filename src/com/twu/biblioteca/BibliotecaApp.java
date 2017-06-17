package com.twu.biblioteca;

public class BibliotecaApp {

    private Menu menu;
    private Library library;

    public BibliotecaApp() {
        this.menu = new Menu();
        this.library = new Library();
    }

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();
        app.menu.launchApp();
        app.library.booksCatalogue();
        app.menu.runMenu();
    }


}


