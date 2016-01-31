package com.crazykid.junior;

import java.util.ArrayList;
import java.util.List;

//There is maybe is more efficient way, but right now I cannot figure it out.
//If you got it, please teach me a lesson.
public class PrimeNumbers {
    public List<Integer> getPrimeNumbers(int factor) {
        handleException(factor);
        return generatePrimeNumList(factor);
    }

    private void handleException(int factor) {
        if (factor < 2) {
            throw  new IllegalArgumentException("The factor cannot be less than 2");
        }
    }

    private List<Integer> generatePrimeNumList(int factor) {
        List<Integer> primeNumList = new ArrayList<>();
        for (int i = 2; i < factor; i++) {
            if (isPrimeNumber(i)) {
                primeNumList.add(i);
            }
        }
        return primeNumList;
    }

    private boolean isPrimeNumber(int number) {
        for (int i=2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
