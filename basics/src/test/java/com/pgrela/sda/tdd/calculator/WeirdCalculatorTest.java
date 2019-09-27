package com.pgrela.sda.tdd.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
class WeirdCalculatorTest {

    private WeirdCalculator weirdCalculator;

    @BeforeEach
    void createCalculator() {
        weirdCalculator = new WeirdCalculator();
    }

    // TODO(FIRST_PARAMETERIZED) use @ParameterizedTest and @ValueSource to test many numbers
    void shouldDetectEvenNumbers(int number) {
        Assertions.assertTrue(weirdCalculator.isEven(number));
    }

    // TODO(FIRST_PARAMETERIZED) use @ParameterizedTest and @ValueSource to test many numbers
    // TODO(FIRST_PARAMETERIZED) find cases that make test fail
    void shouldSkipZeroPrefix(String number) {
        String result = weirdCalculator.skipZeroPrefix(number);

        // TODO(FIRST_PARAMETERIZED) assert result
    }

    // TODO(PARAMETERIZED_METHOD) use @MethodSource
    void shouldComputeModulo4(int number) {
        Assertions.assertEquals(number % 4, weirdCalculator.modulo4(number));
    }

    List<Integer> shouldComputeModulo4() {
        // TODO(PARAMETERIZED_METHOD) generate numbers from 0 to 1000
        return null;
    }
}