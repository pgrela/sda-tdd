package com.pgrela.sda.tdd.model.martian;

import com.pgrela.sda.tdd.model.terrestrial.Pet;

import java.util.List;
import java.util.Optional;

public interface Martian {
    String getPronunciation();
    MartianAddress getAddress();
    List<Pet> getPets();
    Optional<Martian> getSpouse();
}
