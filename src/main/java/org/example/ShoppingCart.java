package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCart extends Utils{
    //Click on Leica T Mirrorless Digital Camera
    By _productInShoppingCart = By.xpath("//td[@class=\"product\"]");
    public void productInShoppingCart() {
        String expectedShoppingCartMessage = "Leica T Mirrorless Digital Camera";
        String actualMessage = getTextFromElement(_productInShoppingCart);
        System.out.println("Result Message:" + actualMessage);
        // Expected message
        Assert.assertEquals(actualMessage, expectedShoppingCartMessage, "Product is not adding in shopping cart");
    }
}
