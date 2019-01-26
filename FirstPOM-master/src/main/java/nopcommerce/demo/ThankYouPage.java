package nopcommerce.demo;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ThankYouPage extends Utils{

    public void verifyRegistrationSucessfulMassege(){
        String expectedMsg = "Your registration completed";
        waitUntilDisplay(By.xpath("//div[contains(text(),'Your registration completed')]"),10);
        Assert.assertEquals(expectedMsg, getTextFromElement(By.xpath("//div[contains(text(),'Your registration completed')]")));

    }
}

