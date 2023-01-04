package de.dhbw.exam.course5;

import de.dhbw.exam.Answers;
import de.dhbw.exam.Answer;

public class ExamAnswers extends Answers {

    static {
        answers.put(Q1, Answer.from("C"));
        answers.put(Q2, Answer.fromMany("B","C","E","F"));
        answers.put(Q3, Answer.fromMany("A","C","D","F"));
    }

}