package com.pgrela.sda.tdd.month;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

class DaysMonthTest {
    // TODO(FEBRUARY) fix test
    @Test
    void shouldReturn29ForFebruary2024() {
        LocalDate firstFeb2024 = LocalDate.of(2024, Month.FEBRUARY, 1);

        int days = new DaysMonth().getDaysOfCurrentMonth();

        Assertions.assertEquals(29, days);
    }
}