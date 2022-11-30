package de.dhbw.experimental.delay;

import java.time.ZonedDateTime;

public interface Train {

    String getKey();

    void setKey(String key);

    ZonedDateTime getArrival();

    void setArrival(ZonedDateTime arrival);
}
