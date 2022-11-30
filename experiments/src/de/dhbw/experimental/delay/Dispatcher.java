package de.dhbw.experimental.delay;

import java.util.Comparator;
import java.util.List;

public class Dispatcher {

    private Station station;

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public void sortTrainsByArrival(boolean ascending) {
        List<Train> regionalTrains = station.getTrains();
        if (regionalTrains != null) {
            if (ascending) {
                regionalTrains.sort(Comparator.comparing(Train::getArrival));
            } else {
                regionalTrains.sort(Comparator.comparing(Train::getArrival).reversed());
            }
        }
    }
}
