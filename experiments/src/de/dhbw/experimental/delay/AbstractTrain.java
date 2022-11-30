package de.dhbw.experimental.delay;

import de.dhbw.DateTimeUtil;

import java.time.ZonedDateTime;
import java.util.Objects;

public abstract class AbstractTrain implements Train {

    private String key;
    private ZonedDateTime bestBeforeDate;

    public AbstractTrain(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public ZonedDateTime getArrival() {
        return bestBeforeDate;
    }

    @Override
    public void setArrival(ZonedDateTime bestBeforeDate) {
        this.bestBeforeDate = bestBeforeDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractTrain that = (AbstractTrain) o;
        return key.equals(that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    @Override
    public String toString() {
        return "Train {" +
                "name='" + key + '\'' +
                ", bestBeforeDate=" + DateTimeUtil.asSimpleString(bestBeforeDate) +
                '}';
    }

}