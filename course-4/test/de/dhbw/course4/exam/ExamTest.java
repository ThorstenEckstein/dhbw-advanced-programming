package de.dhbw.course4.exam;

import de.dhbw.commons.Logger;
import de.dhbw.course4.enums.TrainType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExamTest {

    private final Logger logger = new Logger(ExamTest.class);

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
        // given -> see enum TrainType (now capable of handling multiple synonyms!)

        // when

        // then
    }

}