package de.dhbw.exam.course6;

import de.dhbw.exam.Answer;
import de.dhbw.exam.Answers;

public class ExamAnswers extends Answers {

    static {
        answers.put(Q1, Answer.from("A"));
        answers.put(Q2, Answer.from("B"));
        answers.put(Q3, Answer.fromMany("B", "C", "E"));
    }

}