package de.dhbw.course4.model;

import de.dhbw.commons.Logger;

public class TripOperator implements Runnable {

    private final Logger logger = new Logger(TripOperator.class);

    private Trip trip;

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    @Override
    public void run() {
        getTrip().getEvents().forEach(event -> {
            try {

                Thread.sleep(event.getDuration().toMinutes() * 1000);
                logger.log(trip.toString(event));

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }

}