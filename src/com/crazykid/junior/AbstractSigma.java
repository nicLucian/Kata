package com.crazykid.junior;

public abstract class AbstractSigma {
    public int apply(int factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("the factor must be positive");
        }
        return calculateResult(factor);
    }

    private int calculateResult(int factor) {
        int result = 0;
        for (int index = 1; index <= factor; index++) {
            if(needPlus(index))
                result += index;
        }
        return result;
    }

    abstract protected boolean needPlus(int factor);
}
