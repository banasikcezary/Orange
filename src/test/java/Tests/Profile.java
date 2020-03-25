package Tests;

import PageObjects.LoginPage;
import io.qameta.allure.Description;
import org.openqa.selenium.Alert;

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
        page.dodajUslugeProfil();
        page.dodajAdresProfil();
        page.usunProfil();
        page.dodajNazwaUslugiProfil();
        page.dodajNazwaAdresuProfil();
        page.dodajWageAdresuProfil();
        page.zapiszProfil();

    }
}
