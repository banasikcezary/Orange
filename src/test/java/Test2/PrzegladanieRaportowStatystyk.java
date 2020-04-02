package Test2;

import PageObjects.LoginPage;
import io.qameta.allure.Description;

public class PrzegladanieRaportowStatystyk extends TestBase {


    @org.testng.annotations.Test
    @Description("Przetestowanie funkcjonalnosci dla Przegladania raportow statystyk")

    public void asUserShouldBeAbleToLoggin() {
        LoginPage page = new LoginPage(driver);

        page.sendLogin();
        page.sendPassword();
        page.goSubmit();
        page.clickOnTabStatystyki();

    }

}
