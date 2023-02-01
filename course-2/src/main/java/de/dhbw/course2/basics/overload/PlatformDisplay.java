package de.dhbw.course2.basics.overload;

import java.util.List;

public class PlatformDisplay {

    // multiple methods can be used to
    // update a platforms' display

    public void update() {}

    public void update(String line) {}

    public void update(List<String> lines) {}

}