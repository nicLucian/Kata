package com.crazykid.listandstring;

public class ArrayMerger {
    public static Object[] merge(Object[] firstArray, Object[]
            secondArray) {
        handleNullArrays(firstArray, secondArray);
        Object[] targetArray = initTargetArray(firstArray, secondArray);
        mergeArraysToTargetArray(firstArray, secondArray, targetArray);
        return targetArray;
    }

    private static void handleNullArrays(Object[] firstArray, Object[] secondArray) {
        if (firstArray == null || secondArray == null) {
            throw new NullPointerException("Both arrays cannot be null");
        }
    }

    private static Object[] initTargetArray(Object[] firstArray, Object[] secondArray) {
        return new Object[firstArray.length + secondArray.length];
    }

    private static void mergeArraysToTargetArray(Object[] firstArray,
                                                 Object[] secondArray,
                                                 Object[] targetArray) {
        mergeCommonIndexElements(firstArray, secondArray, targetArray);
        mergeTheRestElements(firstArray, secondArray, targetArray);
    }

    private static void mergeCommonIndexElements(Object[] firstArray,
                                                 Object[] secondArray,
                                                 Object[] targetArray) {
        for (int i=0,j = 0; i<firstArray.length && j<secondArray.length;) {
            targetArray[j + i] = firstArray[i];
            i = i + 1;
            targetArray[i + j] = secondArray[j];
            j = j + 1;
        }
    }

    private static void mergeTheRestElements(Object[] firstArray,
                                             Object[] secondArray,
                                             Object[] targetArray) {
        int greaterLength = Math.max(firstArray.length, secondArray.length);
        int lesserLength = Math.min(firstArray.length, secondArray.length);
        Object[] greaterArray = getGreaterLengthArray(firstArray, secondArray);
        System.arraycopy(greaterArray, lesserLength,
                         targetArray, lesserLength * 2,
                         greaterLength - lesserLength);
    }

    private static Object[] getGreaterLengthArray(Object[] firstArray, Object[] secondArray) {
        return firstArray.length > secondArray.length ? firstArray : secondArray;
    }
}