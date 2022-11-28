package de.dhbw.experimental;

public class TestSuite {
    public void run() {
        ExperimentsTest test = new ExperimentsTest();
        test.canCreateFoodModel();
        test.canSeedFoodStore();
        test.canSortProductsByDate();
        /*
          move test methods here to deactivate
        */
    }
}
