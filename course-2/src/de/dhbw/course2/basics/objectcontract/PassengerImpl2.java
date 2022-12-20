package de.dhbw.course2.basics.objectcontract;

import java.util.Objects;

public class PassengerImpl2 implements Passenger {

    private String name;

    public PassengerImpl2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassengerImpl2 passenger = (PassengerImpl2) o;
        return name.equals(passenger.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
