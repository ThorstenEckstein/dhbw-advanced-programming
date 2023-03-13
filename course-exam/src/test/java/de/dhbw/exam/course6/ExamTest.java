package de.dhbw.exam.course6;

import de.dhbw.commons.Logger;
import de.dhbw.exam.Answer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static de.dhbw.exam.Answers.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Course 6 ExamTests")
public class ExamTest {

    private final Logger logger = new Logger(ExamTest.class);

    private final ExamAnswers correctAnswers = new ExamAnswers();

    @DisplayName(
    """
    Q1: Was ist eine Exception?
    
    A. Eine Ausnahmesituation, die behandelt werden kann
    B. Eine Ausnahmesituation, die nicht behandelt werden kann
    C. Keines von beiden
    """
    )
    // Please give your answer here:
    @ValueSource(strings = {"A"}) // TODO: COURSE 6 -> REPLACE CORRECT ANSWER WITH "?" BEFORE COURSE DAY
    @ParameterizedTest
    public void question1(String studentAnswer) {
        // given
        Answer correctAnswer = correctAnswers.of(Q1);

        // when
        boolean isCorrect = correctAnswer.getLetter().equals(studentAnswer);

        // then
        assertTrue(isCorrect, butMaybeWrong(Q1, studentAnswer));
    }

    @DisplayName(
            """
            Q1: Was ist der Zweck des Schlüsselwortes 'throws' in einer Methodensignatur?
            
            public void risky() throws Exception {...}
            
            A. Wird benutzt, um mögliche Fehler bei der Ausführung der Methode anzuzeigen,
               und der Fehler muss nicht behandelt werden
            B. Wird benutzt, um mögliche Fehler bei der Ausführung der Methode anzuzeigen,
               und der Fehler muss behandelt werden
            C. Die Methode wirft in jedem Fall eine Ausnahme, sie muss behandelt werden
            """
    )
    // Please give your answer here:
    @ValueSource(strings = {"B"}) // TODO: COURSE 6 -> REPLACE CORRECT ANSWER WITH "?" BEFORE COURSE DAY
    @ParameterizedTest
    public void question2(String studentAnswer) {
        // given
        Answer correctAnswer = correctAnswers.of(Q2);

        // when
        boolean isCorrect = correctAnswer.getLetter().equals(studentAnswer);

        // then
        assertTrue(isCorrect, butMaybeWrong(Q2, studentAnswer));
    }

    @DisplayName(
            """
            Q1: Wie ist ein Fehler im Quellcode zu behandeln?
            (mehrere gültige Antworten)
            
            A. Mithilfe eines 'try' Statements
            B. Mithilfe eines 'try-catch' Statements
            C. Mithilfe eigener Implementierungen, die auftretende Fehler verarbeiten
            D. Mithilfe eines 'try-handle' Statements
            E. Mithilfe eines 'try-catch-finally' Statements
            """
    )
    // Please give your answer here:
    @ValueSource(strings = {"B","C","E"}) // TODO: COURSE 6 -> REPLACE CORRECT ANSWER WITH "?" BEFORE COURSE DAY
    @ParameterizedTest
    public void question3(String studentAnswer) {
        // given
        Answer correctAnswer = correctAnswers.of(Q3);

        // when
        boolean isCorrect = correctAnswer.getLetters().contains(studentAnswer);

        // then
        assertTrue(isCorrect, butMaybeWrong(Q3, studentAnswer));
    }

}