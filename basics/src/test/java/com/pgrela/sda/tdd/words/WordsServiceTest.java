package com.pgrela.sda.tdd.words;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// TODO(MOCKITO_ANNOTATIONS) add
@ExtendWith(MockitoExtension.class)
class WordsServiceTest {

    @Mock
    WordsRepository wordsRepository;

    @InjectMocks
    WordsService wordsService;
    private List<String> allWords = Collections.emptyList();


    // TODO(MOCKITO_ANNOTATIONS) add @BeforeEach put there common things and/or use @Mock and/or @InjectMocks

    // TODO(MOCKITO_FIRST) fix the test

    @BeforeEach
    void setupMocks() {
        Mockito.when(wordsRepository.allWords()).thenAnswer(
                (ignored) -> allWords
        );
    }

    @Test
    void shouldReturnOnlyNames() {
        // given
        allWords = Arrays.asList("chair", "grass", "Valentine", "fork", "George");

        // when
        List<String> names = wordsService.getOnlyNames();

        // then
        Assertions.assertThat(names)
                .containsOnly("Valentine", "George");
    }

    @Test
    void shouldReturnOnlyWordsWithDash() {
        // given
        allWords = Arrays.asList("biało-czerowny", "trawa", "ciemnoniebieski", "junit-5");

        // when
        List<String> names = wordsService.getOnlyDashedWords();

        // then
        Assertions.assertThat(names).containsOnly("biało-czerowny", "junit-5");
    }

    // TODO(MOCKITO_VERIFY) verify if WordsRepository#getRecentlyAddedWords() was actually called
    @Test
    void shouldUpdateWordsBeforeReturningMostRecentOne() {
        // given

        // when
        wordsService.getMostRecentWord();

        // then
        Mockito.verify(wordsRepository).getRecentlyAddedWords();
    }
}