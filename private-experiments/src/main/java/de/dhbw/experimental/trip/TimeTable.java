package de.dhbw.experimental.trip;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TimeTable {

    private List<Trip> trips = new ArrayList<>();

    public Trip getTrip(String trainKey) {
        return trips
                .stream()
                .filter(t -> t.getTrain().getKey().equalsIgnoreCase(trainKey))
                .findFirst()
                .orElseThrow();
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public List<Trip> getTrips(String arrivalStation) {
        return trips
                .stream()
                .filter(t -> t.getArrivalStation().equalsIgnoreCase(arrivalStation))
                .collect(Collectors.toList());
    }

    public void addTrip(Trip trip) {
        this.trips.add(trip);
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }

}