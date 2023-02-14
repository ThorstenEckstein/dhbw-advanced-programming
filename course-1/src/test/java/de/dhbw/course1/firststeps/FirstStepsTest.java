package de.dhbw.course1.firststeps;

import org.junit.jupiter.api.Test;

public class FirstStepsTest {

    @Test
    public void canCreateFirstModel() {
        // given
        Train euroExpress = new EuroExpress();
        Train intercity = new Intercity();

        // when
        euroExpress.setTrainNumber("EURO-EXP-1");
        intercity.setTrainNumber("IC2026");

        // then
        System.out.println("EuroExpress : " + euroExpress.getTrainNumber());
        System.out.println("Intercity   : " + intercity.getTrainNumber());

        // DEBUG MODUS AUSPROBIEREN UND EVALUATE DEMONSTRIEREN

        // System.out.println(intercity);
        // System.out.println(intercity.toString()); // Name@HexCodeOf(hashCode())
        // System.out.println(intercity.hashCode());
    }

}
