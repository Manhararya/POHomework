package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils {
    //Click on email button
    By _email = By.id("Email");
    //Click on password button
    By _password = By.id("Password");
    //Click on login button
    By _login = By.xpath("//button[contains(@class,\"button-1 login-button\")]");
    public void enterLoginAndPassword(){
        // Enter your email address
        typeText(_email, "manhararya25@gmail.com");
        // Enter Password
        typeText(_password, "1111aaaa");
        // Click Log in button
        clickOnElement(_login);
    }
}
