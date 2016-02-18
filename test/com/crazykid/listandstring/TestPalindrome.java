package com.crazykid.listandstring;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class TestPalindrome {
    @Rule
    public ExpectedException mExpectedException = ExpectedException.none();

    @Test
    public void testIsNullPalindrome() {
        mExpectedException.expect(NullPointerException.class);
        mExpectedException.expectMessage("The string cannot be null");
        String nullString = null;
        Palindrome.isPalindrome(nullString);
    }

    @Test
    public void testIsPalindrome() {
        String palindromeString = "a";
        String palindromeString1 = "abba";
        String palindromeString2 = "aba";

        assertTrue(Palindrome.isPalindrome(palindromeString));
        assertTrue(Palindrome.isPalindrome(palindromeString1));
        assertTrue(Palindrome.isPalindrome(palindromeString2));

    }

    @Test
    public void testIsNotPalindrome() {
        String notPalindromeString = "abc";
        String notPalindromeString1 = "abcdba";
        String notPalindromeString2 = "abcdefdcba";

        assertFalse(Palindrome.isPalindrome(notPalindromeString));
        assertFalse(Palindrome.isPalindrome(notPalindromeString1));
        assertFalse(Palindrome.isPalindrome(notPalindromeString2));
    }
}
