package org.shoppingcart.offer.impl;

import org.shoppingcart.offer.OfferStrategy;

public class DefaultOfferStrategy implements OfferStrategy {
    @Override
    public double calculatePrice(double price, int quantity) {
        return price * quantity;
    }
}
