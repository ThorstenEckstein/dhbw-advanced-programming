package de.dhbw.experimental.delay;

import java.time.ZonedDateTime;

public class Trip {

    private String departureStation;
    private ZonedDateTime departure;

    private String arrivalStation;
    private ZonedDateTime arrival;

    private Trip() { }

    public String getDepartureStation() {
        return departureStation;
    }

    public ZonedDateTime getDeparture() {
        return departure;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public ZonedDateTime getArrival() {
        return arrival;
    }

    @SuppressWarnings("PMD.AvoidFieldNameMatchingMethodName")
    public static final class Builder {
        private Trip trip;

        public Builder() {
            this.trip = new Trip();
        }

        public Builder departureStation(String val) {
            this.trip.departureStation = val;
            return this;
        }

        public Builder departure(ZonedDateTime val) {
            this.trip.departure = val;
            return this;
        }

        public Builder arrivalStation(String val) {
            this.trip.arrivalStation = val;
            return this;
        }

        public Builder arrival(ZonedDateTime val) {
            this.trip.arrival = val;
            return this;
        }

        public Trip build() {
            return trip;
        }
    }
}
