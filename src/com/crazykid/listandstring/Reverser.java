package com.crazykid.listandstring;

import java.util.Comparator;

public class Reverser {
    public Object[] reverse(Object[] list) {
        if (null == list) {
            throw new NullPointerException("The list cannot be null");
        }
        int tail = list.length-1;
        for (int head=0; head<=tail; head++, tail--) {
            Object tem = list[head];
            list[head] = list[tail];
            list[tail] = tem;
        }
        return list;
    }


}
