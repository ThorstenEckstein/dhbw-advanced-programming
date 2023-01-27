package de.dhbw.course1.model.routes;

public class Track {

    public enum Direction {
        Forward, Return, Bidirectional
    }

    private Direction direction;

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
