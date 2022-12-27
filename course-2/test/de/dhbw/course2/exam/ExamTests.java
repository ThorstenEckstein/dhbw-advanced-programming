package de.dhbw.course2.exam;

import de.dhbw.commons.Logger;
import de.dhbw.exam.Course2Answers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static de.dhbw.exam.Course2Answers.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExamTests {

    private final Logger logger = new Logger(ExamTests.class);

    private final Course2Answers correctAnswers = new Course2Answers();

    @DisplayName(
        """
        Q1: Which would be most suitable for storing data elements that must not appear
        in the store more than once, if searching is not a priority?
        A. Collection
        B. List
        C. Set
        D. Map
        E. Vector
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
            Q2: What is the most important characteristic of a TreeSet?
            A. uses keys to store values
            B. maintains natural order
            C. can store null elements
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