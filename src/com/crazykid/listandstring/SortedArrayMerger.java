package com.crazykid.listandstring;

public class SortedArrayMerger {

    public Object[] merge(Object[] firstSortedArray, Object[] secondSortedArray) {
        handleNullArrays(firstSortedArray, secondSortedArray);
        return mereArrays(firstSortedArray, secondSortedArray);
    }

    private void handleNullArrays(Object[] firstSortedArray, Object[] secondSortedArray) {
        if (firstSortedArray == null || secondSortedArray == null) {
            throw new NullPointerException("Both arrays cannot be null");
        }
    }

    private Object[] mereArrays(Object[] firstArray, Object[] secondArray) {
        int firstIndex = 0, secondIndex = 0;
        Object[] targetArray = new Object[firstArray.length + secondArray.length];

        for (int i = 0; i < targetArray.length; i++) {
            if (firstIndex >= firstArray.length) {
                System.arraycopy(secondArray, secondIndex,
                        targetArray, firstIndex + secondIndex,
                        secondArray.length - secondIndex);
                return targetArray;
            }

            if (secondIndex >= secondArray.length) {
                System.arraycopy(firstArray, firstIndex,
                        targetArray, firstIndex + secondIndex,
                        firstArray.length - firstIndex);
                return targetArray;
            }

            Comparable firstElement = (Comparable) firstArray[firstIndex];
            Comparable secondElement = (Comparable) secondArray[secondIndex];
            if (firstElement.compareTo(secondElement) < 0) {
                targetArray[firstIndex + secondIndex] = firstElement;
                firstIndex++;
            } else {
                targetArray[firstIndex + secondIndex] = secondElement;
                secondIndex++;
            }

        }
        return targetArray;
    }
}
