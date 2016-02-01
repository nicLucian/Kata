package com.crazykid.junior;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestLeapYear {
    private LeapYearGenerator mGenerator = new LeapYearGenerator();
    private int negative = -1;
    private int twenty = 20;

    @Rule
    public ExpectedException mExpectedException = ExpectedException.none();

    private Integer[] nextTwentyLeapYear = {
            2016, 2020, 2024, 2028, 2032,
            2036, 2040, 2044, 2048, 2052,
            2056, 2060, 2064, 2068, 2072,
            2076, 2080, 2084, 2088, 2092,
    };

    @Test
    public void testNextZeroLeapYears() {
        expectException();
        mGenerator.generate(0);
    }

    @Test
    public void testNextNegativeLeapYears() {
        expectException();
        mGenerator.generate(-1);
    }

    private void expectException() {
        mExpectedException.expect(IllegalArgumentException.class);
        mExpectedException.expectMessage("The factor must be positive");
    }

    @Test
    public void testNextTwentyLeapYears() {
//        List<Integer> expectedLeapYears = Arrays.asList(nextTwentyLeapYear);
        assertEquals(Arrays.asList(nextTwentyLeapYear), Arrays.asList(mGenerator.generate(20)));
    }
}
