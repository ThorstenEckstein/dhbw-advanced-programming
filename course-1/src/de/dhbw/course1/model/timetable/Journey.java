package de.dhbw.course1.model.timetable;

import de.dhbw.course1.model.personnel.Driver;
import de.dhbw.course1.model.train.Train;

import java.time.ZonedDateTime;

public class Journey {

    /**
     * Journey takes place on which route (from where to where)?
     */
    private Schedule schedule;

    /**
     * Journey takes place for what train?
     */
    private Train train;

    /**
     * Journey takes place when, when is the scheduled train departing?
     */
    private ZonedDateTime departure;

    /**
     * Who is driving the train?
     */
    private Driver driver;

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public ZonedDateTime getDeparture() {
        return departure;
    }

    public void setDeparture(ZonedDateTime departure) {
        this.departure = departure;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Journey{" +
                "schedule=" + schedule +
                ", train=" + train +
                ", departure=" + departure +
                ", driver=" + driver +
                '}';
    }
}
