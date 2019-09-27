package com.pgrela.sda.tdd.week;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class DaysOfWeekTest {
    @Test
    void testDays() {
        List<String> days = new DaysOfWeek().daysOfWeek();

        // TODO(ASSERTIONS_MESSAGES) Display "Monday is not `Poniedziałek`!" if test fails
        Assertions.assertEquals("Poniedziałek", days.get(0));
        // TODO(ASSERTIONS_MESSAGES) assert other days of week

        // TODO(ASSERT_ALL) use Assertions.assertAll()
    }
}