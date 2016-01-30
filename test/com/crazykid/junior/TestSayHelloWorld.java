package com.crazykid.junior;

import com.crazykid.myexception.NotInTheListException;
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
    private Clerk clerk = null;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private String originHello = "Hello";
    private String bob = "Bob";
    private String alice = "Alice";
    private String tom = "Tom";
    private String nullName = null;

    @Before
    public void setup() {
        clerk = new Clerk();
    }

    @Test
    public void testSayHelloWorld() {
        String hello = clerk.hello();
        assertEquals(originHello, hello);
    }

    @Test
    public void testSayHelloToBobAndAlice() {
        assertEquals("Hello, Bob", clerk.hello(bob));
        assertEquals("Hello, Alice", clerk.hello(alice));
    }

    @Test
    public void testSayHelloToTom() {
        expectedException.expect(NotInTheListException.class);
        expectedException.expectMessage(tom + " is not in the list");
        clerk.hello(tom);
    }

    @Test
    public void testSayHelloToNull() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("The name cannot be null");
        clerk.hello(nullName);
    }

    @After
    public void tearDown() {
        clerk = null;
    }
}
