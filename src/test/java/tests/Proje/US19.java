package tests.Proje;

public class US19 {


    /*

        package tests.sumeyye.US_19;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PearlyMarketPageSumeyye;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;


public class Us_19_TestCase_19_001 extends TestBaseRapor {

    PearlyMarketPageSumeyye pearlyMarketPageSumeyye = new PearlyMarketPageSumeyye();

    @Test

    public void test01() {

        extentTest = extentReports.createTest("Pozitif Login", "Gecerli email ve password ile giris yapilmali");


        // Vendor Url'e sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("projeUrl"));

        // Vendor sign in butonuna tıklar
        pearlyMarketPageSumeyye.ilkSignInButton.click();
        extentTest.info("İlk sign in butonuna tiklandi");

        // Vendor bir email girer   : projee.009@gmail.com

        pearlyMarketPageSumeyye.emailBox.sendKeys(ConfigReader.getProperty("vendorEmail"));
        extentTest.info("Gecerli email girildi");

        // Vendor bir password girer  : qa123456789!
        pearlyMarketPageSumeyye.passwordBox.sendKeys(ConfigReader.getProperty("vendorSifre"));
        extentTest.info("Gecerli password girildi");

        // Vendor signIn butonuna tıklar
        pearlyMarketPageSumeyye.ikinciSignInButton.click();
        extentTest.info("İkinci sign in butonu tiklandi");


        extentTest.pass("Giris yapildi");

    }

    @Test (dependsOnMethods ="test01")


    public void test02() throws InterruptedException {
        extentTest = extentReports.createTest("TC_002", " Takipçileri görünebilmeli " +
                "Takipçi islemleri tanimlanmali");


        ReusableMethods.waitFor(10);


        // My Account butonunun görünür olduğunu test eder

        ReusableMethods.jsScroll(pearlyMarketPageSumeyye.myAccountButton);
        Assert.assertTrue(pearlyMarketPageSumeyye.myAccountButton.isDisplayed());
        extentTest.info("My Account butonu göründü");


        // Vendor My Account butonuna tıklar

        ReusableMethods.jsScrollClick(pearlyMarketPageSumeyye.myAccountButton);
        extentTest.info("My Account butonu tiklandi");


        // Vendor Store Manager butonunun görünür olduğunu test eder

        Assert.assertTrue(pearlyMarketPageSumeyye.storeManagerButton.isDisplayed());
        extentTest.info("Store Manager butonu göründü");


        // Vendor Store Manager butonuna tıklar

        Thread.sleep(3000);
        pearlyMarketPageSumeyye.storeManagerButton.click();
        Thread.sleep(3000);
        extentTest.info("Store Manager butonu tiklandi");


        //Vendor Followers butonunun görünür olduğunu test eder

        ReusableMethods.jsScroll(pearlyMarketPageSumeyye.followersButton);
        Assert.assertTrue(pearlyMarketPageSumeyye.followersButton.isDisplayed());
        extentTest.info("Followers butonu göründü");


        //Vendor Followers butonuna tıklar

        Thread.sleep(3000);
        pearlyMarketPageSumeyye.followersButton.click();
        Thread.sleep(3000);
        extentTest.info("Followers butonu tiklandi");


        // Followers islemleri siralanir

        ReusableMethods.jsScroll(pearlyMarketPageSumeyye.followersTransactions);


        for (WebElement nameHeader : pearlyMarketPageSumeyye.nameHeader) {
            Assert.assertTrue(nameHeader.isDisplayed());
        }

        for (WebElement emailHeader : pearlyMarketPageSumeyye.emailHeader) {
            Assert.assertTrue(emailHeader.isDisplayed());
        }

        for (WebElement actionsHeader : pearlyMarketPageSumeyye.actionsHeader) {
            Assert.assertTrue(actionsHeader.isDisplayed());
        }

        for (WebElement followersInformations : pearlyMarketPageSumeyye.followersInformations) {
            Assert.assertTrue(followersInformations.isDisplayed());

        }



        extentTest.pass("Takipci islemleri tanimlanamadi");


    }

}

     */

}
