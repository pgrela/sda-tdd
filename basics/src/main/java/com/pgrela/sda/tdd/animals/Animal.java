package com.pgrela.sda.tdd.animals;

public class Animal {
    private String name;
    private String sound;
    private String species;
    private int weightInGrams;

    public Animal(String name, String sound, String species, int weightInGrams) {
        this.name = name;
        this.sound = sound;
        this.species = species;
        this.weightInGrams = weightInGrams;
    }

    String makeSound() {
        return sound;
    }

    String species() {
        return species;
    }

    int weightInGrams() {
        return weightInGrams;
    }

    public String getName() {
        return name;
    }
}
