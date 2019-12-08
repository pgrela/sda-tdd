package com.pgrela.sda.tdd.animals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public Zoo() {
        //addAnimal(new Animal("Flip", "", "fox", 7_000));
        //addAnimal(new Animal("Flap", "", "fox", 5_000));
    }

    List<Animal> showAnimals() {
        return new ArrayList<>(animals);
    }

    void addAnimal(Animal animal) {
        if (animals.contains(animal)) {
            throw new IllegalArgumentException(String.format("There already is %s in the zoo!", animal));
        }
        Animal newAnimal = new Animal(
                animal.getName(),
                animal.makeSound(),
                animal.species(),
                animal.weightInGrams()
        );
        animals.add(newAnimal);
    }

    void removeAnimal(Animal animal) {
        if (!animals.contains(animal)) {
            throw new IllegalArgumentException("There is no such animal!");
        }
        animals.remove(animal);
    }

    List<Animal> showAnimalsOfSpecies(String species) {
        return animals.stream()
                .filter(animal -> animal.species().equals(species))
                .collect(Collectors.toList());
    }

    List<Animal> showAnimalsHeavierThan(int grams) {
        return animals.stream()
                .filter(animal -> animal.weightInGrams() > grams)
                .collect(Collectors.toList());
    }

    List<Animal> showSilentAnimals() {
        return animals.stream()
                .filter(animal -> makesActualSound(animal.makeSound()))
                .collect(Collectors.toList());
    }

    private boolean makesActualSound(String sound) {
        return sound != null && sound.trim().length() == 0;
    }

    void removeAllOfSpecies(String species) {
        this.animals.removeIf(animal -> animal.makeSound().equals(species));
    }
}
