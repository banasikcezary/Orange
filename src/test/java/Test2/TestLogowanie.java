package Test2;

import PageObjects.LoginPage;
import io.qameta.allure.Description;


public class TestLogowanie extends TestBase {


    @org.testng.annotations.Test
    @Description("Przetestowanie funkcjonalnosci dla Logowania")

    public void asUserShouldBeAbleToLoggin() {
        LoginPage page = new LoginPage(driver);

        page.sendLogin();
        page.sendPassword();
        page.goSubmit();
        page.assertion();


    }

}
