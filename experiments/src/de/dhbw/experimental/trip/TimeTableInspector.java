package de.dhbw.experimental.trip;

import java.time.Duration;
import java.time.ZonedDateTime;

public class TimeTableInspector {

    private final TimeTable timeTable;

    public TimeTableInspector(TimeTable timeTable) {
        this.timeTable = timeTable;
    }

    @SuppressWarnings("UnnecessaryLocalVariable")
    public Duration predictArrivalFor(RegionalTrain train, Duration consumedTripDuration) {

        Trip trip = timeTable.getTrip(train.getKey());
        ZonedDateTime arrival = trip.getArrival();
        ZonedDateTime departure = trip.getDeparture();

        Duration scheduledTripDuration = Duration.between(departure, arrival);
        Duration predictedDurationToArrive = scheduledTripDuration.minus(consumedTripDuration);

        return predictedDurationToArrive;
    }
}
