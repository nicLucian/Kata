package com.crazykid.junior;

//we do not consider the number that overflow the integer number.
public class Sigma extends AbstractSigma {

    @Override
    protected boolean needCalculate(int factor) {
        return true;
    }
}
