package com.pgrela.sda.tdd.animals;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ZooTest {
    private static final Animal RAT_RODGER = new Animal("Rodger", "Piii", "rat", 200);
    private static final Animal RAT_ROBERT = new Animal("Robert", "Piii", "rat", 300);
    private static final Animal FOX_FELIX = new Animal("Felix", "", "fox", 10_000);
    private static final Animal ELEPHANT_ELEONORE = new Animal("Eleonore", "TRRUUUU!!", "elephant", 4_000_000);

    // TODO(ASSERTJ_FIRST) test methods of Zoo using AssertJ assertions
    // TODO(ASSERTJ_FIRST) create test shouldAddAnimalToZoo()
    // TODO(ASSERTJ_FIRST) create test shouldRemoveAnimalsFormZoo()
    // TODO(ASSERTJ_FIRST) create test shouldShowAnimalsOfGivenSpecies()
    // TODO(ASSERTJ_FIRST) create test shouldShowOnlyAnimalsHeavierThen1000grams()
    // TODO(ASSERTJ_FIRST) create test shouldListSilentAnimals()
    // TODO(ASSERTJ_FIRST) create test shouldRemoveAllAnimalsOfGivenSpecies()
    @Test
    void shouldAddAnimalToZooPreservingPreExisting() {
        // given
        Zoo zoo = new Zoo();

        // when
        zoo.addAnimal(RAT_ROBERT);

        // then
        AnimalAssertions.assertThat(zoo.showAnimals().get(0))
                .hasName("Robert")
                .isSpecies("rat")
                .makes("Piii")
                .weightsGrams(300);
    }
    @Test
    void shouldShowAnimalsOfGivenSpecies() {
        // given
        Zoo zoo = withAnimals(RAT_RODGER, FOX_FELIX);

        // when
        List<Animal> foxes = zoo.showAnimalsOfSpecies("fox");

        // then
        assertThat(foxes)
                .extracting("species")
                .containsOnly("fox");
    }

    private Zoo withAnimals(Animal...animals) {
        Zoo zoo = new Zoo();
        Arrays.stream(animals).forEach(zoo::addAnimal);
        return zoo;
    }

    @Test
    void shouldPreserveAnimalData() {
        // given
        Zoo zoo = withAnimals(RAT_RODGER);

        // when
        List<Animal> foxes = zoo.showAnimalsOfSpecies("fox");

        // then
        assertThat(foxes)
                .extracting("species")
                .containsOnly("fox");
    }

    @Test
    void shouldHaveFatSilentFoxes() {
        // given
        // ...

        // when
        //List<Animal> foxes = zoo.showAnimalsOfSpecies("fox");

        // then
        //AnimalAssertions.assertThat(foxes.get(0)).isSilentFatFox()
    }
}