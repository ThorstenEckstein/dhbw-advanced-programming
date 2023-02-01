package de.dhbw.course3.streaming;

import main.java.de.dhbw.commons.DateTimeUtil;
import main.java.de.dhbw.commons.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamingTest {

    private final Logger logger = new Logger(StreamingTest.class);

    private Timetable timetable;

    @BeforeEach
    public void beforeEach() {
        this.timetable = new Timetable("Sommerfahrplan 2023");

        Schedule s1 = Schedule.of("MA", "DA",  DateTimeUtil.of("2022-12-28T10:15:00"), 30);
        Schedule s2 = Schedule.of("DA", "FFM", DateTimeUtil.of("2022-12-28T11:21:00"), 30);
        Schedule s3 = Schedule.of("MA", "ST",  DateTimeUtil.of("2022-12-28T10:47:00"), 45);
        Schedule s4 = Schedule.of("MÜ", "FFM", DateTimeUtil.of("2022-12-28T06:31:00"), 180);

        // convenient way to add (not too many) instances of Schedule (arbitrary number of args, called 'varargs')
        this.timetable.addSchedules(s1, s2, s3, s4);
    }

    public Timetable prepareTimetableForReduceExample() {
        Timetable timetable = new Timetable("Sommerfahrplan 2023");

        Schedule s1 = Schedule.of("MA", "DA",  DateTimeUtil.of("2022-12-28T08:00:00"), 30);
        Schedule s2 = Schedule.of("DA", "FFM", DateTimeUtil.of("2022-12-28T08:30:00"), 30);
        Schedule s3 = Schedule.of("FFM", "KA", DateTimeUtil.of("2022-12-28T09:30:00"), 60);

        timetable.addSchedules(s1, s2, s3);

        return timetable;
    }

    @Test
    public void canFilterTimetable() {
        // given - preparation see beforeEach() above

        // when
        List<Schedule> filtered = timetable.getSchedules().stream().filter(s -> s.getFrom().equals("MA")).toList();

        // a bit more readable
        //Predicate<Schedule> departingFromMannheim = s -> s.getFrom().equals("MA");
        //List<Schedule> filtered = timetable.getSchedules().stream().filter(departingFromMannheim).toList();

        // then
        logger.log("Full timetable     : " + timetable.getSchedules());
        logger.log("Filtered timetable : " + filtered);

        assertEquals(2, filtered.size());
    }

    @Test
    public void canMapTimetable() {
        // given - preparation see beforeEach() above

        //List<Schedule> mapped = timetable.getSchedules().stream().map(s -> {
        //    s.setFrom(s.getFrom().toLowerCase());
        //    s.setTo(s.getTo().toLowerCase());
        //    return s;
        //}).toList();

        // when - peek is a 'named' map operation
        List<Schedule> mapped = timetable.getSchedules().stream().peek(s -> {
            s.setFrom(s.getFrom().toLowerCase());
            s.setTo(s.getTo().toLowerCase());
        }).toList();

        // then
        logger.log("Mapped timetable : " + mapped);

        assertEquals(4, mapped.size());
    }

    @Test
    public void canReduceTimetable() {
        // given - preparation see beforeEach() above

        // when - peek is a 'named' map operation
        long nSchedules = timetable.getSchedules().stream().count();

        // then
        logger.log("Reduced timetable : " + nSchedules);

        assertEquals(4, nSchedules);
    }

    //tag::reduce-example[]
    @Test
    public void canReduceScheduleDurations() {
        // given - An example journey
        // [MA] ... 30'... [DA] ... 30' ... [FFM] ... 60' ... [KA]
        Timetable timetable = prepareTimetableForReduceExample();

        // when - step 1: map()

        List<Duration> durations = timetable.getSchedules().stream()
                .map(Schedule::getDuration)
                .toList();

        // when - step 2: reduce()

        //Duration reduced = durations.stream()
        //        .reduce(Duration.ZERO,
        //               (partialDuration, d) -> partialDuration.plus(d));

        Duration reduced = durations.stream()
                .reduce(Duration.ZERO, Duration::plus);

        // then
        logger.log("Duration [min]: " + reduced.toMinutes());
        assertEquals(120, reduced.toMinutes());
    }
    //end::reduce-example[]

}