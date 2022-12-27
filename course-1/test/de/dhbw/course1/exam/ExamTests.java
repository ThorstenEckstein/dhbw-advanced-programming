package de.dhbw.course1.exam;

import de.dhbw.commons.Logger;
import de.dhbw.exam.Course1Answers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static de.dhbw.exam.Course1Answers.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExamTests {

    private final Logger logger = new Logger(ExamTests.class);

    private final Course1Answers correctAnswers = new Course1Answers();

    @DisplayName(
        """
        Q1: not yet specified
        """
    )
    // Please give your answer here:
    @ValueSource(strings = {"?"})
    @ParameterizedTest
    public void question1(String studentAnswer) {
        // given
        String correctAnswer = correctAnswers.of(Q1);

        // when
        boolean isCorrect = studentAnswer.equals(correctAnswer);

        // then
        assertTrue(isCorrect, butMaybeWrong(Q1, studentAnswer));
    }

    @DisplayName(
            """
            Q2: not yet specified
            """
    )
    // Please give your answer here:
    @ValueSource(strings = {"?"})
    @ParameterizedTest
    public void question2(String studentAnswer) {
        // given
        String correctAnswer = correctAnswers.of(Q2);

        // when
        boolean isCorrect = studentAnswer.equals(correctAnswer);

        // then
        assertTrue(isCorrect, butMaybeWrong(Q2, studentAnswer));
    }

}