package Test2;


import PageObjects.LoginPage;
import io.qameta.allure.Description;
import org.openqa.selenium.Alert;

import static org.testng.Assert.assertEquals;

public class TestPreconditions extends TestBase {


    @org.testng.annotations.Test
    @Description("Przetestowanie funkcjonalnosci dla Preconditions")

    public void asUserShouldBeAbleToLoggin() {

        LoginPage page = new LoginPage(driver);

        page.sendLogin();
        page.sendPassword();
        page.goSubmit();
        page.konfiguracjaSp();
        page.Preconditions();

        page.DodajWarunek();
        page.saveGrupe();

        assertEquals(page.checkerrorNorm(), "Puste pole methods w w warunkach wstępnych");
        page.submitError();

        page.selectMethod();
        page.saveGrupe();

        assertEquals(page.checkerrorNorm(), "Puste pole grupy normalizacji w warunkach wstępnych");
        page.submitError();

        page.selectGrupaNormalizacji();
        page.saveGrupe();
        assertEquals(page.checkerrorNormSave(),"Konfiguracja została zapisana");
        page.submitError();

        page.konfiguracjaSp();
        page.Preconditions();

        page.selectWarunek();
        page.usunWarunek();
        page.saveGrupe();
        assertEquals(page.checkerrorNormSave(),"Konfiguracja została zapisana");
        page.submitError();

    }
}
