package com.crazykid.junior;

public class Kata11 {
    public Double calculate(int factor) {
        handleException(factor);
        return getResult(factor);
    }

    private void handleException(int factor) {
        if (factor < 1) {
            throw  new IllegalArgumentException("The factor be must greeter than zero");
        }
    }

    private double getResult(int factor) {
        double result = 0;
        for (int i = 1; i <= factor; i++) {
            result += getItemValue(i);
        }
        result *= 4;
        return result;
    }

    public double getItemValue(int factor) {
        return Math.pow(-1.0, factor + 1.0) / (2*factor - 1.0);
    }
}
