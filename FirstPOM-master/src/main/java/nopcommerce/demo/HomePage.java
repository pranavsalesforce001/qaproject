package nopcommerce.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Utils {

    SoftAssert softAssert = new SoftAssert();
    LoadProperties loadProperties = new LoadProperties();

    public HomePage(WebDriver driver) {

    }

    public void toVerifyAddToCartButton() {

        List<WebElement> addToCartList = new ArrayList<>(driver.findElements(By.xpath("//div[@class=\"page-body\"]/div[4]/div[2]/div/div/div[2]/div[3]/div[2]/input[@value=\"Add to cart\"]")));
        for (WebElement object : addToCartList) {
            softAssert.assertEquals(object.getAttribute("value"), "Add to cart", "Add To Cart Not Presence");
            System.out.println(object.getAttribute("value"));
        }
    }
            // object Click Add to cart (Virtual gift card)

            By addToCart = By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div/div/div[2]/div[3]/div[2]/input[@onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/1/1/1');return false;\"]");
            public void setaddToCart () {
                //public void setaddToCart () {
                clickElement(addToCart);
            }
            // object Click on 320GB
            By item = By.id("product_attribute_3_6");
            //
            public void setItem () {
                clickElement(item);
            }

            // object click add to cart
            By addToCart1 = By.id("add-to-cart-button-1");
            public void setAddToCart1 () {
                waitUntilElementToBeClickable(addToCart,30);
                clickElement(addToCart1);
            }


            // Object for Click email to friend button
            By sendtEmailToFriend = By.xpath("//input[@value=\"Email a friend\"]");
            public void setsendEmailToFriend (){
                waitUntilElementToBeClickable(sendtEmailToFriend,30);
                clickElement(sendtEmailToFriend);
            }
            //object friends enter email add
            By friendEmail = By.id("FriendEmail");
            //
            public void setfriendemail () {
                waitUntilElementToBeClickable(friendEmail,15);
                enterText(friendEmail, loadProperties.getProperty("friendEmail") + dateStemp() + "@gmail.com");
                //enterText(friendEmail,"friendEmail" + dateStemp() + "@gmail.com");
            }

            //    // object Enter your email address
            By yourEmailAddress = By.id("YourEmailAddress");
            // enter personal email address
            public void setYourEmailAddress () {
                waitUntilElementToBeClickable(yourEmailAddress,15);
                enterText(yourEmailAddress, loadProperties.getProperty("swami") + dateStemp() + "gmail.com");
                //enterText(yourEmailAddress,"Swami" + dateStemp() + "@gmail.com");
            }
            // object Enter personal msg
            By personalmsg = By.id("PersonalMessage");
            public void setPersonalmsg () {
                enterText(personalmsg, loadProperties.getProperty("personalmsg"));
                //enterText(personalmsg, " Please read message once");
            }
            // object  clik submit button
            By submitt = By.xpath("//div[@class=\"buttons\"]/input[@type=\"submit\"]");
            public void setSubmitt () {waitUntilElementToBeClickable(submitt,15);
                clickElement(submitt);
            }

            // Back to home page
            public void backtoHomePage () {
                clickElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));

            }


    }