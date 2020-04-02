package Test2;

import PageObjects.LoginPage;
import Test2.TestBase;
import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;

import static org.testng.Assert.assertEquals;

public class TestKonfiguracjaLB extends TestBase {


    @org.testng.annotations.Test
    @Description("Przetestowanie funkcjonalnosci dla Konfiguracji LB")

    public void asUserShouldBeAbleToLoggin() {
        LoginPage page = new LoginPage(driver);

        page.sendLogin();
        page.sendPassword();
        page.goSubmit();
        page.tabLB();
        page.stanZaladowanejKonfiguracji();
        page.zmienAdresMaszynySip();
        page.setWeightLbIncorrect();

            try {
                WebDriverWait wait = new WebDriverWait(driver, 5);
                wait.until(ExpectedConditions.alertIsPresent());
                Alert alert = driver.switchTo().alert();
                String info = alert.getText();
                System.out.println(info);
                assertEquals(info,"Suma wag nie może przekraczać 100, maksymalna wartość to 80");
                alert.accept();
            } catch (Exception e) {
            }

               page.setWeightLbCorrect();
        page.zmienPoziomLogowaniaModulu();

        page.zapisanieLoadBalancera();

    }
}
