package com.crazykid.junior;

public abstract class AbstractSigma {
    private int mDefaultResult = 0;
    private double mRandomNum = 0;
    private double mPossibility = 0.4;

    private PlusAgr mPlusAgr = new PlusAgr();
    private MultiAgr mMultiAgr = new MultiAgr();
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
            if (needCalculate(index))
                mDefaultResult = mCalculateAgr.calculate(mDefaultResult, index);
        }
        return mDefaultResult;
    }

    private void prepare() {
        if (getRandomNumber() > getPossibility()) {
            mCalculateAgr = mMultiAgr;
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

    public void setPossibility(double possibility) {
        if (possibility < 0) {
            mPossibility = 0;
        }
        if (possibility > 1) {
            mPossibility = 1;
        }
        mPossibility = possibility;
    }

    public double getPossibility() {
        return mPossibility;
    }

    public double getLastNumber() {
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

    class MultiAgr implements CalculateAgr {
        @Override
        public int calculate(int... factors) {
            int result = 1;
            for (int factor : factors) {
                result *= factor;
            }
            return result;
        }
    }
}
