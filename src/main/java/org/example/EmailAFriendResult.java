package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendResult extends Utils{
    // Get result message
    By _nonUserGetMessage = By.xpath("//div[@class=\"message-error validation-summary-errors\"]/ul[1]");
    By _userGetMessage = By.xpath("//div[@class=\"result\"]");
    public void nonUserSendAEmailToFriendResult(){
        String expectedEmailToFriendMessage = "Only registered customers can use email a friend feature";
        // End of the process Actual message will come
        String actualMessage = getTextFromElement(_nonUserGetMessage);
        System.out.println("Result Message:"+actualMessage);
        // Expected message
        Assert.assertEquals(actualMessage,expectedEmailToFriendMessage, "Can't sending email");
    }
    public void userSendAEmailToFriendResult () {
        String expectedUserShouldNeReferAProductToMessage = "Your message has been sent.";
        // End of the process Actual message will come
        String actualMessage = getTextFromElement(_userGetMessage);
        System.out.println("Result Message:" + actualMessage);
        // Expected message
        Assert.assertEquals(actualMessage, expectedUserShouldNeReferAProductToMessage, "Successfully message send");
    }
}
