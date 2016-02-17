package com.crazykid.listandstring;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestContains {

    @Test
    public void testContainsNull() {
        Object[] objectsContainsNull = {1,2,3,"12",null};
        Object[] objectsNotContainsNull = {1,2,3,4, "2"};
        Object nullElement = null;

        assertTrue(ContainsUtil.isIn(nullElement, objectsContainsNull));

        assertFalse(ContainsUtil.isIn(nullElement, objectsNotContainsNull));
    }

    @Test
    public void testContainsFirst() {
        Object elementFirst = 1;
        Object elementLast = "23";
        Object elementMiddle = 4;
        Object elementNotIn = 6;
        Object[] objects = {1,3,4,null,5,"23"};

        assertTrue(ContainsUtil.isIn(elementFirst, objects));

        assertTrue(ContainsUtil.isIn(elementLast, objects));

        assertTrue(ContainsUtil.isIn(elementMiddle, objects));

        assertFalse(ContainsUtil.isIn(elementNotIn, objects));
    }
}
