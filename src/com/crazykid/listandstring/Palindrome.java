package com.crazykid.listandstring;

public class Palindrome {
    public static boolean isPalindrome(String string) {
        if (null == string) {
            throw new NullPointerException("The string cannot be null");
        }

        char[] chars = string.toCharArray();
        int length = chars.length;
        int tail = length - 1;
        int head = 0;
        while (head < tail) {
            if (chars[head] != chars[tail])
                return false;
            head ++;
            tail --;
        }
        return true;
    }
}
