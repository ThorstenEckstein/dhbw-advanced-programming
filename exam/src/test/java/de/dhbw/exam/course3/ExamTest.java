package de.dhbw.exam.course3;

import main.java.de.dhbw.commons.Logger;
import de.dhbw.exam.Answer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static de.dhbw.exam.Answers.Q1;
import static de.dhbw.exam.Answers.butMaybeWrong;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Course 3 ExamTests")
public class ExamTest {

    private final Logger logger = new Logger(ExamTest.class);

    private final ExamAnswers correctAnswers = new ExamAnswers();

    @DisplayName(
            """
            Q1: Will the following class compile? If not, why?
                        
            public class Singleton<T> {
                public static T getInstance() {
                    if (instance == null)
                        instance = new Singleton<T>();
                    return instance;
                }
                private static T instance = null;
            }
            
            A. Yes
            B. No
            """
    )
    // Please give your answer here:
    @ValueSource(strings = {"B"}) // TODO: COURSE 3 -> REPLACE CORRECT ANSWER WITH "?" BEFORE COURSE DAY
    @ParameterizedTest
    public void question1(String studentAnswer) {
        // given
        Answer correctAnswer = correctAnswers.of(Q1);

        // when
        boolean isCorrect = studentAnswer.equals(correctAnswer.getLetter());

        // then
        assertTrue(isCorrect, butMaybeWrong(Q1, studentAnswer));

        //  show detail
        correctAnswer.showDetail(isCorrect);
    }

}