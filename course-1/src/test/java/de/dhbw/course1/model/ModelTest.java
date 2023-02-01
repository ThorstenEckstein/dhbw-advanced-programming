package de.dhbw.course1.model;

import main.java.de.dhbw.commons.DateTimeUtil;
import main.java.de.dhbw.commons.Logger;
import de.dhbw.course1.Course1Main;
import de.dhbw.course1.model.personnel.Driver;
import de.dhbw.course1.model.personnel.TrainDriver;
import de.dhbw.course1.model.routes.Route;
import de.dhbw.course1.model.timetable.Journey;
import de.dhbw.course1.model.timetable.Timetable;
import de.dhbw.course1.model.train.Locomotive;
import de.dhbw.course1.model.train.LongDistanceTrain;
import de.dhbw.course1.model.train.RegionalTrain;
import de.dhbw.course1.model.train.Train;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModelTest {

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

    @Test
    public void canBuildJourney() {
        // given
        Journey journey = new Journey();

        Locomotive locomotive = new Locomotive();
        locomotive.setType(Locomotive.EngineType.Electrical);

        Train train = new RegionalTrain();
        train.setNumber("RB-10");
        train.setLocomotive(locomotive);

        Driver driver = new TrainDriver("Hans Dampf");

        Route route = new Route("MA-FFM", null);

        journey.setTrain(train);
        journey.setRoute(route);
        journey.setDeparture(DateTimeUtil.of("2023-02-15T10:15+01:00[Europe/Berlin]"));
        journey.setDriver(driver);

        Timetable timetable = new Timetable("Winterfahrplan 22/23");
        timetable.addJourney(journey);

        // when

        // then
        logger.log(timetable);
    }

}
