package tests.day18_pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigReaderKullanimi {
    FacebookPage facebookPage=new FacebookPage();
    @Test
    public void test01() {


        // facebook anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

        // kullanici mail kutusuna yanlis kullanici ismi yazdirin
        facebookPage.mailKutusu.sendKeys(ConfigReader.getProperty("fbWrongUsername"));

        // kullanici sifre kutusuna yanlis bir password yazdirin
        facebookPage.sifreKutusu.sendKeys(ConfigReader.getProperty("fbWrongPassword"));

        // login butonuna basin
       facebookPage.loginTusu.click();

        // giris yapilmadigini test edin
        Assert.assertTrue(facebookPage.girilmediYaziElementi.isDisplayed());

        // sayfayi kapatin
        Driver.closeDriver();
    }
}