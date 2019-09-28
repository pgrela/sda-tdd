package com.pgrela.sda.tdd.time;

import java.time.Duration;
import java.time.LocalDateTime;

public class TimeSpan {
    private LocalDateTime start;
    private LocalDateTime end;

    public TimeSpan(LocalDateTime start, LocalDateTime end) {
        if (start.isBefore(end)) {
            this.start = start;
            this.end = end;
        } else {
            this.start = end;
            this.end = start;
        }
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public Duration length(){
        return Duration.between(start, end);
    }
}
