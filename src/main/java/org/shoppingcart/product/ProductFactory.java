package org.shoppingcart.product;

import org.shoppingcart.offer.OfferStrategy;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {
    private Map<String, Product> productMap = new HashMap<>();

    public void addProduct(String name, double price, OfferStrategy offerStrategy) {
        Product product = new Product(name, price, offerStrategy);
        productMap.put(name, product);
    }

    public Product getProduct(String name) {
        return productMap.get(name);
    }
}
