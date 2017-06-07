package com.twu.biblioteca;

import java.util.Arrays;

/**
 * Created by edytawrobel on 07/06/2017.
 */
public class Menu {

    public String getOptions() {
        String[] options = {"1. List Books", "2. Return a Book", "3. Checkout a Book", "4. Quit"};
        System.out.println(Arrays.toString(options));
        return Arrays.toString(options);
    }
}
