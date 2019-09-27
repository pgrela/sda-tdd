package com.pgrela.sda.tdd.calculator;

import org.junit.jupiter.api.Test;

class RadixCalculatorTest {

    // TODO(ASSERT_THROWS) fix using Assertions.assertThrows()
    @Test
    void shouldThrowExceptionForRadix0() {
        new RadixCalculator(0);
    }

    // TODO(ASSERT_THROWS) fix using Assertions.assertThrows()
    @Test
    void shouldThrowExceptionWhenAddingNonBinaryNumber() {
        RadixCalculator radixCalculator = new RadixCalculator(2);

        radixCalculator.add("4", "345");
    }
}