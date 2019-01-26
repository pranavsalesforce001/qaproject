package nopcommerce.demo;
import junit.framework.TestResult;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.reporters.Files;
import org.testng.annotations.Test;

import java.io.File;

// Before and After Test
public class BaseTest extends Utils {


    private Files FileUtils;

    @BeforeTest
public void openWindow(){
    openBrowser();
}

@AfterTest
public void quitWindow(){
quitBrowser();
}
}
