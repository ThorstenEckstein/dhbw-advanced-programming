package de.dhbw.experimental.trip;

import java.util.List;
import java.util.stream.Collectors;

public class DisplayHelper {

    public static String map(List<Trip> trips) {
        return trips
                .stream()
                .map(t -> String.format(
                        "%n%-5s arrives in %s at %s:%s",
                        t.getTrain().getKey(),
                        t.getArrivalStation(),
                        t.getArrival().getHour(),
                        t.getArrival().getMinute())
                )
                .collect(Collectors.joining(""));
    }

    public static String reduce(List<Trip> trips) {
        String initialDisplayValue = "";
        return trips
                .stream()
                .reduce(initialDisplayValue,
                        (partialDisplay, t) -> partialDisplay + t.format(),
                        String::concat);
    }

}
