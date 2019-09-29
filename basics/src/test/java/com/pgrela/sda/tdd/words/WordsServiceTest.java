package com.pgrela.sda.tdd.words;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

// TODO(MOCKITO_ANNOTATIONS) add @ExtendWith(MockitoExtension.class)
class WordsServiceTest {

    // TODO(MOCKITO_ANNOTATIONS) add @BeforeEach put there common things and/or use @Mock and/or @InjectMocks

    // TODO(MOCKITO_FIRST) fix the test
    @Test
    void shouldReturnOnlyNames() {
        // TODO(MOCKITO_ANNOTATIONS) refactor this test
        // given
        List<String> allWords = Arrays.asList("chair", "grass", "Valentine", "fork", "George");
        WordsService wordsService = null;

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
        WordsService wordsService = null;

        // when
        wordsService.getMostRecentWord();

        // then
    }
}