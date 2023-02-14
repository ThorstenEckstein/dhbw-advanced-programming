package de.dhbw.course1.firststeps;

public class AbstractTrain {

    private String number;

    public AbstractTrain() { }

    public AbstractTrain(String number) {
        this.number = number;
    }

    //@Override
    public String getNumber() {
        return number;
    }

    //@Override
    public void setNumber(String number) {
        this.number = number;
    }

}