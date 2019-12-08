package com.pgrela.sda.tdd.animals;

import org.assertj.core.api.AbstractAssert;

class AnimalAssertions extends AbstractAssert<AnimalAssertions, Animal> {

    public AnimalAssertions(Animal animal) {
        super(animal, Animal.class);
    }

    // TODO(ASSERTJ_CUSTOM) create static method: public static AnimalAssertions assertThat(Animal animal) {...}

    // TODO(ASSERTJ_CUSTOM) create fluent assertions method for animal's properties

    // TODO(ASSERTJ_CUSTOM) create method isSmallDumbFox(Animal animal)
}