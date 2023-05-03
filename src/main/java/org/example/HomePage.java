package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    // Click on buttons as per requirement
    By _registerButton = By.className("ico-register");
    By _pollAnswer = By.id("pollanswers-2");
    By _votePoll1 = By.id("vote-poll-1");
    By _loginButton = By.className("ico-login");
    By _appleMacBookPro13Inch = By.linkText("Apple MacBook Pro 13-inch");
    By _hTCOneM8Android = By.linkText("HTC One M8 Android L 5.0 Lollipop");
    By _electronics = By.linkText("Electronics");

    public void clickOnRegisterButton(){
        //Click on register button
        clickOnElement(_registerButton);
    }
    public void clickOnLoginButton(){
        clickOnElement(_loginButton);
    }
    public void doVote() {
        clickOnElement(_pollAnswer);
        // Do Vote
        clickOnElement(_votePoll1);
    }
    public void clickOnAppleMacBookPro13InchName(){
        clickOnElement( _appleMacBookPro13Inch);
    }
    public void clickOnHTCOneM8Android(){
        clickOnElement(_hTCOneM8Android);
    }
    public void electronics(){
        clickOnElement(_electronics);
    }
}
