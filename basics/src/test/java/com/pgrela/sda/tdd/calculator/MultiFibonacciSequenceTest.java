package com.pgrela.sda.tdd.calculator;

import org.junit.jupiter.api.*;

// TODO(DISPLAY_NAME) use @DisplayName to describe your test class
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MultiFibonacciSequenceTest {
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @Nested
    class ClassicFibonacciTest {
        private MultiFibonacciSequence classicFibonacci;

        @BeforeAll
        void fibonacciClassic() {
            classicFibonacci = new MultiFibonacciSequence(new int[]{0, 1});
        }

        // TODO(DISPLAY_NAME) use @DisplayName to describe your test methods
        @Test
        void shouldCompute6thFibonacciNumber() {
            // when
            int sixth = classicFibonacci.getNthElement(5);

            // then
            Assertions.assertEquals(5, sixth);
        }

        @Test
        void shouldCompute7thFibonacciNumber() {
            // when
            int seventh = classicFibonacci.getNthElement(6);

            // then
            Assertions.assertEquals(8, seventh);
        }
    }
    @DisplayName("Dziwny Fibonacci")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @Nested
    class WeirdFibonacci {

        private MultiFibonacciSequence classicFibonacci;

        @BeforeAll
        void fibonacciClassic() {
            classicFibonacci = new MultiFibonacciSequence(new int[]{-1, 2, 1});
        }
        @Test
        @DisplayName("Szówsty wyraz ciągu fibonacciego powinien być równy 8")
        void shouldCompute6thWeirdFibonacciNumber() {
            // when
            int seventh = classicFibonacci.getNthElement(5);

            // then
            Assertions.assertEquals(8, seventh);
        }

        @Test
        void shouldCompute5thWeirdFibonacciNumber() {
            // when
            int seventh = classicFibonacci.getNthElement(4);

            // then
            Assertions.assertEquals(5, seventh);
        }
    }

}