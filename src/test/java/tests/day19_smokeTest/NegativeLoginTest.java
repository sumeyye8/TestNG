package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {

        BrcPage brcPage=new BrcPage();

        @Test
        public void yanlisSifre() throws InterruptedException {
                // Bir test method olustur  positiveLoginTest()

                // https://www.bluerentalcars.com/ adresine git
                Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

                // login butonuna bas
                brcPage.ilkLoginbutonu.click();

                // test data user email: customer@blurentalcars
                brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));


                // test data password : 54321
                brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));

                // login butonuna tiklayin
                brcPage.ikinciLoginButonu.click();

                // Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et

                Assert.assertTrue(brcPage.ikinciLoginButonu.isDisplayed());

                Driver.closeDriver();

        }


        }
