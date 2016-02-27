package com.crazykid.listandstring;

public class SortUtil {
    public static int[] selectSort(int[] array) {
        handleNullArray(array);
        int minElementsIndex = 0;
        int minElement = 0;
        int tmp = 0;

        for (int i = 0; i < array.length; i++) {
            minElementsIndex = i;

            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minElementsIndex]) {
                    minElementsIndex = j;
                }
            }

            minElement = array[minElementsIndex];

            tmp = array[i];
            array[i] = minElement;
            array[minElementsIndex] = tmp;
        }
        return array;
    }

    public static int[] insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i, element = array[i];
            while (j > 0 && element < array[j-1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = element;
        }
        return array;
    }


    private static void handleNullArray(int[] array) {
        if (null == array) {
            throw new NullPointerException("The array cannot be null!");
        }
    }
}
