package com.pgrela.sda.tdd.calculator;

import java.util.Arrays;

class MultiFibonacciSequence {
    private final int[] startingSequence;

    MultiFibonacciSequence(int[] startingSequence) {
        this.startingSequence = Arrays.copyOf(startingSequence, startingSequence.length);
    }

    int getNthElement(int n) {
        if (n < startingSequence.length) {
            return startingSequence[n];
        }               
        int result = 0;
        for (int i = 0; i < startingSequence.length; i++) {
            result += getNthElement(n - 1 - i);
        }
        return result;
    }
}
