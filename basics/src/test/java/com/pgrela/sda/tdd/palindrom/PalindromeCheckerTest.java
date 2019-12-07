package com.pgrela.sda.tdd.palindrom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PalindromeCheckerTest {

    private PalindromeChecker palindromeChecker;

    @BeforeAll
    void createPalindromeChecker() {
        palindromeChecker = new PalindromeChecker();
    }

    @ParameterizedTest(name = "Should report {0} as palindrome.")
    @ValueSource(strings = {"kajak", "inni", "123 321", ""})
    void isPalindrome(String text) {
        Assertions.assertTrue(palindromeChecker.isPalindrome(text));
    }
    @ParameterizedTest(name = "Should report {0} as palindrome.")
    @ValueSource(strings = {"ka\t jak"})
    void isPalindromeIgnoringWhitespaces(String text) {
        Assertions.assertTrue(palindromeChecker.isPalindromeIgnoringWhiteChars(text));
    }

    @ParameterizedTest(name = "Should not report {0} as palindrome.")
    @ValueSource(strings = {"kajak2", "  h", "1234 321"})
    void isNotPalindrome(String text) {
        Assertions.assertFalse(palindromeChecker.isPalindrome(text));
    }
}