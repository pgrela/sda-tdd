package com.pgrela.sda.tdd.library.infrastructure;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class InMemoryDatabase<IDENTIFIER, ITEM> implements Database<IDENTIFIER, ITEM> {
    private Map<IDENTIFIER, ITEM> storage = new HashMap<>();

    @Override
    public void save(IDENTIFIER id, ITEM item) {
        storage.put(id, item);
    }

    @Override
    public ITEM get(IDENTIFIER id) {
        return storage.get(id);
    }

    @Override
    public Collection<ITEM> getAll() {
        return storage.values();
    }

    @Override
    public void remove(IDENTIFIER id) {
        storage.remove(id);
    }
}
