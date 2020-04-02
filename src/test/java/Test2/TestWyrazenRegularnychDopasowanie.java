package Test2;

import PageObjects.LoginPage;
import io.qameta.allure.Description;

public class TestWyrazenRegularnychDopasowanie extends TestBase {


    @org.testng.annotations.Test
    @Description("Przetestowanie funkcjonalnosci dla wyrazen regularnych")

    public void asUserShouldBeAbleToLoggin() {
        LoginPage page = new LoginPage(driver);

        page.sendLogin();
        page.sendPassword();
        page.goSubmit();
        page.clickOnTabTestWyrazenRegularnych();
        page.clickOnTabDopasowanie();
        page.sendTekstWejsciowy2();
        page.sendwyrazenieregularne();
        page.clickonbuttwynikdopasowania();
        page.checkwynikdopasowania();

    }
}
