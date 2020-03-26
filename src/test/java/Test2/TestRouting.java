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
            page.dodajIdRoutingu();
            page.dodajOpisRoutingu();
            page.dodajDpRoutingu();
            page.selectGrDenormalizacjiRoutingu();

            page.dodajWpisRoutingu();
            page.usunWpisRoutinguFull();
            page.idWpisuRoutingu();
            page.wagaWpisuRoutingu2();
            page.selectGrDenormalizacjiWpisuRoutingu();

            page.saveGrupe();
            Alert alert = driver.switchTo().alert();
            String info = alert.getText();
            System.out.println(info);
            alert.accept();

             assertEquals(info,"Przy zapisie konfiguracji napotkano następujące błędy:\nSuma wag jest różna od 100 w routingu o id: 321\n");


            page.wagaWpisuRoutingu();
            page.saveGrupe();
            String info2 = alert.getText();
            System.out.println(info2);
            alert.accept();

            page.konfiguracjaSp();
            page.Routing();
            page.clickOnRozwinWszystko();
            page.asercjaDodanieNowegoPolaczenia();

           // page.usunSerwer();
            page.saveGrupe();
            alert.accept();





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




