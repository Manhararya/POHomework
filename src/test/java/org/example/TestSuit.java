package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    // Create on connector
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LoginPage loginPage = new LoginPage();
    VoteResult voteResult = new VoteResult();
    AppleMacBookPro13Inch appleMacBookPro13Inch = new AppleMacBookPro13Inch();
    EmailAFriendResult emailAFriendResult = new EmailAFriendResult();
    EmailAFriend emailAFriend = new EmailAFriend();
    HTCOneM8AndroidL50Lollipop htcOneM8AndroidL50Lollipop = new HTCOneM8AndroidL50Lollipop();
    $25VirtualGiftCard $25VirtualGiftCard = new $25VirtualGiftCard();
    ProductComparison productComparison = new ProductComparison();
    CompareClearListMessage compareClearListMessage = new CompareClearListMessage();
    GiftCard giftCard = new GiftCard();
    Electronics electronics = new Electronics();
    CameraAndPhoto cameraAndPhoto = new CameraAndPhoto();
    LeicaTMirrorlessDigitalCamera leicaTMirrorlessDigitalCamera = new LeicaTMirrorlessDigitalCamera();
    ShoppingCart shoppingCart = new ShoppingCart();
    NopCommerceNewRelease nopCommerceNewRelease = new NopCommerceNewRelease();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    CheckOutPage checkoutPage = new CheckOutPage();
    OrderConfirm orderConfirm = new OrderConfirm();
    SocialMedia socialMedia = new SocialMedia();

    //Create all Test suit
    @Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully() {
//        click on register button
        homePage.clickOnRegisterButton();
//        fill in registration details
        registerPage.enterRegistrationDetailsWithTimestamp();
//        verify user registered successfully
        registerResultPage.getRegistrationResult();
    }

    @Test
    public void verifyNonUserShouldNotBeAbleToVoteToCommunityPoll() {
        homePage.doVote();
        voteResult.nonUserGetVoteResult();
    }

    @Test
    public void verifyUserShouldBeAbleToVoteToCommunityPoll() {
        //click on register button
        homePage.clickOnRegisterButton();
        //fill in registration details
        registerPage.enterRegistrationDetails();
        homePage.clickOnLoginButton();
        loginPage.enterLoginAndPassword();
        homePage.doVote();
        voteResult.userGetVoteResult();
    }
    @Test
    public void verifyNonUserShouldNotBeAbleToSendAEmailToFriend(){
        homePage.clickOnAppleMacBookPro13InchName();
        appleMacBookPro13Inch.emailAFriend();
        emailAFriend.nonUserEnterEmailDetails();
        emailAFriendResult.nonUserSendAEmailToFriendResult();
    }
    @Test
    public void verifyUserShouldBeAbleToReferAProductToFriend(){
        //click on register button
        homePage.clickOnRegisterButton();
        //fill in registration details
        registerPage.enterRegistrationDetails();
        homePage.clickOnLoginButton();
        loginPage.enterLoginAndPassword();
        homePage.clickOnAppleMacBookPro13InchName();
        appleMacBookPro13Inch.emailAFriend();
        emailAFriend.userEnterEmailDetails();
        emailAFriendResult.userSendAEmailToFriendResult();
    }
    @Test
    public void verifyUserShouldBeAbleToCompareProduct(){
        homePage.clickOnHTCOneM8Android();
        htcOneM8AndroidL50Lollipop.compareProduct();
        htcOneM8AndroidL50Lollipop.giftCard();
        giftCard.clickOn$25VirtualGiftCard();
        $25VirtualGiftCard.compareProduct();
        $25VirtualGiftCard.productComparison();
        productComparison.compareProductBetween();
        productComparison.clearList();
        compareClearListMessage.getClearListMessage();
    }
    @Test
    public void verifyUserShouldBeAbleToAddProductToShoppingCart(){
        homePage.electronics();
        electronics.CameraAndPhoto();
        cameraAndPhoto.leicaTMirrorlessDigitalCamera();
        leicaTMirrorlessDigitalCamera.addToCartButton16();
        leicaTMirrorlessDigitalCamera.shoppingCart();
        shoppingCart.productInShoppingCart();
    }
    @Test
    public void verifyPrintoutProductTitle(){
        homePage.printoutProductTitle();
    }
    @Test
    public void verifySearchAlertMessage(){
        homePage.searchAlertMessage();
    }
    @Test
    public void verifyVoteAlertMessage(){
        homePage.voteAlertMessage();
    }
    @Test
    public void verifyProductPriceListWithCurrencySign(){
        homePage.printoutProductPriceWithCurrencySign();
    }
    @Test
    public void verifySearchProductList(){
        homePage.printoutSearchProductList();
    }
    @Test
    public void verifyNewReleaseCommentIsSuccessfullyAdded(){
        homePage.nopCommerceNewRelease();
        nopCommerceNewRelease.newReleaseComment();
    }
    @Test
    public void verifyUserShouldBuildTheirOwnComputer(){
        homePage.buildYourOwnComputer();
        buildYourOwnComputer.assembleComputer();
        shoppingCart.productInShoppingCart();
        shoppingCart.checkout();
        checkoutPage.guestButton();
        checkoutPage.billingAddress();
        checkoutPage.shippingMethod();
        checkoutPage.paymentMethod();
        checkoutPage.paymentInformation();
        orderConfirm.getOrderConfirmation();
    }
    @Test
    public void verifyFacebookPageOpen (){
        homePage.facebookPage();
        socialMedia.facebook();
        homePage.welcomeToOurStore();
    }
}
