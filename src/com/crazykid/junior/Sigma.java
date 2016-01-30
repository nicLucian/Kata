package com.crazykid.junior;

//we do not consider the number that overflow the integer number.
public class Sigma {
    public int apply(int factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("the factor must be positive");
        }
        return calculateResult(factor);
    }

    private int calculateResult(int factor) {
        int result = 0;
        for (int index = 1; index <= factor; index++) {
            result += index;
        }
        return result;
    }
}
