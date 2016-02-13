package com.crazykid.listandstring;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.Assert.assertTrue;

public class TestReverseList {
    @Rule
    public ExpectedException mExpectedException = ExpectedException.none();
    private Reverser mReverser;

    @Before
    public void setup() {
        mReverser = new Reverser();
    }

    @Test
    public void reverseNullList() {
        Object[] list = null;
        mExpectedException.expect(NullPointerException.class);
        mExpectedException.expectMessage("The list cannot be null");
        mReverser.reverse(list);
    }

    @Test
    public void reverseOddList() {
        Object[] list = {1, 3, 5, 4, 2, 0, 7};
        Object[] reversedList = mReverser.reverse(list);
        Object[] expectedReversedList = {7, 0, 2, 4, 5, 3, 1};
        assertTrue(Arrays.equals(expectedReversedList, reversedList));
    }

    @Test
    public void reverseEvenList() {
        Object[] list = {1, 3, 5, 4, 2, 0, 7, 8};
        Object[] reversedList = mReverser.reverse(list);
        Object[] expectedReversedList = {8, 7, 0, 2, 4, 5, 3, 1};
        assertTrue(Arrays.equals(expectedReversedList, reversedList));
    }

    @Test
    public void reverseNullElement() {
        Object[] list = {1, 3, 5, 4, 2, null, 7};
        Object[] reversedList = mReverser.reverse(list);
        Object[] expectedReversedList = {7, null, 2, 4, 5, 3, 1};
        assertTrue(Arrays.equals(expectedReversedList, reversedList));
    }
}
