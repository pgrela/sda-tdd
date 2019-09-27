package com.pgrela.sda.tdd.model.terrestrial;

public interface Address {
    String getStreet();
    String getHomeNumber();
    String getFlatNumber();
    ZipCode getZipCode();
    String getCity();
    String getCountry();
}
