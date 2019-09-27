package com.pgrela.sda.tdd.model.terrestrial;

import java.util.List;
import java.util.Optional;

public interface Terrestrial {
    /**
     * Not null, not empty, up to 30 characters
     */
    String getName();
    /**
     * Not null, not empty, up to 30 characters
     */
    String getSurname();
    /**
     * Not null
     */
    Address getAddress();
    /**
     * Not null, can be empty
     */
    List<Pet> getPets();
    Optional<Terrestrial> getSpouse();
}
