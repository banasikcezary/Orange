package Test2;

import PageObjects.LoginPage;
import io.qameta.allure.Description;

public class Profile extends TestBase {


    @org.testng.annotations.Test
    @Description("two tests are carried out as part of the test, the first sends an email, the second checks whether it has been delivered")

    public void asUserShouldBeAbleToLoggin() {
        LoginPage page = new LoginPage(driver);

        page.sendLogin();
        page.sendPassword();
        page.goSubmit();

        page.goToProfil();
        page.dodajProfil();
        page.dodajIdProfil();
        page.dodajOpisProfil();
        page.clickOnProfil();
        page.dodajUslugeProfil();
        page.clickOnRozwinUslugi();
        page.dodajNazwaUslugiProfil();
        page.clickOnProfil();
        page.dodajAdresProfil();
        page.clickOnRozwinAdresy();
        page.dodajNazwaAdresuProfil();
        page.dodajWageAdresuProfil();
        page.zapiszProfil();
        page.clickOnProfil();
        page.usunProfil();


    }
}
