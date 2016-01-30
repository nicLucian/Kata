package com.crazykid.junior;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class TestSigma {

    private AbstractSigma sigma = new Sigma();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testSigmaPositive() {
        int six = 6;
        int sigmaSix = 14;
        int resultOfSigmaSix = sigma.apply(six);
        assertEquals(sigmaSix, resultOfSigmaSix);

        int ten = 10;
        int sigmaTen = 33;
        int resultOfSigmaTen = sigma.apply(ten);
        assertEquals(sigmaTen, resultOfSigmaTen);
    }

    @Test
    public void testSigmaZero() {
        int zero = 0;
        expectIllegalArgumentException();
        sigma.apply(zero);
    }

    @Test
    public void testSigmaNegative() {
        int negative = -10;
        expectIllegalArgumentException();
        sigma.apply(negative);
    }

    private void expectIllegalArgumentException() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("the factor must be positive");
    }
}
