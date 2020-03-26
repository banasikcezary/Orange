package Test2;

import PageObjects.LoginPage;
import Test2.TestBase;
import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class TestSPLogowanie extends TestBase {

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

        Alert alert = driver.switchTo().alert();
        String info = alert.getText();
        System.out.println(info);
        alert.accept();
    }
}
