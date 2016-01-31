package com.crazykid.junior;

import com.crazykid.myexception.NotInTheListException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by ljf on 16-1-29.
 */
public class Clerk {
    private List<String> guestList;
    private String hello = "Hello";

    public Clerk() {
        guestList = new ArrayList<>();
        guestList.add("Bob");
        guestList.add("Alice");
    }

    public String hello() {
        return hello;
    }

    public String hello(String name) {
        if (null == name) {
            throw new NullPointerException("The name cannot be null");
        }

        if (!guestList.contains(name)) {
            throw new NotInTheListException(name + " is not in the list");
        }
        return hello + ", " + name;
    }

}
