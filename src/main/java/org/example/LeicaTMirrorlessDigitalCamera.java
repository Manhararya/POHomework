package org.example;

import org.openqa.selenium.By;

public class LeicaTMirrorlessDigitalCamera extends Utils {
    // Click on add to cart button
    By _addToCartButton16 = By.id("add-to-cart-button-16");
    // Click on Shopping cart
    By _shoppingCart = By.linkText("Shopping cart");
    public void addToCartButton16(){
        clickOnElement(_addToCartButton16);
    }
    public void shoppingCart() {
        clickOnElement(_shoppingCart);
    }
}
