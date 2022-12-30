package de.dhbw.course4.threads;

import de.dhbw.commons.Logger;
import de.dhbw.course4.Course4Main;
import de.dhbw.course4.TripBuilder;
import de.dhbw.course4.model.TimeTable;
import de.dhbw.course4.model.Train;
import de.dhbw.course4.model.Trip;
import org.junit.jupiter.api.Test;

public class ThreadsAndRunnableTests {

    private final Logger logger = new Logger(Course4Main.class);
    TripBuilder builder = new TripBuilder();

    @Test
    public void canCreateTrip() {
        // given

        // when
        Trip trip = builder.mock_MA_to_FFM();
        trip.setTrain(new Train("RE-13"));

        // then
        logger.log(trip);
    }

    @Test
    public void canRunSingleTrip() {
        // given
        Trip trip = builder.mock_FU_to_FFM();
        trip.setTrain(new Train("RB-1234"));

        // when
        trip.run();

        // then
    }

    @Test
    public void canRunMultipleTrips() {
        // given
        Trip trip1 = builder.mock_MA_to_FFM();
        Trip trip2 = builder.mock_MZ_to_FFM();
        Trip trip3 = builder.mock_FU_to_FFM();

        TimeTable timeTable = new TimeTable();
        timeTable.putTrip("RE-23", trip1);
        timeTable.putTrip("S8", trip2);
        timeTable.putTrip("RB-2461", trip3);

        // when
        timeTable.run();

        // then

    }

}