package de.dhbw.course9.factory;

public interface Train {

    void build(Engine engine);

    Engine getEngine();

    void setEngine(Engine engine);
}
