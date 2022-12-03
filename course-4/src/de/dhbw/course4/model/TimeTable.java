package de.dhbw.course4.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeTable {

    private List<Trip> trips = new ArrayList<>();

    private Map<Train, List<Trip>> _trips = new HashMap<>();

    public List<Trip> getTrips() {
        return trips;
    }

    public void addTrip(Trip trip) {
        this.trips.add(trip);
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }

}