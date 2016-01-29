package com.crazykid;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by ljf on 16-1-29.
 */
public class TestSayHelloWorld {
    private String originHello = "Hello";

    @Test
    public void testSayHelloWorld() {
        Clark clark = new Clark();
        String hello = clark.hello();
        assertEquals(originHello, hello);
    }
}
