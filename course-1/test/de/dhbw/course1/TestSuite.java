package de.dhbw.course1;

import de.dhbw.course1.model.train.LongDistanceTrain;
import de.dhbw.course1.model.train.Train;

public class TestSuite {
    public void run() {
        Train train = new LongDistanceTrain();
        train.setNumber("AZ02638");

        log(train);
    }

    public void log(Object what) {
        System.out.println(what);
    }
}
