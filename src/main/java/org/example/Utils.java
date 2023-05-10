package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Timestamp;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;


public class Utils extends BasePage{
    //Create all methods
    public static void clickOnElement(By by){
        driver.findElement(by).click();
    }
    public static void typeText(By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    public static String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }
    public static long timestamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }
    public static void selectDropdownByValue(By by,String value){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    public static void selectDropdownByText(By by,String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static void selectDropdownByIndex(By by,int index){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    public static void waitForClickable(By by, int timeInSec){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSec));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public static void selectDropdownByIndex(By by){
        Select select = new Select(driver.findElement(by));
    }
    public static void chooseOption(By by){
        driver.findElement(by).getLocation();}
    public static void clickOnRadioButtonElement(By by) {
        driver.findElement(by).click();
    }
}
