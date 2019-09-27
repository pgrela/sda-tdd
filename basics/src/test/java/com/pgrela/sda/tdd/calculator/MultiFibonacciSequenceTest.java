package com.pgrela.sda.tdd.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// TODO(DISPLAY_NAME) use @DisplayName to describe your test class
class MultiFibonacciSequenceTest {
    // TODO(DISPLAY_NAME) use @DisplayName to describe your test methods
    @Test
    void shouldCompute6thFibonacciNumber() {
        // given
        // TODO(NESTED) do not repeat tested object creation code
        MultiFibonacciSequence classicFibonacci = new MultiFibonacciSequence(new int[]{0, 1});

        // when
        int sixth = classicFibonacci.getNthElement(5);

        // then
        Assertions.assertEquals(5, sixth);
    }

    // TODO(DISPLAY_NAME) use @DisplayName to describe your nested classes
    // TODO(NESTED) use @Nested annotation to group tests in nested classes
    class ClassicFibonacci {
        // TODO(NESTED) use @BeforeAll to create and configure tested object only once
    }
}