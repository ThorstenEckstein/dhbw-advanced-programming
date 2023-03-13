package de.dhbw.course3;

import de.dhbw.commons.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class ExerciseSolutions {

    private final Logger logger = new Logger(ExerciseSolutions.class);

    @Test
    @DisplayName("Lösung zu Übung 1 / Exercise 1")
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
    @DisplayName("Lösung zu Übung 2 / Exercise 2")
    public void exercise2Solution() {
        // given

        // when

        // then
    }

}
