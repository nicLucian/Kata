package com.crazykid.listandstring;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class TestSortUtil extends TestBase{

    private int[] array;
    private int[] expectArrayAfterSort;

    private int[] array1;
    private int[] expectArray1AfterSort;

    private int[] array2;
    private int[] expectArray2AfterSort;

    private int[] array3;
    private int[] expectArray3AfterSort;

    @Before
    public void setup() {
        array = new int[]{1};
        expectArrayAfterSort = new int[]{1};
        array1 = new int[]{1,2,3,4,5};
        expectArray1AfterSort = new int[]{1,2,3,4,5};
        array2 = new int[]{9,8,7,6,5,4,3,2,1};
        expectArray2AfterSort = new int[]{1,2,3,4,5,6,7,8,9};
        array3 = new int[]{43,1234,9,0,3,55,57,8};
        expectArray3AfterSort = new int[]{0,3,8,9,43,55,57,1234};
    }

    @Test
    public void testSelectSortNullArray() {
        int[] nullArray = null;
        mExpectedException.expect(NullPointerException.class);
        mExpectedException.expectMessage("The array cannot be null");
        SortUtil.selectSort(nullArray);
    }


    @Test
    public void testSelectSort() {
        int[] actualArrayAfterSort = SortUtil.selectSort(array);
        assertTrue(Arrays.equals(actualArrayAfterSort, expectArrayAfterSort));

        int[] actualArray1AfterSort = SortUtil.selectSort(array1);
        assertTrue(Arrays.equals(actualArray1AfterSort, expectArray1AfterSort));

        int[] actualArray2AfterSort = SortUtil.selectSort(array2);
        assertTrue(Arrays.equals(actualArray2AfterSort, expectArray2AfterSort));

        int[] actualArray3AfterSort = SortUtil.selectSort(array3);
        assertTrue(Arrays.equals(actualArray3AfterSort, expectArray3AfterSort));
    }

    @Test
    public void testInsertSort() {
        int[] actualArrayAfterSort = SortUtil.insertSort(array);
        assertTrue(Arrays.equals(actualArrayAfterSort, expectArrayAfterSort));

        int[] actualArray1AfterSort = SortUtil.insertSort(array1);
        assertTrue(Arrays.equals(actualArray1AfterSort, expectArray1AfterSort));

        int[] actualArray2AfterSort = SortUtil.insertSort(array2);
        assertTrue(Arrays.equals(actualArray2AfterSort, expectArray2AfterSort));

        int[] actualArray3AfterSort = SortUtil.insertSort(array3);
        assertTrue(Arrays.equals(actualArray3AfterSort, expectArray3AfterSort));
    }

    @Test
    public void testMergeSort() {
        int[] actualArrayAfterSort = SortUtil.mergeSort(array);
        assertTrue(Arrays.equals(actualArrayAfterSort, expectArrayAfterSort));

        int[] actualArray1AfterSort = SortUtil.mergeSort(array1);
        assertTrue(Arrays.equals(actualArray1AfterSort, expectArray1AfterSort));

        int[] actualArray2AfterSort = SortUtil.mergeSort(array2);
        assertTrue(Arrays.equals(actualArray2AfterSort, expectArray2AfterSort));

        int[] actualArray3AfterSort = SortUtil.mergeSort(array3);
        assertTrue(Arrays.equals(actualArray3AfterSort, expectArray3AfterSort));
    }

}
