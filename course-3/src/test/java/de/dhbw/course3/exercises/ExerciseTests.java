package de.dhbw.course3.exercises;

import main.java.de.dhbw.commons.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExerciseTests {

    private final Logger logger = new Logger(ExerciseTests.class);

    @BeforeEach
    public void beforeEach() {
        // implement a shopping cart with 4 products (having 'name', 'category' and 'price')
    }

    //tag::generic-workflow[]
    @Test
    @DisplayName("Übung 1: Generic workflow execution")
    public void exercise1() {
        // given - a Workflow to execute steps

        // when - execute is called, the step-name is printed to the console

        // then - no assertion, just a log output
    }
    //end::generic-workflow[]

    //tag::old-fashioned-reduce[]
    @Test
    @DisplayName("Übung 2: Calculate a total in old fashioned way")
    public void exercise2() {
        // given - a list of at least 10 random Integers

        // when - iterate over the list and calculate the total

        // then - assert the correct total
    }
    //end::old-fashioned-reduce[]

    @Test
    @DisplayName("Übung 3: Filter & reduce a shopping cart")
    public void exercise3() {
        // given - use created shopping cart from above beforeEach()

        // when - step 1: filter your shopping cart for products for some 'category'
        // when - step 2: reduce your shopping cart by summing product prices

        // then - assert the correct total price
    }

}