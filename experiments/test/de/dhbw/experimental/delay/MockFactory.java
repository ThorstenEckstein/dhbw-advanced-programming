package de.dhbw.experimental.delay;

import de.dhbw.DateTimeUtil;
import de.dhbw.experimental.foodstore.FoodGroup;
import de.dhbw.experimental.foodstore.Product;

import java.time.ZonedDateTime;

public class MockFactory {

    public static Train mockTrain(String key, ZonedDateTime arrival) {
        Train train = new RegionalTrain(key);
        train.setArrival(arrival);
        return train;
    }

    /**
     * Use zoned datetime string of format:
     * <pre>
     * dd.mm.yyyy:HH:MM
     * </pre>.
     */
    public static Train mockTrain(String key, String arrival) {
        Train train = new RegionalTrain(key);
        train.setArrival(DateTimeUtil.of2(arrival));
        return train;
    }

}
