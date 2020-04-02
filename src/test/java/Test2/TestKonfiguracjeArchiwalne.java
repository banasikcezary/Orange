package Test2;

import PageObjects.LoginPage;
import io.qameta.allure.Description;

public class TestKonfiguracjeArchiwalne extends TestBase {

    @org.testng.annotations.Test
    @Description("Przetestowanie funkcjonalnosci dla Konfiguracji archiwalnych")

    public void asUserShouldBeAbleToLoggin() {
        LoginPage page = new LoginPage(driver);

        page.sendLogin();
        page.sendPassword();
        page.goSubmit();
        page.clickToKonfiguracjeArchiwalne();
        page.loadToKonfiguracjeArchiwalne();
        page.checkKonfiguracjeArchiwalne();

    }
}
