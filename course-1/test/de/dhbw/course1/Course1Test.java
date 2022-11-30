package de.dhbw.course1;

import de.dhbw.course1.model.Course1Main;
import de.dhbw.commons.Logger;
import de.dhbw.course1.model.train.LongDistanceTrain;
import de.dhbw.course1.model.train.Train;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Course1Test {

    private final Logger logger = new Logger(Course1Main.class);

    @Test
    public void canCreateValidTrainModel() {
        // given
        Train train = new LongDistanceTrain();
        String expected = "AZ02638";

        // when
        train.setNumber(expected);

        // then
        assertEquals(expected, train.getNumber());
        logger.log(train);
    }

}
