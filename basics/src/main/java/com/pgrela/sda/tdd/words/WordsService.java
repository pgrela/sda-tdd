package com.pgrela.sda.tdd.words;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class WordsService {
    WordsRepository wordsRepository;

    public WordsService(WordsRepository wordsRepository) {
        this.wordsRepository = wordsRepository;
    }

    List<String> getOnlyNames() {
        return wordsRepository.allWords()
                .stream()
                .filter(word -> Character.isUpperCase(word.charAt(0)))
                .collect(Collectors.toList());
    }

    List<String> getOnlyDashedWords() {
        return wordsRepository.allWords()
                .stream()
                .filter(word -> word.contains("-"))
                .collect(Collectors.toList());
    }

    String getMostRecentWord() {
        return wordsRepository.getRecentlyAddedWords()
                .stream()
                .findFirst()
                .orElseGet(this::getLastWord);
    }

    private String getLastWord() {
        List<String> allWords = wordsRepository.allWords();
        if (allWords.isEmpty()) {
            return null;
        }
        return allWords.get(allWords.size() - 1);
    }
}
