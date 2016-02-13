package com.crazykid.listandstring;

import java.util.List;

public class MaxNumInList {
    public int max(int[] numbers) {
        handleNull(numbers);
        handleEmpty(numbers);
        return getMaxNum(numbers);
    }

    public Comparable max(List<? extends Comparable> objects) {
        handleNull(objects);
        handleEmpty(objects);
        return getMax(objects);
    }

    private void handleNull(Object numbers) {
        if (numbers == null) {
            throw new NullPointerException("The numbers cannot " +
                    "be null");
        }

    }

    private void handleEmpty(List objects) {
        if (objects.size() == 0) {
            throw new IllegalArgumentException("The numbers cannot " +
                    "be empty");
        }
    }


    private Comparable getMax(List<? extends Comparable> objects) {
        Comparable currentMinObject = objects.get(0);
        for (Comparable t : objects) {
            if (null == t) {
                throw new NullPointerException("The element cannot be null!");
            }
            if (t.compareTo(currentMinObject) >= 0) {
                currentMinObject = t;
            }
        }
        return currentMinObject;
    }

    private void handleEmpty(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("The numbers cannot " +
                    "be empty");
        }
    }

    private int getMaxNum(int[] numbers) {
        int currentMaxNum = numbers[0];
        for (int value : numbers) {
            if (value >= currentMaxNum) {
                currentMaxNum = value;
            }
        }
        return currentMaxNum;
    }
}
