package Test2;

import PageObjects.LoginPage;
import io.qameta.allure.Description;

public class Profile extends TestBase {


    @org.testng.annotations.Test
    @Description("Przetestowanie funkcjonalnosci dla Profili")

    public void asUserShouldBeAbleToLoggin() {
        LoginPage page = new LoginPage(driver);

        page.sendLogin();
        page.sendPassword();
        page.goSubmit();

        page.goToProfil();
        page.dodajProfil();
        page.dodajUslugeProfil();
        page.dodajNazwaUslugiProfil();
        page.clickOnRozwinProfile();

        page.dodajNazwaAdresuProfil();
        page.dodajWageAdresuProfil();
        page.clickOnEdytujProfil();
        page.edytujIdProfil();
        page.edytujNameProfil();
        page.saveEdycjaProfil();
        page.zapiszProfil();
        page.submitSaveProfil();

        page.goToProfil();
        page.dropDownProfil();
        page.deleteProfile();
        page.zapiszProfil();





    }
}
