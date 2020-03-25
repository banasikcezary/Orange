package PageObjects;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
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


    @FindBy(id = "SP")
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
    private WebElement poziomLogowaniaModulu;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div[2]/button")
    private WebElement saveLoadBalancer;
    @FindBy(id = "ARCH")
    private WebElement konfiguracjeArchiwalne;
    @FindBy(xpath = "//*[@id=\"SP-panel\"]/div/div[2]/div/table/tbody[1]/tr/td[4]/button")
    private WebElement loadKonfiguracjeArchiwalne;
    @FindBy(xpath = "//*[@id=\"main\"]/div/app-sp-config/div/div[2]/div/div[1]/p")
    private WebElement checkKonfiguracjaSp;

    @FindBy(id = "STATS")
    private WebElement statystyki;

    @FindBy(id = "REGEX")
    private WebElement testwyrazenregularnych;

    @FindBy(id = "FIT")
    private WebElement tabDopasowanie;

    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div[2]/input")
    private WebElement tekstwejsciowy;

    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div[4]/input")
    private WebElement wyrazenieregularne;

    @FindBy(id = "result")
    private WebElement buttonwynikdopasowania;
    @FindBy(xpath = "//*[@id=\"main\"]/div[4]/div[2]/input")
    private WebElement wynikdopasowania;

    @FindBy(id = "REG")
    private WebElement reguly;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[4]/input")
    private WebElement tekstwejsciowy2;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[6]/input")
    private WebElement poleprotokolu2;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[8]/input")
    private WebElement wyrazenieregularne2;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[10]/input")
    private WebElement zamiennik;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[11]/button")
    private WebElement dodajbutton;
    @FindBy(xpath = "//*[@id=\"main\"]/div/app-sp-config/div/div[2]/div/div[2]/app-sp-routing/div/div[1]/div[3]/button")
    private WebElement rozwinwszystko;

    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/table/tbody[1]/tr[2]/td[1]/input")
    private WebElement assercjawezla;

    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/table/tbody[1]/tr[2]/td[4]/input")
    private WebElement wagaedit;

    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/table/tbody[1]/tr[2]/td[6]/label/select")
    private WebElement selectSP;
    ////////////////////////////
    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[5]/button")
    private WebElement dodajgrupe;
    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[3]/select")
    private WebElement selectgrupa;
    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div[2]/select")
    private WebElement routing2;
    @FindBy(xpath = "//*[@id=\"main\"]/button")
    private WebElement newregula;
    @FindBy(xpath = "//*[@id=\"main\"]/div[3]/div/table/tbody/tr[2]/td[1]/label/select")
    private WebElement type;
    @FindBy(xpath = "//*[@id=\"main\"]/div[3]/div/table/tbody/tr[2]/td[6]/label/input")
    private WebElement opis;
    @FindBy(xpath = "//*[@id=\"save\"]")
    private WebElement save2;

    /////////////////
    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[6]/button")
    private WebElement edytujGrupe;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/div[2]/label[1]/input")
    private WebElement edytujID;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/div[2]/label[2]/input")
    private WebElement edytujOpis;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/div[3]/button[1]")
    private WebElement saveEdycjaGrupy;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/img")
    private WebElement checkChangeEditGroup;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[7]/button")
    private WebElement deleteGroup;
    @FindBy(xpath = "//*[@id=\"main\"]/div[3]/div/table/tbody/tr/td[5]/img[1]")
    private WebElement dodajWpis;
    @FindBy(xpath = "//*[@id=\"main\"]/div[3]/div/table/tbody/tr[1]/td[5]/img[2]")
    private WebElement usunWpis;
    ////////////////////////////////////////////////////////////////////////////////////////////
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[5]/button")
    private WebElement dodajGrupeDe;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[3]/select")
    private WebElement selectDe;
    @FindBy(xpath = "//*[@id=\"main\"]/div/button")
    private WebElement dodajReguleDe;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[8]/table/tbody/tr/td[1]/label/select")
    private WebElement selectTypeDe;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[8]/table/tbody/tr/td[6]/input")
    private WebElement dodajOpisDe;
    //////////////////////////////////////////
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[6]/button")
    private WebElement edytujGrupeDe;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[7]/button")
    private WebElement usunGrupeDe;

    ///////////////////////////////////////////////////////
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[8]/table/tbody/tr[1]/td[5]/img[1]")
    private WebElement dodajWpisDe;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[8]/table/tbody/tr[1]/td[5]/img[2]")
    private WebElement usunWpisDe;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[8]/table/tbody/tr[1]/td[1]/label/select")
    private WebElement selectTypeDe2;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[8]/table/tbody/tr[1]/td[6]/input")
    private WebElement dodajOpisDe2;
    ////////////////////////////////////////////////////////////////////////
    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/button")
    private WebElement dodajWarunek;

    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/table/tbody/tr[2]/td[3]/label/select")
    private WebElement selectGrupaNormalizacji;
    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/table/tbody/tr[2]/td[4]/label/select")
    private WebElement selectMethod;
    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/table/tbody/tr[2]")
    private WebElement selectWarunek;
    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[3]/button")
    private WebElement usunWarunek;
    ///////////////////////////////////////////////
    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/select")
    private WebElement globalnyPoziomLogowania;

    ////////////////////////// Routing
    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/table/tbody[1]/tr[1]/td[11]/img[1]")
    private WebElement dodajReguleRoutingu;
    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/table/tbody[2]/tr[1]/td[1]/input")
    private WebElement dodajIdRoutingu;

    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/table/tbody[2]/tr[1]/td[3]/input")
    private WebElement dodajOpisRoutingu;
    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/table/tbody[2]/tr[1]/td[10]/input")
    private WebElement dodajDpRoutingu;

    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/table/tbody[2]/tr[1]/td[6]/select")
    private WebElement selectGrDenormalizacjiRoutingu;

    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/table/tbody/tr[1]/td[11]/img[2]")
    private WebElement usunReguleRoutingu;
    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/table/tbody[1]/tr[2]/td[11]/img[1]")
    private WebElement dodajWpisRoutingu;


    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/table/tbody[1]/tr[3]/td[1]/input")
    private WebElement idWpisuRoutingu;
    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/table/tbody[1]/tr[3]/td[4]/input")
    private WebElement wagaWpisuRoutingu;
    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/table/tbody[2]/tr[2]/td[6]/label/select")
    private WebElement selectGrDenormalizacjiWpisuRoutingu;
    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[5]/button")
    private WebElement buttonDodajServeruRoutingu;

    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/table/tbody[1]/tr[2]/td[11]/img[2]")
    private WebElement usunWpisRoutingu;
    /////////////////////////////////////////////Profile/////////////////////////////////////////
    @FindBy(id = "PROFILES")
    private WebElement profiles;

    @FindBy(xpath = "//*[@id=\"main\"]/div/app-profiles/div/div/div[4]/button")
    private WebElement dodajProfil;

    @FindBy(xpath = "//*[@id=\"main\"]/div/app-profiles/div/div/div[8]/table/tbody/tr[13]/td[1]/input")
    private WebElement idProfil;
    @FindBy(xpath = "//*[@id=\"main\"]/div/app-profiles/div/div/div[8]/table/tbody/tr[13]/td[2]/input")
    private WebElement opisProfil;
    @FindBy(xpath = "//*[@id=\"main\"]/div/app-profiles/div/div/div[5]/button")
    private WebElement dodajUslugeProfil;
    @FindBy(xpath = "//*[@id=\"main\"]/div/app-profiles/div/div/div[6]/button")
    private WebElement dodajAdresProfil;
    @FindBy(xpath = "//*[@id=\"main\"]/div/app-profiles/div/div/div[7]/button")
    private WebElement usunProfil;
    @FindBy(xpath = "//*[@id=\"main\"]/div/app-profiles/div/div/div[8]/table/tbody/tr[14]/td[3]/input")
    private WebElement dodajNazwaUslugiProfil;
    @FindBy(xpath = "//*[@id=\"main\"]/div/app-profiles/div/div/div[8]/table/tbody/tr[15]/td[4]/input")
    private WebElement dodajNazwaAdresuProfil;

    @FindBy(xpath = "//*[@id=\"main\"]/div/app-profiles/div/div/div[8]/table/tbody/tr[15]/td[5]/input")
    private WebElement dodajWageAdresuProfil;
    @FindBy(xpath = "//*[@id=\"main\"]/div/app-profiles/div/div/div[10]/button")
    private WebElement zapiszProfil;

    //////////////////////////////DDDDDDDDDDDDPPPPPPPPPPP
    @FindBy(xpath = "//*[@id=\"main\"]/div/app-dp-config/div/div[2]/div/table/tbody/tr[1]/td[9]/img[1]")
    private WebElement regulaDp;

    @FindBy(xpath = "//*[@id=\"main\"]/div/app-dp-config/div/div[2]/div/table/tbody/tr[4]/td[1]/img[1]")
    private WebElement otworzWezlyDp;

    @FindBy(xpath = "//*[@id=\"main\"]/div/app-dp-config/div/div[2]/div/table/tbody/tr[5]/td[9]/img[1]")
    private WebElement dodajWezelDp;

    @FindBy(xpath = "//*[@id=\"main\"]/div/app-dp-config/div/div[2]/div/table/tbody/tr[6]/td[9]/img[2]")
    private WebElement usunWezelDp;

    @FindBy(xpath = "//*[@id=\"main\"]/div/app-dp-config/div/div[1]/div[4]/button")
    private WebElement zapiszDp;


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
    public void zmienAdresMaszynySip() {
        adresMaszynySip.sendKeys("192.168.22.321:1234");
        logger.info("Konfiguracja Sp");
    }

    @Step("konf")
    public void zmienWageMaszynySip() {
        wagaRuchu.clear();
        wagaRuchu.sendKeys("20");
        logger.info("Konfiguracja Sp");
    }

    @Step("konf")
    public void zmienPoziomLogowaniaModulu() {
        poziomLogowaniaModulu.click();
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
        tekstwejsciowy2.sendKeys("");
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

    @Step("Test wyrażeń regularnych")
    public void clickOnRozwinWszystko() {
        rozwinwszystko.click();
        String wezel1 = assercjawezla.getAttribute("ng-reflect-model");
        assertEquals(wezel1, "1_route_user@domena_route_rt_i");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void editWaga() {
        wagaedit.clear();

        wagaedit.sendKeys("5");
        String waga = wagaedit.getAttribute("ng-reflect-model");
        assertEquals(waga, "5");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void selecttsp() {
        Select normalizacjaDropDown = new Select(selectSP);
        normalizacjaDropDown.selectByValue("gr_id_denorm_cc_2");
        logger.info("Konfiguracja Sp");
    }
///////////////////////////////////////

    @Step("Test wyrażeń regularnych")
    public void clickDodajGrupe() {
        dodajgrupe.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void selectGrupa() {


        Select dropDownGrupa = new Select(selectgrupa);
        int selectOptions = dropDownGrupa.getOptions().size();
        dropDownGrupa.selectByIndex(selectOptions - 1);
    }

    @Step("Test wyrażeń regularnych")
    public void dropDownRouting() {
        Select dropDownRouting = new Select(routing2);
        dropDownRouting.selectByValue("1");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajRegule() {
        newregula.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void selectType() {
        Select dropDownType = new Select(type);
        dropDownType.selectByValue("TO_DISPLAY_NAME");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajopis() {
        opis.sendKeys("testopisu");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void saveGrupe() {
        save2.click();
        logger.info("Konfiguracja Sp");
        WebDriverWait wait = new WebDriverWait(driver, 300 /*timeout in seconds*/);
        if (wait.until(ExpectedConditions.alertIsPresent()) == null)
            System.out.println("alert was not present");
        else
            System.out.println("alert was present");
///////////////////////////
    }

    @Step("Test wyrażeń regularnych")
    public void edytujGrupe() {
        edytujGrupe.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void edytujID() {
        edytujID.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void edytujOpis() {
        edytujOpis.sendKeys("1234");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void saveEdycjaGrupy() {
        saveEdycjaGrupy.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void checkChangeEditGroup() {
        checkChangeEditGroup.click();
        logger.info("Konfiguracja Sp");

        String infoo = checkChangeEditGroup.getAttribute("ng-reflect-ngb-tooltip");
        assertEquals(infoo, "1234");
        System.out.println(infoo);
    }

    @Step("Test wyrażeń regularnych")
    public void deleteGroup() {

        deleteGroup.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajWpis() {

        dodajWpis.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void usunWpis() {

        usunWpis.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajGrupeDe() {
        dodajGrupeDe.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void selectTablicaDe() {
        Select dropDownGrupa = new Select(selectDe);
        int selectOptions = dropDownGrupa.getOptions().size();
        dropDownGrupa.selectByIndex(selectOptions - 1);
    }

    @Step("Test wyrażeń regularnych")
    public void dodajreguleDe() {
        dodajReguleDe.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void selectTypeDe() {
        Select dropDownType = new Select(selectTypeDe);
        dropDownType.selectByValue("TO_URI");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajOpisDe() {
        dodajOpisDe.sendKeys("sadasda");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void edytujGrupeDe() {
        edytujGrupeDe.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void usunGrupeDe() {
        usunGrupeDe.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajWpisDe() {
        dodajWpisDe.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void usunWpisDee() {
        usunWpisDe.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void selectTypeDe2() {
        Select dropDownType = new Select(selectTypeDe2);
        dropDownType.selectByValue("TO_DISPLAY_NAME");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajOpisDe2() {
        dodajOpisDe2.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void DodajWarunek() {
        dodajWarunek.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void selectGrupaNormalizacji() {
        Select dropDownType = new Select(selectGrupaNormalizacji);
        dropDownType.selectByValue("gr_id_norm_cc_2");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void selectMethod() {
        Select dropDownType = new Select(selectMethod);
        dropDownType.selectByValue("BYE");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void selectWarunek() {
        selectWarunek.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void usunWarunek() {
        usunWarunek.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void globalnyPoziomLogowania() {
        Select dropDownType = new Select(globalnyPoziomLogowania);
        dropDownType.selectByValue("INFO");
        logger.info("Konfiguracja Sp");
    }

    ///////////Routing//////////////////////////////////
    @Step("Test wyrażeń regularnych")
    public void dodajReguleRoutingu() {
        dodajReguleRoutingu.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajIdRoutingu() {
        dodajIdRoutingu.sendKeys("321");

    }

    @Step("Test wyrażeń regularnych")
    public void dodajOpisRoutingu() {
        dodajOpisRoutingu.sendKeys("qwerty");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajDpRoutingu() {
        dodajDpRoutingu.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void selectGrDenormalizacjiRoutingu() {
        Select dropDownType = new Select(selectGrDenormalizacjiRoutingu);
        dropDownType.selectByValue("gr_id_denorm_cc_3");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void usunReguleRoutingu() {
        usunReguleRoutingu.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajWpisRoutingu() {
        dodajWpisRoutingu.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void idWpisuRoutingu() {
        idWpisuRoutingu.sendKeys("123");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void wagaWpisuRoutingu() {
        wagaWpisuRoutingu.sendKeys("5");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void selectGrDenormalizacjiWpisuRoutingu() {
        Select dropDownType = new Select(selectGrDenormalizacjiWpisuRoutingu);
        dropDownType.selectByValue("gr_id_denorm_cc_3");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void buttonDodajServeruRoutingu() {
        boolean displayed = buttonDodajServeruRoutingu.isDisplayed();
        assertTrue(displayed);
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void usunWpisRoutingu() {
        usunWpisRoutingu.click();
        logger.info("Konfiguracja Sp");
    }

    //////////////////////////////////////////////////////////////////////////////////ASERCJE
    @Step("Test wyrażeń regularnych")
    public void asercjaDodanieNowegoPolaczenia() {
        String wpis = idWpisuRoutingu.getAttribute("ng-reflect-model");
        assertEquals(wpis, "123");
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    @Step("Test wyrażeń regularnych")
    public void goToProfil() {
        profiles.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajProfil() {
        dodajProfil.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajIdProfil() {
        idProfil.sendKeys("4");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajOpisProfil() {
        opisProfil.sendKeys("qwerty");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajUslugeProfil() {
        dodajUslugeProfil.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajAdresProfil() {
        dodajAdresProfil.sendKeys("qwerty");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void usunProfil() {
        usunProfil.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajNazwaUslugiProfil() {
        dodajNazwaUslugiProfil.sendKeys("SMS");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajNazwaAdresuProfil() {
        dodajNazwaAdresuProfil.sendKeys("SMS");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajWageAdresuProfil() {
        dodajWageAdresuProfil.sendKeys("5");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void zapiszProfil() {
        zapiszProfil.click();
        logger.info("Konfiguracja Sp");
    }

    //////////////////////////////////////////////////////////////
    @Step("Test wyrażeń regularnych")
    public void dodajRegulaDp() {
        regulaDp.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void otworzWezlyDp() {
        otworzWezlyDp.click();
        logger.info("Konfiguracja Sp");
    }


    @Step("Test wyrażeń regularnych")
    public void dodajWezelDp() {
        dodajWezelDp.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void usunWezelDp() {
        usunWezelDp.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void zapiszDp() {
        zapiszDp.click();
        logger.info("Konfiguracja Sp");
    }


}

