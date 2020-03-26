package Test2;


import PageObjects.LoginPage;
import io.qameta.allure.Description;
import org.openqa.selenium.Alert;

import static org.testng.Assert.assertEquals;

public class TestPreconditions extends TestBase {


    @org.testng.annotations.Test
    @Description("two tests are carried out as part of the test, the first sends an email, the second checks whether it has been delivered")

    public void asUserShouldBeAbleToLoggin() {
        final String ALERT_BLAD_WARUNEK_WSTEPNY = "Przy zapisie konfiguracji napotkano następujące błędy:\n" + "Puste pole methods w w warunkach wstępnych\n";

        LoginPage page = new LoginPage(driver);

        page.sendLogin();
        page.sendPassword();
        page.goSubmit();
        page.konfiguracjaSp();
        page.Preconditions();

        page.DodajWarunek();
        page.saveGrupe();
        Alert alert = driver.switchTo().alert();
        String info1 = alert.getText();
        System.out.println(info1);
        assertEquals(info1, ALERT_BLAD_WARUNEK_WSTEPNY);
        alert.accept();

        page.selectMethod();
        page.saveGrupe();
        String info2 = alert.getText();
        System.out.println(info2);
        assertEquals(info2, "Przy zapisie konfiguracji napotkano następujące błędy:\n" +
                "Puste pole grupy normalizacji w warunkach wstępnych\n");
        alert.accept();

        page.selectGrupaNormalizacji();
        page.saveGrupe();
        alert.accept();

        page.konfiguracjaSp();
        page.Preconditions();

        page.selectWarunek();
        page.usunWarunek();
        page.saveGrupe();
        alert.accept();


    }
}
