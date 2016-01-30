package com.crazykid.junior;

import com.crazykid.junior.MultiplicationTable;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;
public class TestMultiplicationTable {
    MultiplicationTable multiplicationTable = null;
    @Rule public ExpectedException expectedException = ExpectedException.none();

    String tableFourTimes = "1*1 = 1\n" +
                            "2*1 = 2, 2*2 = 4\n" +
                            "3*1 = 3, 3*2 = 6, 3*3 = 9\n" +
                            "4*1 = 4, 4*2 = 8, 4*3 = 12, 4*4 = 16";
    String tableOneTime = "1*1 = 1";
    String tableSixTimes = "1*1 = 1\n" +
                           "2*1 = 2, 2*2 = 4\n" +
                           "3*1 = 3, 3*2 = 6, 3*3 = 9\n" +
                           "4*1 = 4, 4*2 = 8, 4*3 = 12, 4*4 = 16\n" +
                           "5*1 = 5, 5*2 = 10, 5*3 = 15, 5*4 = 20, 5*5 = 25\n" +
                           "6*1 = 6, 6*2 = 12, 6*3 = 18, 6*4 = 24, 6*5 = 30, 6*6 = 36";
    @Before
    public void setUp() {
        multiplicationTable = new MultiplicationTable();
    }

    @Test
    public void testFourTimesTable() {
        assertEquals(tableFourTimes, multiplicationTable.getTable(4));
    }

    @Test
    public void testOneTimeTable() {
        assertEquals(tableOneTime, multiplicationTable.getTable(1));
    }

    @Test
    public void testSixTimesTable() {
        assertEquals(tableSixTimes, multiplicationTable.getTable(6));
    }

    @Test
    public void testZeroOrNegativeTable() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("The factor must be positive.");
        multiplicationTable.getTable(0);
        multiplicationTable.getTable(-1);
    }
}
