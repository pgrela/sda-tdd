package com.pgrela.sda.tdd.library.domain;

import com.pgrela.sda.tdd.library.infrastructure.Database;

public interface BookRepository extends Database<String, Book> {
}
