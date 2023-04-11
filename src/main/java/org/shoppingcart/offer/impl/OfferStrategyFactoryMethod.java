package org.shoppingcart.offer.impl;

import org.shoppingcart.offer.OfferStrategy;
import org.shoppingcart.offer.OfferStrategyFactory;
import org.shoppingcart.offer.impl.BuyOneGetOneFreeOfferStrategy;
import org.shoppingcart.offer.impl.BuyThreeForTwoFreeOfferStrategy;
import org.shoppingcart.offer.impl.DefaultOfferStrategy;
public class OfferStrategyFactoryMethod implements OfferStrategyFactory {
    @Override
    public OfferStrategy create(String offer) {
        switch (offer) {
            case "buy-one-get-one-free":
                return new BuyOneGetOneFreeOfferStrategy();
            case "three-for-two":
                return new BuyThreeForTwoFreeOfferStrategy();
            default:
                return new DefaultOfferStrategy();
            // Add more offers
        }
    }
}
