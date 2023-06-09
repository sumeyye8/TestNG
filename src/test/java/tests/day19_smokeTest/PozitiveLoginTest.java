package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PozitiveLoginTest {
    BrcPage brcPage=new BrcPage();

    @Test
    public void test01() {

        // Bir test method olustur  positiveLoginTest()

        // https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

        // login butonuna bas
        brcPage.ilkLoginbutonu.click();

        // test data user email: customer@blurentalcars
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));


        // test data password : 12345
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));

        // login butonuna tiklayin
        brcPage.ikinciLoginButonu.click();

        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

      /*  String actualUsername= brcPage.kullaniciProfilIsmi.getText();
        String expectedUsername= ConfigReader.getProperty("brcValidUsername");
        Assert.assertEquals(actualUsername,expectedUsername);


       */


        Driver.closeDriver();
    }
}
