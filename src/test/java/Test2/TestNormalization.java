package Test2;

import PageObjects.LoginPage;
import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class TestNormalization  extends TestBase {


        @Test
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
page.dodajInput2();
page.dodajOutput2();
            page.dodajopis();
            page.saveGrupe();
            Alert alert = driver.switchTo().alert();
            String info = alert.getText();
            System.out.println(info);
            alert.accept();

            page.Normalizacja();
            page.selectGrupa();
            page.dodajWpis();
            page.selectType();
            page.dodajInput();
            page.dodajOutput();
            page.dodajopis2();
            page.saveGrupe();
            String info2 = alert.getText();
            System.out.println(info2);
            alert.accept();

            page.Normalizacja();
            page.selectGrupa();
            page.edytujGrupe();
            page.edytujID();
            page.edytujOpis();
            page.saveEdycjaGrupy2();
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
