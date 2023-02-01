package de.dhbw.course1.basics.composition;

import java.util.Set;

public class Whole1 {

    private final Set<PartClass1> parts;

    public Whole1(Set<PartClass1> parts) {
        this.parts = parts;
    }
}
