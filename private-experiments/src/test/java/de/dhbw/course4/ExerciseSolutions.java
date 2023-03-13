package de.dhbw.course4;

import de.dhbw.commons.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("ConstantValue")
public class ExerciseSolutions {

    private final Logger logger = new Logger(ExerciseSolutions.class);

    @Test
    @DisplayName("(1) Logischer Operator: &")
    public void testOperator1() {
        // given
        boolean operand1 = true;
        boolean operand2 = false;

        // when - both are evaluated!
        boolean result = operand1 & operand2;

        // then
        System.out.printf("%s & %s -> %s", operand1, operand2, result);
    }

    @Test
    @DisplayName("(2) Logischer Operator: &")
    public void testOperator2() {
        // given
        boolean operand1 = true;
        boolean operand2 = true;

        // when - both are evaluated!
        boolean result = operand1 & operand2;

        // then
        System.out.printf("%s & %s -> %s", operand1, operand2, result);
    }

    @Test
    @DisplayName("(3) Logischer Operator: &&")
    public void testOperator3() {
        // given
        boolean operand1 = true;
        boolean operand2 = false;

        // when - both are evaluated!
        boolean result = operand1 && operand2;

        // then
        System.out.printf("%s && %s -> %s", operand1, operand2, result);
    }

    @Test
    @DisplayName("(4) Logischer Operator: &&")
    public void testOperator4() {
        // given
        boolean operand1 = false;
        boolean operand2 = true;

        // when - evaluation stops after operand1 has been evaluated to 'false'
        boolean result = operand1 && operand2;

        // then
        System.out.printf("%s && %s -> %s", operand1, operand2, result);
    }

}
