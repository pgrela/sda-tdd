package com.pgrela.sda.tdd.words;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// TODO(MOCKITO_ANNOTATIONS) add
@ExtendWith(MockitoExtension.class)
class WordsServiceTest {

    // TODO(MOCKITO_ANNOTATIONS) add @BeforeEach method, put there common things

    // TODO(MOCKITO_ANNOTATIONS) try out MockitoAnnotations.initMocks(this);

    @Mock
    WordsRepository wordsRepositoryMock;
    // TODO(MOCKITO_FIRST) fix the test
    @Test
    void shouldReturnOnlyNames() {
        // TODO(MOCKITO_ANNOTATIONS) refactor this test
        // given
        List<String> fiveWords = Arrays.asList("chair", "grass", "Valentine", "fork", "George");
        Mockito.when(wordsRepositoryMock.allWords()).thenReturn(fiveWords);
        WordsService wordsService = new WordsService(wordsRepositoryMock);

        // when
        List<String> names = wordsService.getOnlyNames();

        // then
        Assertions.assertThat(names).containsOnly("Valentine", "George");
    }

    @Test
    void shouldReturnOnlyWordsWithDash() {
        // TODO(MOCKITO_ANNOTATIONS) refactor this test
        // given
        List<String> allWords = Arrays.asList("biało-czerowny", "trawa", "ciemnoniebieski", "junit-5");
        WordsService wordsService = null;

        // when
        List<String> names = wordsService.getOnlyDashedWords();

        // then
        Assertions.assertThat(names).containsOnly("biało-czerowny", "junit-5");
    }

    // TODO(MOCKITO_VERIFY) verify if WordsRepository#getRecentlyAddedWords() was actually called
    @Test
    void shouldUpdateWordsBeforeReturningMostRecentOne() {
        // given
        WordsService wordsService = new WordsService(wordsRepositoryMock);
        Mockito.when(wordsRepositoryMock.getRecentlyAddedWords())
                .thenReturn(Collections.singletonList("recent word"));
        // when
        wordsService.getMostRecentWord();

        // then
        Mockito.verify(wordsRepositoryMock,
                Mockito.times(1))
                .getRecentlyAddedWords();
    }
}