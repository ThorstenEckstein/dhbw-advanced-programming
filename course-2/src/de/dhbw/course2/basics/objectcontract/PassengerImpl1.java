package de.dhbw.course2.basics.objectcontract;

public class PassengerImpl1 implements Passenger {

    private String name;

    public PassengerImpl1(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
