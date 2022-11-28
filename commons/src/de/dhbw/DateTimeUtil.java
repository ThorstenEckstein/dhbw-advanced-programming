package de.dhbw;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeUtil {

    public static final Boolean SORT_ASCENDING = true;
    public static final Boolean SORT_DESCENDING = false;

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

    /**
     * Returns a zoned datetime from a string of format: "dd.mm.yyyy"
     * @param dateTime the date time string
     * @return the instance od date time
     */
    public static ZonedDateTime of(String dateTime) {
        String[] dateTimeParts = dateTime.split("\\.");
        return ZonedDateTime.of(
                Integer.parseInt(dateTimeParts[2]),
                Integer.parseInt(dateTimeParts[1]),
                Integer.parseInt(dateTimeParts[0]),
                0,
                0,
                0,
                0,
                ZoneId.systemDefault());
    }

    /**
     * Returns the date time as a simplified string: dd/mm/yyyy
     * @param zonedDateTime the date time instance
     * @return the converted & simplified date time instance
     */
    public static String asSimpleString(ZonedDateTime zonedDateTime) {
        if (zonedDateTime != null) {
            return String.format(
                    "%s/%s/%s",
                    zonedDateTime.getDayOfMonth(),
                    zonedDateTime.getMonthValue(),
                    zonedDateTime.getYear());
        }
        return "not-set";
    }
}