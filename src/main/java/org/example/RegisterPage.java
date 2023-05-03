package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils{
    // Fill all mandatory details
    By _firstName = By.id("FirstName");
    By _lastName = By.id("LastName");
    By _email = By.name("Email");
    By _password = By.id("Password");
    By _confirmPassword = By.id("ConfirmPassword");
    By _registerButton = By.id("register-button");

    public void enterRegistrationDetailsWithTimestamp(){
        // Fill all mandatory details
        typeText(_firstName, "Manhar");
        typeText(_lastName, "Arya");
        typeText(_email, "manhararya25+"+timestamp()+"@gmail.com");
        typeText(_password, "1111aaaa");
        typeText(_confirmPassword, "1111aaaa");
        // Click register submit button
        clickOnElement(_registerButton);
    }
    public void enterRegistrationDetails(){
        // Fill all mandatory details
        typeText(_firstName, "Manhar");
        typeText(_lastName, "Arya");
        typeText(_email, "manhararya25@gmail.com");
        typeText(_password, "1111aaaa");
        typeText(_confirmPassword, "1111aaaa");
        // Click register submit button
        clickOnElement(_registerButton);
    }
}
