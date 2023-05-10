package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HomePage extends Utils{
    // Write Xpath as per requirement
    By _registerButton = By.className("ico-register");
    By _pollAnswer = By.id("pollanswers-2");
    By _votePoll1 = By.id("vote-poll-1");
    By _loginButton = By.className("ico-login");
    By _appleMacBookPro13Inch = By.linkText("Apple MacBook Pro 13-inch");
    By _hTCOneM8AndroidL50Lollipop = By.linkText("HTC One M8 Android L 5.0 Lollipop");
    By _electronics = By.linkText("Electronics");
    By _productGrid = By.cssSelector("div.product-grid h2");
    By _searchButton = By.cssSelector("button.search-box-button");
    By _voteButton = By.cssSelector("button.vote-poll-button");
    By _currency = By.id("customerCurrency");
    By _usDollar = By.id("US Dollar");
    By _euro = By.id("Euro");
    By _productPriceList = By.cssSelector("div.prices span");
    By _searchBox = By.id("small-searchterms");
    By _newRelease = By.linkText("nopCommerce new release!");
    By _ownComputer = By.linkText("Build your own computer");
    By _facebookButton = By.linkText("Facebook");
    By _welcomeMessage = By.cssSelector("div.topic-block-title h2");

    public void clickOnRegisterButton(){
        //connect with Xpath
        clickOnElement(_registerButton);
    }
    public void clickOnLoginButton(){
        //connect with Xpath
        clickOnElement(_loginButton);
    }
    public void doVote() {
        //connect with Xpath
        clickOnElement(_pollAnswer);
        // Do Vote
        clickOnElement(_votePoll1);
    }
    public void clickOnAppleMacBookPro13InchName(){
        //connect with Xpath
        clickOnElement( _appleMacBookPro13Inch);
    }
    public void clickOnHTCOneM8Android(){
        //connect with Xpath
        clickOnElement(_hTCOneM8AndroidL50Lollipop);
    }
    public void electronics(){
        //connect with Xpath
        clickOnElement(_electronics);
    }
    public void printoutProductTitle(){
        //connect with Xpath
        System.out.println("Products Title:");
        List< WebElement> productList =driver.findElements(_productGrid);
        for (WebElement e:productList){
            System.out.println(e.getText());
        }
    }
    public void searchAlertMessage(){
        //connect with Xpath
        clickOnElement(_searchButton);
        System.out.println("Search Alert Message");
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"Please enter some search keyword");
        alert.accept();
    }
    public void voteAlertMessage(){
        //connect with Xpath
        clickOnElement(_voteButton);
        System.out.println("Vote Alert Message");
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"Please select an answer");
        alert.accept();
    }
    public void printoutProductPriceWithCurrencySign(){
        //connect with Xpath
        selectDropdownByText(_currency,"US Dollar");
        System.out.println("Price list as per US Dollar:");
        List< WebElement> productList1 =driver.findElements(_productPriceList);
        for (WebElement e:productList1){
            System.out.println(e.getText());
        }
        System.out.println("....................................");
        {
            selectDropdownByText(_currency, "Euro");
            System.out.println("Price list as per Euro:");
            List<WebElement> productList2 = driver.findElements(_productPriceList);
            for (WebElement e : productList2) {
                System.out.println(e.getText());
            }
        }
    }
    public void printoutSearchProductList(){
        //connect with Xpath
        typeText(_searchBox, "Nike");
        clickOnElement(_searchButton);
        System.out.println("Nike product list:");
        List< WebElement> productList1 =driver.findElements(_productGrid);
        for (WebElement e:productList1) {
            System.out.println(e.getText());
        }
        System.out.println("....................................");
        {
            typeText(_searchBox, "Desktop");
            clickOnElement(_searchButton);
            System.out.println("Desktop product list:");
            List<WebElement> productList2 = driver.findElements(_productGrid);
            for (WebElement e : productList2) {
                System.out.println(e.getText());
            }
        }
    }
    public void nopCommerceNewRelease(){
        //connect with Xpath
        clickOnElement(_newRelease);
    }
    public void buildYourOwnComputer(){
        //connect with Xpath
        clickOnElement(_ownComputer);
    }
    public void facebookPage(){
        //connect with Xpath
        String MainWindow = driver.getWindowHandle();
        clickOnElement(_facebookButton);
        // To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();
            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
            }
        }
    }
    public void welcomeToOurStore () {
        //connect with Xpath
        String expectedWelcomeMessage = "Welcome to our store";
        String actualMessage = getTextFromElement(_welcomeMessage);
        System.out.println("get message on Homepage:" + actualMessage);
        //Close URL
        Assert.assertEquals(actualMessage, expectedWelcomeMessage, "Welcome Homepage");
    }
}

