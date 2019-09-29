package com.pgrela.sda.tdd.month;

import java.time.LocalDate;
import java.time.YearMonth;

public class DaysMonth {
    private DateProvider dateProvider;

    public DaysMonth(DateProvider dateProvider) {
        this.dateProvider = dateProvider;
    }

    // TODO(FEBRUARY) inject DateProvider
    int getDaysOfCurrentMonth() {
        return YearMonth.from(dateProvider.now()).lengthOfMonth();
    }
}
