package org.shoppingcart.offer.impl;

import org.shoppingcart.offer.OfferStrategy;

public class BuyOneGetOneFreeOfferStrategy implements OfferStrategy {

    @Override
    public double calculatePrice(double price, int quantity) {
        int numDiscountedItems = quantity / 2;
        int numFullPricedItems = quantity - numDiscountedItems;
        return (price * numFullPricedItems) + (0.0 * numDiscountedItems);
    }
}
