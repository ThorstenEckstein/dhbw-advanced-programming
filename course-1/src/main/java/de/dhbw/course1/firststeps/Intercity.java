package de.dhbw.course1.firststeps;

public class Intercity implements Train {
    private String number;

    @Override
    public String getTrainNumber() {
        return number;
    }

    @Override
    public void setTrainNumber(String number) {
        this.number = number;
    }
}
