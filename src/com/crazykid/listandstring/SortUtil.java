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

    public static int[] mergeSort(int[] array) {
        handleNullArray(array);
        int[] src = array.clone();
        mergeSort(src, array, 0, array.length-1);
        return array;
    }

    private static void mergeSort(int[] src, int[] dest, int low, int high) {
        if (high - low <= 1) {
            if (dest[high] < dest[low]) {
                int tmp = dest[high];
                dest[high] = dest[low];
                dest[low] = tmp;
            }
            return;
        }

        int destLow  = low;
        int destHigh = high;
        int mid = (low + high) >>> 1;
        mergeSort(dest, src, low, mid);
        mergeSort(dest, src, mid, high);

        for (int i = destLow,p=low,q=mid;i<destHigh;i++) {
            if (q >= high || p<mid && src[p] <= src[q]) {
                dest[i] = src[p++];
            } else {
                dest[i] = src[q++];
            }
        }

//                int destLow  = low;
//        int destHigh = high;
//        int mid = (low + high) >>> 1;
//        mergeSort(dest, src, low, mid);
//        mergeSort(dest, src, mid, high);
//
//        for(int i = destLow, p = low, q = mid; i < destHigh; i++) {
//            if (q >= high || p < mid && src[p]<=src[q])
//                dest[i] = src[p++];
//            else
//                dest[i] = src[q++];
//        }



    }


    private static void handleNullArray(int[] array) {
        if (null == array) {
            throw new NullPointerException("The array cannot be null!");
        }
    }
}
