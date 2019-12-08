package com.pgrela.sda.tdd.library.domain;

import com.pgrela.sda.tdd.library.infrastructure.Database;

public interface IndexedBookRepository extends Database<String, IndexedBook> {
}
