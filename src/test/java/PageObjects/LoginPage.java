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
import org.openqa.selenium.support.ui.Select;
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

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[3]/select")
    private WebElement tablicaNormalizacj;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[4]/img")
    private WebElement tree;
    @FindBy(id = "save")
    private WebElement save;

    @FindBy(id = "LB")
    private WebElement lB;
    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/p")
    private WebElement stanKonfiguracji;

    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/table/tbody[1]/tr/td[1]/input")
    private WebElement adresMaszynySip;

    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/table/tbody[1]/tr/td[2]/input")
    private WebElement wagaRuchu;
    @FindBy(name = "SipLoadBalancerCall")
    private WebElement poziomLogowaniaModułu;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div[2]/button")
    private WebElement saveLoadBalancer;
    @FindBy(id = "ARCH")
    private WebElement konfiguracjeArchiwalne;
    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/table/tbody[1]/tr/td[4]/button")
    private WebElement loadKonfiguracjeArchiwalne;
    @FindBy(xpath = "//*[@id=\"main\"]/div/app-sp-config/div/div[2]/div/div[1]/p")
    private WebElement checkKonfiguracjaSp;

    @FindBy(id = "STATS")
    private WebElement statystyki;

    @FindBy(id = "REGEX")
    private WebElement testwyrazenregularnych;

    @FindBy(xpath = "//*[@id=\"ngb-tab-6\"]")
    private WebElement tabDopasowanie;

    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div[2]/input")
    private WebElement tekstwejsciowy;

    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div[4]/input")
    private WebElement wyrazenieregularne;

    @FindBy(id = "result")
    private WebElement buttonwynikdopasowania;
    @FindBy(xpath = "//*[@id=\"main\"]/div[4]/div[2]/input")
    private WebElement wynikdopasowania;

    @FindBy(xpath = "//*[@id=\"ngb-tab-7\"]")
    private WebElement reguly;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[4]/input")
    private WebElement tekstwejściowy2;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[6]/input")
    private WebElement poleprotokolu2;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[8]/input")
    private WebElement wyrazenieregularne2;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[10]/input")
    private WebElement zamiennik;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[11]/button")
    private WebElement dodajbutton;


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

    @Step("konf")
    public void dropDownNormalizacja() {

        Select normalizacjaDropDown = new Select(tablicaNormalizacj);
        normalizacjaDropDown.selectByValue("gr_id_norm_cc_2");
        logger.info("Konfiguracja Sp");
    }

    @Step("konf")
    public void showTree() {

        tree.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("konf")
    public void saveSettings() {

        save.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("konf")
    public void tabLB() {

        lB.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("konf")
    public void stanZaladowanejKonfiguracji() {

        stanKonfiguracji.getText();
        logger.info("Konfiguracja Sp");
    }

    @Step("konf")
    public void zmieńAdresMaszynySip() {
        adresMaszynySip.sendKeys("192.168.22.321:1234");
        logger.info("Konfiguracja Sp");
    }

    @Step("konf")
    public void zmieńWageMaszynySip() {
        wagaRuchu.clear();
        wagaRuchu.sendKeys("20");
        logger.info("Konfiguracja Sp");
    }

    @Step("konf")
    public void zmieńPoziomLogowaniaModułu() {
        poziomLogowaniaModułu.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("konf")
    public void zapisanieLoadBalancera() {
        saveLoadBalancer.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("konf")
    public void clickToKonfiguracjeArchiwalne() {
        konfiguracjeArchiwalne.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("konf")
    public void loadToKonfiguracjeArchiwalne() {
        loadKonfiguracjeArchiwalne.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("konf")
    public void checkKonfiguracjeArchiwalne() {
        String info = checkKonfiguracjaSp.getText();
        assertEquals(info, "Załadowano konfigurację SP o id: 1");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void clickOnTabStatystyki() {
        statystyki.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void clickOnTabTestWyrazenRegularnych() {
        testwyrazenregularnych.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void clickOnTabDopasowanie() {
        tabDopasowanie.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void sendTekstWejsciowy() {
        tekstwejsciowy.sendKeys("");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void sendwyrazenieregularne() {
        wyrazenieregularne.sendKeys("");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void clickonbuttwynikdopasowania() {
        buttonwynikdopasowania.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void checkwynikdopasowania() {
        String wynik = wynikdopasowania.getText();
        assertEquals(wynik, "");
        logger.info("Konfiguracja Sp");
    }



    @Step("Test wyrażeń regularnych")
    public void clickOnTabReguly() {
        reguly.click();
        logger.info("Konfiguracja Sp");

    }

    @Step("Test wyrażeń regularnych")
    public void sendtekstwejsciowy2() {
        tekstwejściowy2.sendKeys("");
        logger.info("Konfiguracja Sp");

    }

    @Step("Test wyrażeń regularnych")
    public void sendpoleprotokolu2() {
        poleprotokolu2.sendKeys("");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void wyrazeniaregularne2() {
        wyrazenieregularne2.sendKeys("");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void sendzamiennik() {
        zamiennik.sendKeys("");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void clickOnDodajButton() {
        dodajbutton.click();
        logger.info("Konfiguracja Sp");
    }


}