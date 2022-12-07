package de.dhbw.course1.model.timetable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Timetable {

    private final String title;

    private List<Schedule> entries;

    public Timetable(String title) {
        this.title = title;
        this.entries = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public List<Schedule> getEntries() {
        return entries;
    }

    public void setEntries(List<Schedule> entries) {
        this.entries = entries;
    }

    public void addEntry(Schedule entry) {
        this.entries.add(entry);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Timetable timetable = (Timetable) o;
        return title.equals(timetable.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
