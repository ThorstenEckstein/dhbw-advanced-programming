package de.dhbw.experimental.foodstore;

import main.java.de.dhbw.commons.DateTimeUtil;
import main.java.de.dhbw.commons.Logger;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static de.dhbw.experimental.foodstore.MockFactory.mockProduct;

public class FoodstoreTest {

    private final Logger logger = new Logger(FoodstoreTest.class);

    @Test
    public void canReadDataFromCsvFile() {
        // given
        DataLoader loader = new DataLoader();

        // when - files are searched relative to module root 'experiments'
        Set<Product> data = loader.load("./src/test/resources/Vorratsliste.csv");

        // then
        logger.log(data);
    }

    @Test
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

    @Test
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
