package com.crazykid.listandstring;

public class Fibonacci {

    public long get(int number) {
        handleInvalidateInput(number);

        return getFibonacci(number);
    }

    private long getFibonacciByRecurce(int number) {
        if (number == 1 || number == 2) {
            return 1;
        } else {
            return getFibonacciByRecurce(number - 1) + getFibonacciByRecurce(number - 2);
        }
    }

    private long getFibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        long a = 1, b = 1;
        for (int i = 0; i < (number - 1) / 2; i++) {
            a = a + b;
            b = a + b;
        }
        return number % 2 == 0 ? b : a;
    }

    private void handleInvalidateInput(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("The number must be positive!");
        }
    }
}
