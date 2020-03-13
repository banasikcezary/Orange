package Tests;

import PageObjects.LoginPage;
import io.qameta.allure.Description;

public class Dodanie_nowej_reguły_do_tabeli_routingu extends TestBase {







    @org.testng.annotations.Test
    @Description("two tests are carried out as part of the test, the first sends an email, the second checks whether it has been delivered")

    public void asUserShouldBeAbleToLoggin() {
        LoginPage page = new LoginPage(driver);

        page.sendLogin();
        page.sendPassword();
        page.goSubmit();
        page.konfiguracjaSp();
        page.Routing();


    }

}
