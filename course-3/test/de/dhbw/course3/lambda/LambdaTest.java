package de.dhbw.course3.lambda;

import de.dhbw.commons.DateTimeUtil;
import de.dhbw.commons.Logger;
import de.dhbw.course3.streaming.Schedule;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static de.dhbw.course3.lambda.Validator.*;


public class LambdaTest {

    private final Logger logger = new Logger(LambdaTest.class);

    //tag::lambda-example-1[]
    @Test
    public void canUseLambdaForLists() {
        // given
        List<String> trains = List.of("ICE 81", "RB 10", "IC 2027", "RE 39", "S8");

        // when - find IC's
        boolean matchesIC = trains.stream().anyMatch(e -> e.startsWith("IC"));

        // when - find regional trains
        String train = trains.stream()
                .filter(e -> e.contains("R"))
                .findFirst()
                .orElse("?");

        // then
        assertTrue(matchesIC);
        assertEquals("RB 10", train);
    }
    //end::lambda-example-1[]

    //tag::lambda-example-2[]
    @Test
    public void canUseValidatorPredicates() {
        // given (Timetable shall be created for the year '2023')

        ZonedDateTime departure = DateTimeUtil.from("15.02.2023");
        Schedule schedule = Schedule.of("MA", "DA", departure, 45);

        // when - (a) direct implementation
        Predicate<Schedule> predicate = s -> s.getDeparture().getYear() == 2023;
        boolean testResult1 = predicate.test(schedule);

        // when - (b) concern 'validation' wrapped in a separate class
        boolean testResult2 = Validator.validate(schedule, isScheduledFor2023());

        // then
        assertTrue(testResult1);
        assertTrue(testResult2);
    }
    //end::lambda-example-2[]

}