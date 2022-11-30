package de.dhbw.experimental.delay;

import de.dhbw.Logger;

import java.time.ZonedDateTime;

import static de.dhbw.Assertions.assertEquals;
import static de.dhbw.experimental.delay.MockFactory.mockTrain;

public class DelayTest {

    private final Logger logger = new Logger(Train.class);

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
