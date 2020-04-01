package Test2;

import PageObjects.LoginPage;
import io.qameta.allure.Description;
import org.openqa.selenium.Alert;


import static org.testng.Assert.assertEquals;

public class TestKonfiguracjeDP extends TestBase {


    @org.testng.annotations.Test
    @Description("two tests are carried out as part of the test, the first sends an email, the second checks whether it has been delivered")

    public void asUserShouldBeAbleToLoggin() {
        LoginPage page = new LoginPage(driver);

        page.sendLogin();
        page.sendPassword();
        page.goSubmit();
        page.konfiguracjaDP();
        page.rozwinWszystkoDp();
        page.dodajSerwerDp();
        page.clearIdDp();

        Alert alert = driver.switchTo().alert();
        String info = alert.getText();
        System.out.println(info);
        assertEquals(info, "Id nie może być puste");
        alert.accept();

         page.setNotUniqueIdDp();
//W metodzie asercja unikalnego id

        page.chooseTypDp();
        page.dodajNazwaDp();
        page.dodajOpisDp();
        page.dodajWageIncorrencDp();
        alert.accept();
        page.dodajWageDp();
        page.dodajNowePolaczenieDp();
        page.DodajWageDrugiegoPolaczeniaDp();

         page.zapiszKonfiguracjeDp();
        assertEquals(page.checkerrorNorm(),"Suma wag w routingu o id: dp_routing_cc1 jest różna od 100");
        page.setSaveButtonDp();

        page.dodajWageDp();
        page.usunPierwszePolaczenieZListy();
        page.zapiszKonfiguracjeDp();

    }

}
