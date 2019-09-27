package com.pgrela.sda.tdd.model.terrestrial;

public interface Pet {
    String name();
    Species getSpecies();
    Terrestrial getOwner();
}
