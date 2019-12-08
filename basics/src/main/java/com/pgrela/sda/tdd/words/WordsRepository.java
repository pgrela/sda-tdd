package com.pgrela.sda.tdd.words;

import java.io.File;
import java.lang.management.GarbageCollectorMXBean;
import java.sql.Connection;
import java.util.Collections;
import java.util.List;

public class WordsRepository {
    public WordsRepository(File fileWithGoodWords,
                           Connection databaseConnection,
                           ClassLoader classLoader,
                           GarbageCollectorMXBean garbageCollectorMXBean) {
        notNull(fileWithGoodWords);
        notNull(databaseConnection);
        notNull(classLoader);
        notNull(garbageCollectorMXBean);
    }

    private void notNull(Object fileWithGoodWords) {
        if (fileWithGoodWords == null) {
            throw new RuntimeException("Dependency can't be null. I need it!");
        }
    }

    /**
     * Real implementation returns list of all words.
     */
    final List<String> allWords() {
        simulateLongLastingOperation();
        return Collections.emptyList();
    }

    /**
     * Real implementation returns list of the most recent words.
     */
    List<String> getRecentlyAddedWords() {
        simulateLongLastingOperation();
        return Collections.emptyList();
    }

    private void simulateLongLastingOperation() {
        try {
            Thread.sleep(100_000);
        } catch (InterruptedException ignored) {
        }
    }
}
