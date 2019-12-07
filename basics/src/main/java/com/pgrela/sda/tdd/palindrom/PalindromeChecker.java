package com.pgrela.sda.tdd.palindrom;

public class PalindromeChecker {
    public boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();

        return text.equals(reversed);
    }

    public boolean isPalindromeIgnoringCase(String text) {
        return isPalindrome(text.toLowerCase());
    }

    public boolean isPalindromeIgnoringSpaces(String text) {
        return isPalindrome(text.replace(" ", ""));
    }

    public boolean isPalindromeIgnoringWhiteChars(String text) {
        return isPalindromeIgnoringSpaces(
                text.replace("\t","")
                        .replace("\n", ""));
    }
}
