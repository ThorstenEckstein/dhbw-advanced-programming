package de.dhbw.exam.course5;

import de.dhbw.commons.Logger;
import de.dhbw.exam.Answer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static de.dhbw.exam.Answers.Q1;
import static de.dhbw.exam.Answers.butMaybeWrong;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Course 5 ExamTests")
public class ExamTest {

    private final Logger logger = new Logger(ExamTest.class);

    private final ExamAnswers correctAnswers = new ExamAnswers();

    @DisplayName(
    """
    Q1: Was ist eine 'Representation' im Kontext von REST?
    
    A. Eine PowerPoint Präsentation, die den Begriff erläutert
    B. Der Dateninhalt, den ein Client an eine API sendet
    C. Der Typ der Datenantwort eines API Calls
    """
    )
    // Please give your answer here:
    @ValueSource(strings = {"C"}) // TODO: COURSE 5 -> REPLACE CORRECT ANSWER WITH "?" BEFORE COURSE DAY
    @ParameterizedTest
    public void question1(String studentAnswer) {
        // given
        Answer correctAnswer = correctAnswers.of(Q1);

        // when
        boolean isCorrect = studentAnswer.equals(correctAnswer.getLetter());

        // then
        assertTrue(isCorrect, butMaybeWrong(Q1, studentAnswer));
    }

}