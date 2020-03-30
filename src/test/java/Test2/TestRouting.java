package Test2;

import PageObjects.LoginPage;
import io.qameta.allure.Description;
import org.openqa.selenium.Alert;

import static org.testng.Assert.assertEquals;

public class TestRouting extends TestBase {


        @org.testng.annotations.Test
        @Description("two tests are carried out as part of the test, the first sends an email, the second checks whether it has been delivered")

        public void asUserShouldBeAbleToLoggin() {
            LoginPage page = new LoginPage(driver);

            page.sendLogin();
            page.sendPassword();
            page.goSubmit();
            page.konfiguracjaSp();
            page.Routing();
            page.clickOnRozwinWszystko();
            page.dodajReguleRoutingu();
            page.saveGrupe();

            assertEquals(page.checkerrorNorm(),"Puste id reguły routingu");
            page.submitError();


            page.dodajIdRoutinguInvalid();
            page.saveGrupe();
            Alert alert = driver.switchTo().alert();
            String info = alert.getText();


            assertEquals(info,"Id powinno być unikalne");
            alert.accept();



            page.dodajIdRoutingu();
            page.saveGrupe();
            assertEquals(page.checkerrorNorm(),"Puste pole grupy denormalizacji w połączeniu w regule routingu o id: 321");
            page.submitError();

            page.selectGrDenormalizacjiWpisuRoutingu();
            page.dodajOpisRoutingu();
            page.dodajDpRoutingu();
            page.selectGrDenormalizacjiRoutingu();
            page.dodajWpisRoutingu();
            page.usunWpisRoutinguFull();
            page.idWpisuRoutingu();
            page.wagaWpisuRoutingu2();

            page.saveGrupe();
            assertEquals(page.checkerrorNorm(),"Suma wag w routingu o id: 321 jest różna od 100");
            page.submitError();


            page.wagaWpisuRoutingu();
            page.saveGrupe();
            assertEquals(page.checkerrorNormSave(),"Konfiguracja została zapisana");
            page.submitError();


            page.konfiguracjaSp();
            page.Routing();
            page.clickOnRozwinWszystko();
            page.asercjaDodanieNowegoPolaczenia();

            page.DeleteSerwerRout();
            page.saveGrupe();
            page.submitError();





        // for (int i = 0; i < 4; i++) {
        // page.usunReguleRoutingu();
        // }
        //  page.buttonDodajServeruRoutingu();
//        page.saveGrupe();
//        Alert alert = driver.switchTo().alert();
//        String info = alert.getText();
//        System.out.println(info);
//        alert.accept();









        }

    }




