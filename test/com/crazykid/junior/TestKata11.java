package com.crazykid.junior;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;

//sorry I Cannot figure a good name for this one
public class TestKata11 {
    private Kata11 mKata11 = new Kata11();
    private int one = 1;
    private int three = 3;
    private int zero = 0;

    private Double resultOfOne = 4 * 1.0;
    private Double resultOfFive = 4 * (1 - 1/3.0 + 1/5.0);

    @Rule
    public ExpectedException mExpectedException = ExpectedException.none();

    @Test
    public void testCalculate() {
        assertEquals(resultOfOne, mKata11.calculate(one));
        assertEquals(resultOfFive, mKata11.calculate(three));
    }

    @Test
    public void testWhenKLessThenOne() {
        mExpectedException.expect(IllegalArgumentException.class);
        mExpectedException.expectMessage("The factor be must greeter than zero");
        mKata11.calculate(zero);
    }
}
