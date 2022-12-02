package de.dhbw.experimental.trip;

import de.dhbw.experimental.trip.RegionalTrain;
import de.dhbw.experimental.trip.Train;
import de.dhbw.experimental.trip.Trip;

import java.time.ZonedDateTime;

public class MockFactory {

    /**
     * Use zoned datetime string of format:
     * <pre>
     * dd.mm.yyyy:HH:MM
     * </pre>.
     */
    public static Train mockTrain(String key) {
        return new RegionalTrain(key);
    }

    public static Trip mockTrip(
            String trainKey,
            String departureStation,
            ZonedDateTime departure,
            String arrivalStation,
            ZonedDateTime arrival) {

        RegionalTrain train = new RegionalTrain(trainKey);

        return new Trip.Builder()
                .train(train)
                .departureStation(departureStation)
                .departure(departure)
                .arrivalStation(arrivalStation)
                .arrival(arrival)
                .build();
    }

}
