package de.dhbw.course1.theory;

import de.dhbw.commons.Logger;
import de.dhbw.course1.theory.objectcontract.Passenger;
import de.dhbw.course1.theory.objectcontract.Train;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TheoryTest {

    private final Logger logger = new Logger(TheoryTest.class);

    @Test
    public void canCommitEqualInstances() {
        // given
        Train train1 = new Train("RB-10");
        Train train2 = new Train("RB-10");

        // when
        boolean areEqual = train1.equals(train2);

        // then
        assertTrue(areEqual);
        logger.log(String.format("%s == %s", train1.hashCode(), train2.hashCode()));
    }

    @Test
    public void cannotCommitEqualInstances() {
        // given
        Passenger passenger1 = new Passenger("Max Mustermann");
        Passenger passenger2 = new Passenger("Max Mustermann");

        // when
        boolean areEqual = passenger1.equals(passenger2);

        // then
        assertFalse(areEqual);
        logger.log(String.format("%s != %s", passenger1.hashCode(), passenger2.hashCode()));
    }

}
