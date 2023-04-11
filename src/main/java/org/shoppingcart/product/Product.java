package org.shoppingcart.product;

import org.shoppingcart.offer.OfferStrategy;

public class Product {
    private String name;
    private double price;
    private OfferStrategy offerStrategy;

    public Product(String name, double price, OfferStrategy offerStrategy) {
        this.name = name;
        this.price = price;
        this.offerStrategy = offerStrategy;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double calculatePrice(int quantity) {
        return offerStrategy.calculatePrice(price, quantity);
    }

    public void setOfferStrategy(OfferStrategy offerStrategy) {
        this.offerStrategy = offerStrategy;
    }
}
