package com.crazykid.junior;

//we do not consider the number that overflow the integer number.
public class Sigma extends AbstractSigma {

    @Override
    protected boolean needPlus(int factor) {
        return factor % 3 == 0 || factor % 5 == 0;
    }
}
