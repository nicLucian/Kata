package com.crazykid.listandstring;

public class SumUtil {

    public static int sumByRecurseLoop(int[] array) {
        handleNull(array);
        return sumByRecurseFromIndex(array, 0);
    }

    private static int sumByRecurseFromIndex(int[] array, int index) {
        if (index == array.length-1) {
            return array[array.length-1];
        }
        return sumByRecurseFromIndex(array, index + 1) + array[index];
    }

    public static int sumByWhileLoop(int[] array) {
        handleNull(array);
        int result = 0, i = 0;
        int length = array.length;
        while (i < length) {
            result += array[i++];
        }
        return result;
    }

    public static int sumByForLoop(int[] array) {
        handleNull(array);
        int result = 0;
        for (int anArray : array) {
            result += anArray;
        }
        return result;
    }

    private static void handleNull(int[] array) {
        if (null == array) {
            throw new NullPointerException("Array cannot be null");
        }
    }
}
