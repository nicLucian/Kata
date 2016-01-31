package com.crazykid.junior;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TestPrimeNumbers {
    private PrimeNumbers mPrimeNumbers;
    private List<Integer> mPrimeNumbersIn20;
    private List<Integer> mPrimeNumbersIn40;
    @Rule
    public ExpectedException mExpectedException = ExpectedException.none();

    private final static Integer[] PRIME_NUMBERS_IN_20 = {2, 3, 5, 7, 11, 13, 17, 19};
    private final static Integer[] PRIME_NUMBERS_IN_40 = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};

    @Before
    public void setup() {
        mPrimeNumbers = new PrimeNumbers();
        mPrimeNumbersIn20 = Arrays.asList(PRIME_NUMBERS_IN_20);
        mPrimeNumbersIn40 = Arrays.asList(PRIME_NUMBERS_IN_40);
    }


    @Test
    public void testGetPrimeNumbers() {
        int factor20 = 20;
        assertEquals(mPrimeNumbersIn20, mPrimeNumbers.getPrimeNumbers(factor20));

        int factor40 = 40;
        assertEquals(mPrimeNumbersIn40, mPrimeNumbers.getPrimeNumbers(factor40));
    }

    @Test
    public void testFactorIsOne() {
        prepareTheExpectedException();
        mPrimeNumbers.getPrimeNumbers(1);
    }

    @Test
    public void testFactorIsZero() {
        prepareTheExpectedException();
        mPrimeNumbers.getPrimeNumbers(0);
    }

    @Test
    public void testFactorIsNegative() {
        prepareTheExpectedException();
        mPrimeNumbers.getPrimeNumbers(-1);
    }

    private void prepareTheExpectedException() {
        mExpectedException.expect(IllegalArgumentException.class);
        mExpectedException.expectMessage("The factor cannot be less than 2");
    }
}
