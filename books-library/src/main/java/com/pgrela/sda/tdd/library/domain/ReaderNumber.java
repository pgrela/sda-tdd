package com.pgrela.sda.tdd.library.domain;

import java.util.Objects;

public class ReaderNumber {
    private String number;

    private ReaderNumber(String number) {
        this.number = number;
    }

    static ReaderNumber newReaderNumber(String number) {
        if (number == null) {
            throw new IllegalArgumentException("Reader number must not be null.");
        }
        if (number.trim().length() == 0) {
            throw new IllegalArgumentException("Reader number must not be empty.");
        }
        return new ReaderNumber(number);
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "ReaderNumber{" +
                "number='" + number + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReaderNumber that = (ReaderNumber) o;
        return number.equals(that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
