package com.pgrela.sda.tdd.junit4.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.fail;

public class RadixCalculatorTest {
    // TODO(JUNIT4_RULE) annotate and assign this field
    public ExpectedException expectedException;

    @Test
    public void shouldAddBinaryNumbers(){
        // given
        RadixCalculator radixCalculator = new RadixCalculator(2);

        // when
        String result = radixCalculator.add("1","1");

        // then
        Assert.assertEquals("10", result);
    }

    // TODO(JUNIT4_ANCIENT) fix the test
    @Test
    public void ancientExceptionStyle() {
        RadixCalculator radixCalculator = new RadixCalculator(2);
        try {
            radixCalculator.add("1", "1");
            fail("Should have failed!");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(IllegalArgumentException.class.isAssignableFrom(e.getClass()));
        }
    }

    // TODO(JUNIT4_EXCEPTION) fix the test by using expected in @Test annotation
    @Test
    public void shouldThrowExceptionWhenAddingNonBinaryNumber() {
        RadixCalculator radixCalculator = new RadixCalculator(1);

        radixCalculator.add("777", "999");
    }

    // TODO(JUNIT4_RULE) fix the test by using expectedException field
    @Test
    public void shouldThrowExceptionWhenAddingNonBinaryNumber_Rule() {
        RadixCalculator radixCalculator = new RadixCalculator(1);

        radixCalculator.add("777", "999");
    }


}