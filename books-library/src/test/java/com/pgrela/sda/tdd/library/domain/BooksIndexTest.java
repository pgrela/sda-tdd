package com.pgrela.sda.tdd.library.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BooksIndexTest {
    private static final Book PAN_TADEUSZ = new Book("9", "Pan Tadeusz", "Adam Mickiewicz");

    private BooksIndex booksIndex;

    @BeforeEach
    void setupBooksIndex() {
        booksIndex = new BooksIndex(new InMemoryBookRepository());
    }

    @Test
    void shouldAddBookToIndex() {
        // when
        booksIndex.addNew(PAN_TADEUSZ);

        // then
        assertThat(booksIndex.allBooks()).contains(PAN_TADEUSZ);
    }

    @Test
    void shouldRemoveBook() {
        // given
        booksIndex.addNew(PAN_TADEUSZ);

        // when
        booksIndex.remove(PAN_TADEUSZ);

        // then
        assertThat(booksIndex.allBooks()).doesNotContain(PAN_TADEUSZ);
    }

    @Test
    void shouldCheckBookAvailability() {
        // given
        booksIndex.addNew(PAN_TADEUSZ);

        // when & then
        assertThat(booksIndex.isAvailable(PAN_TADEUSZ)).isTrue();
    }

    @Test
    void shouldCheckBookAvailabilityWhenThereIsNoSuchBook() {
        // when & then
        assertThat(booksIndex.isAvailable(PAN_TADEUSZ)).isFalse();
    }

    @Test
    void shouldInformThatBookCanBeBorrowed() {
        // given
        booksIndex.addNew(PAN_TADEUSZ);

        // when
        assertThat(booksIndex.canBeBorrowed(PAN_TADEUSZ)).isTrue();
    }

    @Test
    void shouldThrowExceptionWhenBorrowingNotExistingBook() {
        // when & then
        assertThatThrownBy(() -> booksIndex.borrow(PAN_TADEUSZ))
                .isInstanceOf(BookNotAvailableException.class)
                .hasMessage("Library does not own such book.");

    }

    @Test
    void shouldRespondEvenWhileDatabaseOutage() {
        // given
        BookRepository repository = Mockito.mock(BookRepository.class);
        BooksIndex booksIndex = new BooksIndex(repository);
        Mockito.when(repository.get(PAN_TADEUSZ.getIsbn()))
                .thenThrow(new IllegalStateException());

        // when
        booksIndex.isAvailable(PAN_TADEUSZ);

        // then
        // no exception thrown
    }
}