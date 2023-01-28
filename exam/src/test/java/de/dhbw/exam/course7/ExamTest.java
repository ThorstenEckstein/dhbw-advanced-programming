package de.dhbw.exam.course7;

import main.java.de.dhbw.commons.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Course 7 ExamTests")
public class ExamTest {

    private final Logger logger = new Logger(ExamTest.class);

    @DisplayName(
    """
    Q1: A question?
    
    A. An answer!
    """
    )
    // Please give your answer here:
    @ValueSource(strings = {"?"}) // TODO: COURSE 7 -> REPLACE CORRECT ANSWER WITH "?" BEFORE COURSE DAY
    @ParameterizedTest
    public void question1(String studentAnswer) {
        // given

        // when

        // then
    }

}