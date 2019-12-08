package com.pgrela.sda.tdd.library.domain;

public class BookNotAvailableException extends RuntimeException {
    public BookNotAvailableException() {
    }

    public BookNotAvailableException(String message) {
        super(message);
    }
}
