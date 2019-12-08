package com.pgrela.sda.tdd.library.domain;

import java.util.Collection;

public interface PublicBookIndex {
    Collection<Book> allBooks();

    boolean isAvailable(Book book);

    boolean canBeBorrowed(Book book);
}
