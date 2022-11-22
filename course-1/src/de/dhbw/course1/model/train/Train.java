package de.dhbw.course1.model.train;

import java.util.List;

public interface Train {

    String getNumber();
    void setNumber(String number);
    Locomotive getLocomotive();
    void setLocomotive(Locomotive locomotive);
    List<PassengerWagon> getWagons();
    void setWagons(List<PassengerWagon> wagons);
}
