package com.pgrela.sda.tdd.week;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class DaysOfWeek {
    List<String> daysOfWeek() {
        return Arrays.stream(DayOfWeek.values())
                .map(day -> day.getDisplayName(TextStyle.FULL, new Locale("pl")))
                //.map(lowerCaseDay -> lowerCaseDay.substring(0,1).toUpperCase()+lowerCaseDay.substring(1))
                .collect(Collectors.toList());
    }
}
