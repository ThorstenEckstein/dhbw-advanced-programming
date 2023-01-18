package de.dhbw.course8.records;

public record Train(String number, double longitude, double latitude) {

    public static Train withDefaultCoordinates(String number) {
        return new Train(number, 0.000, 0.000);
    }

}