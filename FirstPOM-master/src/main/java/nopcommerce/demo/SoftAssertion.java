package nopcommerce.demo;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class SoftAssertion extends Utils {

    static SoftAssert softAssert = new SoftAssert();
    //  public  SoftAssertion (){}

    // soft asset for registered User Should Be Able To SendEmail With Product Successfully
    public void verifyYourMessageHasBeenSent() {
        String expectedMsg = "Your message has been sent.";
        waitUntilDisplay(By.xpath("// div[contains(text(),\"Your message has been sent.\")]"), 10);
        softAssert.assertEquals(expectedMsg, getTextFromElement(By.xpath("// div[contains(text(),\"Your message has been sent.\")]")));
    }
    public void toVerifyOnlyRegisteredCustomersCanUseEmailAFriendFeature(){

        String expectedMsg =  "Only registered customers can use email a friend feature";
        waitUntilDisplay(By.xpath("//div[@class=\"message-error validation-summary-errors\"]/ul/li"),10);
        softAssert.assertEquals(expectedMsg,getTextFromElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]/ul/li")));

    }

    public static void toVerifySelectTermsOfService(){
        String expectedMsg= "Terms of service";
       // waitUntilDisplay(By.id("\"ui-id-2\""),20);
        softAssert.assertEquals(expectedMsg,getTextFromElement(By.id("ui-id-2")));

 }

    public static void toverifyYourOrderHasBeenSuccessfullyProcessed(){


   String expectedMsg = "Your order has been successfully processed!";
   softAssert.assertEquals(expectedMsg,getTextFromElement(By.xpath("//div[@class=\"page-body checkout-data\"]/div/div/strong")));

//    // Get actual result
//    String actulResult = driver.findElement(By.xpath("//div[@class=\"page-body checkout-data\"]/div/div/strong")).getText();
//    // Asser actual and expected result
//        Assert.assertEquals("Test case scenario is fail", actulResult, actulResult);
//    // log out
//    clickElement(By.className("ico-logout"));
//        System.out.println("Test: logout");
//    // refresh page
//        driver.navigate().refresh();
//
    }
    }





