package com.crazykid.listandstring;

import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.Classes;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TestMaxNumInList extends TestBase{
    private MaxNumInList mMaxNumInList = new MaxNumInList();

    @Test
    public void testMaxNumInNumbers() {
        int[] numbers = {1,3,-2,-5,-1,10,0,-2,0};
        assertEquals(10, mMaxNumInList.max(numbers));

        int[] numbersContainMinValue = {-1,-2,-3,1,3,0,Integer.MIN_VALUE};
        assertEquals(3, mMaxNumInList.max(numbersContainMinValue));

        int[] numbersContainMaxValue = {-1,-2,-3,1,3,0,Integer.MAX_VALUE};
        assertEquals(Integer.MAX_VALUE, mMaxNumInList.max(
                numbersContainMaxValue));
    }

    @Test
    public void testMaxInEmptyNums() {
        expectException(IllegalArgumentException.class, "The numbers cannot " +
                "be empty");
        int[] emptyNums = {};
        mMaxNumInList.max(emptyNums);
    }

    @Test
    public void testMaxInNullNums() {
        expectException(NullPointerException.class, "The numbers cannot " +
                "be null");
        int[] nullNums = null;
        mMaxNumInList.max(nullNums);
    }

    @Test
    public void testMaxInGenericObjects() {
        Integer[] numbers = {-1,3,4,0,-2};
        List<Integer> list = Arrays.asList(numbers);
        assertEquals(4, mMaxNumInList.max(list));
    }

    @Test
    public void testMaxInGenericObjectsContainsNull() {
        expectException(NullPointerException.class, "The element cannot be null!");
        Integer[] numbers = {-1,3,4,0,-2,null};
        List<Integer> list = Arrays.asList(numbers);
        mMaxNumInList.max(list);
    }

    @Test
    public void testMaxInGenericEmptyObjects() {
        expectException(IllegalArgumentException.class, "The numbers cannot " +
                "be empty");
        Integer[] numbers = {};
        List<Integer> list = Arrays.asList(numbers);
        assertEquals(4, mMaxNumInList.max(list));
    }


    private void expectException(Class<? extends Exception> clazz,
                                 String message) {
        mExpectedException.expect(clazz);
        mExpectedException.expectMessage(message);
    }

}
