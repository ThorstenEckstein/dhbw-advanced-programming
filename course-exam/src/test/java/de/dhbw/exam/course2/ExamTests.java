package de.dhbw.exam.course2;

import de.dhbw.exam.Answer;
import de.dhbw.commons.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static de.dhbw.exam.course2.ExamAnswers.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Disabled
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
        Answer correctAnswer = correctAnswers.of(Q2);

        // when
        boolean isCorrect = studentAnswer.equals(correctAnswer.getLetter());

        // then
        assertTrue(isCorrect, butMaybeWrong(Q2, studentAnswer));
    }

    @DisplayName(
            """
            Q3: What is function overloading?
            
            A. When a function overrides a method defined in the parent class
            B. When a function has more then 3 arguments
            C. Multiple functions with same name but different parameters
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
            Q4: What do you mean by 'Access Modifier'?
            
            Explain in your own words!
            """
    )
    @Test
    public void question4() {
        // given
        Answer commonExplanation = correctAnswers.of(Q4);

        // when
        final String studentExplanation =
                """
                ... your answer here ...
                """;

        // then
        logger.log(commonExplanation.face(studentExplanation));
    }

    @DisplayName(
            """
            Q5: If a variable is declared as 'private', where may the variable be accessed?
            
            Explain in your own words!
            """
    )
    @Test
    public void question5() {
        // given
        Answer commonExplanation = correctAnswers.of(Q5);

        // when
        final String studentExplanation =
                """
                ... your answer here ...
                """;

        // then
        logger.log(commonExplanation.face(studentExplanation));
    }

    @DisplayName(
            """
            Q6: If a method is declared as protected, where may the method be accessed?
                        
            Explain in your own words!
            """
    )
    @Test
    public void question6() {
        // given
        Answer commonExplanation = correctAnswers.of(Q6);

        // when
        final String studentExplanation =
                """
                ... your answer here ...
                """;

        // then
        logger.log(commonExplanation.face(studentExplanation));
    }

}