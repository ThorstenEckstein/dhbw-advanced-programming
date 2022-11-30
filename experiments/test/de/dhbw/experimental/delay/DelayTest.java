package de.dhbw.experimental.delay;

import de.dhbw.commons.Logger;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;

import static de.dhbw.experimental.delay.MockFactory.mockTrain;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DelayTest {

    private final Logger logger = new Logger(Train.class);

    @Test
    public void canSetDelay() {
        // given
        Train train = mockTrain(
                "RE 1045",
                "2022-11-30T10:15:00");

        // when
        ZonedDateTime arrival = train.getArrival();

        // then
        assertEquals("2022-11-30T10:15+01:00[Europe/Berlin]", arrival.toString());
    }

}
