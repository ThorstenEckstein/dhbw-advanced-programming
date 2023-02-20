package de.dhbw.course1.basics;

import de.dhbw.course1.basics.objectcontract.Passenger;
import de.dhbw.course1.basics.objectcontract.Train;
import de.dhbw.course1.basics.visibility.VisibilityExampleClass;
import main.java.de.dhbw.commons.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BasicsTest {

    private final Logger logger = new Logger(BasicsTest.class);

    //tag::visibility[]
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
    //end::visibility[]

    // --------------------------------------------------------------------------------
    //                               Object Contract
    // --------------------------------------------------------------------------------

    //tag::object-contract-1[]
    @Test
    public void cannotCommitEqualInstances() {
        // given
        Passenger passenger1 = new Passenger("Max Mustermann");
        Passenger passenger2 = new Passenger("Max Mustermann");

        // when
        boolean areEqual = passenger1.equals(passenger2);

        // then
        assertFalse(areEqual);
        logger.log(String.format(
                "%s != %s",
                passenger1.hashCode(),
                passenger2.hashCode()));
    }
    //end::object-contract-1[]

    //tag::object-contract-2[]
    @Test
    public void canCommitEqualInstances() {
        // given
        Train train1 = new Train("RB-10");
        Train train2 = new Train("RB-10");

        // when
        boolean areEqual = train1.equals(train2);

        // then
        assertTrue(areEqual);
        logger.log(String.format(
                "%s == %s",
                train1.hashCode(),
                train2.hashCode()));
    }
    //end::object-contract-2[]


}
