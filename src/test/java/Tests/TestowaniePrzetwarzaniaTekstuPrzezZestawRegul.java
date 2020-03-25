package Tests;

import PageObjects.LoginPage;
import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestowaniePrzetwarzaniaTekstuPrzezZestawRegul extends TestBase {







    @org.testng.annotations.Test
    @Description("two tests are carried out as part of the test, the first sends an email, the second checks whether it has been delivered")

    public void asUserShouldBeAbleToLoggin() {
        LoginPage page = new LoginPage(driver);

        page.sendLogin();
        page.sendPassword();
        page.goSubmit();
        page.clickOnTabTestWyrazenRegularnych();
        page.clickOnTabReguly();
        page.sendtekstwejsciowy2();
        page.sendpoleprotokolu2();
        page.wyrazeniaregularne2();
        page.sendzamiennik();
        page.clickOnDodajButton();
//////////////////////////////////////////////////
    }
}
