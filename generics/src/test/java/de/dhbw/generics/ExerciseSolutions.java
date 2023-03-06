package de.dhbw.generics;

import de.dhbw.commons.Logger;
import de.dhbw.generics.solution.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class ExerciseSolutions {

    private final Logger logger = new Logger(ExerciseSolutions.class);

    @Test
    @DisplayName("Exercise 1")
    public void exercise1Solution() {
        // given
        Step step1 = new Start();
        Step step2 = new Choice();
        Step step3 = new SendEmail();

        // when
        Workflow.execute(step1);
        Workflow.execute(step2);
        Workflow.execute(step3);

        // then
    }

    @Test
    @DisplayName("Exercise 2")
    public void exercise2Solution() {
        /*
        public interface Calculator<T extends Number> {
            T add(T first, T second);
            T remove(T first, T second);
            T multiply(T first, T second);
            T divide(T first, T second);
        }
        */
    }

}
