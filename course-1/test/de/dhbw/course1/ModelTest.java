package de.dhbw.course1;

import de.dhbw.Assertions;
import de.dhbw.Course1Main;
import de.dhbw.Logger;
import de.dhbw.course1.model.train.LongDistanceTrain;
import de.dhbw.course1.model.train.Train;

public class ModelTest {

    private final Logger logger = new Logger(Course1Main.class);

    public void canCreateValidTrainModel() {
        // given
        Train train = new LongDistanceTrain();
        String expected = "AZ02638";

        // when
        train.setNumber(expected);

        // then
        Assertions.assertEquals(expected, train.getNumber());
        logger.log(train);
    }

}
