package com.pgrela.sda.tdd.calculator;

import org.junit.jupiter.api.*;

// TODO(BEFORE_ALL_AFTER_ALL) configure test class with
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BasicCalculatorTest {
    private BasicCalculator calculator;

    // TODO(BEFORE_ALL_AFTER_ALL) use @BeforeAll, @AfterAll

    // TODO(BEFORE_AFTER) create new object BasicCalculator each time @Before test, destroy @After

    @BeforeAll
    void createCalculator() {
        System.out.println("Tworzę obiekt kalkulator");
        calculator = new BasicCalculator();
    }

    @Test
    void shouldAddTwoPositiveNumbers() {
        // TODO(FIRST_TEST) add two numbers using BasicCalculator.add()
        int result = calculator.add(4, 5);

        // TODO(FIRST_TEST) check if result is as expected using Assertions.assertEquals()
        Assertions.assertEquals(9, result);
    }

    @Test
        // TODO(BASIC_CALCULATOR) write tests for other (non private) methods in class BasicCalculator
    void shouldMultiply() {
        int result = calculator.multiply(3, 4);

        Assertions.assertEquals(12, result);
    }
}