package Tests;

import PageObjects.LoginPage;
import io.qameta.allure.Description;
import org.openqa.selenium.Alert;

public class usunięcieWpisuZTabeliNormalizacji extends TestBase {


    @org.testng.annotations.Test
    @Description("two tests are carried out as part of the test, the first sends an email, the second checks whether it has been delivered")

    public void asUserShouldBeAbleToLoggin() {
        LoginPage page = new LoginPage(driver);

        page.sendLogin();
        page.sendPassword();
        page.goSubmit();
        page.konfiguracjaSp();
        page.Normalizacja();
        page.selectGrupa();
        page.usunWpis();
        page.saveGrupe();
        Alert alert = driver.switchTo().alert();

        alert.accept();

    }
}
