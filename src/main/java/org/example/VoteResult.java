package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class VoteResult extends Utils{
    // Get result message
    By _nonUserGetMessageWithWait = By.xpath("//div[@class=\"poll-vote-error\"]");
    By _nonUserGetMessage = By.xpath("//div[@class=\"poll-vote-error\"]");
    By _userGetMessage = By.xpath("//span[@class=\"poll-total-votes\"]");
    public void nonUserGetVoteResult(){
        // Add driver
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // Add method
        wait.until(ExpectedConditions.elementToBeClickable(_nonUserGetMessageWithWait));
        // End of the process Actual message will come
        String expectedNonuserVoteResult = "Only registered users can vote.";
        String actualMessage = getTextFromElement(_nonUserGetMessage);
        System.out.println("Result Message:"+actualMessage);
        // Expected message
        Assert.assertEquals(actualMessage,expectedNonuserVoteResult, "Error message is disappearing");
    }
    public void userGetVoteResult(){
        String expectedUserVoteResult = "18 vote(s)...";
        String actualMessage = getTextFromElement(_userGetMessage);
        System.out.println("Result Message:"+actualMessage);
        // Expected message
        Assert.assertEquals(actualMessage,expectedUserVoteResult, "Total Votes are wrong");
    }
}
