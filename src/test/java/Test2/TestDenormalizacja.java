package Test2;

import PageObjects.LoginPage;
import io.qameta.allure.Description;
import org.openqa.selenium.Alert;

public class TestDenormalizacja  extends TestBase {


        @org.testng.annotations.Test
        @Description("two tests are carried out as part of the test, the first sends an email, the second checks whether it has been delivered")

        public void asUserShouldBeAbleToLoggin() {
            LoginPage page = new LoginPage(driver);

            page.sendLogin();
            page.sendPassword();
            page.goSubmit();
            page.konfiguracjaSp();
            page.Denormalizacja();
            page.clickDodajGrupe();
            page.selectTablicaDe();
            page.dodajreguleDe();
            page.selectTypeDe();
            page.dodajInput2();
            page.dodajOutput3();
            page.dodajOpisDe();
            page.saveGrupe();
            Alert alert = driver.switchTo().alert();
            String info = alert.getText();
            System.out.println(info);
            alert.accept();

            page.konfiguracjaSp();
            page.Denormalizacja();
            page.selectTablicaDe();
            page.dodajWpis();
            page.selectTypeDe2();
            page.dodajInput();
            page.dodajOutputDe2();
            page.dodajOpisDe2();
            page.saveGrupe();
            String info2 = alert.getText();
            System.out.println(info2);
            alert.accept();

            page.konfiguracjaSp();
            page.Denormalizacja();
            page.selectTablicaDe();
            page.edytujGrupeDe();
            page.edytujID();
            page.edytujOpis();
            page.saveEdycjaGrupy();
            page.checkChangeEditGroupDe();
            page.saveGrupe();
            String info3 = alert.getText();
            System.out.println(info3);
            alert.accept();

            page.konfiguracjaSp();
            page.Denormalizacja();
            page.selectTablicaDe();
            page.deleteGroup();
            page.saveGrupe();
            String info4= alert.getText();
            System.out.println(info4);
            alert.accept();
        }
}
