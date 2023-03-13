package de.dhbw.exam.course2;

import de.dhbw.exam.Answer;
import de.dhbw.exam.Answers;

public class ExamAnswers extends Answers {

    static {
        answers.put(Q1, Answer.from("C"));
        answers.put(Q2, Answer.from("B"));
        answers.put(Q3, Answer.from("C"));
        answers.put(Q4, Answer.fromExplanation("""
         Java provides access modifiers to set access levels for classes, variables, methods and constructors.
         A member has package or default accessibility when no accessibility modifier is specified."""));
        answers.put(Q5, Answer.fromExplanation("""
         A private variable may only be accessed within the class in which it is declared."""));
        answers.put(Q6, Answer.fromExplanation("""
         A protected method may only be accessed by classes or interfaces of the same package or by
         subclasses of the class in which it is declared."""));



    }

}