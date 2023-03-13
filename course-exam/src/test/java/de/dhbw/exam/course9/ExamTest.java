package de.dhbw.exam.course9;

import de.dhbw.commons.Logger;
import de.dhbw.exam.Answer;
import de.dhbw.exam.course8.ExamAnswers;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static de.dhbw.exam.Answers.Q1;
import static de.dhbw.exam.Answers.butMaybeWrong;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Disabled
@DisplayName("Course 9 ExamTests")
public class ExamTest {

    private final Logger logger = new Logger(ExamTest.class);

    private final ExamAnswers correctAnswers = new ExamAnswers();

    @DisplayName(
    """
    Q1: Dies ist eine DUMMY Frage?
    
    A. Dies ist eine DUMMY Antwort!
    """
    )
    // Please give your answer here:
    @ValueSource(strings = {"A"}) // TODO: COURSE 9 -> REPLACE CORRECT ANSWER WITH "?" BEFORE COURSE DAY
    @ParameterizedTest
    public void question1(String studentAnswer) {
        // given
        Answer correctAnswer = correctAnswers.of(Q1);

        // when
        boolean isCorrect = correctAnswer.getLetter().equals(studentAnswer);

        // then
        assertTrue(isCorrect, butMaybeWrong(Q1, studentAnswer));
    }

}