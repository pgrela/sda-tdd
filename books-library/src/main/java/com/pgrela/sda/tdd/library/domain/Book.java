package com.pgrela.sda.tdd.library.domain;

import java.util.Objects;

public class Book {
    // https://en.wikipedia.org/wiki/International_Standard_Book_Number
    private String isbn;
    private String title;
    private String author;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
