package com.crazykid.listandstring;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestArrayMerger extends TestBase{
    private String mExpectMessage = "Both arrays cannot be null";
    private Class<? extends RuntimeException> exceptionClass =
            NullPointerException.class;

    private Object[] mNullArray = null;
    private Object[] mNotNullIntegerArray = {1,2,3,4,5};
    private Object[] mNotNullCharArray = {"c", "b", "a"};

    @Test
    public void testMergeNullArray() {
        mExpectedException.expect(exceptionClass);
        mExpectedException.expectMessage(mExpectMessage);
        ArrayMerger.merge(mNullArray, mNullArray);
    }

    @Test
    public void testMergeFirstNullArray() {
        mExpectedException.expect(exceptionClass);
        mExpectedException.expectMessage(mExpectMessage);
        ArrayMerger.merge(mNullArray, mNotNullCharArray);
    }

    @Test
    public void testMergeSecondNullArray() {
        mExpectedException.expect(exceptionClass);
        mExpectedException.expectMessage(mExpectMessage);
        ArrayMerger.merge(mNotNullCharArray, mNullArray);
    }

    @Test
    public void testMergeNotNullArrays() {
        Object[] expectedIntegerFirstMergedArray = {1,"c",2,"b",3,"a",4,5};
        Object[] actualIntegerFirstMergedArray = ArrayMerger.merge(mNotNullIntegerArray,
                mNotNullCharArray);
        assertTrue(Arrays.equals(expectedIntegerFirstMergedArray,
                actualIntegerFirstMergedArray));

        Object[] expectedCharFirstMergedArray = {"c",1,"b",2,"a",3,4,5};
        Object[] actualCharFirstMergedArray = ArrayMerger.merge(mNotNullCharArray,
                mNotNullIntegerArray);
        assertTrue(Arrays.equals(expectedCharFirstMergedArray, actualCharFirstMergedArray));
    }
}
