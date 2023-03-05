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

}
