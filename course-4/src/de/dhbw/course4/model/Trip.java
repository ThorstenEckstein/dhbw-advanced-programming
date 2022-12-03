package de.dhbw.course4.model;

import de.dhbw.commons.Logger;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Trip {

    private final Logger logger = new Logger(Trip.class);

    private List<TripEvent> events = new LinkedList<>();

    public void add(TripEvent event) {
        this.events.add(event);
    }

    public List<TripEvent> getEvents() {
        return events;
    }

    public void setEvents(List<TripEvent> events) {
        this.events = events;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Iterator<TripEvent> iterator = events.iterator();
        while (iterator.hasNext()) {
            TripEvent event = iterator.next();
            builder.append(toString(event));
            builder.append(iterator.hasNext() ? " .." + event.getDuration().toMinutes() + "'.. " : "");
        }
        return builder.toString();
    }

    public String toString(TripEvent event) {
        return String.format("[%s|%s] .. %s .. %s",
                event.getStation(),
                event.getType(),
                event.getDuration().toMinutes(),
                event.getTransition()
        );
    }

}
