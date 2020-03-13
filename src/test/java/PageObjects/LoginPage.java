package PageObjects;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginPage {

    Logger logger = LogManager.getRootLogger();



    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/input[1]")
    private WebElement login;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/input[2]")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/button[2]")
    private WebElement submit;
    @FindBy(xpath = "//*[@id=\"header\"]/app-lbprov-header/div/div[5]/button")
    private WebElement assertion;


    @FindBy(xpath = "//*[@id=\"ngb-tab-0\"]")
   private WebElement konfiguracjaSp;

    @FindBy(xpath = "//*[@id=\"menu\"]/table/tbody/tr[3]/th/button")
    private WebElement routing;
    @FindBy(xpath = "//*[@id=\"ngb-tab-2\"]/a")
    private WebElement konfiguracjaDp;

    @FindBy(xpath = "//*[@id=\"menu\"]/table/tbody/tr[2]/th/button")
    private WebElement normalizacja;

    @FindBy(xpath = "//*[@id=\"menu\"]/table/tbody/tr[4]/th/button")
    private WebElement denormalizacja;

@FindBy(xpath = "//*[@id=\"menu\"]/table/tbody/tr[1]/th/button")
private WebElement precondition;

    @FindBy(xpath = "//*[@id=\"menu\"]/table/tbody/tr[5]/th/button")
    private WebElement logowanie;


    private WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    @Step("sendLogin")
    public void sendLogin() {
        login.sendKeys("admin");
        logger.info("Wpisano login");
    }

    @Step("sendPassword")
    public void sendPassword() {
        password.sendKeys("admin");
        logger.info("Wpisano hasło");
    }

    @Step("sendLogin")
    public void goSubmit() {
        submit.click();
        logger.info("Zalogowano");
    }

    @Step("sendLogin")
    public void assertion() {



    assertTrue(assertion.isDisplayed());

        logger.info("Zalogowano");
    }

    @Step("konf")
    public void konfiguracjaSp() {
        konfiguracjaSp.click();
        logger.info("Konfiguracja Sp");
    }
    @Step("rout")
    public void Routing() {
        routing.click();
        logger.info("Routing");
    }
    @Step("konf")
    public void konfiguracjaDP() {
        konfiguracjaDp.click();
        logger.info("Konfiguracja Sp");
    }
    @Step("konf")
    public void Normalizacja() {
        normalizacja.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("konf")
    public void Denormalizacja() {
        denormalizacja.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("konf")
    public void Preconditions() {
        precondition.click();
        logger.info("Konfiguracja Sp");
    }
    @Step("konf")
    public void Logowanie() {
        logowanie.click();
        logger.info("Konfiguracja Sp");
    }
}
