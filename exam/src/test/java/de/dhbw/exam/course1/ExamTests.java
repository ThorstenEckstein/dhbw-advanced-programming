package de.dhbw.exam.course1;

import de.dhbw.commons.Logger;
import de.dhbw.exam.Answer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static de.dhbw.exam.course1.ExamAnswers.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Course 1 ExamTests")
public class ExamTests {

    private final Logger logger = new Logger(ExamTests.class);

    private final ExamAnswers correctAnswers = new ExamAnswers();

    @DisplayName(
        """
        Q1: Consider the following application:
        
        class MyApp {
          public static void main(String[] args) {
            Holder h = new Holder();
            h.held = 100;
            h.bump(h);
            System.out.println(h.held);
          }
        }
        class Holder {
          public int held;
          public void bump(Holder h) {
            h.held++;
          }
        }
        
        What will be the candidate?
        A. 0
        B. 1
        C. 100
        D. 101
        """
    )
    // Please give your answer here:
    @ValueSource(strings = {"?"})
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
            Q2: Which of the following will print "true" to the console?
            
            A. int x = 100; float y = 100.0F; System.out.println(x == y);
            B. String x = new String("100"); String y = new String("100");System.out.println(x == y);
            """
    )
    // Please give your answer here:
    @ValueSource(strings = {"?"})
    @ParameterizedTest
    public void question2(String studentAnswer) {
        // given
        Answer correctAnswer = correctAnswers.of(Q2);

        // when
        boolean isCorrect = studentAnswer.equals(correctAnswer.getLetter());

        // then
        assertTrue(isCorrect, butMaybeWrong(Q2, studentAnswer));
    }

    @DisplayName(
            """
            Q3: Which is the correct value range for primitive data type int?
            
            A. 16 bits
            A. 32 bits
            A. 64 bits
            """
    )
    // Please give your answer here:
    @ValueSource(strings = {"?"})
    @ParameterizedTest
    public void question3(String studentAnswer) {
        // given
        Answer correctAnswer = correctAnswers.of(Q3);

        // when
        boolean isCorrect = studentAnswer.equals(correctAnswer.getLetter());

        // then
        assertTrue(isCorrect, butMaybeWrong(Q3, studentAnswer));
    }

    @DisplayName(
            """
            Q4: What is a local variable?
            
            A. Variables defined inside methods, constructors or blocks are called local variables
            B. Variables defined inside methods are called local variables
            C. Variables defined inside methods, constructors are called local variables
            """
    )
    // Please give your answer here:
    @ValueSource(strings = {"?"})
    @ParameterizedTest
    public void question4(String studentAnswer) {
        // given
        Answer correctAnswer = correctAnswers.of(Q4);

        // when
        boolean isCorrect = studentAnswer.equals(correctAnswer.getLetter());

        // then
        assertTrue(isCorrect, butMaybeWrong(Q4, studentAnswer));
    }

}