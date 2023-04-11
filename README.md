# Shopping Cart

This is a simple shopping cart application written in Java. It allows you to add products to a shopping cart, apply different pricing strategies to those products, and calculate the total price of the items in the cart.

The main classes of the program are Product, ProductFactory, ShoppingCart, PricingConfigurationLoader, ProductConfigurationLoader, and the OfferStrategy interface with its implementations.

## Product
Product is a class that represents a product in the shopping cart. It has three attributes: name, price, and offerStrategy. The calculatePrice method of this class takes an integer argument, representing the quantity of the product, and returns the price based on the pricing strategy.

## ProductFactory
ProductFactory is a factory class that creates a new Product instance and adds it to the productMap. This class has two methods: addProduct and getProduct.

## ShoppingCart
ShoppingCart is a class that represents a shopping cart. It has a Map of Product objects and their quantities. The addItem method of this class takes a Product and an integer argument, representing the quantity of the product. The getTotal method of this class calculates and returns the total price of all items in the cart.


## Table of Contents
- [Requirements](#requirements)
- [Installation and Usage](#installation-and-usage)
- [Functionality](#functionality)
- [Design](#design)
- [Testing](#testing)

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

## Installation and Usage
To use this program, download the source code and compile it using a Java compiler. Then, run the compiled class file using the command line or an IDE.

To calculate the price of a shopping basket, create an instance of the ShoppingBasket class and add items to it using the addItem method. Then, call the calculateTotalPrice method to get the total price of the basket, taking into account any available offers.

## Functionality
This program supports the following items and prices:
- Apples: 35p each
- Bananas: 20p each
- Melons: 50p each (buy one get one free)
- Limes: 15p each (three for the price of two)

The program applies the following offer strategies:
- BuyOneGetOneFreeOfferStrategy: applies the buy one get one free offer to melons
- ThreeForTwoOfferStrategy: applies the three for the price of two offer to limes

The program calculates the total price of the basket by applying the appropriate offer strategy to each item in the basket and adding up the prices.

## Design
This program uses the strategy design pattern to implement the offer strategies. The OfferStrategy interface defines the methods that each offer strategy must implement. The BuyOneGetOneFreeOfferStrategy and ThreeForTwoOfferStrategy classes implement the OfferStrategy interface and define the specific logic for each offer.

The Product class represents a product and its price. The ShoppingBasket class represents a shopping basket and provides methods to add items to the basket and calculate the total price of the basket.

The PricingService class acts as a mediator between the ShoppingBasket and OfferStrategy classes. It retrieves the product information from the Product class and the offer strategy from the OfferStrategy class, and calculates the offer price and total price of the basket.

Product class represents a product in the shopping basket. It has the following properties:
name (string): The name of the product.
price (double): The price of the product.
The PricingService class is responsible for calculating the price of the shopping basket. It has the following methods:
addProduct(String name): Adds a product to the shopping basket.
getTotalPrice(): Calculates and returns the total price of the shopping basket.
getBasket(): Returns the list of products in the shopping basket.
The OfferStrategy interface defines the structure of an offer strategy. It has the following methods:
calculateOfferPrice(List<Product> products): Calculates and returns the offer price for the given list of products.
getOfferType(): Returns the type of the offer.
The BuyOneGetOneFreeOffer class implements the OfferStrategy interface and represents the "buy one get one free" offer. It has the following properties:
product (Product): The product that is part of the offer.
The ThreeForTwoOffer class implements the OfferStrategy interface and represents the "three for the price of two" offer. It has the following properties:
product (Product): The product that is part of the offer.
The Main class is the entry point for the program. It has the following methods:
main(String[] args): Creates a new instance of the PricingService class, adds products to the shopping basket, calculates the total price of the shopping basket, and prints the result.

# Class Diagram

![Model](https://github.com/tibcogeek/ShoppingCart/blob/master/ClassDiagram.PNG)


# Sequence Diagram

![Model](https://github.com/tibcogeek/ShoppingCart/blob/master/SequenceDiagram.png)

## Testing
This program includes unit tests to ensure the correctness of the implementation. The tests use the JUnit testing framework and can be run using a Java testing tool such as Maven or Gradle.






