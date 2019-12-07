package com.pgrela.sda.tdd.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
class WeirdCalculatorTest {

    private WeirdCalculator weirdCalculator;

    @BeforeEach
    void createCalculator() {
        weirdCalculator = new WeirdCalculator();
    }

    // TODO(FIRST_PARAMETERIZED) use @ParameterizedTest and @ValueSource to test many numbers
    @ParameterizedTest
    @ValueSource(ints={-22,0,2,4})
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
    @ParameterizedTest
    @MethodSource
    void shouldComputeModulo4(int number) {
        Assertions.assertEquals(number % 4, weirdCalculator.modulo4(number));
    }

    IntStream shouldComputeModulo4() {
        // TODO(PARAMETERIZED_METHOD) generate numbers from 0 to 1000
        return IntStream.rangeClosed(0,1000);
    }
}