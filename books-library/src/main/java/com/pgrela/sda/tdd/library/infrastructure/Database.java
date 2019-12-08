package com.pgrela.sda.tdd.library.infrastructure;

import java.util.Collection;

public interface Database<IDENTIFIER, ITEM> {
    void save(IDENTIFIER id, ITEM item);

    ITEM get(IDENTIFIER id);

    Collection<ITEM> getAll();

    void remove(IDENTIFIER id);
}
