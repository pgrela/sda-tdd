package com.pgrela.sda.tdd.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class RadixCalculatorTest {

    // TODO(ASSERT_THROWS) fix using Assertions.assertThrows()
    @Test
    void shouldThrowExceptionForRadix0() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new RadixCalculator(0),
                "Radix cannot be less than 5!"
        );
    }

    // TODO(ASSERT_THROWS) fix using Assertions.assertThrows()
    @Test
    void shouldThrowExceptionWhenAddingNonBinaryNumber() {
        RadixCalculator radixCalculator = new RadixCalculator(2);

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> radixCalculator.add("4", "345")
        );
    }
}