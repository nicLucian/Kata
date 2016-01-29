package com.crazykid;

/**
 * Created by ljf on 16-1-29.
 */
public class Clark {
    private String hello = "Hello";

    public String hello() {
        return hello;
    }

    public String hello(String name) {
        if (null == name) {
            throw new NullPointerException("The name cannot be null");
        }
        return hello + ", " + name;
    }
}
