package com.pgrela.sda.tdd.month;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

class DaysMonthTest {
    // TODO(FEBRUARY) fix test
    @Test
    void shouldReturn29ForFebruary2024() {
        // given
        LocalDate firstFeb2024 = LocalDate.of(2024, Month.FEBRUARY, 1);
        DaysMonth daysMonth = new DaysMonth(new FakeDateProvider(firstFeb2024));

        // when
        int days = daysMonth.getDaysOfCurrentMonth();

        // then
        Assertions.assertEquals(29, days);
    }

    class FakeDateProvider implements DateProvider {

        private LocalDate date;

        public FakeDateProvider(LocalDate date) {
            this.date = date;
        }

        @Override
        public LocalDate now() {
            return date;
        }
    }
}