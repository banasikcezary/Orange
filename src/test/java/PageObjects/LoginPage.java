package PageObjects;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
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

    @FindBy(id = "delete_regule_0")
    private WebElement usunWpisDe;

    @FindBy(id = "type_1")
    private WebElement selectTypeDe2;
    @FindBy(id = "description_1")
    private WebElement dodajOpisDe2;
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

    @FindBy(id = "select_global_level")
    private WebElement globalnyPoziomLogowania;

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


    @Step("Wpisz Login")
    public void sendLogin() {
        login.sendKeys("admin");
        logger.info("Wpisano login");
    }

    @Step("Wpisz haslo")
    public void sendPassword() {
        password.sendKeys("admin");
        logger.info("Wpisano hasło");
    }

    @Step("Zaloguj")
    public void goSubmit() {
        submit.click();
        logger.info("Zaloguj");
    }

    @Step("Sprawdz logowanie")
    public void assertion() {
        assertTrue(assertion.isDisplayed());
        logger.info("Zalogowano");
    }

    @Step("Przejdz do konf SP")
    public void konfiguracjaSp() {
        konfiguracjaSp.click();
        logger.info("Przejdz do konf SP");
    }

    @Step("Przejdz do routingu")
    public void Routing() {
        routing.click();
        logger.info("Przejdz do routingu");
    }

    @Step("Przejdz do konf DP")
    public void konfiguracjaDP() {
        konfiguracjaDp.click();
        logger.info("Przejdz do konf DP");
    }

    @Step("Przejdz do normalizacji")
    public void Normalizacja() {
        normalizacja.click();
        logger.info("Przejdz do normalizacji");
    }

    @Step("Przejdz do denormalizacji")
    public void Denormalizacja() {
        denormalizacja.click();
        logger.info("Przejdz do denormalizacji");
    }

    @Step("Przejdz do precondition ")
    public void Preconditions() {
        precondition.click();
        logger.info("Przejdz do precondition");
    }

    @Step("Kliknij przycisk logowania")
    public void Logowanie() {
        logowanie.click();
        logger.info("Kliknij przycisk logowania");
    }

    @Step("Przejdz do LB")
    public void tabLB() {
        lB.click();
        logger.info("Przejdz do LB");
    }

    @Step("Sprawdz zaladowanie stanu konfiguracji LB")
    public void stanZaladowanejKonfiguracji() {

        String message = stanKonfiguracji.getText();
        assertEquals(message, "Załadowano konfiguracje LoadBalancera");
        logger.info("Sprawdz zaladowanie stanu konfiguracji LB");
    }

    @Step("Zmien adres maszyny")
    public void zmienAdresMaszynySip() {
        adresMaszynySip.sendKeys("192.168.22.321:1234");
        logger.info("Zmien adres maszyny");
    }

    @Step("Zmien poziom logowania modulu")
    public void zmienPoziomLogowaniaModulu() {
        poziomLogowaniaModulu.click();
        logger.info("Zmien poziom logowania modulu");
    }

    @Step("Zapisz")
    public void zapisanieLoadBalancera() {
        saveLoadBalancer.click();
        logger.info("Zapisz");
    }

    @Step("Przejdz do konfiguracji archiwalnych")
    public void clickToKonfiguracjeArchiwalne() {
        konfiguracjeArchiwalne.click();
        logger.info("Przejdz do konfiguracji archiwalnych");
    }

    @Step("Zaladuj konf archiwalne")
    public void loadToKonfiguracjeArchiwalne() {
        loadKonfiguracjeArchiwalne.click();
        logger.info("Zaladuj konf archiwalne");
    }

    @Step("Sprawdz konfiguracje archiwalne")
    public void checkKonfiguracjeArchiwalne() {
        String info = checkKonfiguracjaSp.getText();
        assertEquals(info, "Załadowano konfiguracje archiwalną o id 76");
        logger.info("Sprawdz konfiguracje archiwalne");
    }

    @Step("Przejdz do statystyk")
    public void clickOnTabStatystyki() {
        statystyki.click();
        logger.info("Przejdz do statystyk");
    }

    @Step("Test wyrażeń regularnych")
    public void clickOnTabTestWyrazenRegularnych() {
        testwyrazenregularnych.click();
        logger.info("Test wyrażeń regularnych");
    }

    @Step("Tab dopasowanie")
    public void clickOnTabDopasowanie() {

        tabDopasowanie.click();
        logger.info("Tab dopasowanie");
    }

    @Step("Wpisz tekst wejsciowy")
    public void sendTekstWejsciowy() {
        tekstwejsciowy.sendKeys("");
        logger.info("Wpisz tekst wejsciowy");
    }

    @Step("Wpisz tekst wejsciowy")
    public void sendTekstWejsciowy2() {
        tekstwejsciowy2.sendKeys("");
        logger.info("Wpisz tekst wejsciowy");
    }

    @Step("Wpisz wyrazenie regularne")
    public void sendwyrazenieregularne() {
        wyrazenieregularne.sendKeys("");
        logger.info("Wpisz wyrazenie regularne");
    }

    @Step("Wynik dopasowania")
    public void clickonbuttwynikdopasowania() {
        buttonwynikdopasowania.click();
        logger.info("Wynik dopasowania");
    }

    @Step("Sprawdz wynik dopasowania")
    public void checkwynikdopasowania() {
        String wynik = wynikdopasowania.getText();
        assertEquals(wynik, "");
        logger.info("Sprawdz wynik dopasowania");
    }

    @Step("Tab reguly")
    public void clickOnTabReguly() {
        reguly.click();
        logger.info("Tab reguly");

    }

    @Step("Wpisz pole protokolu")
    public void sendpoleprotokolu2() {
        poleprotokolu2.sendKeys("");
        logger.info("Wpisz pole protokolu");
    }

    @Step("Wpisz wyrazenie regularne")
    public void wyrazeniaregularne2() {
        wyrazenieregularne2.sendKeys("");
        logger.info("Wpisz wyrazenie regularne");
    }

    @Step("Wpisz zamiennik")
    public void sendzamiennik() {
        zamiennik.sendKeys("");
        logger.info("Wpisz zamiennik");
    }

    @Step("Wcisnij przycisk dodaj")
    public void clickOnDodajButton() {
        dodajbutton.click();
        logger.info("Wcisnij przycisk dodaj");
    }

    @Step("Rozwin wszystko")
    public void clickOnRozwinWszystko() {
        rozwinwszystko.click();
        logger.info("Rozwin wszystko");
    }


    @Step("Dodaj grupe")
    public void clickDodajGrupe() {
        dodajgrupe.click();
        logger.info("Dodaj grupe");
    }

public WebElement x;

    @Step("Wybierz grupe")
    public void selectGrupa() {


        Select dropDownGrupa = new Select(selectgrupa);
        int selectOptions = dropDownGrupa.getOptions().size();
        dropDownGrupa.selectByIndex(selectOptions - 1);
         x = dropDownGrupa.getFirstSelectedOption();
        System.out.println(x.getText());
    }


    public String ostatniElementDropDown() {
        return x.getText();
    }

    public String checkerrorNorm() {
        return checkerrorNorm.getText();
    }

    public String checkerrorNormSave() {
        return checkerrorNormSave.getText();
    }



    @Step("dropDownRouting")
    public void dropDownRouting() {
        Select dropDownRouting = new Select(routing2);
        dropDownRouting.selectByValue("rt_id_cc_2");
        logger.info("dropDownRouting");
    }

    @Step("dodajRegule")
    public void dodajRegule() {
        newregula.click();
        logger.info("dodajRegule");
    }

    @Step("selectType")
    public void selectType() {
        Select dropDownType = new Select(type);
        dropDownType.selectByValue("TO_DISPLAY_NAME");
        logger.info("selectType");
    }

    @Step("dodajopis")
    public void dodajopis() {
        opis.sendKeys("testopisu");
        logger.info("dodajopis");
    }
    @Step("dodajopis")
    public void dodajopis2() {
        opis2.sendKeys("testopisu");
        logger.info("dodajopis");
    }

    @Step("saveGrupe")
    public void saveGrupe() {
        save2.click();
        logger.info("saveGrupe");

    }

    @Step("dodajOutput")
    public void dodajOutput() {
        output.click();
        outputText.sendKeys("user_part: \"rect\", \"dialog\"");
        outputSave.click();
        logger.info("dodajOutput");
    }
    @Step("dodajOutput")
    public void dodajOutput2() {
        output2.click();
        outputText.sendKeys("user_part: \"rect\", \"dialog\"");
        outputSave.click();
        logger.info("dodajOutput");
    }
    @Step("dodajOutput")
    public void dodajOutput3() {
        outputDe.click();
        outputText2.sendKeys("user_part: \"rect\", \"dialog\"");
        outputSave2.click();
        logger.info("dodajOutput");
    }

    @Step("dodajOutput")
    public void dodajOutputDe2() {
        outputDe2.click();
        outputText2.sendKeys("user_part: \"rect\", \"dialog\"");
        outputSave2.click();
        logger.info("dodajOutput");
    }

    @Step("dodajInput")
    public void dodajInput() {
        dodajInput.sendKeys("1234");
        logger.info("dodajInput");
    }
    @Step("dodajInput")
    public void dodajInput2() {
        dodajInput2.sendKeys("1234");
        logger.info("dodajInput");
    }

    @Step("edytujGrupe")
    public void edytujGrupe() {
        edytujGrupe.click();
        logger.info("edytujGrupe");
    }

    @Step("edytujID")
    public void edytujID() {
        edytujID.click();
        logger.info("edytujID");
    }

    @Step("edytujOpis")
    public void edytujOpis() {
        edytujOpis.sendKeys("1234");
        logger.info("edytujOpis");
    }

    @Step("saveEdycjaGrupy")
    public void saveEdycjaGrupy() {
        saveEdycjaGrupy.click();
        logger.info("saveEdycjaGrupy");
    }

    @Step("saveEdycjaGrupy")
    public void saveEdycjaGrupy2() {
        saveEdycjaGrupy2.click();
        logger.info("saveEdycjaGrupy");
    }

    @Step("checkChangeEditGroup")
    public void checkChangeEditGroup() {
        checkChangeEditGroup.click();
        logger.info("Konfiguracja Sp");

        String infoo = checkChangeEditGroup.getAttribute("ng-reflect-ngb-tooltip");
        assertEquals(infoo, "1234");
        System.out.println(infoo);
    }

    @Step("checkChangeEditGroupDe")
    public void checkChangeEditGroupDe() {
        String infoo = checkChangeEditGroupDe.getAttribute("ng-reflect-ngb-tooltip");
        assertEquals(infoo, "1234");
        System.out.println(infoo);
    }

    @Step("deleteGroup")
    public void deleteGroup() {

        deleteGroup.click();
        logger.info("deleteGroup");
    }

    @Step("dodajWpis")
    public void dodajWpis() {

        dodajWpis.click();
        logger.info("dodajWpis");
    }



    @Step("selectTablicaDe")
    public void selectTablicaDe() {
        Select dropDownGrupa = new Select(selectDe);
        int selectOptions = dropDownGrupa.getOptions().size();
        dropDownGrupa.selectByIndex(selectOptions - 1);
        x = dropDownGrupa.getFirstSelectedOption();
        System.out.println(x.getText());
    }

    @Step("ostatniElementDropDownDenormalizacja")
    public String ostatniElementDropDownDenormalizacja() {

        return x.getText();
    }

    @Step(" dodajreguleDe")
    public void dodajreguleDe() {
        dodajReguleDe.click();
        logger.info(" dodajreguleDe");
    }

    @Step("selectTypeDe")
    public void selectTypeDe() {
        Select dropDownType = new Select(selectTypeDe);
        dropDownType.selectByValue("TO_URI");
        logger.info("selectTypeDe");
    }

    @Step(" dodajOpis")
    public void dodajOpisDe() {
        dodajOpisDe.sendKeys("sadasda");
        logger.info(" dodajOpis");
    }

    @Step("edytujGrupe")
    public void edytujGrupeDe() {
        edytujGrupeDe.click();
        logger.info("edytujGrupe");
    }


    @Step("selectTypeDe")
    public void selectTypeDe2() {
        Select dropDownType = new Select(selectTypeDe2);
        dropDownType.selectByValue("TO_DISPLAY_NAME");
        logger.info("selectTypeDe");
    }

    @Step("dodajOpis")
    public void dodajOpisDe2() {
        dodajOpisDe2.sendKeys("qwerty");
        logger.info("dodajOpis");
    }

    @Step("DodajWarunek")
    public void DodajWarunek() {
        dodajWarunek.click();
        logger.info("DodajWarunek");
    }

    @Step("selectGrupaNormalizacji")
    public void selectGrupaNormalizacji() {
        Select dropDownType = new Select(selectGrupaNormalizacji);
        dropDownType.selectByValue("gr_id_norm_cc_2");
        logger.info("selectGrupaNormalizacji");
    }

    @Step("selectMethod")
    public void selectMethod() {
        Select dropDownType = new Select(selectMethod);
        dropDownType.selectByValue("BYE");
        logger.info("selectMethod");
    }

    @Step("selectWarunek")
    public void selectWarunek() {
        selectWarunek.click();
        logger.info("selectWarunek");
    }

    @Step("usunWarunek")
    public void usunWarunek() {
        usunWarunek.click();
        logger.info("usunWarunek");
    }

    @Step(" globalnyPoziomLogowania")
    public void globalnyPoziomLogowania() {
        Select dropDownType = new Select(globalnyPoziomLogowania);
        dropDownType.selectByValue("INFO");
        logger.info(" globalnyPoziomLogowania");
    }

    @Step("dodajReguleRoutingu")
    public void dodajReguleRoutingu() {
        dodajReguleRoutingu.click();
        logger.info("dodajReguleRoutingu");
    }

    @Step("dodajIdRoutingu")
    public void dodajIdRoutingu() {
        dodajIdRoutingu.sendKeys("321");

    }
    @Step("dodajIdRoutinguInvalid")
    public void dodajIdRoutinguInvalid() {
        dodajIdRoutingu.sendKeys("rt_id_cc_1");

    }

    @Step("dodajOpisRoutingu")
    public void dodajOpisRoutingu() {
        dodajOpisRoutingu.sendKeys("qwerty");
        logger.info("dodajOpisRoutingu");
    }

    @Step("dodajDpRoutingu")
    public void dodajDpRoutingu() {
        dodajDpRoutingu.click();
        logger.info("dodajDpRoutingu");
    }

    @Step("selectGrDenormalizacjiRoutingu")
    public void selectGrDenormalizacjiRoutingu() {
        Select dropDownType = new Select(selectGrDenormalizacjiRoutingu);
        dropDownType.selectByValue("gr_id_denorm_cc_1");
        logger.info("selectGrDenormalizacjiRoutingu");
    }


    @Step("dodajWpis")
    public void dodajWpisRoutingu() {
        dodajWpisRoutingu.click();
        logger.info("dodajWpis");
    }

    @Step("idWpisuRoutingu")
    public void idWpisuRoutingu() {
        idWpisuRoutingu.clear();
        idWpisuRoutingu.sendKeys("123_route_user@domena_route_rt_i");
        logger.info("idWpisuRoutingu");
    }



    @Step("wagaWpisuRoutingu")
    public void wagaWpisuRoutingu2() {
        wagaWpisuRoutingu2.clear();
        wagaWpisuRoutingu2.sendKeys("95");
        logger.info("wagaWpisuRoutingu");
    }

    @Step("wagaWpisuRoutingu")
    public void wagaWpisuRoutingu() {
        wagaWpisuRoutingu2.clear();
        wagaWpisuRoutingu2.sendKeys("100");

        logger.info("wagaWpisuRoutingu");
    }

    @Step("selectGrDenormalizacjiWpisuRoutingu")
    public void selectGrDenormalizacjiWpisuRoutingu() {
        Select dropDownType = new Select(selectGrDenormalizacjiWpisuRoutingu);
        dropDownType.selectByValue("gr_id_denorm_cc_1");
        logger.info("selectGrDenormalizacjiWpisuRoutingu");
    }

    @Step("usunWpisRoutinguFull")
    public void usunWpisRoutinguFull() {
        usunWpisRoutinguFull.click();
        logger.info("usunWpisRoutinguFull");
    }


    @Step("asercjaDodanieNowegoPolaczenia")
    public void asercjaDodanieNowegoPolaczenia() {
        String wpis = idWpisuRoutingu.getAttribute("ng-reflect-model");
        assertEquals(wpis, "123_route_user@domena_route_rt");
    }


    @Step("goToProfil")
    public void goToProfil() {
        profiles.click();
        logger.info("goToProfil");
    }

    @Step("dodajProfil")
    public void dodajProfil() {
        dodajProfil.click();
        logger.info("dodajProfil ");
    }


    @Step("dodajUslugeProfil")
    public void dodajUslugeProfil() {
        dodajUslugeProfil.click();
        logger.info("dodajUslugeProfil");
    }


    @Step("dodajNazwaUslugiProfil")
    public void dodajNazwaUslugiProfil() {
        dodajNazwaUslugiProfil.sendKeys("SMS");
        logger.info("dodajNazwaUslugiProfil");
    }

    @Step("dodajNazwaAdresuProfil")
    public void dodajNazwaAdresuProfil() {
        dodajNazwaAdresuProfil.sendKeys("127.01.98.0");
        logger.info("dodajNazwaAdresuProfil");
    }

    @Step("dodajWageAdresuProfil")
    public void dodajWageAdresuProfil() {
        dodajWageAdresuProfil.clear();
        dodajWageAdresuProfil.sendKeys("5");
        logger.info("dodajWageAdresuProfil");
    }

    @Step("zapiszProfil")
    public void zapiszProfil() {
        zapiszProfil.click();
        logger.info("zapiszProfil");
    }

    @Step("rozwinWszystkoDp")
    public void rozwinWszystkoDp() {
        rozwinWszystkoDp.click();
        logger.info("rozwinWszystkoDp");
    }
    @Step("dodajSerwerDp")
    public void dodajSerwerDp() {
        dodajSerwerDp.click();
        logger.info("dodajSerwerDp");
    }
    @Step("chooseTypDp")
    public void chooseTypDp() {
        Select dropDownType = new Select(TypDp);
        dropDownType.selectByValue("Real");
        logger.info("chooseTypDp");
    }
    @Step("dodajNazwaDp")
    public void dodajNazwaDp() {
        NazwaDp.sendKeys("Test nazwy Dp");
        logger.info("dodajNazwaDp");
    }

    @Step("dodajOpisDp")
    public void dodajOpisDp() {
        OpisDp.sendKeys("Test opisu Dp");
        logger.info("dodajOpisDp");
    }

    @Step("dodajWageDp")
    public void dodajWageDp() {
        WagaDp.clear();
        WagaDp.sendKeys("100");
        logger.info("dodajWageDp");
    }


    @Step("dodajWageIncorrencDp")
    public void dodajWageIncorrencDp() {
        WagaDp.clear();
        WagaDp.sendKeys("111");
        logger.info("dodajWageIncorrencDp");
    }

    @Step("dodajNowePolaczenieDp")
    public void dodajNowePolaczenieDp() {
        dodajNowePolaczenieDp.click();
        logger.info("dodajNowePolaczenieDp");
    }

    @Step("DodajWageDrugiegoPolaczeniaDp")
    public void DodajWageDrugiegoPolaczeniaDp() {
        WagaDp.clear();
        WagaDp.sendKeys("50");
        logger.info("DodajWageDrugiegoPolaczeniaDp");
    }

    @Step("usunPierwszePolaczenieZListy")
    public void usunPierwszePolaczenieZListy() {
        usunDrugiePolaczenieZListy.click();
        logger.info("usunPierwszePolaczenieZListy");
    }
    @Step("zapiszKonfiguracjeDp")
    public void zapiszKonfiguracjeDp() {
        zapiszKonfiguracjeDp.click();
        logger.info("zapiszKonfiguracjeDp");
    }

    @Step("submitError")
    public void submitError() {
        submitError.click();
        logger.info("submitError");
    }
    @Step("DeleteSerwerRout")
    public void DeleteSerwerRout() {
        deleteSerwerRout.click();
        logger.info("DeleteSerwerRout");
    }
    @Step("setWeightLbIncorrect")
    public void setWeightLbIncorrect () {
        weightLb.sendKeys("110");
        logger.info("setWeightLbIncorrect");
    }
    @Step("setWeightLbCorrect")
    public void setWeightLbCorrect() {
        weightLb.clear();
        weightLb.sendKeys("40");
        logger.info("setWeightLbCorrect");
    }

    @Step("clearIdDp")
    public void clearIdDp() {
        clearIdDp.clear();
        logger.info("clearIdDp");
    }

    @Step("setNotUniqueIdDp")
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

    }

    @Step("setSaveButtonDp")
    public void setSaveButtonDp() {
        saveButtonDp.click();
        logger.info("setSaveButtonDp");
    }

    @Step("clickOnRozwinProfile")
    public void clickOnRozwinProfile() {
        rozwinProfile.click();
        logger.info("clickOnRozwinProfile");
    }
    @Step("clickOnEdytujProfil")
    public void clickOnEdytujProfil() {
        edytujProfil.click();
        logger.info("clickOnEdytujProfil");
    }
    @Step("edytujIdProfil")
    public void edytujIdProfil() {
        editProfileId.clear();
        editProfileId.sendKeys("3");
        logger.info("edytujIdProfil");
    }
    @Step("edytujNameProfil")
    public void edytujNameProfil() {
        editProfileName.clear();
        editProfileName.sendKeys("3 numer profilu");
        logger.info("edytujNameProfil");
    }
    @Step("saveEdycjaProfil")
    public void saveEdycjaProfil() {
        saveEdycjaProfil.click();
        logger.info("saveEdycjaProfil");
    }

    @Step("dropDownProfil")
    public void dropDownProfil() {

        Select normalizacjaDropDown = new Select(chooseProfil);
        normalizacjaDropDown.selectByValue("3");
        logger.info("dropDownProfil");
    }
    @Step("deleteProfile")
    public void deleteProfile() {
        deleteProfil.click();
        logger.info("deleteProfile");
    }
    @Step("submitSaveProfil")
    public void submitSaveProfil() {
        submitSaveProfil.click();
        logger.info("submitSaveProfil");
    }

}


