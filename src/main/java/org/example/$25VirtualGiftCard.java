package org.example;

import org.openqa.selenium.By;

public class $25VirtualGiftCard extends Utils{
    //Click on compare button
    By _compareProduct = By.className("compare-products");
    //Click on product comparison button
    By _productComparison = By.linkText("product comparison");
    public void compareProduct(){
        // click on $25VirtualGiftCard compare button
        clickOnElement(_compareProduct);
    }
    public void productComparison() {
        // click on product comparison button
        clickOnElement(_productComparison);
    }
}
