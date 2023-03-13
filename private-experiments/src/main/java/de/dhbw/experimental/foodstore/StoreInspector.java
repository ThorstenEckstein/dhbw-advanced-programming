package de.dhbw.experimental.foodstore;

import java.util.Comparator;
import java.util.List;

public class StoreInspector {

    private FoodStore foodStore;

    public FoodStore getFoodStore() {
        return foodStore;
    }

    public void setFoodStore(FoodStore foodStore) {
        this.foodStore = foodStore;
    }

    public void sortProductsByBestBeforeDate(boolean ascending) {
        List<Product> products = foodStore.getProducts();
        if (products != null) {
            if (ascending) {
                products.sort(Comparator.comparing(Product::getBestBeforeDate));
            } else {
                products.sort(Comparator.comparing(Product::getBestBeforeDate).reversed());
            }
        }
    }
}
