package com.crazykid.listandstring;

public class ContainsUtil {
    public static boolean isIn(Object element, Object[] objects) {
        if (null == element) {
            return isContainsNull(objects);
        } else {
            return isContainTheElement(element, objects);
        }
    }

    private static boolean isContainTheElement(Object element, Object[] objects) {
        for (Object object : objects) {
            if (element.equals(object)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isContainsNull(Object[] objects) {
        for (Object object : objects) {
            if (null == object)
                return true;
        }
        return false;
    }
}
