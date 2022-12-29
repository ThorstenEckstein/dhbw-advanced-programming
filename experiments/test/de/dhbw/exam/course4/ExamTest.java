package de.dhbw.exam.course4;

import de.dhbw.commons.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExamTest {

    private final Logger logger = new Logger(ExamTest.class);

    @Test
    @DisplayName(
            """
            Exercise 2: Refactor the enum so that it is able to handle many synonyms!
            """)
    public void canGetEnumValueFromString() {
        // given -> see enum TrainTypeWithSynonyms

        // when
        TrainTypeWithSynonyms trainType = TrainTypeWithSynonyms.from("?");

        // then
        assertEquals(TrainTypeWithSynonyms.Unknown, trainType);
    }

}