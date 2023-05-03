package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;


public class RegisterResultPage extends Utils {
    // Get result message
    By _getMessage = By.xpath("//div [@ class= \"result\"]");
    public void getRegistrationResult(){
        String expectedRegistrationCompletedMessage = "Your registration completed";
        String actualMessage = getTextFromElement(_getMessage);
        System.out.println("Result Message:"+actualMessage);
        // Expected message
        Assert.assertEquals(actualMessage,expectedRegistrationCompletedMessage,"registration is not working");
    }
}
