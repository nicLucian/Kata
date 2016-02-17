package com.crazykid.listandstring;

public class OddElementsCatcher {
    public Object[] catchOddPositionElements(Object[] array) {
        handleNullArray(array);
        return handleNotNullArray(array);
    }

    private void handleNullArray(Object[] array) {
        if (null == array) {
            throw new NullPointerException("The array cannot be null");
        }
    }

    //数组的第一元素是下标为0的元素
    private Object[] handleNotNullArray(Object[] array) {
        int arrayLength = array.length;
        Object[] oddPositionElements = initOddPositionElements(arrayLength);

        int index = 0;
        for (int i = 0; i < arrayLength; i ++) {
            if (!isOddNumber(i)) {
                oddPositionElements[index++] = array[i];
            }
        }

        return oddPositionElements;
    }

    private Object[] initOddPositionElements(int arrayLength) {
        int oddPositionElementsLength = getOddPositionElementsLength(arrayLength);
        return new Object[oddPositionElementsLength];
    }

    private int getOddPositionElementsLength(int arrayLength) {
        return (arrayLength + 1) / 2;
    }

    private boolean isOddNumber(int i) {
        return i % 2 != 0;
    }
}
