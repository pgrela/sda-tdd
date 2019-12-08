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
        return database.getAll();
    }

    @Override
    public boolean isAvailable(Book book) {
        try {
            return database.get(book.getIsbn()) != null;
        } catch (IllegalStateException e) {
            return false;
        }
    }

    @Override
    public boolean canBeBorrowed(Book book) {
        if (!isAvailable(book)) {
            return false;
        }
        return false;
    }

    public void borrow(Book book) {
        if (!isAvailable(book)) {
            throw new BookNotAvailableException(
                    "Library does not own such book.");
        }
    }


    void addNew(Book book) {
        database.save(book.getIsbn(), book);
    }

    void remove(Book book) {
        database.remove(book.getIsbn());
    }
}
