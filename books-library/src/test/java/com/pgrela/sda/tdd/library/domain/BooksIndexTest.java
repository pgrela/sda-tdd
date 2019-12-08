package com.pgrela.sda.tdd.library.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BooksIndexTest {
    private static final Book BOOK = new Book("9", "Pan Tadeusz", "Adam Mickiewicz");

    private BooksIndex booksIndex;

    @BeforeEach
    void setupBooksIndex() {
        booksIndex = new BooksIndex(new InMemoryBookRepository());
    }
    @Test
    void shouldAddBookToIndex() {
        // when
        booksIndex.addNew(BOOK);

        // then
        Assertions.assertThat(booksIndex.allBooks()).contains(BOOK);
    }
    @Test
    void shouldRemoveBook() {
        // when
        booksIndex.remove(BOOK);

        // then
        Assertions.assertThat(booksIndex.allBooks()).doesNotContain(BOOK);
    }
}