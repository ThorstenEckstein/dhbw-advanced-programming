package de.dhbw.exam.course2;

import de.dhbw.commons.Logger;
import de.dhbw.exam.Answer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static de.dhbw.exam.course2.ExamAnswers.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Course 2 ExamTests")
public class ExamTests {

    private final Logger logger = new Logger(ExamTests.class);

    private final ExamAnswers correctAnswers = new ExamAnswers();

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
    @ValueSource(strings = {"C"}) // TODO: COURSE 2 -> REPLACE CORRECT ANSWER WITH "?" BEFORE COURSE DAY
    @ParameterizedTest
    public void question1(String studentAnswer) {
        // given
        Answer correctAnswer = correctAnswers.of(Q1);

        // when
        boolean isCorrect = studentAnswer.equals(correctAnswer.getLetter());

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
    @ValueSource(strings = {"B"}) // TODO: COURSE 2 -> REPLACE CORRECT ANSWER WITH "?" BEFORE COURSE DAY
    @ParameterizedTest
    public void question2(String studentAnswer) {
        // given
        Answer correctAnswer = correctAnswers.of(Q2);

        // when
        boolean isCorrect = studentAnswer.equals(correctAnswer.getLetter());

        // then
        assertTrue(isCorrect, butMaybeWrong(Q2, studentAnswer));
    }

}