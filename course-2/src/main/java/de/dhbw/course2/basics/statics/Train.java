package de.dhbw.course2.basics.statics;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private long id;
    private List<Wagon> wagons;

    public Train(long id) {
        this.id = id;
        this.wagons = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Wagon> getWagons() {
        return wagons;
    }

    public void addWagon(Wagon wagon) {
        this.wagons.add(wagon);
    }

    public void setWagons(List<Wagon> wagons) {
        this.wagons = wagons;
    }
}
