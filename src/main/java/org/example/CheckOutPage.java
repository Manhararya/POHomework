package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckOutPage extends Utils {
    // Write all xpath
    By _checkoutAsGuestButton = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    By _firstName = By.xpath("//div[@class='edit-address']/div[1]/input");
    By _lastName = By.xpath("//div[@class='edit-address']/div[2]/input");
    By _email = By.xpath("//div[@class='edit-address']/div[3]/input");
    By _company = By.xpath("//div[@class='edit-address']/div[4]/input");
    By _country = By.xpath("//div[@class='edit-address']/div[5]/select");
    By _stateProvince = By.xpath("//div[@class='edit-address']/div[6]/select");
    By _city = By.xpath("//div[@class='edit-address']/div[7]/input");
    By _address1 = By.xpath("//div[@class='edit-address']/div[8]/input");
    By _address2 = By.xpath("//div[@class='edit-address']/div[9]/input");
    By _zipPostalCode = By.xpath("//div[@class='edit-address']/div[10]/input");
    By _phoneNumber = By.xpath("//div[@class='edit-address']/div[11]/input");
    By _faxNumber = By.xpath("//div[@class='edit-address']/div[12]/input");
    By _addressContinueButton = By.xpath("//div[@id='billing-buttons-container']/button[4]");
    By _nextDayAir = By.xpath("//input[@id='shippingoption_1']");
    By _shippingContinueButton = By.xpath("//button[@onclick='ShippingMethod.save()']");
    By _creditCard = By.xpath("//input[@id='paymentmethod_1']");
    By _creditCardContinueButton = By.xpath("//button[@onclick='PaymentMethod.save()']");
    By _cardDetails = By.cssSelector("select.dropdownlists");
    By _cardHolderName = By.xpath("//input[@id='CardholderName']");
    By _cardNumber = By.xpath("//input[@id='CardNumber']");
    By _expirationMonth = By.xpath("//select[@id='ExpireMonth']");
    By _expirationYear = By.xpath("//select[@id='ExpireYear']");
    By _cardCore = By.xpath("//input[@id='CardCode']");
    By _paymentContinue = By.xpath("//button[@onclick='PaymentInfo.save()']");
    By _paymentConfirm = By.xpath("//button[@onclick='ConfirmOrder.save()']");
    public void guestButton() {
        //connect with Xpath
        clickOnElement(_checkoutAsGuestButton);
    }
    public void billingAddress(){
        //connect with Xpath
        typeText(_firstName,"Vicky");
        typeText(_lastName,"Patel");
        typeText(_email,"Vickypatel@gmail.com");
        typeText(_company,"Royal Mail");
        selectDropdownByValue(_country,"233");
        selectDropdownByValue(_stateProvince,"0");
        typeText(_city,"Leicester");
        typeText(_address1,"House No - 101");
        typeText(_address2,"Royal Palace");
        typeText(_zipPostalCode,"007");
        typeText(_phoneNumber,"111111111");
        typeText(_faxNumber,"00000000");
        clickOnElement(_addressContinueButton);
    }
    public void shippingMethod(){
        //connect with Xpath
        clickOnElement(_nextDayAir);
        clickOnElement(_shippingContinueButton);
    }
    public void paymentMethod (){
        //connect with Xpath
        clickOnElement(_creditCard);
        clickOnElement(_creditCardContinueButton);
    }
    public void paymentInformation (){
        //connect with Xpath
        selectDropdownByValue(_cardDetails,"visa");
        typeText(_cardHolderName,"Vicky Patel");
        typeText(_cardNumber,"4024007140202440");
        selectDropdownByIndex(_expirationMonth,9);
        selectDropdownByText(_expirationYear,"2025");
        typeText(_cardCore,"828");
        clickOnElement(_paymentContinue);
        clickOnElement(_paymentConfirm);

    }
}
