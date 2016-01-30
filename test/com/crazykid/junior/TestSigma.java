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
        int six = 4;
        int sigmaSixPlus = 10;
        int sigmaSixMul = 24;
        int resultOfSigmaSix = sigma.apply(six);
        if (sigma.getFieldRandomNumber() > 0.4) {
            assertEquals(sigmaSixMul, resultOfSigmaSix);
        } else {
            assertEquals(sigmaSixPlus, resultOfSigmaSix);
        }

        int five = 5;
        int sigmaTenPlus = 15;
        int sigmaTenMul = 120;
        int resultOfSigmaTen = sigma.apply(five);
        if (sigma.getFieldRandomNumber() > 0.4) {
            assertEquals(sigmaTenMul, resultOfSigmaTen);
        } else {
            assertEquals(sigmaTenPlus, resultOfSigmaTen);
        }
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
