package de.dhbw.experimental.trip;

import java.util.Comparator;
import java.util.List;

public class ArrivalInspector {

    private final TimeTable timeTable;

    public ArrivalInspector(TimeTable timeTable) {
        this.timeTable = timeTable;
    }

    public List<Trip> getSortedArrivalsFor(String arrivalStation, boolean ascending) {
        List<Trip> trips = timeTable.getTrips(arrivalStation);
        if (ascending) {
            trips.sort(Comparator.comparing(Trip::getArrival));
        } else {
            trips.sort(Comparator.comparing(Trip::getArrival).reversed());
        }
        return trips;
    }
}
