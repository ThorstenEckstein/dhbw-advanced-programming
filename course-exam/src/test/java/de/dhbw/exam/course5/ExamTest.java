package de.dhbw.exam.course5;

import de.dhbw.commons.Logger;
import de.dhbw.exam.Answer;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static de.dhbw.exam.Answers.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Course 5 ExamTests")
@Disabled
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
        boolean isCorrect = correctAnswer.getLetter().equals(studentAnswer);

        // then
        assertTrue(isCorrect, butMaybeWrong(Q1, studentAnswer));
    }

    @DisplayName(
            """
            Q2: Welche Kriterien sollten unbedingt betrachtet werden, wenn zwei Applikationen integriert 
            werden sollen? (mehrere gültige Antworten)
                        
            A. Komponenten-Architektur
            B. Lose vs. enge Kopplung
            C. Einfachheit
            D. Persistenz
            E. Datenformat& -aktualität
            F. Synchron vs. Asynchron
            G. User Experience
            """
    )
    // Please give your answer here:
    @ValueSource(strings = {"B","C","E","F"}) // TODO: COURSE 5 -> REPLACE CORRECT ANSWER WITH "?" BEFORE COURSE DAY
    @ParameterizedTest
    public void question2(String studentAnswer) {
        // given
        Answer correctAnswer = correctAnswers.of(Q2);

        // when
        boolean isCorrect = correctAnswer.getLetters().contains(studentAnswer);

        // then
        assertTrue(isCorrect, butMaybeWrong(Q2, studentAnswer));
    }

    @DisplayName(
            """
            Q3: Welche der folgenden sind Integrationsstile bzw. -muster? (mehrere gültige Antworten)
                        
            A. File Transfer
            B. AWS Lambda
            C. Shared Database
            D. Remote Procedure Invocation
            E. Local Cache
            F. Messaging
            """
    )
    // Please give your answer here:
    @ValueSource(strings = {"A","C","D","F"}) // TODO: COURSE 5 -> REPLACE CORRECT ANSWER WITH "?" BEFORE COURSE DAY
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