package com.twu.biblioteca;

/**
 * Created by edytawrobel on 18/06/2017.
 */
public class User {

    private String name;
    private String email;
    private String password;
    private int libraryID;
    private long phone_number;

    public User(String name, String email, long phone_number, String password, int libraryID) {
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.password = password;
        this.libraryID = libraryID;
    }

    public User() {}

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public boolean verifyLibraryID(int libraryIDtoCheck) {
        return libraryIDtoCheck == libraryID;

    }

    public boolean verifyPassword(String passwordToCheck) {
        return passwordToCheck == password;
    }


    public String toString() {
        return String.format(
                "Name  | %-12s\nEmail | %-12s\nPhone | %-12s",
                getName(),
                getEmail(),
                getPhone_number()
        );
    }
}
