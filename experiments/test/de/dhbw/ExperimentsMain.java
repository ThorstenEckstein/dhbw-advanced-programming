package de.dhbw;

public class ExperimentsMain {
    public static void main(String[] args) {

        de.dhbw.experimental.foodstore.TestSuite testSuite1 = new de.dhbw.experimental.foodstore.TestSuite();
        testSuite1.run();

        de.dhbw.experimental.delay.TestSuite testSuite2 = new de.dhbw.experimental.delay.TestSuite();
        testSuite2.run();
    }
}