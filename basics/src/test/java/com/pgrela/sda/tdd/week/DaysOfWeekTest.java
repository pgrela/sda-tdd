package com.pgrela.sda.tdd.week;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class DaysOfWeekTest {
    @Test
    void testDays() {
        List<String> days = new DaysOfWeek().daysOfWeek();

        // TODO(ASSERTIONS_MESSAGES) Display "Monday is not `Poniedziałek`!" if test fails
        Assertions.assertAll(
                () -> Assertions.assertEquals("Poniedziałek", days.get(0), "Coś poszło źle"),
                () -> Assertions.assertEquals("Wtorek", days.get(1), "Coś poszło źle"),
                () -> Assertions.assertEquals("Środa", days.get(2), "Coś poszło źle")
        );// TODO(ASSERTIONS_MESSAGES) assert other days of week

        // TODO(ASSERT_ALL) use Assertions.assertAll()
    }
}