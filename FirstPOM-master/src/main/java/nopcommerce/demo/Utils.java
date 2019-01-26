package nopcommerce.demo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Utils extends BasePage {

    // made static method

    //click method
    public static By clickElement(By by) {
        driver.findElement(by).click();
        return by;
    }

    //Enter text
    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //Get text
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    // find element
    public static void findElement(By by) {
        driver.findElement(by);
    }

    //Time Stamp
    public static String dateStemp() {
        SimpleDateFormat date = new SimpleDateFormat("ddmmyymmsshh");
        Date date1 = new Date();
        String date2 = date.format(date1);
        return date2;
    }

    // explicit wait until element clickable
    WebElement element;

    public static void waitUntilDisplay(By by, int second) {
        WebDriverWait wait = new WebDriverWait(driver, second);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void waitUntilElementToBeClickable(By by, int second) {
        WebDriverWait wait = new WebDriverWait(driver, second);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
    }


    // 30 second implicit wiat
    public static void implicitwait() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    // open browser
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\java\\browserfile\\chromedriver.exe");
        driver = new ChromeDriver();
        implicitwait();
        //windowFullScreen();
        driver.get("https://demo.nopcommerce.com/");
    }

    //Quit Browser
    public static void quitBrowser() {
        driver.quit();
    }

    //Close Browser
    public static void closeBrowser() {
        driver.close();
    }

    public static void getValueByAttribute(By by, String value) {
        driver.findElement(by).getAttribute(value);
    }

    public static void selectByValue(By by, String text) {
        Select value = new Select(driver.findElement(by));
        value.selectByValue(text);
    }

    public static void selectByIndex(By by, int number) {
        Select index = new Select(driver.findElement(by));
        index.selectByIndex(number);
    }

    public static void selectByVisibleText(By by, String text) {
        Select visiblebytext = new Select(driver.findElement(by));
        visiblebytext.selectByVisibleText(text);
    }


    public static void windowFullScreen() {
        driver.manage().window().fullscreen();
    }

    public static void pageRefresh() {
        driver.navigate().refresh();
    }

    public static void MouseOver(WebElement we) {
        Actions actObj = new Actions(driver);
        actObj.moveToElement(we).build().perform();
    }


    public static void clickMultipleElements(WebElement someElement, WebElement someOtherElement) {
        Actions builder = new Actions(driver);
        builder.keyDown(Keys.CONTROL).click(someElement).click(someOtherElement).keyUp(Keys.CONTROL).build().perform();
    }

    public static void dragAndDrop(WebElement fromWebElement, WebElement toWebElement) {
        Actions builder = new Actions(driver);
        builder.dragAndDrop(fromWebElement, toWebElement);
    }

    public static void ClickOnElement(By locator){

    }
    public static void WaitForElementIsClickable(By by, int seconds){
        WebDriverWait wait= new WebDriverWait(driver,seconds);

    }

public static void ewaitUntilDisplay(By by,int seconds){

        WebDriverWait wait= new WebDriverWait(driver,seconds);
}
public static void WaitforElementIsClickable(By by, String seconds){


}
}




