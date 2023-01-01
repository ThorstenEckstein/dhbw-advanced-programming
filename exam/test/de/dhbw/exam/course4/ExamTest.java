package de.dhbw.exam.course4;

import de.dhbw.commons.Logger;
import de.dhbw.exam.Answer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static de.dhbw.exam.Answers.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Course 4 ExamTests")
public class ExamTest {

    private final Logger logger = new Logger(ExamTest.class);

    private final ExamAnswers correctAnswers = new ExamAnswers();

    @DisplayName(
    """
    Q1: Which statement is true?
    
     1. class Greebo extends Vector implements Runnable {
     2.     public void run(String message) {
     3.         System.out.println("in run(): " + message);
     4.     }
     5. }
     6.
     7. class GreeboApp {
     8.     public static void main(String[] args) {
     9.         Greebo g = new Greebo();
    10.         Thread t = new thread(g);
    11.         t.start();
    12.     }
    13. }
    
    A. There will be a compile error, because class Greebo does not correctly implement the Runnable interface
    B. The code will compile correctly but crashes at line 10 with an exception
    C. The code will compile correctly and will execute without any errors
    """
    )
    // Please give your answer here:
    @ValueSource(strings = {"A"}) // TODO: COURSE 4 -> REPLACE CORRECT ANSWER WITH "?" BEFORE COURSE DAY
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
            Q1: A Java Monitor must extend either Thread or implement Runnable?
            
            A. True
            B. False
            """
    )
    // Please give your answer here:
    @ValueSource(strings = {"B"}) // TODO: COURSE 4 -> REPLACE CORRECT ANSWER WITH "?" BEFORE COURSE DAY
    @ParameterizedTest
    public void question2(String studentAnswer) {
        // given
        Answer correctAnswer = correctAnswers.of(Q2);

        // when
        boolean isCorrect = studentAnswer.equals(correctAnswer.getLetter());

        // then
        assertTrue(isCorrect, butMaybeWrong(Q2, studentAnswer));
        correctAnswer.showDetail(isCorrect);
    }

}