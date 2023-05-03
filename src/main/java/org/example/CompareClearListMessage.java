package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CompareClearListMessage extends Utils {
    // Get result message
    By _getMessage = By.xpath("//div[@class=\"page-body\"]");

    public void getClearListMessage(){
        String expectedCompareClearListMessageMessage = "You have no items to compare.";
        // End of the process Actual message will come
        String actualMessage3 = getTextFromElement(_getMessage);
        System.out.println("Result Message:"+actualMessage3);
        // Expected message
        Assert.assertEquals(actualMessage3,expectedCompareClearListMessageMessage, "Can't clear list");

    }
}
