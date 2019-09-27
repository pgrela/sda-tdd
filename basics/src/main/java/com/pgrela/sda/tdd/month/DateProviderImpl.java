package com.pgrela.sda.tdd.month;

import java.time.LocalDate;

public class DateProviderImpl implements DateProvider {
    @Override
    public LocalDate now(){
        return LocalDate.now();
    }
}
