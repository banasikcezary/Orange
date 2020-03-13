package Tests;

import io.qameta.allure.Step;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import java.net.URL;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class TestBase {


    public WebDriver driver;
    @Step("Loading configuration from configuration.properties")
    @BeforeMethod
    public void beforeTest()throws MalformedURLException{


        ChromeOptions options = new ChromeOptions();

        driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444/wd/hub"), options);
        driver.navigate().to("http://51.178.55.34:4300/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }




    @Step("Disposing browser")
    @AfterMethod
    public void afterTest(){
        driver.close();
        driver.quit();


    }


}
