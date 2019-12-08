package com.pgrela.sda.tdd.animals;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.AbstractFileAssert;
import org.assertj.core.api.AbstractListAssert;
import org.assertj.core.api.Assertions;

import java.util.List;

class AnimalAssertions extends AbstractAssert<AnimalAssertions, Animal> {

    public AnimalAssertions(Animal animal) {
        super(animal, AnimalAssertions.class);
    }

    public static AnimalAssertions assertThat(Animal animal) {
        return new AnimalAssertions(animal);
    }

    public AnimalAssertions hasName(String name) {
        Assertions.assertThat(actual.getName()).isEqualTo(name);
        return this;
    }

    public AnimalAssertions isSpecies(String species) {
        Assertions.assertThat(actual.species()).isEqualTo(species);
        return this;
    }

    public AnimalAssertions makes(String sound) {
        Assertions.assertThat(actual.makeSound()).isEqualTo(sound);
        return this;
    }

    public AnimalAssertions weightsGrams(int weight) {
        Assertions.assertThat(actual.weightInGrams())
                .isEqualTo(weight);
        return this;
    }

    public AnimalAssertions isSilentFatFox() {
        Assertions.assertThat(actual.species())
                .isEqualTo("fox");
        Assertions.assertThat(actual.makeSound())
                .isEqualTo("");
        Assertions.assertThat(actual.weightInGrams())
                .isGreaterThan(14_000);
        return this;
    }


    // TODO(ASSERTJ_CUSTOM) create static method: public static AnimalAssertions assertThat(Animal animal) {...}

    // TODO(ASSERTJ_CUSTOM) create fluent assertions method for animal's properties

    // TODO(ASSERTJ_CUSTOM) create method isSmallDumbFox(Animal animal)
}