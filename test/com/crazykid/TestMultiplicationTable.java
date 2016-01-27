package com.crazykid;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
public class TestMultiplicationTable {
    MultiplicationTable multiplicationTable = null;
    String table = "1*1 = 1\n" +
                   "2*1 = 2, 2*2 = 4\n" +
                   "3*1 = 3, 3*2 = 6, 3*3 = 9\n" +
                   "4*1 = 4, 4*2 = 8, 4*3 = 12, 4*4 = 16";
    @Before
    public void setUp() {
        multiplicationTable = new MultiplicationTable();
    }

    @Test
    public void testPrintMultiplicationTable() {
        assertEquals(table, multiplicationTable.getTable());
    }
}
