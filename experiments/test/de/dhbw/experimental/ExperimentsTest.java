package de.dhbw.experimental;

import de.dhbw.DateTimeUtil;
import de.dhbw.Logger;

public class ExperimentsTest {

    private final Logger logger = new Logger(ExperimentsTest.class);

    public void canCreateFoodModel() {
        // given
        Product product1 = new Product(FoodGroup.Getreideprodukte, "Dinkelmehl");
        product1.setBestBeforeDate(DateTimeUtil.of(2023,4,13));

        Product product2 = new Product(FoodGroup.Fertiggerichte, "Erbsensuppe");
        product2.setBestBeforeDate(DateTimeUtil.of(2024,10,2));

        // when

        // then
        logger.log(product1);
        logger.log(product2);
    }

}
