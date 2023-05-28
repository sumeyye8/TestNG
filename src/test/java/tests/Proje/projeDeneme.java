package tests.Proje;

public class projeDeneme {




    /*


package tests.sumeyye.US_19;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PearlyMarketPageSumeyye;
import tests.methods.Login;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class Us_19_TestCase_19_002 extends TestBaseRapor {


        PearlyMarketPageSumeyye pearlyMarketPageSumeyye = new PearlyMarketPageSumeyye();

        @Test

        public void test() throws InterruptedException {
            extentTest = extentReports.createTest("TC_002", " Takipçileri görünebilmeli " +
                    "Takipçi islemleri tanimlanmali");


            Driver.getDriver().get(ConfigReader.getProperty("projeUrl"));
            extentTest.info("Pearly Market anasayfasina gidildi");
            pearlyMarketPageSumeyye.ilkSignInButton.click();
            extentTest.info("Sign in butonuna tiklandi");
            pearlyMarketPageSumeyye.emailBox.sendKeys(ConfigReader.getProperty("vendorEmail") + Keys.ENTER);
            extentTest.info("Gecerli email yazildi");
            pearlyMarketPageSumeyye.passwordBox.sendKeys(ConfigReader.getProperty("vendorSifre")+ Keys.ENTER);
            extentTest.info("Gecerli password girildi, enter yapildi");
            pearlyMarketPageSumeyye.ikinciSignInButton.click();
            extentTest.info("İkinci sign in butonu tiklandi, giris yapildi");

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


    /////////////////////////////////////////////////


    /*



package tests.sumeyye.US_21;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PearlyMarketPageSumeyye;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class Us_21_TestCase_002 extends TestBaseRapor {

    PearlyMarketPageSumeyye pearlyMarketPageSumeyye = new PearlyMarketPageSumeyye();

    @Test

    public void test() throws InterruptedException {
        extentTest = extentReports.createTest("TC_002", "Store manager olarak satis raporlarinin incelenmesi " +
                "Gecen ay rakamlari görünmeli");

        // Vendor log in olur
      //  Login.login();

        Driver.getDriver().get(ConfigReader.getProperty("projeUrl"));
        extentTest.info("Pearly Market anasayfasina gidildi");
        pearlyMarketPageSumeyye.ilkSignInButton.click();
        extentTest.info("Sign in butonuna tiklandi");
        pearlyMarketPageSumeyye.emailBox.sendKeys(ConfigReader.getProperty("vendorEmail") + Keys.ENTER);
        extentTest.info("Gecerli email yazildi");
        pearlyMarketPageSumeyye.passwordBox.sendKeys(ConfigReader.getProperty("vendorSifre")+ Keys.ENTER);
        extentTest.info("Gecerli password girildi, enter yapildi");
        pearlyMarketPageSumeyye.ikinciSignInButton.click();
        extentTest.info("İkinci sign in butonu tiklandi, giris yapildi");

        extentTest.info("Log in olundu");

        ReusableMethods.waitFor(10);
        // My Account butonunun görünür olduğunu test eder

        ReusableMethods.jsScroll(pearlyMarketPageSumeyye.myAccountButton);
        Assert.assertTrue(pearlyMarketPageSumeyye.myAccountButton.isDisplayed());
        extentTest.info("My Account butonu göründü");


        // Vendor My Account'a tıklar
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


        // Vendor Reports butonunun görünür olduğunu test eder

        Thread.sleep(3000);
        ReusableMethods.jsScroll((WebElement) pearlyMarketPageSumeyye.reportsButton);
        Assert.assertTrue(pearlyMarketPageSumeyye.reportsButton.isDisplayed());
        Thread.sleep(3000);
        extentTest.info("Reports butonu göründü");


        // Vendor Reports butonuna tıklar

        Thread.sleep(3000);
        ReusableMethods.jsScroll((WebElement) pearlyMarketPageSumeyye.reportsButton);
        pearlyMarketPageSumeyye.reportsButton.click();
        Thread.sleep(3000);
        extentTest.info("Reports butonu tiklandi");


        // Vendor Last Month butonunun görünür olduğunu test eder

        Thread.sleep(3000);
        pearlyMarketPageSumeyye.lastMonthButton.isDisplayed();
        Thread.sleep(3000);

        extentTest.info("Last Month butonu göründü");


        // Vendor Last Month butonuna tıklar

        pearlyMarketPageSumeyye.lastMonthButton.click();

        ReusableMethods.jsScroll((WebElement) pearlyMarketPageSumeyye.lastMonthButton);
        extentTest.info("Last Month butonu tiklandi");


        // Vendor Last Month incelemesi yapar

        pearlyMarketPageSumeyye.reports.isDisplayed();
        Thread.sleep(3000);


        extentTest.pass("Last Month incelemesi gorundu ");


    }
}


     */

//////////////////////////////////////////



    /*



package tests.sumeyye.US_21;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PearlyMarketPageSumeyye;
import tests.methods.Login;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class Us_21_TestCase_003 extends TestBaseRapor {


    PearlyMarketPageSumeyye pearlyMarketPageSumeyye = new PearlyMarketPageSumeyye();

    @Test

    public void test() throws InterruptedException {
        extentTest = extentReports.createTest("TC_003", "Store manager olarak satis raporlarinin incelenmesi " +
                "Bu ay rakamlari görünmeli");

        // Vendor log in olur
     //   Login.login();

        Driver.getDriver().get(ConfigReader.getProperty("projeUrl"));
        extentTest.info("Pearly Market anasayfasina gidildi");
        pearlyMarketPageSumeyye.ilkSignInButton.click();
        extentTest.info("Sign in butonuna tiklandi");
        pearlyMarketPageSumeyye.emailBox.sendKeys(ConfigReader.getProperty("vendorEmail") + Keys.ENTER);
        extentTest.info("Gecerli email yazildi");
        pearlyMarketPageSumeyye.passwordBox.sendKeys(ConfigReader.getProperty("vendorSifre")+ Keys.ENTER);
        extentTest.info("Gecerli password girildi, enter yapildi");
        pearlyMarketPageSumeyye.ikinciSignInButton.click();
        extentTest.info("İkinci sign in butonu tiklandi, giris yapildi");

        extentTest.info("Log in olundu");

        ReusableMethods.waitFor(10);
        // My Account butonunun görünür olduğunu test eder

        ReusableMethods.jsScroll(pearlyMarketPageSumeyye.myAccountButton);
        Assert.assertTrue(pearlyMarketPageSumeyye.myAccountButton.isDisplayed());
        extentTest.info("My Account butonu göründü");


        // Vendor My Account'a tıklar
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


        // Vendor Reports butonunun görünür olduğunu test eder

        Thread.sleep(3000);
        ReusableMethods.jsScroll((WebElement) pearlyMarketPageSumeyye.reportsButton);
        Assert.assertTrue(pearlyMarketPageSumeyye.reportsButton.isDisplayed());
        Thread.sleep(3000);
        extentTest.info("Reports butonu göründü");


        // Vendor Reports butonuna tıklar

        Thread.sleep(3000);
        ReusableMethods.jsScroll((WebElement) pearlyMarketPageSumeyye.reportsButton);
        pearlyMarketPageSumeyye.reportsButton.click();
        Thread.sleep(3000);
        extentTest.info("Reports butonu tiklandi");


        // Vendor This Month butonunun görünür olduğunu test eder

        Thread.sleep(3000);
        pearlyMarketPageSumeyye.thisMonthButton.isDisplayed();
        Thread.sleep(3000);

        extentTest.info("This Month butonu göründü");


        // Vendor This Month butonuna tıklar

        pearlyMarketPageSumeyye.thisMonthButton.click();

        ReusableMethods.jsScroll((WebElement) pearlyMarketPageSumeyye.thisMonthButton);
        extentTest.info("This Month butonu tiklandi");


        // Vendor This Month incelemesi yapar

        pearlyMarketPageSumeyye.reports.isDisplayed();
        Thread.sleep(3000);

        extentTest.pass("This Month incelemesi gorundu");


    }

}

     */

/////////////////////////



    /*
package tests.sumeyye.US_21;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PearlyMarketPageSumeyye;
import tests.methods.Login;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class Us_21_TestCase_004 extends TestBaseRapor {

    PearlyMarketPageSumeyye pearlyMarketPageSumeyye = new PearlyMarketPageSumeyye();

    @Test

    public void test04() throws InterruptedException {
        extentTest = extentReports.createTest("TC_004", "Store manager olarak satis raporlarinin incelenmesi " +
                "Son 7 Gun rakamlari görünmeli");

        // Vendor log in olur
       // Login.login();

        Driver.getDriver().get(ConfigReader.getProperty("projeUrl"));
        extentTest.info("Pearly Market anasayfasina gidildi");
        pearlyMarketPageSumeyye.ilkSignInButton.click();
        extentTest.info("Sign in butonuna tiklandi");
        pearlyMarketPageSumeyye.emailBox.sendKeys(ConfigReader.getProperty("vendorEmail") + Keys.ENTER);
        extentTest.info("Gecerli email yazildi");
        pearlyMarketPageSumeyye.passwordBox.sendKeys(ConfigReader.getProperty("vendorSifre")+ Keys.ENTER);
        extentTest.info("Gecerli password girildi, enter yapildi");
        pearlyMarketPageSumeyye.ikinciSignInButton.click();
        extentTest.info("İkinci sign in butonu tiklandi, giris yapildi");

        extentTest.info("Log in olundu");

        ReusableMethods.waitFor(10);
        // My Account butonunun görünür olduğunu test eder

        ReusableMethods.jsScroll(pearlyMarketPageSumeyye.myAccountButton);
        Assert.assertTrue(pearlyMarketPageSumeyye.myAccountButton.isDisplayed());
        extentTest.info("My Account butonu göründü");


        // Vendor My Account'a tıklar
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


        // Vendor Reports butonunun görünür olduğunu test eder

        Thread.sleep(3000);
        ReusableMethods.jsScroll((WebElement) pearlyMarketPageSumeyye.reportsButton);
        Assert.assertTrue(pearlyMarketPageSumeyye.reportsButton.isDisplayed());
        Thread.sleep(3000);
        extentTest.info("Reports butonu göründü");


        // Vendor Reports butonuna tıklar

        Thread.sleep(3000);
        ReusableMethods.jsScroll((WebElement) pearlyMarketPageSumeyye.reportsButton);
        pearlyMarketPageSumeyye.reportsButton.click();
        Thread.sleep(3000);
        extentTest.info("Reports butonu tiklandi");


        // Vendor Last 7 Days butonunun görünür olduğunu test eder

        Thread.sleep(3000);
        pearlyMarketPageSumeyye.last7DaysButton.isDisplayed();
        Thread.sleep(3000);

        extentTest.info("This Month butonu göründü");


        // Vendor Last 7 Days butonuna tıklar

        pearlyMarketPageSumeyye.last7DaysButton.click();

        ReusableMethods.jsScroll((WebElement) pearlyMarketPageSumeyye.last7DaysButton);
        extentTest.info("Last 7 Days butonu tiklandi");


        // Vendor Last 7 Days incelemesi yapar

        pearlyMarketPageSumeyye.reports.isDisplayed();
        Thread.sleep(3000);


        extentTest.pass("Last 7 Days incelemesi gorundu ");


    }

}

     */


    //////////////////////////////////

    /*

package tests.sumeyye.US_21;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PearlyMarketPageSumeyye;
import tests.methods.Login;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;


public class Us_21_TestCase_005 extends TestBaseRapor {

    PearlyMarketPageSumeyye pearlyMarketPageSumeyye = new PearlyMarketPageSumeyye();

    @Test

    public void test() throws InterruptedException {
        extentTest = extentReports.createTest("TC_005", "Store manager olarak satis raporlarinin incelenmesi " +
                "Custom butonu tiklanmali, specific bir tarih secilmeli");



        Driver.getDriver().get(ConfigReader.getProperty("projeUrl"));
        extentTest.info("Pearly Market anasayfasina gidildi");
        pearlyMarketPageSumeyye.ilkSignInButton.click();
        extentTest.info("Sign in butonuna tiklandi");
        pearlyMarketPageSumeyye.emailBox.sendKeys(ConfigReader.getProperty("vendorEmail") + Keys.ENTER);
        extentTest.info("Gecerli email yazildi");
        pearlyMarketPageSumeyye.passwordBox.sendKeys(ConfigReader.getProperty("vendorSifre")+ Keys.ENTER);
        extentTest.info("Gecerli password girildi, enter yapildi");
        pearlyMarketPageSumeyye.ikinciSignInButton.click();
        extentTest.info("İkinci sign in butonu tiklandi, giris yapildi");

        extentTest.info("Log in olundu");

        ReusableMethods.waitFor(10);
        // My Account butonunun görünür olduğunu test eder

        ReusableMethods.jsScroll(pearlyMarketPageSumeyye.myAccountButton);
        Assert.assertTrue(pearlyMarketPageSumeyye.myAccountButton.isDisplayed());
        extentTest.info("My Account butonu göründü");


        // Vendor My Account'a tıklar
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


        // Vendor Reports butonunun görünür olduğunu test eder

        Thread.sleep(3000);
        ReusableMethods.jsScroll((WebElement) pearlyMarketPageSumeyye.reportsButton);
        Assert.assertTrue(pearlyMarketPageSumeyye.reportsButton.isDisplayed());
        Thread.sleep(3000);
        extentTest.info("Reports butonu göründü");


        // Vendor Reports butonuna tıklar

        Thread.sleep(3000);
        ReusableMethods.jsScroll((WebElement) pearlyMarketPageSumeyye.reportsButton);
        pearlyMarketPageSumeyye.reportsButton.click();
        Thread.sleep(3000);
        extentTest.info("Reports butonu tiklandi");


        // Vendor Custom butonunun görünür olduğunu test eder

        Thread.sleep(3000);
        pearlyMarketPageSumeyye.customButton.isDisplayed();
        Thread.sleep(3000);

        extentTest.info("Custom butonu göründü");


        // Vendor Custom butonuna tıklar

        pearlyMarketPageSumeyye.customButton.click();

        extentTest.info("Custom butonu tiklandi");


        // Vendor specific bir tarih secer

        pearlyMarketPageSumeyye.DateRange.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.jsScrollClick(pearlyMarketPageSumeyye.DayMonth);
        ReusableMethods.waitForVisibility(pearlyMarketPageSumeyye.day1,10);
        ReusableMethods.jsScrollClick(pearlyMarketPageSumeyye.day1);
        ReusableMethods.waitForVisibility(pearlyMarketPageSumeyye.day2,5);
        ReusableMethods.jsScrollClick(pearlyMarketPageSumeyye.day2);
        ReusableMethods.waitFor(5);
        actions.sendKeys(Keys.PAGE_DOWN).perform();


        extentTest.pass("Custom butonu tiklandi, specific bir tarih secildi");


    }
}

     */





}
