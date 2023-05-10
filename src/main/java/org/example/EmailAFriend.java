package org.example;

import org.openqa.selenium.By;

public class EmailAFriend extends Utils {
    // Enter friend's email
    By _friendEmail = By.className("friend-email");
    // Enter your email
    By _yourEmail = By.className("your-email");
    // Type message
    By _writeMessage = By.id("PersonalMessage");
    // Click on send email button
    By _sendEmail = By.name("send-email");
    public void nonUserEnterEmailDetails() {
        //connect with Xpath
        typeText(_friendEmail, "Arya25@gmail.com");
        // Put your email address
        typeText(_yourEmail, "manhararya25@gmail.com");
        // Type message
        typeText(_writeMessage, "This MacBook is a best");
        // Click on Send email button
        clickOnElement(_sendEmail);
    }
    public void userEnterEmailDetails() {
        //connect with Xpath
        typeText(_friendEmail, "Arya25@gmail.com");
        // Type message
        typeText(_writeMessage, "This MacBook is a best");
        // Click on Send email button
        clickOnElement(_sendEmail);
    }
}
