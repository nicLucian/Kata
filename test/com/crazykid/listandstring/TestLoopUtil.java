package com.crazykid.listandstring;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;

public class TestLoopUtil extends TestBase{

    private int[] array = {1,2,3,4,5,6};

    @Test
    public void testForLoopNull() {
        handleNullArray();
        SumUtil.sumByForLoop(null);
    }

    @Test
    public void testForLoop() {
        assertEquals(21, SumUtil.sumByForLoop(array));
    }

    @Test
    public void testWhileLoopNull() {
        handleNullArray();
        SumUtil.sumByWhileLoop(null);
    }

    @Test
    public void testWhileLoop() {
        assertEquals(21, SumUtil.sumByWhileLoop(array));
    }

    @Test
    public void testRecurseLoopNull() {
        handleNullArray();
        SumUtil.sumByRecurseLoop(null);
    }

    @Test
    public void testRecurseLoop() {
        assertEquals(21, SumUtil.sumByRecurseLoop(array));
    }

    private void handleNullArray() {
        mExpectedException.expect(NullPointerException.class);
        mExpectedException.expectMessage("Array cannot be null");
    }
}
