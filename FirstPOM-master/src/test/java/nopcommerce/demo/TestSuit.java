package nopcommerce.demo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSuit extends BaseTest {

    JewelryPage jewelryPage = new JewelryPage(driver);
    ThankYouPage thankYouPage = new ThankYouPage();
    RegistertionPage registertionPage = new RegistertionPage(driver);
    HomePage homePage = new HomePage(driver);
    EmailToFriend emailToFriend = new EmailToFriend();
    SoftAssertion softAssertion = new SoftAssertion();
    SoftAssert softAssert = new SoftAssert();
    PaymentPage paymentPage = new PaymentPage();

    @Test
    public void userShouldBeAbleToRegisterSuccessfully() {
        registertionPage.register();
        registertionPage.gender();
        registertionPage.firstName();
        registertionPage.lastName();
        registertionPage.dateOfBirthDay();
        registertionPage.dateOfBirthMonth();
        registertionPage.dateOfBirthYear();
        registertionPage.email();
        registertionPage.companyName();
        registertionPage.password();
        registertionPage.confirmPassword();
        registertionPage.registerButton();
        // Registration successful msg soft assertion
        thankYouPage.verifyRegistrationSucessfulMassege();
        registertionPage.continueNext();
    }

    @Test
    public void registeredUserShouldBeAbleToSendEmailWithProductSuccessfully() {
        userShouldBeAbleToRegisterSuccessfully();
        emailToFriend.addToCartButton();
        emailToFriend.setEmailAFriend();
        emailToFriend.setfriendemail();
        emailToFriend.setPersonalMassage();
        emailToFriend.setButton();
        softAssertion.verifyYourMessageHasBeenSent();
        softAssert.assertAll();
        registertionPage.waitUntilLogout();
        registertionPage.setLogOut();

    }

    @Test
    public void unRegisteredUseShouldNotBeAbleToSendEmail() {
        homePage.setaddToCart();
        System.out.println("Test 1 ");
        homePage.setItem();
        homePage.setsendEmailToFriend();
        System.out.println("Test 2");
        homePage.setfriendemail();
        homePage.setYourEmailAddress();
        System.out.println("test000");
        homePage.setPersonalmsg();
        System.out.println("Test 3");

        homePage.setSubmitt();
        System.out.println("Test 4");
        softAssertion.toVerifyOnlyRegisteredCustomersCanUseEmailAFriendFeature();
        softAssert.assertAll();
        homePage.backtoHomePage();

    }

    @Test
    public void userNeedToAcceptTermsTCAsPerBelowScreen() {
        homePage.setaddToCart();
        System.out.println("Test : 1");
        homePage.setItem();
        System.out.println("Test : 2");
        jewelryPage.waitBeforeProductSelect();
        System.out.println("Test : 3");

        jewelryPage.setAddToCartbutton();
        System.out.println("test : 4");
        jewelryPage.waitUntilShoppingCart();
        jewelryPage.setShoppingCart();
        System.out.println("Test : 5");

        jewelryPage.setCheckout();
        System.out.println("Test : 6");

        SoftAssertion.toVerifySelectTermsOfService();
        softAssert.assertAll();
        jewelryPage.setClearPopMsg();
        homePage.backtoHomePage();
    }

    @Test
    public void registeredUserShouldBeAbleToBuyAnySingleProductSuccessfully() {
        userShouldBeAbleToRegisterSuccessfully();
        homePage.setaddToCart();
        System.out.println("Test : 1");
        homePage.setItem();
        System.out.println("Test : 2");
        jewelryPage.waitBeforeProductSelect();
        System.out.println("Test : 3");
        jewelryPage.setAddToCartbutton();
        System.out.println("test : 4");
        jewelryPage.waitUntilShoppingCart();
        jewelryPage.setShoppingCart();
        System.out.println("Test : 5");
        jewelryPage.setTermsofservice();
        jewelryPage.setCheckout();
        //address
        paymentPage.setSelectCountry();
        paymentPage.selectCity();
        paymentPage.firstLineAddress();
        paymentPage.postCode();
        paymentPage.phoneNumber();
        paymentPage.continueToShippingAddress();
        paymentPage.continueToPaymentMethod();
        paymentPage.continueToPaymentInformation();
        paymentPage.paymentmethod();
        paymentPage.selectPaymentMethod();
        paymentPage.cardHolderNmae();
        paymentPage.setCardNumber();
        paymentPage.setExpireMonth();
        paymentPage.setExpireYear();
        paymentPage.setCardCode();
        paymentPage.setContinueToConfirmOder();
        paymentPage.setConform();
        SoftAssertion.toverifyYourOrderHasBeenSuccessfullyProcessed();
        softAssert.assertAll();
        registertionPage.waitUntilLogout();
        registertionPage.setLogOut();

    }


    @Test
    public void userShouldBeSelectPriceByUSDollarAndEuro() {
        jewelryPage.jewelary();
        jewelryPage.selectUSDollar();
        //
        jewelryPage.verifyPriceInUSDollar();
        softAssert.assertAll();

        jewelryPage.selectEuro();
        jewelryPage.verifyPriceInEuro();
        softAssert.assertAll();
        homePage.backtoHomePage();

    }


    @Test
    public void verifyHomePageAddToCartButton() {
        homePage.toVerifyAddToCartButton();
        softAssert.assertAll();
    }
}
