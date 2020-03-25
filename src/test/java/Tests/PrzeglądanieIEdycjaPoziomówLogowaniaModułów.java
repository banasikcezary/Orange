package Tests;

import PageObjects.LoginPage;
import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class PrzeglądanieIEdycjaPoziomówLogowaniaModułów extends TestBase {

    @Test
    @Description("two tests are carried out as part of the test, the first sends an email, the second checks whether it has been delivered")

    public void asUserShouldBeAbleToLoggin() {
        LoginPage page = new LoginPage(driver);

        page.sendLogin();
        page.sendPassword();
        page.goSubmit();
        page.konfiguracjaSp();
        page.Logowanie();
        page.globalnyPoziomLogowania();
        page.saveGrupe();

        driver.switchTo().alert().accept();
    }
}
