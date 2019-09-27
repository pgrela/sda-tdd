package com.pgrela.sda.tdd.calculator;

import org.junit.jupiter.api.Test;

// TODO(BEFORE_ALL_AFTER_ALL) configure test class with @TestInstance(Lifecycle.PER_CLASS)
class BasicCalculatorTest {

    // TODO(BEFORE_ALL_AFTER_ALL) use @BeforeAll, @AfterAll

    // TODO(BEFORE_AFTER) create new object BasicCalculator each time @Before test, destroy @After

    @Test
    void shouldAddTwoPositiveNumbers() {
        BasicCalculator calculator = new BasicCalculator();

        // TODO(FIRST_TEST) add two numbers using BasicCalculator.add()

        // TODO(FIRST_TEST) check if result is as expected using Assertions.assertEquals()
    }

    // TODO(BASIC_CALCULATOR) write tests for other (non private) methods in class BasicCalculator
}