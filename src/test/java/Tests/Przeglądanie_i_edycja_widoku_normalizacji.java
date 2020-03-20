package Tests;

import PageObjects.LoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

public class Przeglądanie_i_edycja_widoku_normalizacji extends TestBase {







    @org.testng.annotations.Test
    @Description("two tests are carried out as part of the test, the first sends an email, the second checks whether it has been delivered")

    public void asUserShouldBeAbleToLoggin() {
        LoginPage page = new LoginPage(driver);

        page.sendLogin();
        page.sendPassword();
        page.goSubmit();
        page.konfiguracjaSp();
        page.Normalizacja();
        page.clickDodajGrupe();
        page.selectGrupa();
        page.dropDownRouting();
        page.dodajRegule();
        page.selectType();
        page.dodajopis();
        page.saveGrupe();
        Alert alert = driver.switchTo().alert();

        alert.accept();
        page.konfiguracjaSp();
        page.Normalizacja();
        page.selectGrupa();
page.edytujGrupe();
page.edytujID();
page.edytujOpis();
page.saveEdycjaGrupy();
page.checkChangeEditGroup();
        page.saveGrupe();
        alert.accept();

        page.konfiguracjaSp();
        page.Normalizacja();
        page.selectGrupa();
        page.deleteGroup();
        page.saveGrupe();
        alert.accept();











    }
}
