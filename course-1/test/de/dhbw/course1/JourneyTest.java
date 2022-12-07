package de.dhbw.course1;

import de.dhbw.commons.Logger;
import de.dhbw.course1.model.Course1Main;
import de.dhbw.course1.model.personnel.Driver;
import de.dhbw.course1.model.personnel.TrainDriver;
import de.dhbw.course1.model.timetable.Journey;
import de.dhbw.course1.model.timetable.Schedule;
import de.dhbw.course1.model.train.Locomotive;
import de.dhbw.course1.model.train.LongDistanceTrain;
import de.dhbw.course1.model.train.RegionalTrain;
import de.dhbw.course1.model.train.Train;
import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JourneyTest {

    private final Logger logger = new Logger(JourneyTest.class);

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

        Schedule schedule = new Schedule();
        schedule.setFrom("MA");
        schedule.setTo("FFM");
        schedule.getJourneys().add(journey);

        journey.setTrain(train);
        journey.setSchedule(schedule);
        journey.setDeparture(ZonedDateTime.of(2023,2,15,10,15,0,0, ZoneId.systemDefault()));
        journey.setDriver(driver);

        // when

        // then
        logger.log(journey);
    }

}
