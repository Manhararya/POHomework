package org.example;

import org.openqa.selenium.By;

public class HTCOneM8AndroidL50Lollipop extends Utils{
    // Click on compare button
    By _compareProduct = By.className("compare-products");
    //Click on GIft Card button
    By _giftCard = By.linkText("Gift Cards");
    public void compareProduct(){
        //connect with Xpath
        clickOnElement(_compareProduct);
    }
    public void giftCard (){
        //connect with Xpath
        clickOnElement(_giftCard);
    }
}
