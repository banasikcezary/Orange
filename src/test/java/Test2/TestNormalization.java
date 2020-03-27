package Test2;

import PageObjects.LoginPage;
import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

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
            page.dodajRegule();
           page.saveGrupe();
            assertEquals(page.checkerrorNorm(),"Puste id Routingu dla grupy normalizacji id: "+page.ostatniElementDropDown());

          page.submitError();

            page.dropDownRouting();
            page.saveGrupe();

             assertEquals(page.checkerrorNorm(),"Puste pole Input w grupie normalizacji o id: "+page.ostatniElementDropDown());
            page.submitError();

            page.selectType();
            page.dodajInput2();
            page.saveGrupe();
            assertEquals(page.checkerrorNorm(),"Puste pole Output w grupie normalizacji o id: "+page.ostatniElementDropDown());
            page.submitError();

            page.dodajOutput2();
            page.dodajopis();
            page.saveGrupe();
            assertEquals(page.checkerrorNormSave(),"Konfiguracja została zapisana");
            page.submitError();


            page.Normalizacja();
            page.selectGrupa();
            page.dodajWpis();
            page.selectType();
            page.dodajInput();
            page.dodajOutput();
            page.dodajopis2();
            page.saveGrupe();
            assertEquals(page.checkerrorNormSave(),"Konfiguracja została zapisana");
            page.submitError();

            page.Normalizacja();
            page.selectGrupa();
            page.edytujGrupe();
            page.edytujID();
            page.edytujOpis();
            page.saveEdycjaGrupy2();
            page.checkChangeEditGroup();
            page.saveGrupe();
            assertEquals(page.checkerrorNormSave(),"Konfiguracja została zapisana");
            page.submitError();


            page.konfiguracjaSp();
            page.Normalizacja();
            page.selectGrupa();
            page.deleteGroup();
            page.saveGrupe();
            assertEquals(page.checkerrorNormSave(),"Konfiguracja została zapisana");
            page.submitError();


        }
    }
