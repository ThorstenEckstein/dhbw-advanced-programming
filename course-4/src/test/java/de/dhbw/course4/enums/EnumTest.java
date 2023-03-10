package de.dhbw.course4.enums;

import de.dhbw.commons.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnumTest {

    private final Logger logger = new Logger(EnumTest.class);

    @Test
    @DisplayName(
    """
    Exercise 1:
      Refactor the enum's method 'from()' so that it uses
      the streaming API instead of the old 'for each' loop!
    """)
    public void exercise1() {
        // given -> see enum TrainType

        // when
        TrainType trainType = TrainType.from("Güterzug");

        // then
        assertEquals(TrainType.FreightTrain, trainType);

        // then (additional check)
        assertEquals(TrainType.FreightTrain, TrainType.valueOf("FreightTrain"));
    }

    @Test
    @DisplayName(
    """
    Exercise 2:
      Refactor the enum so that it is able to handle many synonyms!
    """)
    public void exercise2() {
        // given -> create an enum named 'TrainTypeWithSynonyms'

        // when
        // TrainTypeWithSynonyms trainType = TrainTypeWithSynonyms.from("?");

        // then
        // assertEquals(TrainTypeWithSynonyms.Unknown, trainType);
    }

    @DisplayName(
    """
    Exercise 3:
      Implement the following enum
    
    public enum TrafficLight {
        Red, DarkRedYellow, LightRedYellow, Yellow, Green;
    }
    
    Add methods to the enum to check if the current traffic light state allows to pass it
    and test it in this test method.
    """)
    @Test
    public void exercise3() {
        // given - enum TrafficLight

        // when - check some traffic light state

        // then - assert test result
    }

}