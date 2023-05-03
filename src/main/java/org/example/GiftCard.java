package org.example;

import org.openqa.selenium.By;

public class GiftCard extends Utils{
    // Click on $25 Virtual Gift Card
    By _$25VirtualGiftCard = By.linkText("$25 Virtual Gift Card");
    public void clickOn$25VirtualGiftCard(){
        clickOnElement(_$25VirtualGiftCard);
    }

}
