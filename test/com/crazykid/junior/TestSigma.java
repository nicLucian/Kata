package com.crazykid.junior;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class TestSigma {
    private int six = 6;
    private int sigmaSix = 21;

    private int ten = 10;
    private int sigmaTen = 55;

    private int zero = 0;
    private int negative = -10;
    private Sigma sigma = new Sigma();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testSigmaPositive() {
        int resultOfSigmaSix = sigma.apply(six);
        assertEquals(sigmaSix, resultOfSigmaSix);

        int resultOfSigmaTen = sigma.apply(ten);
        assertEquals(sigmaTen, resultOfSigmaTen);
    }

    @Test
    public void testSigmaZero() {
        expectIllegalArgumentException();
        sigma.apply(zero);
    }

    @Test
    public void testSigmaNegative() {
        expectIllegalArgumentException();
        sigma.apply(negative);
    }

    private void expectIllegalArgumentException() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("the factor must be positive");
    }
}
