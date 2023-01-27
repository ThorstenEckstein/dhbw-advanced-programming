package de.dhbw.course6.exceptions;

import main.java.de.dhbw.commons.Colourizer;
import main.java.de.dhbw.commons.Logger;
import de.dhbw.course6.TrainObservationMonitor;
import de.dhbw.course6.io.DataLoader;
import de.dhbw.course6.io.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionsTests {

    private final Logger logger = new Logger(ExceptionsTests.class);

    @Test()
    public void testExpectedException() {
        // given
        TrainObservationMonitor model = new TrainObservationMonitor();

        // when
        TrainTooLateException thrown = assertThrows(TrainTooLateException.class, () -> {
            // Code under test that can throw an exception
            model.observeOperatingTrain("RB-21");
        });

        // then
        assertTrue(thrown.getMessage().contains("is more than 6 minutes delayed!"));
    }

    @Test()
    public void testExpectedExceptionWithContext() {
        // given
        TrainObservationMonitor model = new TrainObservationMonitor();

        // when
        PassengerLimitPerWagonExceededException thrown = assertThrows(
                PassengerLimitPerWagonExceededException.class, () -> {
            // Code under test that can throw an exception
            model.observeOperatingTrainWithContext("RB-21");
        });
        Object passengersCount = thrown.getContext().getItem("passengers");

        // then
        assertEquals(Severity.WARN, thrown.getContext().getSeverity());
        assertTrue((int)passengersCount > 80);

        logger.log(Colourizer.red(thrown.getContext().getMessage()));
    }

    @Test()
    public void testHandleException() {
        // given
        DataLoader loader = new DataLoader();

        // when
        Product product = loader.tryLoadWithResources("/resources/macbook-pro.csv");

        // then
        assertNull(product);
    }

    @Test()
    public void testHandleExceptionWithSpecificHandler() {
        // given
        DataLoader loader = new DataLoader();

        // when
        Product product = loader.tryLoad("/resources/macbook-pro.csv");

        // then
        assertNull(product);
    }

}