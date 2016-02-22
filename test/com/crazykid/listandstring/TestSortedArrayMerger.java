package com.crazykid.listandstring;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestSortedArrayMerger extends TestBase{
    private SortedArrayMerger mMerger = new SortedArrayMerger();

    @Test
    public void testMergeNullArrays() {
        Object[] nullList = null;
        Object[] notNullList = {};
        mExpectedException.expectMessage("Both arrays cannot be null");
        mExpectedException.expect(NullPointerException.class);
        mMerger.merge(nullList,nullList);
        mMerger.merge(nullList,notNullList);
        mMerger.merge(notNullList,nullList);
    }

    @Test
    public void testMerge() {
        Integer[] firstSortedArray = {1,3,5,7,8,100};
        Integer[] secondSortedArray = {0,2,4,6,9, 10};
        Integer[] expectedMergedArray = {0,1,2,3,4,5,6,7,8,9,10,100};

        Object[] actualMergedList = mMerger.merge(firstSortedArray,
                secondSortedArray);

        assertTrue(Arrays.equals(expectedMergedArray, actualMergedList));
    }
}
