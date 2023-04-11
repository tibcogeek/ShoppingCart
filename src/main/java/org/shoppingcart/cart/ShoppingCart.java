package org.shoppingcart.cart;

import org.shoppingcart.product.Product;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<Product, Integer> items = new HashMap<>();

    public void addItem(Product product, int quantity) {
        if (items.containsKey(product)) {
            items.put(product, items.get(product) + quantity);
        } else {
            items.put(product, quantity);
        }
    }

    public double getTotal() {
        double total = 0.0;
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            total += product.calculatePrice(quantity);
        }
        return total;
    }
}
