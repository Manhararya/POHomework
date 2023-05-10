package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ShoppingCart extends Utils{
    //Write Xpath
    By _productInShoppingCart = By.cssSelector("td.product");
    By _termOfService = By.xpath("//input[@id='termsofservice']");
    By _checkout = By.xpath("//Button[@id='checkout']");
    public void productInShoppingCart() {
        //connect with Xpath
        System.out.println("Product in Shopping Cart:");
        List<WebElement> productList =driver.findElements(_productInShoppingCart);
        for (WebElement e:productList){
            System.out.println(e.getText());
        }
    }
    public void checkout(){
        //connect with Xpath
        clickOnElement(_termOfService);
        clickOnElement(_checkout);
    }
}
