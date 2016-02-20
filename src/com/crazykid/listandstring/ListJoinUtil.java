package com.crazykid.listandstring;

public class ListJoinUtil {
    public static Object[] join(Object[] firstSrcArray, Object[] secondSrcArray) {
        handleNullObject(firstSrcArray, secondSrcArray);
        Object[] desArray = initNewArray(firstSrcArray, secondSrcArray);
        joinSrcArraysToDesArray(firstSrcArray, secondSrcArray, desArray);
        return desArray;
    }

    private static void handleNullObject(Object[] objects1, Object[] objects2) {
        if (null == objects1 || null == objects2) {
            throw  new NullPointerException("Both list cannot be null");
        }
    }

    private static Object[] initNewArray(Object[] objects1, Object[] objects2) {
        int newListLength = objects1.length + objects2.length;
        return new Object[newListLength];
    }

    private static void joinSrcArraysToDesArray(Object[] objects1, Object[] objects2, Object[] newList) {
        System.arraycopy(objects1,0,newList,0,objects1.length);
        System.arraycopy(objects2,0,newList,objects1.length,objects2.length);
    }
}
