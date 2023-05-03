package org.example;

import org.openqa.selenium.By;

public class $25VirtualGiftCard extends Utils{
    //Click on compare button
    By _compareProduct = By.className("compare-products");
    //Click on product comparison button
    By _productComparison = By.linkText("product comparison");
    public void compareProduct(){
        clickOnElement(_compareProduct);
    }
    public void productComparison() {
        clickOnElement(_productComparison);
    }
}
