package PageObjects;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static javax.swing.text.html.CSS.getAttribute;
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

    @FindBy(id = "routing_button")
    private WebElement routing;
    @FindBy(id = "DP")
    private WebElement konfiguracjaDp;

    @FindBy(id = "normalizacja_button")
    private WebElement normalizacja;

    @FindBy(id = "denormalizacja_button")
    private WebElement denormalizacja;

    @FindBy(id = "precondition_button")
    private WebElement precondition;

    @FindBy(id = "logowanie_button")
    private WebElement logowanie;

    @FindBy(id = "group_normalization_select")
    private WebElement tablicaNormalizacj;

    @FindBy(xpath = "//*[@id=\"main\"]/div/app-sp-config/div/div[2]/div/div[2]/app-sp-normalization/div/div[1]/div[4]/img")
    private WebElement tree;
    @FindBy(id = "save")
    private WebElement save;

    @FindBy(id = "LB")
    private WebElement lB;
    @FindBy(id = "message")
    private WebElement stanKonfiguracji;

    @FindBy(id = "name_2")
    private WebElement adresMaszynySip;

    @FindBy(id = "weight_0")
    private WebElement wagaRuchu;
    @FindBy(id = "SipLoadBalancerCall4")
    private WebElement poziomLogowaniaModulu;

    @FindBy(id = "save")
    private WebElement saveLoadBalancer;
    @FindBy(id = "ARCH")
    private WebElement konfiguracjeArchiwalne;
    @FindBy(id = "sp_load_0")
    private WebElement loadKonfiguracjeArchiwalne;
    @FindBy(id = "message")
    private WebElement checkKonfiguracjaSp;

    @FindBy(id = "STATS")
    private WebElement statystyki;

    @FindBy(id = "REGEX")
    private WebElement testwyrazenregularnych;

    @FindBy(id = "FIT")
    private WebElement tabDopasowanie;

    @FindBy(id = "input_regules")
    private WebElement tekstwejsciowy;
    @FindBy(id = "input_regex")
    private WebElement tekstwejsciowy2;

    @FindBy(id = "regex")
    private WebElement wyrazenieregularne;

    @FindBy(id = "result")
    private WebElement buttonwynikdopasowania;
    @FindBy(id = "result_text")
    private WebElement wynikdopasowania;

    @FindBy(id = "REG")
    private WebElement reguly;



    @FindBy(id = "protocol")
    private WebElement poleprotokolu2;

    @FindBy(id = "regex_0")
    private WebElement wyrazenieregularne2;

    @FindBy(id = "replacement_0")
    private WebElement zamiennik;

    @FindBy(id = "add_regule")
    private WebElement dodajbutton;
    @FindBy(id = "expand_all_button")
    private WebElement rozwinwszystko;

    @FindBy(id = "destination_0_1")
    private WebElement assercjawezla;

    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/table/tbody[1]/tr[2]/td[4]/input")
    private WebElement wagaedit;

    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/table/tbody[1]/tr[2]/td[6]/label/select")
    private WebElement selectSP;
    ////////////////////////////
    @FindBy(id = "add_group")
    private WebElement dodajgrupe;
    @FindBy(id = "group_normalization_select")
    private WebElement selectgrupa;
    @FindBy(id = "routing_select")
    private WebElement routing2;
    @FindBy(id = "add_regule_button")
    private WebElement newregula;
    @FindBy(id = "normalization_type_0")
    private WebElement type;
    @FindBy(id = "description_0")
    private WebElement opis;
    @FindBy(id = "description_1")
    private WebElement opis2;


    @FindBy(id = "save")
    private WebElement save2;

    @FindBy(xpath="//*[@id=\"main\"]/div/app-sp-config/div/div[2]/div/div[2]/app-sp-normalization/div/div[3]/div/table/tbody/tr[2]/td[4]")
    private WebElement output;
    @FindBy(id = "output_edited")
    private WebElement outputText;
    @FindBy(id = "output_value")
    private WebElement outputText2;
    @FindBy(id = "output_save")
    private WebElement outputSave2;


    @FindBy(id = "output_save_button")
    private WebElement outputSave;
    @FindBy(id = "input_1")
    private WebElement dodajInput;


    @FindBy(id = "input_0")
    private WebElement dodajInput2;
    @FindBy(xpath="//*[@id=\"main\"]/div/app-sp-config/div/div[2]/div/div[2]/app-sp-normalization/div/div[3]/div/table/tbody/tr/td[4]")
    private WebElement output2;

    @FindBy(xpath = "//*[@id=\"main\"]/div/app-sp-config/div/div[2]/div/div[2]/app-sp-denormalization/div/div/div[8]/table/tbody/tr/td[4]")
    private WebElement outputDe;

    @FindBy(xpath = "//*[@id=\"main\"]/div/app-sp-config/div/div[2]/div/div[2]/app-sp-denormalization/div/div/div[8]/table/tbody/tr[2]/td[4]")
    private WebElement outputDe2;



    /////////////////
    @FindBy(id = "edit_group")
    private WebElement edytujGrupe;
    @FindBy(id = "edit_group_id")
    private WebElement edytujID;
    @FindBy(id = "edit_group_desc")
    private WebElement edytujOpis;
    @FindBy(id = "edit_save")
    private WebElement saveEdycjaGrupy;
    @FindBy(id = "edit_save_button")
    private WebElement saveEdycjaGrupy2;


    @FindBy(xpath = "//*[@id=\"main\"]/div/app-sp-config/div/div[2]/div/div[2]/app-sp-normalization/div/div[1]/div[2]/img")
    private WebElement checkChangeEditGroup;
    @FindBy(xpath = "//*[@id=\"main\"]/div/app-sp-config/div/div[2]/div/div[2]/app-sp-denormalization/div/div/div[2]/img")
    private WebElement checkChangeEditGroupDe;


    @FindBy(id = "delete_group")
    private WebElement deleteGroup;
    @FindBy(id = "add_regule_0")
    private WebElement dodajWpis;
    @FindBy(id = "delete_regule_0")
    private WebElement usunWpis;
    ////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy(id = "chooseDenorm")
    private WebElement selectDe;
    @FindBy(id = "add_regule")
    private WebElement dodajReguleDe;
    @FindBy(id = "type_0")
    private WebElement selectTypeDe;
    @FindBy(id = "description_0")
    private WebElement dodajOpisDe;
    //////////////////////////////////////////
    @FindBy(id = "edit_group")
    private WebElement edytujGrupeDe;


    ///////////////////////////////////////////////////////

    @FindBy(id = "delete_regule_0")
    private WebElement usunWpisDe;

    @FindBy(id = "type_1")
    private WebElement selectTypeDe2;
    @FindBy(id = "description_1")
    private WebElement dodajOpisDe2;
    ////////////////////////////////////////////////////////////////////////
    @FindBy(id = "add_precondition_button")
    private WebElement dodajWarunek;

    @FindBy(id = "precondition_group_normalization_id_1")
    private WebElement selectGrupaNormalizacji;
    @FindBy(id = "precondition_method_1")
    private WebElement selectMethod;
    @FindBy(id = "precondition_row_1")
    private WebElement selectWarunek;
    @FindBy(id = "delete_precondition_button")
    private WebElement usunWarunek;
    ///////////////////////////////////////////////
    @FindBy(id = "select_global_level")
    private WebElement globalnyPoziomLogowania;

    ////////////////////////// Routing
    @FindBy(id = "add_server_0")
    private WebElement dodajReguleRoutingu;
    @FindBy(id = "routing_id_1")
    private WebElement dodajIdRoutingu;

    @FindBy(id = "routing_description_1")
    private WebElement dodajOpisRoutingu;
    @FindBy(id = "locate_route_checkbox_1")
    private WebElement dodajDpRoutingu;

    @FindBy(id = "group_denormalization_1")
    private WebElement selectGrDenormalizacjiRoutingu;



    @FindBy(id = "delete_server_0")
    private WebElement usunReguleRoutingu;
    @FindBy(id = "add_file_1_0")
    private WebElement dodajWpisRoutingu;


    @FindBy(id = "destination_1_0")
    private WebElement idWpisuRoutingu;

    @FindBy(id = "weight_1_0")
    private WebElement wagaWpisuRoutingu2;


    @FindBy(id = "denormalization_1_0")
    private WebElement selectGrDenormalizacjiWpisuRoutingu;


    @FindBy(id = "add_server_button")
    private WebElement buttonDodajServeruRoutingu;

    @FindBy(id = "delete_file_0_0")
    private WebElement usunWpisRoutingu;
    @FindBy(id = "delete_file_1_1")
    private WebElement usunWpisRoutinguFull;


    /////////////////////////////////////////////Profile/////////////////////////////////////////
    @FindBy(id = "PROFILES")
    private WebElement profiles;

    @FindBy(id = "add_profile")
    private WebElement dodajProfil;

    @FindBy(id = "id_2")
    private WebElement idProfil;
    @FindBy(id = "name_2")
    private WebElement opisProfil;
    @FindBy(id = "add_service_button")
    private WebElement dodajUslugeProfil;
    @FindBy(id = "add_address")
    private WebElement dodajAdresProfil;
    @FindBy(id = "delete")
    private WebElement usunProfil;
    @FindBy(id = "service_name_0")
    private WebElement dodajNazwaUslugiProfil;
    @FindBy(id = "address_0_0")
    private WebElement dodajNazwaAdresuProfil;

    @FindBy(id = "address_weight_0_0")
    private WebElement dodajWageAdresuProfil;
    @FindBy(id = "save")
    private WebElement zapiszProfil;

    //////////////////////////////DDDDDDDDDDDDPPPPPPPPPPP////////////////////////////////////////////////////////////////////////////////
    @FindBy(id = "expand_all")
    private WebElement rozwinWszystkoDp;
    @FindBy(id = "add_server_0")
    private WebElement dodajSerwerDp;
    @FindBy(id = "type_1")
    private WebElement TypDp;
    @FindBy(id = "name_1")
    private WebElement NazwaDp;
    @FindBy(id = "description_1")
    private WebElement OpisDp;
    @FindBy(id = "weight_1_0")
    private WebElement WagaDp;
    @FindBy(id = "add__1_0")
    private WebElement dodajNowePolaczenieDp;
    @FindBy(id = "weight_1_1")
    private WebElement DodajWageDrugiegoPolaczeniaDp;
    @FindBy(id = "delete_1_1")
    private WebElement usunDrugiePolaczenieZListy;
    @FindBy(id = "save")
    private WebElement zapiszKonfiguracjeDp;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/div[2]/p[2]")
    private WebElement checkerrorNorm;
    @FindBy(id = "sp_save_button")
    private WebElement submitError;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/div[2]/p")
    private WebElement checkerrorNormSave;

    @FindBy(id = "delete_server_1")
    private WebElement deleteSerwerRout;
    @FindBy(id = "weight_2")
    private WebElement weightLb;
    @FindBy(xpath = "(//*[@id=\"service_1\"])[1]")
    private WebElement rozwinuslugi;
    @FindBy(xpath = "//*[@id=\"address_2\"]/img")
    private WebElement rozwinadresy;

    @FindBy(xpath = "//*[@id=\"main\"]/div/app-profiles/div/div/div[11]/table/tbody/tr[1]")
    private WebElement clickProfil;

    @FindBy(id = "id_1")
    private WebElement clearIdDp;
    @FindBy(id = "dp_save_button")
    private WebElement saveButtonDp;

    @FindBy(id = "open_folder_button_0")
    private WebElement rozwinProfile;
    @FindBy(id = "edit_profile")
    private WebElement edytujProfil;

    @FindBy(id = "edit_profile_id")
    private WebElement editProfileId;

    @FindBy(id = "edit_profile_name")
    private WebElement editProfileName;

    @FindBy(id = "edit_save_button")
    private WebElement saveEdycjaProfil;
    @FindBy(id = "chooseProfile")
    private WebElement chooseProfil;
    @FindBy(id = "delete_profile")
    private WebElement deleteProfil;
    @FindBy(id = "lb_save_button")
    private WebElement submitSaveProfil;


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
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    @Step("konf")
    public void dropDownNormalizacja() {

        Select normalizacjaDropDown = new Select(tablicaNormalizacj);
        normalizacjaDropDown.selectByValue("gr_id_norm_cc_2");
        logger.info("Konfiguracja Sp");
    }


///@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
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

        String message = stanKonfiguracji.getText();
        assertEquals(message, "Załadowano konfiguracje LoadBalancera");
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
        assertEquals(info, "Załadowano konfiguracje archiwalną o id 76");
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
    public void sendTekstWejsciowy2() {
        tekstwejsciowy2.sendKeys("");
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

        logger.info("Konfiguracja Sp");
    }
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    @Step("Test wyrażeń regularnych")
    public void editWaga() {
        wagaedit.clear();

        wagaedit.sendKeys("5");
        String waga = wagaedit.getAttribute("ng-reflect-model");
        assertEquals(waga, "5");
        logger.info("Konfiguracja Sp");
    }
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
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
public WebElement x;
    @Step("Test wyrażeń regularnych")
    public void selectGrupa() {


        Select dropDownGrupa = new Select(selectgrupa);
        int selectOptions = dropDownGrupa.getOptions().size();
        dropDownGrupa.selectByIndex(selectOptions - 1);
         x = dropDownGrupa.getFirstSelectedOption();
        System.out.println(x.getText());
    }

    @Step("Test wyrażeń regularnych")
    public String ostatniElementDropDown() {
        return x.getText();
    }
    @Step("Test wyrażeń regularnych")
    public String checkerrorNorm() {
        return checkerrorNorm.getText();
    }
    @Step("Test wyrażeń regularnych")
    public String checkerrorNormSave() {
        return checkerrorNormSave.getText();
    }



    @Step("Test wyrażeń regularnych")
    public void dropDownRouting() {
        Select dropDownRouting = new Select(routing2);
        dropDownRouting.selectByValue("rt_id_cc_2");
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
    public void dodajopis2() {
        opis2.sendKeys("testopisu");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void saveGrupe() {
        save2.click();
        logger.info("Konfiguracja Sp");
//        WebDriverWait wait = new WebDriverWait(driver, 300 /*timeout in seconds*/);
//        if (wait.until(ExpectedConditions.alertIsPresent()) == null)
//            System.out.println("alert was not present");
//        else
//            System.out.println("alert was present");
///////////////////////////
    }

    @Step("Test wyrażeń regularnych")
    public void dodajOutput() {
        output.click();
        outputText.sendKeys("user_part: \"rect\", \"dialog\"");
        outputSave.click();
        logger.info("Konfiguracja Sp");
    }
///////////////////////////////////////////////////////////////////NORMALIZACJA
    @Step("Test wyrażeń regularnych")
    public void dodajOutput2() {
        output2.click();
        outputText.sendKeys("user_part: \"rect\", \"dialog\"");
        outputSave.click();
        logger.info("Konfiguracja Sp");
    }
    @Step("Test wyrażeń regularnych")
    public void dodajOutput3() {
        outputDe.click();
        outputText2.sendKeys("user_part: \"rect\", \"dialog\"");
        outputSave2.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajOutputDe2() {
        outputDe2.click();
        outputText2.sendKeys("user_part: \"rect\", \"dialog\"");
        outputSave2.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajInput() {
        dodajInput.sendKeys("1234");
        logger.info("Konfiguracja Sp");
    }
    @Step("Test wyrażeń regularnych")
    public void dodajInput2() {
        dodajInput2.sendKeys("1234");
        logger.info("Konfiguracja Sp");
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
    public void saveEdycjaGrupy2() {
        saveEdycjaGrupy2.click();
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
    public void checkChangeEditGroupDe() {


        String infoo = checkChangeEditGroupDe.getAttribute("ng-reflect-ngb-tooltip");
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
    public void selectTablicaDe() {
        Select dropDownGrupa = new Select(selectDe);
        int selectOptions = dropDownGrupa.getOptions().size();
        dropDownGrupa.selectByIndex(selectOptions - 1);
        x = dropDownGrupa.getFirstSelectedOption();
        System.out.println(x.getText());
    }



    @Step("Test wyrażeń regularnych")
    public String ostatniElementDropDownDenormalizacja() {
        return x.getText();
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
        dodajOpisDe2.sendKeys("qwerty");
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
    public void dodajIdRoutinguInvalid() {
        dodajIdRoutingu.sendKeys("rt_id_cc_1");

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
        dropDownType.selectByValue("gr_id_denorm_cc_1");
        logger.info("Konfiguracja Sp");
    }
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
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
        idWpisuRoutingu.clear();
        idWpisuRoutingu.sendKeys("123_route_user@domena_route_rt_i");
        logger.info("Konfiguracja Sp");
    }



    @Step("Test wyrażeń regularnych")
    public void wagaWpisuRoutingu2() {
        wagaWpisuRoutingu2.clear();
        wagaWpisuRoutingu2.sendKeys("95");

        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void wagaWpisuRoutingu() {
        wagaWpisuRoutingu2.clear();
        wagaWpisuRoutingu2.sendKeys("100");

        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void selectGrDenormalizacjiWpisuRoutingu() {
        Select dropDownType = new Select(selectGrDenormalizacjiWpisuRoutingu);
        dropDownType.selectByValue("gr_id_denorm_cc_1");
        logger.info("Konfiguracja Sp");
    }

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    @Step("Test wyrażeń regularnych")
    public void buttonDodajServeruRoutingu() {
        boolean displayed = buttonDodajServeruRoutingu.isDisplayed();
        assertTrue(displayed);
        logger.info("Konfiguracja Sp");
    }
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    @Step("Test wyrażeń regularnych")
    public void usunWpisRoutingu() {
        usunWpisRoutingu.click();
        logger.info("Konfiguracja Sp");
    }
    @Step("Test wyrażeń regularnych")
    public void usunWpisRoutinguFull() {
        usunWpisRoutinguFull.click();
        logger.info("Konfiguracja Sp");
    }

    //////////////////////////////////////////////////////////////////////////////////ASERCJE
    @Step("Test wyrażeń regularnych")
    public void asercjaDodanieNowegoPolaczenia() {
        String wpis = idWpisuRoutingu.getAttribute("ng-reflect-model");
        assertEquals(wpis, "123_route_user@domena_route_rt");
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
        dodajAdresProfil.click();
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
        dodajNazwaAdresuProfil.sendKeys("127.01.98.0");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajWageAdresuProfil() {
        dodajWageAdresuProfil.clear();
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
    public void rozwinWszystkoDp() {
        rozwinWszystkoDp.click();
        logger.info("Konfiguracja Sp");
    }
    @Step("Test wyrażeń regularnych")
    public void dodajSerwerDp() {
        dodajSerwerDp.click();
        logger.info("Konfiguracja Sp");
    }
    @Step("Test wyrażeń regularnych")
    public void chooseTypDp() {
        Select dropDownType = new Select(TypDp);
        dropDownType.selectByValue("Real");
        logger.info("Konfiguracja Sp");
    }
    @Step("Test wyrażeń regularnych")
    public void dodajNazwaDp() {
        NazwaDp.sendKeys("Test nazwy Dp");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajOpisDp() {
        OpisDp.sendKeys("Test opisu Dp");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajWageDp() {
        WagaDp.clear();
        WagaDp.sendKeys("100");
        logger.info("Konfiguracja Sp");
    }


    @Step("Test wyrażeń regularnych")
    public void dodajWageIncorrencDp() {
        WagaDp.clear();
        WagaDp.sendKeys("111");
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void dodajNowePolaczenieDp() {
        dodajNowePolaczenieDp.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void DodajWageDrugiegoPolaczeniaDp() {
        WagaDp.clear();
        WagaDp.sendKeys("50");
        logger.info("Konfiguracja 50");
    }

    @Step("Test wyrażeń regularnych")
    public void usunPierwszePolaczenieZListy() {
        usunDrugiePolaczenieZListy.click();
        logger.info("Konfiguracja Sp");
    }
    @Step("Test wyrażeń regularnych")
    public void zapiszKonfiguracjeDp() {
        zapiszKonfiguracjeDp.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void submitError() {
        submitError.click();
        logger.info("Konfiguracja Sp");
    }
    @Step("Test wyrażeń regularnych")
    public void DeleteSerwerRout() {
        deleteSerwerRout.click();
        logger.info("Konfiguracja Sp");
    }
    @Step("Test wyrażeń regularnych")
    public void setWeightLbIncorrect () {
        weightLb.sendKeys("110");
        logger.info("Konfiguracja Sp");
    }
    @Step("Test wyrażeń regularnych")
    public void setWeightLbCorrect() {
        weightLb.clear();
        weightLb.sendKeys("40");
        logger.info("Konfiguracja Sp");
    }
    @Step("Test wyrażeń regularnych")
    public void clickOnRozwinUslugi() {
        rozwinuslugi.click();
        logger.info("Konfiguracja Sp");
    }
    @Step("Test wyrażeń regularnych")
    public void clickOnRozwinAdresy() {
        rozwinadresy.click();
        logger.info("Konfiguracja Sp");
    }
    @Step("Test wyrażeń regularnych")
    public void clickOnProfil() {
        clickProfil.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void clearIdDp() {
        clearIdDp.clear();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void setNotUniqueIdDp() {


        clearIdDp.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dp_routing_cc1");
        zapiszKonfiguracjeDp.click();


        try {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            String info = alert.getText();
            System.out.println(info);
            assertEquals(info,"Id powinno być unikalne");
            alert.accept();
        } catch (Exception e) {
        }
//        Alert alert = driver.switchTo().alert();
//        String info3 = alert.getText();
//        assertEquals(info3, "Id powinno być unikalne");
   logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void setSaveButtonDp() {
        saveButtonDp.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("Test wyrażeń regularnych")
    public void clickOnRozwinProfile() {
        rozwinProfile.click();
        logger.info("Konfiguracja Sp");
    }
    @Step("Test wyrażeń regularnych")
    public void clickOnEdytujProfil() {
        edytujProfil.click();
        logger.info("Konfiguracja Sp");
    }
    @Step("Test wyrażeń regularnych")
    public void edytujIdProfil() {
        editProfileId.clear();
        editProfileId.sendKeys("3");
        logger.info("Konfiguracja Sp");
    }
    @Step("Test wyrażeń regularnych")
    public void edytujNameProfil() {
        editProfileName.clear();
        editProfileName.sendKeys("3 numer profilu");
        logger.info("Konfiguracja Sp");
    }
    @Step("Test wyrażeń regularnych")
    public void saveEdycjaProfil() {
        saveEdycjaProfil.click();
        logger.info("Konfiguracja Sp");
    }

    @Step("konf")
    public void dropDownProfil() {

        Select normalizacjaDropDown = new Select(chooseProfil);
        normalizacjaDropDown.selectByValue("3");
        logger.info("Konfiguracja Sp");
    }
    @Step("Test wyrażeń regularnych")
    public void deleteProfile() {
        deleteProfil.click();
        logger.info("Konfiguracja Sp");
    }
    @Step("Test wyrażeń regularnych")
    public void submitSaveProfil() {
        submitSaveProfil.click();
        logger.info("Konfiguracja Sp");
    }

}


