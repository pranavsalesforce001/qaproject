package nopcommerce.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage extends Utils {

LoadProperties loadProperties = new LoadProperties();
By selectCountry = By.id("BillingNewAddress_CountryId");
By BillingNewAddress_City = (By.id("BillingNewAddress_City"));
By firstLineAddress =(By.id("BillingNewAddress_Address1"));
By BillingNewAddress_ZipPostalCode = (By.id("BillingNewAddress_ZipPostalCode"));
By BillingNewAddress_PhoneNumber = (By.id("BillingNewAddress_PhoneNumber"));
By CardholderName =(By.id("CardholderName"));
By CardNumber = (By.id("CardNumber"));
By ExpireYear =(By.id("ExpireYear"));
By CardCode =(By.id("CardCode"));
By setContinueToConfirmOder = (By.xpath("//input[@class=\"button-1 payment-info-next-step-button\"]"));
By setConform = (By.xpath("//input[@class=\"button-1 confirm-order-next-step-button\"]"));

    //    // click continue on payment
   // By SelectCountry = By.id("BillingNewAddress_CountryId");

    public void setSelectCountry() {

        selectByVisibleText(selectCountry,loadProperties.getProperty("selectCountry"));
        //selectByVisibleText(selectCountry, "United Kingdom");
    }

    // enter City name
    public void selectCity() {
       enterText(BillingNewAddress_City,loadProperties.getProperty("BillingNewAddress_City"));
       // enterText(By.id("BillingNewAddress_City"), "London");
    }

    // Enter address
    public void firstLineAddress() {
        enterText(firstLineAddress,loadProperties.getProperty("BillingNewAddress_Address1"));
        //enterText(By.id("BillingNewAddress_Address1"), "100 MollisonWay");
    }
    // Enter second line address
    //enterText(By.id("BillingNewAddress_Address2"), "Harrow");

    // Enter Postcode
    public void postCode() {
        enterText(BillingNewAddress_ZipPostalCode,loadProperties.getProperty("BillingNewAddress_ZipPostalCode"));
        //enterText(By.id("BillingNewAddress_ZipPostalCode"), "HA85QW");
    }

    //Enter Phone Number
    public void phoneNumber() {
        enterText(BillingNewAddress_PhoneNumber,loadProperties.getProperty("BillingNewAddress_PhoneNumber"));
        //enterText(By.id("BillingNewAddress_PhoneNumber"), "020 8111 2222");
    }

    //    // Click Continue Button
    public void continueToShippingAddress() {
        clickElement(By.id("billing-buttons-container"));
    }
    //    // Click next
    public void continueToPaymentMethod() {
        clickElement(By.xpath("//input[@class=\"button-1 shipping-method-next-step-button\"]"));
    }

    public void continueToPaymentInformation() {
        clickElement(By.xpath("//div[@id=\"shipping-method-buttons-container\"]/input"));
    }

    // select payment method
    public void paymentmethod() {
        clickElement(By.id("paymentmethod_1"));
    }


    // click continue
    public void selectPaymentMethod() {

        clickElement(By.xpath("//input[@class=\"button-1 payment-method-next-step-button\"]"));
    }

    // Enter Card holder name
    By cardholderName =By.id("CardholderName");
    public void cardHolderNmae() { waitUntilElementToBeClickable(cardholderName,25);

     enterText(CardholderName,loadProperties.getProperty("CardholderName"));
        //enterText(By.id("CardholderName"), "Mr. G Swami");
    }

    //    // Enter SandBox card detail
    By cardNumber = By.id("CardNumber");
    public void setCardNumber() {waitUntilElementToBeClickable(cardNumber,60);
        enterText(CardNumber,loadProperties.getProperty("CardNumber"));
        //enterText(By.id("CardNumber"), "4111 1111 1111 1111");
    }

    //    // Select expiry month
    public void setExpireMonth() {
        Select expireMonth = new Select(driver.findElement(By.id("ExpireMonth")));
        expireMonth.selectByIndex(2);
    }

    //    // Select expire year
    public void setExpireYear() {
        selectByValue(ExpireYear,loadProperties.getProperty("ExpireYear"));
        //selectByValue(By.id("ExpireYear"), "2023");
    }

    // Enter Cardcode
    public void setCardCode() {

        enterText(CardCode,loadProperties.getProperty("CardCode"));
        //enterText(By.id("CardCode"), "729");
    }

    // Click next
    public void setContinueToConfirmOder() {
        waitUntilElementToBeClickable(setContinueToConfirmOder,30);
        clickElement(By.xpath("//input[@class=\"button-1 payment-info-next-step-button\"]"));
    }

    //    // Click next
    public void setConform() {
        waitUntilElementToBeClickable(setConform,60);
        clickElement(By.xpath("//input[@class=\"button-1 confirm-order-next-step-button\"]"));
    }


}
