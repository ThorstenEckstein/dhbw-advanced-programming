package de.dhbw.course2.basics;

import de.dhbw.course2.basics.statics.Train;
import de.dhbw.course2.basics.statics.TrainFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StaticTest {

    @Test
    @DisplayName(
            """
            DEMO : Static elements (Factory)
            """)
    public void canUseStaticElements() {
        // given - no instance required!

        // when
        String type = TrainFactory.FACTORY_TYPE;

        List<Train> preparedTrains = TrainFactory.getPreparedTrains();

        Train train = TrainFactory.buildTrain(77);

        // then
        assertEquals("24/7", type);
        assertEquals(3, preparedTrains.size());
        assertNotNull(train);
    }

}
