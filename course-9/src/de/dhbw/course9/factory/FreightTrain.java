package de.dhbw.course9.factory;

public class FreightTrain extends AbstractTrain {

    public void build(Engine engine) {
        System.out.println("Building " + this.getClass().getSimpleName() + " with engine '" + engine + "' ...");
    }

}