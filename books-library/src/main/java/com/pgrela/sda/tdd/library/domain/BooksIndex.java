package com.pgrela.sda.tdd.library.domain;

import java.util.Collection;

// TODO(BooksIndex)
class BooksIndex implements PublicBookIndex {

    private BookRepository database;

    public BooksIndex(BookRepository database) {
        this.database = database;
    }

    @Override
    public Collection<Book> allBooks() {
        return null;
    }

    @Override
    public boolean isAvailable(Book book) {
        return false;
    }

    void addNew(Book book) {

    }

    void remove(Book book) {

    }
}
