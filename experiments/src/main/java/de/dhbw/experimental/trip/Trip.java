package de.dhbw.experimental.trip;

import java.time.ZonedDateTime;

public class Trip {

    private Train train;

    private String departureStation;
    private ZonedDateTime departure;

    private String arrivalStation;
    private ZonedDateTime arrival;

    private Trip() { }

    public String getDepartureStation() {
        return departureStation;
    }

    public Train getTrain() {
        return train;
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

        public Builder train(Train val) {
            this.trip.train = val;
            return this;
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

    @Override
    public String toString() {
        return "Trip{" +
                "train=" + train +
                ", arrivalStation='" + arrivalStation + '\'' +
                ", arrival=" + arrival +
                '}';
    }

    public String format() {
        return String.format(
                "%n%-5s arrives in %s at %s:%s",
                this.getTrain().getKey(),
                this.getArrivalStation(),
                this.getArrival().getHour(),
                this.getArrival().getMinute()
        );
    }
}
