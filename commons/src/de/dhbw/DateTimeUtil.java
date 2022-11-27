package de.dhbw;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeUtil {

    public static ZonedDateTime of(int year, int month, int dayOfMonth) {
        return ZonedDateTime.of(
                year,
                month,
                dayOfMonth,
                0,
                0,
                0,
                0,
                ZoneId.systemDefault());
    }
}
