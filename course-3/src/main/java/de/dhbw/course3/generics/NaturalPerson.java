package de.dhbw.course3.generics;

public class NaturalPerson extends Person {

    public NaturalPerson(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "NaturalPerson: " + super.toString();
    }
}
