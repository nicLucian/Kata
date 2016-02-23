package com.crazykid.listandstring;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestFibonacci extends TestBase{
    private Fibonacci fibonacci = new Fibonacci();

    @Test
    public void testNonPositiveInput() {
        mExpectedException.expect(IllegalArgumentException.class);
        mExpectedException.expectMessage("The number must be positive!");
        fibonacci.get(-1);
    }

    @Test
    public void testGetFibonacci() {
        assertEquals(1, fibonacci.get(1));
        assertEquals(1, fibonacci.get(2));
        assertEquals(2, fibonacci.get(3));
        assertEquals(55, fibonacci.get(10));
        assertEquals(89, fibonacci.get(11));
        assertEquals(144, fibonacci.get(12));
        assertEquals(233, fibonacci.get(13));
        assertEquals(377, fibonacci.get(14));
        assertEquals(610, fibonacci.get(15));

        assertEquals(1000, fibonacci.get(5000));
    }
}