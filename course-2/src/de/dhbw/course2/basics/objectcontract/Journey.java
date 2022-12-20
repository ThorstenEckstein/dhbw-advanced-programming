package de.dhbw.course2.basics.objectcontract;

import java.util.ArrayList;
import java.util.List;

public class Journey {

    private List<Passenger> passengers = new ArrayList<>();

    public void checkIn(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void checkOut(Passenger passenger) {
        this.passengers.remove(passenger);
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    @Override
    public String toString() {
        return "Journey{" +
                "passengers=" + passengers +
                '}';
    }
}