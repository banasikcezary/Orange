package Tests;

import PageObjects.LoginPage;
import io.qameta.allure.Description;

public class Usunięcie_reguły_z_tabeli_routingu extends TestBase {


    @org.testng.annotations.Test
    @Description("two tests are carried out as part of the test, the first sends an email, the second checks whether it has been delivered")

    public void asUserShouldBeAbleToLoggin() {
        LoginPage page = new LoginPage(driver);

        page.sendLogin();
        page.sendPassword();
        page.goSubmit();
        page.konfiguracjaSp();
        page.Routing();
        for (int i = 0; i < 3; i++) {
            page.usunReguleRoutingu();
        }
        page.buttonDodajServeruRoutingu();


    }

}
