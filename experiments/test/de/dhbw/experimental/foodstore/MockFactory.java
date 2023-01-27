package de.dhbw.experimental.foodstore;

import main.java.de.dhbw.commons.DateTimeUtil;

import java.time.ZonedDateTime;

public class MockFactory {

    public static Product mockProduct(FoodGroup foodGroup, String name, ZonedDateTime bestBeforeDate) {
        Product product = new Product(foodGroup, name);
        product.setBestBeforeDate(bestBeforeDate);
        return product;
    }

    /**
     * Use zoned datetime string of format:
     * <pre>
     * dd.mm.yyyy
     * </pre>.
     */
    public static Product mockProduct(FoodGroup foodGroup, String name, String bestBeforeDate) {
        Product product = new Product(foodGroup, name);
        product.setBestBeforeDate(DateTimeUtil.from(bestBeforeDate));
        return product;
    }

}
