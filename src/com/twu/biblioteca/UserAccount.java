package com.twu.biblioteca;

/**
 * Created by edytawrobel on 19/06/2017.
 */
public class UserAccount {

    private User kate;
    private User emma;
    private User edyta;
    private User currentUser;

    public UserAccount() {
        this.currentUser = currentUser;
        emma = new User("Emma", "emma@example.com", 849000, "pass90do", 908-4563);
        kate = new User("Kate", "kate@examaple.com", 567000, "password2", 278-5654);
        edyta = new User("Edyta", "ew@examaple.com", 977000, "password", 210-5644);
    }

    private User[] users = { kate, emma, edyta };

    public User[] getUsers() {
        return users;
    }

    public User getUserDetails() {
        return currentUser;
    }

    public void printUserInformation() {
        try {
            System.out.println(getUserDetails().toString());
        } catch (Exception e) {
            System.out.println("You need to be signed in!");
        }
    }





}
