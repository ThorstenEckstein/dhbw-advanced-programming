package de.dhbw.course4.enums;

import de.dhbw.commons.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EnumTest {

    private final Logger logger = new Logger(EnumTest.class);

    @DisplayName(
            """
            E1: Implement the following enum:
            
            public enum TrafficLight {
                Red, DarkRedYellow, LightRedYellow, Yellow, Green;
            }
            
            Add methods to the enum to check if the current traffic light state allows to pass it
            and test it in this test method.
            """
    )
    @Test
    public void exercise1() {
        // given - enum TrafficLight

        // when - check some traffic light state

        // then - assert test result
    }

}