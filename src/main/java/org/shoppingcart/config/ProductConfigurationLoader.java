package org.shoppingcart.config;

import org.shoppingcart.offer.OfferStrategyFactory;
import org.shoppingcart.offer.impl.OfferStrategyFactoryMethod;
import org.shoppingcart.offer.OfferStrategy;
import org.shoppingcart.product.ProductFactory;

import java.io.*;

import java.util.*;

public class ProductConfigurationLoader {
    private final String productConfigFilePath;
    private final String pricingConfigFilePath;
    private final Properties productConfig;
    private final Properties pricingConfig;
    private final OfferStrategyFactory offerStrategyFactory;

    public ProductConfigurationLoader(String productConfigFilePath, String pricingConfigFilePath) {
        this.productConfigFilePath = productConfigFilePath;
        this.pricingConfigFilePath = pricingConfigFilePath;
        this.productConfig = loadProperties(productConfigFilePath);
        this.pricingConfig = loadProperties(pricingConfigFilePath);
        this.offerStrategyFactory = new OfferStrategyFactoryMethod();
    }

    private Properties loadProperties(String filePath) {
        Properties properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public ProductFactory loadProductFactory() {
        ProductFactory productFactory = new ProductFactory();
        String[] products = productConfig.getProperty("products").split(",");
        for (String productName : products) {
            String priceString = pricingConfig.getProperty(productName + ".price");
            double price = 0.0;
            if (priceString != null && !priceString.trim().isEmpty()) {
                price = Double.parseDouble(priceString);
            }
            String offer = pricingConfig.getProperty(productName + ".offer");
            if (offer == null) {
                offer = "";
            }
            OfferStrategy offerStrategy = offerStrategyFactory.create(offer);
            productFactory.addProduct(productName, price, offerStrategy);
        }
        return productFactory;
    }

}
