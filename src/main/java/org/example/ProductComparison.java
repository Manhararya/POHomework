package org.example;

import org.openqa.selenium.By;

public class ProductComparison extends Utils{
    //Click on HTC One M8 Android L 5.0 Lollipop button
    By _hTCOneM8Android = By.linkText("HTC One M8 Android L 5.0 Lollipop");
    //Click on $25 Virtual Gift Card button
    By _$25VirtualGiftCard = By.linkText("$25 Virtual Gift Card");
    public void compareProductBetween(){
        String actualMessage1 = getTextFromElement(_hTCOneM8Android);
        System.out.println("First Product:"+actualMessage1);
        // After comparison second product's name will come
        String actualMessage2 = getTextFromElement(_$25VirtualGiftCard);
        System.out.println("Second Product:"+actualMessage2);

    }
    // Click on clear list
    By _clearList = By.className("clear-list");
    public void clearList () {
        // Click all product
        clickOnElement(_clearList);
    }

}
