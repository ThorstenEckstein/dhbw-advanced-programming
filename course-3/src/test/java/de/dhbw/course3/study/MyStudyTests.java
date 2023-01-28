package de.dhbw.course3.study;

import main.java.de.dhbw.commons.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyStudyTests {

    private final Logger logger = new Logger(MyStudyTests.class);

    @BeforeEach
    public void beforeEach() {
        // implement a shopping cart with 4 products (having 'name', 'category' and 'price')
    }

    @Test
    public void canFilterAndReduceShoppingCart() {
        // given - use created shopping cart from above beforeEach()

        // when - step 1: filter your shopping cart for products for some 'category'
        // when - step 2: reduce your shopping cart by summing product prices

        // then - assert the correct total price
    }

}