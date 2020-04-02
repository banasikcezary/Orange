package Test2;

import PageObjects.LoginPage;
import Test2.TestBase;
import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestSPLogowanie extends TestBase {

    @Test
    @Description("Przetestowanie funkcjonalnosci dla SP logowanie")

    public void asUserShouldBeAbleToLoggin() {
        LoginPage page = new LoginPage(driver);

        page.sendLogin();
        page.sendPassword();
        page.goSubmit();
        page.konfiguracjaSp();
        page.Logowanie();
        page.globalnyPoziomLogowania();
        page.saveGrupe();
        assertEquals(page.checkerrorNormSave(),"Konfiguracja została zapisana");
        page.submitError();
    }
}
