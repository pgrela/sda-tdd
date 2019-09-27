package com.pgrela.sda.tdd.month;

import java.time.LocalDate;
import java.time.YearMonth;

public class DaysMonth {
    // TODO(FEBRUARY) inject DateProvider
    int getDaysOfCurrentMonth() {
        return YearMonth.from(LocalDate.now()).lengthOfMonth();
    }
}
