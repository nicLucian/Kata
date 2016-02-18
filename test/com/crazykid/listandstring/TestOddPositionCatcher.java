package com.crazykid.listandstring;

import junit.framework.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class TestOddPositionCatcher extends TestBase{
    private OddElementsCatcher catcher = new OddElementsCatcher();

    @Test
    public void getOddElementsFromNull() {
        mExpectedException.expect(NullPointerException.class);
        mExpectedException.expectMessage("The array cannot be null");
        catcher.catchOddPositionElements(null);
    }

    @Test
    public void testGetOddElementsFromEmpty() {
        Object[] emptyArray = {};

        Object[] oddPositionElements = catcher.catchOddPositionElements(emptyArray);

        assertTrue(Arrays.equals(emptyArray, oddPositionElements));
    }

    @Test
    public void testGetOddElementsFromSingleElement() {
        Object[] singleElementArray = {1};

        Object[] oddPositionElements = catcher.catchOddPositionElements(singleElementArray);
        System.out.println(oddPositionElements[0]);

        assertTrue(Arrays.equals(singleElementArray, oddPositionElements));
    }

    @Test
    public void testGetOddElementsFromRegularArray() {
        Object[] regularArray = {"1", 2, "6", "56", 0, 1, null};
        Object[] expectedArray = {"1", "6", 0, null};

        Object[] actualArray = catcher.catchOddPositionElements(regularArray);
        System.out.println(actualArray.length);
        assertTrue(Arrays.equals(expectedArray, actualArray));
    }
}
