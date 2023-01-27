package de.dhbw.course2.basics;

import main.java.de.dhbw.commons.Logger;
import de.dhbw.course2.basics.objectcontract.Journey;
import de.dhbw.course2.basics.objectcontract.Passenger;
import de.dhbw.course2.basics.objectcontract.PassengerImpl1;
import de.dhbw.course2.basics.objectcontract.PassengerImpl2;
import de.dhbw.course2.basics.override.DefaultDisplay;
import de.dhbw.course2.basics.override.Display;
import de.dhbw.course2.basics.override.PlatformDisplay;
import de.dhbw.course2.basics.visibility.VisibilityExampleClass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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

    //tag::overload[]
    @Test
    public void canOverloadMethods() {
        // given
        de.dhbw.course2.basics.overload.PlatformDisplay display = new de.dhbw.course2.basics.overload.PlatformDisplay();

        // when
        display.update();
        display.update("MA-DA");
        display.update(List.of("MA-DA", "FFM-MUE"));

        // then
    }
    //end::overload[]

    //tag::override[]
    @Test
    public void canOverwriteMethods() {
        // given
        Display display1 = new DefaultDisplay();
        Display display2 = new PlatformDisplay();

        // when
        display1.update(0, "5 minutes delay");
        display2.update(0, "5 minutes delay");

        // then
    }
    //end::override[]


    // ###################################### Wiederholungen ######################################

    @Test
    @DisplayName(
            """
            Wiederholung: Identity and Equality
            """)
    public void cannotRemovePassenger() {
        // given
        Journey journey = new Journey();

        Passenger eric = new PassengerImpl1("Eric");
        Passenger julia = new PassengerImpl1("Julia");
        Passenger fred = new PassengerImpl1("Fred");

        journey.checkIn(eric);
        journey.checkIn(julia);
        journey.checkIn(fred);

        logger.log(journey);

        // when - does this work?
        //journey.checkOut(julia);
        PassengerImpl1 againJulia = new PassengerImpl1("Julia");
        journey.checkOut(againJulia);

        // then
        assertEquals(3, journey.getPassengers().size());

        logger.log(journey);
    }

    @Test
    @DisplayName(
            """
            Wiederholung: Identity and Equality
            """)
    public void canRemovePassengerBecauseOfEquality() {
        // given
        Journey journey = new Journey();

        Passenger eric = new PassengerImpl2("Eric");
        Passenger julia = new PassengerImpl2("Julia");
        Passenger fred = new PassengerImpl2("Fred");

        journey.checkIn(eric);
        journey.checkIn(julia);
        journey.checkIn(fred);

        logger.log(journey);

        // when - does this work, and why?
        Passenger stillJulia = new PassengerImpl2("Julia");
        journey.checkOut(stillJulia);

        // then
        assertEquals(2, journey.getPassengers().size());

        logger.log(journey);
    }

}
