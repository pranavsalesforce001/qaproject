package nopcommerce.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.swing.*;

public class EmailToFriend extends Utils {
    LoadProperties loadProperties = new LoadProperties();

    By friendemail = By.id("FriendEmail");
    By Youremail = By.id("YourEmailAddress");


    // Object for click Add to cart

    By addToCartButton = By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div/div/div[2]/div[3]/div[2]/input[@onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/1/1/1');return false;\"]");

    //Click add to cart
    public void addToCartButton() {
        clickElement(addToCartButton);
        System.out.println("Test");
    }

    // object click send email to friend
    By emailAFriend = By.xpath("//input[@value=\"Email a friend\"]");

    // Click send email to friend
    public void setEmailAFriend() { clickElement(emailAFriend);
    }

    //object for Enter  Friends email

    // enter friend email address

        public void setfriendemail() {

            waitUntilElementToBeClickable(friendemail,30);

            enterText(friendemail, loadProperties.getProperty("friendemail") + dateStemp() + "@gmail.com");
        // enterText(friendEmail, "Ganesh" + dateStemp() + "@gmail.com");
    }

    //enter your email address
    public void setYouremail() {
        waitUntilElementToBeClickable(Youremail,30);
        enterText(Youremail, loadProperties.getProperty("Youremail") + dateStemp() + "@gmail.com");
        // enterText (Youremail,"Swami"+dateStemp() + "@gmail.com");
    }

    // object Enter personal msg
    By personalMassage = By.id("PersonalMessage");

    // enter personal msg
    public void setPersonalMassage() {
        waitUntilElementToBeClickable(personalMassage,30);

        enterText(personalMassage, loadProperties.getProperty("PersonalMessage"));
    }

    // object click submit button
    By button = By.xpath("//div[@class=\"buttons\"]/input[@type=\"submit\"]");

    // click submit button
    public void setButton() {
        clickElement(button);
    }

    // object click logout
    By logout = By.className("ico-logout");

    // click log out
    public void setLogout() {
        clickElement(logout);
    }

}
