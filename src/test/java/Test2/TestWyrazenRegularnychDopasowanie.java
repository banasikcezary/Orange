package Test2;

import PageObjects.LoginPage;
import io.qameta.allure.Description;

public class TestWyrazenRegularnychDopasowanie extends TestBase {


    @org.testng.annotations.Test
    @Description("two tests are carried out as part of the test, the first sends an email, the second checks whether it has been delivered")

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
