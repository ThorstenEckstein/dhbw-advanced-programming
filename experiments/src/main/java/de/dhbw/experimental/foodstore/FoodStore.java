package de.dhbw.experimental.foodstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
public class FoodStore {

    private List<Product> products = new ArrayList<>();

    public boolean hasProduct(String name) {
        return products.stream().anyMatch(p -> p.getName().equalsIgnoreCase(name));
    }

    public Product getProduct(String name) {
        Optional<Product> optional =
                products.stream()
                        .filter(p -> p.getName().equalsIgnoreCase(name))
                        .findFirst();
        return optional.orElse(null);
    }

    public List<Product> getProducts() {
        return products;
    }

    public FoodStore add(Product product) {
        this.products.add(product);
        return this;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
