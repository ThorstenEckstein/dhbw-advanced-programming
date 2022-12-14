package de.dhbw.course2.basics;

import de.dhbw.commons.Logger;
import de.dhbw.course2.basics.visibility.VisibilityExampleClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BasicsTest {

    private final Logger logger = new Logger(BasicsTest.class);

    @Test
    public void canCheckVisibility() {
        // given
        VisibilityExampleClass someClass = new VisibilityExampleClass();

        // What is the reason for fields A, C and D being not accessible?

        //someClass.fieldA
        someClass.fieldB = "some value for field B";
        //someClass.fieldC
        //someClass.fieldD

        // when
        String fieldBValue = someClass.fieldB;

        // then
        assertNotNull(fieldBValue);
    }

}
