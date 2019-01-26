package nopcommerce.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class JewelryPage extends Utils {
    SoftAssert softAssert = new SoftAssert();
    LoadProperties loadProperties =new LoadProperties();
    By SelectUSDollar= By.id("customerCurrency");
    By SelectEuro= By.id("customerCurrency");
    By jewelry = By.linkText("Jewelry");

    // Jewelrypage constroctor
    public JewelryPage(WebDriver driver) { }

    // object for click Jewelary Page

    // object for Select US dollar or Euro
    By selectUSDollar = By.id("customerCurrency");
    By setTermsofservice =By.id("termsofservice");
    // |Click Jewelry Categories
    public void jewelary() {
        clickElement(jewelry);
    }

    // Select Price by US dollar
    public void selectUSDollar() {
        selectByVisibleText(selectUSDollar,loadProperties.getProperty("selectUSDollar"));
        //selectByVisibleText(selectUSDollar, "US Dollar");
    }

    //Select Price by Euro
    public void selectEuro() {
        selectByVisibleText(SelectEuro,loadProperties.getProperty("selectEuro"));

        //selectByVisibleText(selectEuro, "Euro");
    }

    public void verifyPriceInUSDollar() {
        ArrayList<WebElement> elementDollar = new ArrayList<>(driver.findElements(By.xpath("//div[@class=\"item-grid\"]/div/div/div[2]/div[3]/div/span")));
        for (WebElement object : elementDollar) {
            softAssert.assertEquals(object.getText().charAt(0), "$");
            System.out.println(object.getText().charAt(0));
        }
    }

    public void verifyPriceInEuro() {
        List<WebElement> elementeEuro = new ArrayList<>(driver.findElements(By.xpath("//div[@class=\"item-grid\"]/div/div/div[2]/div[3]/div/span")));
        for (WebElement object1 : elementeEuro) {
            softAssert.assertEquals(object1.getText().charAt(0), "Ђ");
            System.out.println(object1.getText().charAt(0));
        }
    }


    //...waitUntilElementToBeClickable(By.id("product_attribute_3_6") {
    public void waitBeforeProductSelect() {
        waitUntilElementToBeClickable(By.id("product_attribute_3_6"), 20);
    }

//    // Click on 320GB
//    clickElement(By.id("product_attribute_3_6"));


    // object  click add to cart button
    By addToCartbutton = By.id("add-to-cart-button-1");

    public void setAddToCartbutton() {
        clickElement(addToCartbutton);
    }

    // wait until shopping cart button availavle
    //.. waitUntilElementToBeClickable (By.linkText("Shopping cart", 20);

    // wait until Shopping cart clickable
    //   wait.until(
    //        ExpectedConditions.elementToBeClickable(By.linkText("Shopping cart")));

    public void waitUntilShoppingCart(){
        waitUntilDisplay(By.linkText("Shopping cart"),20);
    }

    // object click on shopping cart
    By shoppingCart = By.linkText("Shopping cart");

    // click shopping cart button
    public void setShoppingCart() {
        waitUntilElementToBeClickable(shoppingCart,25);
        clickElement(shoppingCart);
    }
    //clickElement(By.linkText("Shopping cart"));

    // click on check out
    // clickElement(By.id("checkout"));
    By checkout = By.id("checkout");

    public void setCheckout() {
        clickElement(checkout);
    }

    // object esc term condition pop msg
    By clearPopMsg = By.xpath("//button[@type=\"button\"]");

    public void setClearPopMsg() {
        clickElement(clearPopMsg);
    }

    public void url() {
        driver.get("https://demo.nopcommerce.com/");
    }
//        clickElement(By.xpath("//button[@type=\"button\"]"));
//        // refresh web page
//        clickElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));

    // object Select term and condition option
    By termsofservice = By.id("termsofservice");

    public void setTermsofservice() {

        waitUntilElementToBeClickable(termsofservice,30);clickElement(termsofservice);
    }


}
