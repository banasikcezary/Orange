package Test2;

import PageObjects.LoginPage;
import io.qameta.allure.Description;
import org.openqa.selenium.Alert;

import static org.testng.Assert.assertEquals;

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
            page.saveGrupe();
            assertEquals(page.checkerrorNorm(),"Puste pole type w grupie denormalizacji o id:"+page.ostatniElementDropDownDenormalizacja());
            page.submitError();

            page.selectTypeDe();
            page.saveGrupe();
            assertEquals(page.checkerrorNorm(),"Puste pole Input w grupie denormalizacji o id: "+page.ostatniElementDropDownDenormalizacja());
            page.submitError();

            page.dodajInput2();
            page.saveGrupe();
            assertEquals(page.checkerrorNorm(),"Puste pole Output w grupie denormalizacji o id: "+page.ostatniElementDropDownDenormalizacja());
            page.submitError();

            page.dodajOutput3();
            page.dodajOpisDe();

            page.saveGrupe();
            assertEquals(page.checkerrorNormSave(),"Konfiguracja została zapisana");
            page.submitError();

            page.konfiguracjaSp();
            page.Denormalizacja();
            page.selectTablicaDe();
            page.dodajWpis();
            page.selectTypeDe2();
            page.dodajInput();
            page.dodajOutputDe2();
            page.dodajOpisDe2();
            page.saveGrupe();
            assertEquals(page.checkerrorNormSave(),"Konfiguracja została zapisana");
            page.submitError();

            page.konfiguracjaSp();
            page.Denormalizacja();
            page.selectTablicaDe();
            page.edytujGrupeDe();
            page.edytujID();
            page.edytujOpis();
            page.saveEdycjaGrupy();
            page.checkChangeEditGroupDe();
            page.saveGrupe();
            assertEquals(page.checkerrorNormSave(),"Konfiguracja została zapisana");
            page.submitError();

            page.konfiguracjaSp();
            page.Denormalizacja();
            page.selectTablicaDe();
            page.deleteGroup();
            page.saveGrupe();
            assertEquals(page.checkerrorNormSave(),"Konfiguracja została zapisana");
            page.submitError();
        }
}
