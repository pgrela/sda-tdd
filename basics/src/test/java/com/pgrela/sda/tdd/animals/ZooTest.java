package com.pgrela.sda.tdd.animals;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

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
    void should(){
        Zoo zoo = new Zoo();
        zoo.addAnimal(RAT_ROBERT);
        Assertions.assertThat(zoo.showAnimals()).contains(RAT_ROBERT);
    }
}