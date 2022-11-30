package de.dhbw.experimental.foodstore;

public class TestSuite {
    public void run() {
        FoodstoreTest test = new FoodstoreTest();
        test.canCreateFoodModel();
        test.canSeedFoodStore();
        test.canSortProductsByDate();
        /*
          move test methods here to deactivate
        */
    }
}
