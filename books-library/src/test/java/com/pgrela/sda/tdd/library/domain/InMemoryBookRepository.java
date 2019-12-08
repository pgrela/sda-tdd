package com.pgrela.sda.tdd.library.domain;

import com.pgrela.sda.tdd.library.infrastructure.InMemoryDatabase;

public class InMemoryBookRepository
    extends InMemoryDatabase<String, Book>
        implements BookRepository {
}
