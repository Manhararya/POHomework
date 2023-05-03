package org.example;

import org.openqa.selenium.By;

public class HTCOneM8AndroidL50Lollipop extends Utils{
    // Click on compare button
    By _compareProduct = By.className("compare-products");
    //Click on GIft Card button
    By _giftCard = By.linkText("Gift Cards");
    public void compareProduct(){
        clickOnElement(_compareProduct);
    }
    public void giftCard (){
        clickOnElement(_giftCard);
    }
}
