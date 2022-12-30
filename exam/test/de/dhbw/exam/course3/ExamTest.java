package de.dhbw.exam.course3;

import de.dhbw.commons.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static de.dhbw.exam.Answers.Q1;
import static de.dhbw.exam.Answers.butMaybeWrong;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Course 3 ExamTests")
public class ExamTest {

    private final Logger logger = new Logger(ExamTest.class);

    private final ExamAnswers correctAnswers = new ExamAnswers();

    @DisplayName(
            """
            Q1: ...
            """
    )
    // Please give your answer here:
    @ValueSource(strings = {"?"}) // TODO: COURSE 3 -> REPLACE CORRECT ANSWER WITH "?" BEFORE COURSE DAY
    @ParameterizedTest
    public void question1(String studentAnswer) {
        // given
        String correctAnswer = correctAnswers.of(Q1);

        // when
        boolean isCorrect = studentAnswer.equals(correctAnswer);

        // then
        assertTrue(isCorrect, butMaybeWrong(Q1, studentAnswer));
    }

}