package org.example;

import org.openqa.selenium.By;

public class AppleMacBookPro13Inch extends Utils {
    //Click on email a friend button
    By _emailAFriend = By.className("email-a-friend");
    public void emailAFriend() {
        clickOnElement(_emailAFriend);
    }
}
