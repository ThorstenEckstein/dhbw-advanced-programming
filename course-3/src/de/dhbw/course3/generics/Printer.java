package de.dhbw.course3.generics;

public class Printer {

    public <T> String print(T data) {
        return String.format("%s", data);
    }
}
