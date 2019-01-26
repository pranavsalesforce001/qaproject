package nopcommerce.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// This Class will store all the locator and methods of registration page
public class RegistertionPage extends Utils{

    LoadProperties loadProperties = new LoadProperties();
    WebDriver driver;

    By register = By.xpath("//a[@href=\"/register\"]");
    By gender = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By dateOfBirthDay = By.name("DateOfBirthDay");
    By dateOfBirthMonth = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    By dateOfBirthYear = By.xpath("//select[@name=\"DateOfBirthYear\"]");
    By email = By.id("Email");
    By companyName = By.id("Company");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");

    public RegistertionPage(WebDriver driver) {
    }

    public void register() {
        clickElement(register);
    }
    public void gender() {
        clickElement(gender);
    }
    public void firstName() {

    enterText(firstName,loadProperties.getProperty("FirstName"));
        //enterText(firstName, "Dhyanam");
    }
    public void lastName() {
        enterText(lastName,loadProperties.getProperty("LastName"));
        //enterText(lastName, "Mehta");
    }
    public void dateOfBirthDay() {
        selectByValue(dateOfBirthDay,loadProperties.getProperty("dateOfBirthDay"));
       // selectByValue(dateOfBirthDay, "21");
    }
    public void dateOfBirthMonth() {
        selectByVisibleText(dateOfBirthMonth,loadProperties.getProperty("dateOfBirthMonth"));

       // selectByVisibleText(dateOfBirthMonth,loadProperties.getProperty("dateOfBirthMonth"));
        //selectByVisibleText(dateOfBirthMonth, "August");
    }
    public void dateOfBirthYear() {
        selectByValue(dateOfBirthYear,loadProperties.getProperty("dateOfBirthYear"));
        //selectByValue(dateOfBirthYear,"2001");
    }
    public void email() {
        enterText(email,loadProperties.getProperty("email")+dateStemp() +"@gmail.com");
        //enterText(email, "Swami" + dateStemp() + "@gmail.com");
    }
    public void companyName() {
        enterText(companyName,loadProperties.getProperty("companyName"));
        //enterText(companyName, "GS IT Consultant Ltd");
    }
    public void password() {
        enterText(password,loadProperties.getProperty("(password"));
        //enterText(password, "Sriharidham");
    }
    public void confirmPassword() {
        enterText(confirmPassword,loadProperties.getProperty("confirmPassword"));
        //enterText(confirmPassword, "Sriharidham");
    }
    public void registerButton() {
        clickElement(registerButton);
    }

    By contineNext = By.xpath("//input[@name=\"register-continue\"]");
    public void continueNext () {clickElement(contineNext);}

    public void waitUntilLogout(){
        waitUntilElementToBeClickable(By.className("ico-logout"),25);
    }
    public void setLogOut () {clickElement(By.className("ico-logout"));}
}
