package de.dhbw.course1.basics.refsemantics;

public class Account {

    private int amount;

    public Account() {}

    public Account(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void deposit(int amount) {
        this.amount += amount;
    }
}
