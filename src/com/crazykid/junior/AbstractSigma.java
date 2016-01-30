package com.crazykid.junior;

import java.util.Random;

public abstract class AbstractSigma {
    private int mDefaultResult = 0;
    private double mRandomNum = 0;

    private PlusAgr mPlusAgr = new PlusAgr();
    private MulitAgr mMulitAgr = new MulitAgr();
    private CalculateAgr mCalculateAgr = mPlusAgr;


    public interface CalculateAgr {
        int calculate(int... factors);
    }

    public int apply(int factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("the factor must be positive");
        }
        return calculateResult(factor);
    }

    private int calculateResult(int factor) {
        prepare();
        for (int index = 1; index <= factor; index++) {
            if(needCalculate(index))
                mDefaultResult = mCalculateAgr.calculate(mDefaultResult, index);
        }
        return mDefaultResult;
    }

    private void prepare() {
        if(getRandomNumber() > 0.4) {
            mCalculateAgr = mMulitAgr;
            mDefaultResult = 1;
        } else {
            mCalculateAgr = mPlusAgr;
            mDefaultResult = 0;
        }
    }

    private double getRandomNumber() {
        mRandomNum = Math.random();
        return mRandomNum;
    }

    public double getFieldRandomNumber() {
        return mRandomNum;
    }

    abstract protected boolean needCalculate(int factor);

    class PlusAgr implements CalculateAgr {
        @Override
        public int calculate(int... factors) {
            int result = 0;
            for (int factor : factors) {
                result += factor;
            }
            return result;
        }
    }

    class MulitAgr implements CalculateAgr {
        @Override
        public int calculate(int... factors) {
            int result = 1;
            for (int factor : factors) {
                result  *= factor;
            }
            return result;
        }
    }
}
