# Shopping Cart

This is a simple shopping cart application written in Java. It allows you to add products to a shopping cart, apply different pricing strategies to those products, and calculate the total price of the items in the cart.

## Table of Contents
- [Requirements](#requirements)
- [Design](#design)

## Requirements
Using Java, write a simple program that calculates the price of a basket of shopping.

The solution should be accomplished in roughly two hours.

Items are presented one at a time, in a list, identified by name - for example "Apple" or "Banana".

Multiple items are present multiple times in the list, so for example ["Apple", "Apple", "Banana"] is a basket with two apples and one banana.

Items are priced as follows:

- Apples are 35p each
- Bananas are 20p each
- Melons are 50p each, but are available as ‘buy one get one free’
- Limes are 15p each, but are available in a ‘three for the price of two’ offer

Given a list of shopping, calculate the total cost of those items.

## Design

The main classes of the program are Product, ProductFactory, ShoppingCart, PricingConfigurationLoader, ProductConfigurationLoader, and the OfferStrategy interface with its implementations.


## Class Diagram

![Model](https://github.com/tibcogeek/ShoppingCart_V2/blob/master/src/main/resources/ClassDiagram.PNG)

## Product
Product is a class that represents a product in the shopping cart. The calculatePrice method of this class takes an integer argument, representing the quantity of the product, and returns the price based on the pricing strategy.

## ProductFactory
ProductFactory is a factory class that creates a new Product instance and adds it to the productMap. This class has two methods: addProduct and getProduct.

## ShoppingCart
ShoppingCart is a class that represents a shopping cart. It has a Map of Product objects and their quantities. The addItem method of this class takes a Product and an integer argument, representing the quantity of the product. The getTotal method of this class calculates and returns the total price of all items in the cart.

## OfferStrategy
OfferStrategy is an interface that defines a pricing strategy for the Product class. It has a single method calculatePrice, which takes a price and a quantity and returns the total price based on the pricing strategy.

## PricingConfigurationLoader
PricingConfigurationLoader is a class that loads the pricing configuration from a pricing_config.properties file. This class has a static method loadProperties that returns a Properties object containing the pricing configuration.

## ProductConfigurationLoader
ProductConfigurationLoader is a class that loads the product configuration from a product_config.properties file. This class has a method loadProducts that returns a list of Product objects based on the product configuration.



## Sequence Diagram

![Model](https://github.com/tibcogeek/ShoppingCart_V2/blob/master/src/main/resources/SequenceDiagram.PNG)


## Adding products
To add products to the shopping cart, you will need to configure them in the product_config.properties file. This file contains a list of all the products that can be added to the cart, along with their prices and any pricing strategies that should be applied to them.

## Applying pricing strategies
When you add a product to the cart, you can specify how many of that product you want to add. The shopping cart will then apply the appropriate pricing strategy to that product based on the configuration in the product_config.properties file.

There are three pricing strategies available:

**DefaultOfferStrategy**: This is the default pricing strategy and simply multiplies the price of the product by the quantity.

**BuyOneGetOneFreeOfferStrategy**: This strategy applies a "buy one, get one free" discount to the product.

**BuyThreeForTwoFreeOfferStrategy**: This strategy applies a "buy three, get two free" discount to the product.

You can also create your own custom pricing strategies by implementing the OfferStrategy interface.

## Calculating the total price
Once you have added all the products you want to purchase to the shopping cart, you can calculate the total price by calling the getTotal method on the shopping cart. This will iterate through all the products in the cart and apply the appropriate pricing strategy to each one, then return the total price of all the items in the cart.







