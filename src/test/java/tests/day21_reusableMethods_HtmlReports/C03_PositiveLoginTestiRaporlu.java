package tests.day21_reusableMethods_HtmlReports;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C03_PositiveLoginTestiRaporlu extends TestBaseRapor {


    BrcPage brcPage = new BrcPage();

    @Test
    public void test01() {

        extentTest=extentReports.createTest("Pozitif Login","Gecerli username ve sifre ile giris yapabilmeli");

        // Bir test method olustur  positiveLoginTest()

        // https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Brc anasayfaya gidildi");
        // login butonuna bas
        brcPage.ilkLoginbutonu.click();
        extentTest.info("Login butonuna tiklandi");
        // test data user email: customer@blurentalcars
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        extentTest.info("Gecerli email yazildi");

        // test data password : 12345
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        extentTest.info("Gecerli password yazildi");
        // login bu tonuna tiklayin
        brcPage.ikinciLoginButonu.click();
        extentTest.info("Gecerli login butonuna basildi");
        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

       /* String actualUsername= brcPage.kullaniciProfilIsmi.getText();
        String expectedUsername= ConfigReader.getProperty("brcValidUsername");
        Assert.assertEquals(actualUsername,expectedUsername);
        extentTest.info("Kullanici basarili sekilde girs yapti");
        */


        Driver.closeDriver();
    }
}
