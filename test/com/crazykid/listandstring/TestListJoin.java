package com.crazykid.listandstring;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class TestListJoin {

    @Rule
    public ExpectedException mExpectedException = ExpectedException.none();

    private Object[] nullObjects = null;
    private Object[] notNullObjects = {1,2,3,4,5};
    private Object[] notNullObjects1 = {"a","b","c"};


    @Test
    public void testJoinBothNullList() {
        mExpectedException.expect(NullPointerException.class);
        mExpectedException.expectMessage("Both list cannot be null");
        ListJoinUtil.join(nullObjects,nullObjects);
    }

    @Test
    public void testJoinFirstNullList() {
        mExpectedException.expect(NullPointerException.class);
        mExpectedException.expectMessage("Both list cannot be null");
        ListJoinUtil.join(nullObjects,notNullObjects);
    }

    @Test
    public void testJoinSecondNotNullList() {
        mExpectedException.expect(NullPointerException.class);
        mExpectedException.expectMessage("Both list cannot be null");
        ListJoinUtil.join(notNullObjects,nullObjects);
    }

    @Test
    public void testJoinNot() {
        Object[] expectedListAfterJoin = {1,2,3,4,5,"a","b","c"};
        Object[] actualListAfterJoin = ListJoinUtil.join(notNullObjects, notNullObjects1);
        assertTrue(Arrays.equals(expectedListAfterJoin, actualListAfterJoin));
    }

}
