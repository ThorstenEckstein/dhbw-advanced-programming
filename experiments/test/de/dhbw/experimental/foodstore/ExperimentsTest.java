package de.dhbw.experimental.foodstore;

import de.dhbw.DateTimeUtil;
import de.dhbw.Logger;

import static de.dhbw.experimental.foodstore.MockFactory.mockProduct;

public class ExperimentsTest {

    private final Logger logger = new Logger(ExperimentsTest.class);

    public void canCreateFoodModel() {
        // given
        Product product = mockProduct(
                FoodGroup.Getreideprodukte,
                "Dinkelmehl",
                "13.4.2023");

        // when

        // then
        logger.log(product);
    }

    public void canSeedFoodStore() {
        // given
        Product product1 = mockProduct(
                FoodGroup.Getreideprodukte,
                "Dinkelmehl",
                "13.4.2023");

        Product product2 = mockProduct(
                FoodGroup.Fertiggerichte,
                "Erbsensuppe",
                "02.10.2024");


        // when
        FoodStore store = new FoodStore();
        store.addProduct(product1);
        store.addProduct(product2);

        // then
        logger.log(store.getProducts());
    }

    public void canSortProductsByDate() {
        // given
        Product product1 = mockProduct(
                FoodGroup.Getreideprodukte,
                "Dinkelmehl",
                "13.4.2023");

        Product product2 = mockProduct(
                FoodGroup.Fertiggerichte,
                "Erbsensuppe",
                "02.10.2024");

        Product product3 = mockProduct(
                FoodGroup.Schokoladen,
                "Lindt 90%",
                "27.12.2023");

        FoodStore store = new FoodStore();
        store.add(product1)
             .add(product2)
             .add(product3);

        StoreInspector inspector = new StoreInspector();
        inspector.setFoodStore(store);

        // when
        inspector.sortProductsByBestBeforeDate(DateTimeUtil.SORT_ASCENDING);

        // then
        logger.log(store.getProducts());
    }

}
