package de.dhbw.exam.course4;

import de.dhbw.exam.Answer;
import de.dhbw.exam.Answers;

public class ExamAnswers extends Answers {

    static {
        answers.put(Q1, Answer.from("A"));
        answers.put(Q2, Answer.from("B", "A Monitor is an instance of any class that has synchronized code"));
    }

}