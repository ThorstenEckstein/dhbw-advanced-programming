package de.dhbw.experimental.delay;

import de.dhbw.commons.DateTimeUtil;
import de.dhbw.commons.Logger;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TripsTest {

    private final Logger logger = new Logger(Train.class);

    @Test
    public void canCreateTrip() {
        // given
        // Departure  -->   Arrival
        // MZ 10:15   -->   FFM 11:21
        RegionalTrain train = new RegionalTrain("RB 102");

        String departureStation = "MZ";
        ZonedDateTime departure = DateTimeUtil.of("2022-11-30T10:15:00");

        String arrivalStation = "FFM";
        ZonedDateTime arrival = DateTimeUtil.of("2022-11-30T11:21:00");

        // when
        Trip trip = new Trip.Builder()
                .train(train)
                .departureStation(departureStation)
                .departure(departure)
                .arrivalStation(arrivalStation)
                .arrival(arrival)
                .build();

        // then
        assertEquals("2022-11-30T11:21+01:00[Europe/Berlin]", trip.getArrival().toString());
        assertEquals("MZ", trip.getDepartureStation());
    }

    @Test
    public void canPredictArrivalInMinutes() {
        // given
        // Departure  -->   Arrival
        // WI 07:02   -->   FFM 07:35
        RegionalTrain train = new RegionalTrain("RB 10");

        String departureStation = "WI";
        ZonedDateTime departure = DateTimeUtil.of("2022-11-30T07:02:00");

        String arrivalStation = "FFM";
        ZonedDateTime arrival = DateTimeUtil.of("2022-11-30T07:35:00");

        // Create trip (Fahrt, geplant)
        Trip trip = new Trip.Builder()
                .train(train)
                .departureStation(departureStation)
                .departure(departure)
                .arrivalStation(arrivalStation)
                .arrival(arrival)
                .build();

        // create timetable (Fahrplan)
        TimeTable timeTable = new TimeTable();
        timeTable.addTrip(trip);

        // when
        TimeTableInspector inspector = new TimeTableInspector(timeTable);
        Duration arrivalPrediction = inspector.predictArrivalFor(train, Duration.ofMinutes(17));

        // then
        assertEquals(16, arrivalPrediction.toMinutes(),
                "Train arrival is predicted in 16 Minutes");
    }

    @Test
    public void canSortTripsByArrival() {
        // given
        Trip trip1 = MockFactory.mockTrip(
                "RB 10",
                "WI",
                DateTimeUtil.of("2022-11-30T07:02:00"),
                "FFM",
                DateTimeUtil.of("2022-11-30T07:35:00")
        );
        Trip trip2 = MockFactory.mockTrip(
                "S1",
                "WI",
                DateTimeUtil.of("2022-11-30T07:05:00"),
                "FFM",
                DateTimeUtil.of("2022-11-30T07:41:00")
        );
        Trip trip3 = MockFactory.mockTrip(
                "S8",
                "WI",
                DateTimeUtil.of("2022-11-30T06:59:00"),
                "FFM",
                DateTimeUtil.of("2022-11-30T07:51:00")
        );

        // create timetable (Fahrplan)
        TimeTable timeTable = new TimeTable();
        timeTable.addTrip(trip1);
        timeTable.addTrip(trip2);
        timeTable.addTrip(trip3);

        // when
        ArrivalInspector inspector = new ArrivalInspector(timeTable);
        List<Trip> upcomingArrivals = inspector.getSortedArrivalsFor("FFM", true);

        // then
        logger.log(upcomingArrivals);
    }

}