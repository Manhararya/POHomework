package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utils {
    // Write Xpath of processor
    By _processor = By.xpath("//select[@data-attr='1']");
    // Write Xpath of  ram
    By _ram = By.xpath("//select[@data-attr='2']");
    // Write Xpath of hard drive
    By _hdd = By.xpath("//input[@id='product_attribute_3_6']");
    // Write Xpath of os
    By _os = By.xpath("//input[@id='product_attribute_4_9']");
    // Write Xpath of programme
    By _acrobatReader = By.xpath("//input[@id='product_attribute_5_11']");
    // Write Xpath of programme
    By _totalCommander = By.xpath("//input[@id='product_attribute_5_12']");
    // click on add to cart
    By _addToCart = By.cssSelector("button.add-to-cart-button");
    // click on shopping cart button
    By _shoppingCart = By.xpath("//div[@class='bar-notification success']/p[1]/a");

    public void assembleComputer(){
        // connect with Xpath
        selectDropdownByText(_processor,"2.2 GHz Intel Pentium Dual-Core E2200");
        selectDropdownByText(_ram,"8GB [+$60.00]");
        clickOnElement(_hdd);
        clickOnElement(_os);
        clickOnElement(_acrobatReader);
        clickOnElement(_totalCommander);
        clickOnElement(_addToCart);
        clickOnElement(_shoppingCart);
    }
}
