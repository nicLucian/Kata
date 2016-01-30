package com.crazykid;

import com.crazykid.myexception.NotInTheListException;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by ljf on 16-1-29.
 */
public class TestSayHelloWorld {
    private Clark clark = null;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private String originHello = "Hello";
    private String bob = "Bob";
    private String alice = "Alice";
    private String tom = "Tom";
    private String nullName = null;

    @Before
    public void setup() {
        clark = new Clark();
    }

    @Test
    public void testSayHelloWorld() {
        String hello = clark.hello();
        assertEquals(originHello, hello);
    }

    @Test
    public void testSayHelloToBobAndAlice() {
        assertEquals("Hello, Bob", clark.hello(bob));
        assertEquals("Hello, Alice", clark.hello(alice));
    }

    @Test
    public void testSayHelloToTom() {
        expectedException.expect(NotInTheListException.class);
        expectedException.expectMessage(tom + " is not in the list");
        clark.hello(tom);
    }

    @Test
    public void testSayHelloToNull() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("The name cannot be null");
        clark.hello(nullName);
    }

    @After
    public void tearDown() {
        clark = null;
    }
}
