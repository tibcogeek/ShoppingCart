package org.shoppingcart.offer;

public interface OfferStrategy {
    double calculatePrice(double price, int quantity);
}
