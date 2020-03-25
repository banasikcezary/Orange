package Tests;

import PageObjects.LoginPage;
import io.qameta.allure.Description;
import org.openqa.selenium.Alert;

public class DodanieNowejRegulyDoTabeliRoutingu extends TestBase {


    @org.testng.annotations.Test
    @Description("two tests are carried out as part of the test, the first sends an email, the second checks whether it has been delivered")

    public void asUserShouldBeAbleToLoggin() {
        LoginPage page = new LoginPage(driver);

        page.sendLogin();
        page.sendPassword();
        page.goSubmit();
        page.konfiguracjaSp();
        page.Routing();
        page.clickOnRozwinWszystko();
        page.dodajReguleRoutingu();
        page.dodajWpisRoutingu();

        page.dodajIdRoutingu();


        page.dodajOpisRoutingu();
        page.dodajDpRoutingu();
        page.selectGrDenormalizacjiRoutingu();
        page.selectGrDenormalizacjiWpisuRoutingu();


        try
        {
            Thread.sleep(200000);
        }
        catch(InterruptedException e)
        {
            // this part is executed when an exception (in this example InterruptedException) occurs
        }
        // for (int i = 0; i < 4; i++) {
        // page.usunReguleRoutingu();
        // }
        //  page.buttonDodajServeruRoutingu();
        page.saveGrupe();
        Alert alert = driver.switchTo().alert();
        String info = alert.getText();
        System.out.println(info);
        alert.accept();

    }

}
