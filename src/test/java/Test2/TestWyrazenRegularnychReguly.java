package Test2;

import PageObjects.LoginPage;
import io.qameta.allure.Description;

public class TestWyrazenRegularnychReguly extends TestBase {


    @org.testng.annotations.Test
    @Description("Przetestowanie funkcjonalnosci dla wyrazen regularnych")

    public void asUserShouldBeAbleToLoggin() {
        LoginPage page = new LoginPage(driver);

        page.sendLogin();
        page.sendPassword();
        page.goSubmit();
        page.clickOnTabTestWyrazenRegularnych();
        page.clickOnTabReguly();
        page.sendTekstWejsciowy();
        page.sendpoleprotokolu2();
        page.wyrazeniaregularne2();
        page.sendzamiennik();
        page.clickOnDodajButton();

    }
}
