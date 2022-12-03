package de.dhbw.course4;

import de.dhbw.commons.Logger;
import de.dhbw.course4.model.Trip;
import de.dhbw.course4.model.TripEvent;
import de.dhbw.course4.model.TripOperator;
import org.junit.jupiter.api.Test;

import static de.dhbw.course4.model.TripEvent.EventType.Arrival;
import static de.dhbw.course4.model.TripEvent.EventType.Departure;

public class Course4Test {

    private final Logger logger = new Logger(Course4Main.class);

    @Test
    public void canCreateTrip() {
        // given

        // when
        Trip trip = buildTrip();

        // then
        logger.log(trip);
    }

    @Test
    public void canRunTrip() {
        // given
        Trip trip = buildTrip();

        TripOperator operator = new TripOperator();
        operator.setTrip(trip);

        // when
        operator.run();

        // then
        //logger.log(trip);
    }

    private Trip buildTrip() {
        Trip trip = new Trip();

        trip.add(TripEvent.of("MA",   Departure, 3)); // "Mannheim"
        trip.add(TripEvent.of("BIB",  Arrival,    1)); // "Biblis"
        trip.add(TripEvent.of("BIB",  Departure, 4)); // "Biblis"
        trip.add(TripEvent.of("SSTD", Arrival,    2)); // "Stockstadt"
        trip.add(TripEvent.of("SSTD", Departure, 4)); // "Stockstadt"
        trip.add(TripEvent.of("FFM",  Arrival,    1)); // "Frankfurt"

        return trip;
    }

}