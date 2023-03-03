package de.dhbw.course2.basics.statics;

import java.util.LinkedList;
import java.util.List;

public class TrainFactory {

    // static field or constant
    public static final String FACTORY_TYPE = "24/7";

    // static initializer
    public static List<Train> trains;

    static {
        trains = new LinkedList<>();
        trains.add(buildTrain(1));
        trains.add(buildTrain(2));
        trains.add(buildTrain(3));
    }

    // static method
    public static Train buildTrain(long id) {
        Train train = new Train(id);
        train.addWagon(new Wagon(1));
        train.addWagon(new Wagon(2));
        train.addWagon(new Wagon(3));
        return train;
    }

    public static List<Train> getPreparedTrains() {
        return trains;
    }
}
