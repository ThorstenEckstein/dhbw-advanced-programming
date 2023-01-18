package de.dhbw.course8.records;

import de.dhbw.commons.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RecordsTest {

    private final Logger logger = new Logger(RecordsTest.class);

    @Test
    public void canUseRecords() {
        // when
        Train train = new Train("RB-10", 9.574655, 11.3836245);

        // when
        // try to change train number -> impossible, because of built-in immutability of Java Records!

        // then
        assertEquals("RB-10", train.number());
    }

    @Test
    public void areRecordsEqual() {
        // when
        Train train1 = new Train("RB-10", 9.574655, 11.3836245);

        // when
        Train train2 = new Train("RB-10", 9.574655, 11.3836245);

        // then
        assertEquals(train1, train2); // same applies to hashCode(), generated automatically
    }

    @Test
    public void canUseStaticRecordMethods() {
        // when
        Train train1 = Train.withDefaultCoordinates("RB-10");

        // when
        Train train2 = Train.withDefaultCoordinates("RB-10");

        // then
        assertEquals(train1, train2); // same applies to hashCode(), generated automatically
    }

}