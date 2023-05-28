package tests.medunnaProje;

public class medunnaProjeStepDefinitions {


    /*

 Given Hasta <sumeyyeUrl> sayfasina gider
      Then Hasta ilk sign in butonunun gorunur oldugunu test eder
      When Hasta sign in butonuna tiklar
      Then Hasta <patientUserName8> butonunun gorunur oldugunu oldugunu test eder
      And Hasta gecerli bir <patientUserName8> girer
      Then Hasta <patientpassword8> butonunun gorunur oldugunu oldugunu test eder
      And Hasta gecerli bir <patientpassword8> girer
      Then Hasta ikinci sign in butonun gorunur oldugunu test eder
      When Hasta ikinci sign in butonuna tiklar
      Then Hasta MY PAGES(PATIENT) butonunun gorunur oldugunu test eder
      When Hasta MY PAGES(PATIENT) butonuna tiklar
      Then Hasta My Appointments butonunun gorunur oldugunu test eder
      When Hasta My Appointments butonuna tiklar


      **********************
       @US24_TC01
      Scenario: TC01 Hasta sonuclarini gorebilmelidir.
      Test sonuclarinda "Id, Name for test, Default Min. Value, Default Max. Value,
      Description ve Date" bolumleri gorulmelidir.


      Then Hasta Show Tests butonunun gorunur oldugunu test eder
      When Hasta Show Tests butonuna tiklar
      Then Hasta View Results butonunun gorunur oldugunu test eder
      When Hasta View Results butonuna tiklar
      Then Hasta Id, Name for test, Default Min. Value, Default Max. Value
      When Description ve Date'in gorunur oldugunu test eder


    @US24_TC02
    Scenario: TC02 Hasta faturasini da görebilmelidir. (Show Invoice)


    Then Hasta Show Invoice butonunun gorunur oldugunu test eder
    When Hasta Show Invoice butonuna tiklar
    Then Hasta faturanin gorunur oldugunu test eder


     */




    // *************************************



    /*


    package stepDefinitions.uiStepDef;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SumeyyePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_24_StepDefinitions {


    SumeyyePage sumeyyePage=new SumeyyePage();

    @Given("Hasta <sumeyyeUrl> sayfasina gider")
    public void hastaSumeyyeUrlSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("sumeyyeUrl"));
    }


    @Then("Hasta ilk sign in butonunun gorunur oldugunu test eder")
    public void hasta_ilk_sign_in_butonunun_gorunur_oldugunu_test_eder() throws InterruptedException {
        Assert.assertTrue(sumeyyePage.ilkSignInButton.isDisplayed());
        Thread.sleep(3000);
    }
    @When("Hasta sign in butonuna tiklar")
    public void hasta_sign_in_butonuna_tiklar() {
        sumeyyePage.ilkSignInButton.click();

    }
    @Then("Hasta <patientUserName8> butonunun gorunur oldugunu oldugunu test eder")
    public void hasta_username_butonunun_gorunur_oldugunu_oldugunu_test_eder() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(sumeyyePage.userNameButton.isDisplayed());

    }
    @Then("Hasta gecerli bir <patientUserName8> girer")
    public void hasta_gecerli_bir_username_girer() {
        sumeyyePage.userNameButton.sendKeys("patientUserName8");


    }
    @Then("Hasta <patientpassword8> butonunun gorunur oldugunu oldugunu test eder")
    public void hasta_password_butonunun_gorunur_oldugunu_oldugunu_test_eder() {
        Assert.assertTrue(sumeyyePage.passwordButton.isDisplayed());

    }
    @Then("Hasta gecerli bir <patientpassword8> girer")
    public void hasta_gecerli_bir_password_girer() throws InterruptedException {
        Thread.sleep(3000);
        sumeyyePage.passwordButton.sendKeys("patientpassword8");
    }
    @Then("Hasta ikinci sign in butonun gorunur oldugunu test eder")
    public void hasta_ikinci_sign_in_butonun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(sumeyyePage.ikinciSignInButton.isDisplayed());
    }
    @When("Hasta ikinci sign in butonuna tiklar")
    public void hasta_ikinci_sign_in_butonuna_tiklar() {
        sumeyyePage.ikinciSignInButton.click();
    }
    @Then("Hasta MY PAGES\\(PATIENT) butonunun gorunur oldugunu test eder")
    public void hasta_my_pages_patient_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(sumeyyePage.myPagesButton.isDisplayed());

    }
    @When("Hasta MY PAGES\\(PATIENT) butonuna tiklar")
    public void hasta_my_pages_patient_butonuna_tiklar() {
        sumeyyePage.myPagesButton.click();
    }
    @Then("Hasta My Appointments butonunun gorunur oldugunu test eder")
    public void hasta_my_appointments_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(sumeyyePage.myAppointmentsButton.isDisplayed());
    }
    @When("Hasta My Appointments butonuna tiklar")
    public void hasta_my_appointments_butonuna_tiklar() {
        sumeyyePage.myAppointmentsButton.click();
    }
    @Then("Hasta Show Tests butonunun gorunur oldugunu test eder")
    public void hasta_show_tests_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(sumeyyePage.showTestsButton.isDisplayed());
    }
    @When("Hasta Show Tests butonuna tiklar")
    public void hasta_show_tests_butonuna_tiklar() {
        sumeyyePage.showTestsButton.click();

    }
    @Then("Hasta View Results butonunun gorunur oldugunu test eder")
    public void hasta_view_results_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(sumeyyePage.viewResultsButton.isDisplayed());
    }
    @When("Hasta View Results butonuna tiklar")
    public void hasta_view_results_butonuna_tiklar() {
        sumeyyePage.viewResultsButton.click();
    }
    @Then("Hasta Id, Name for test, Default Min. Value, Default Max. Value")
    public void hasta_id_name_for_test_default_min_value_default_max_value() {
        Assert.assertTrue(sumeyyePage.idHeader.isDisplayed());
        Assert.assertTrue(sumeyyePage.sonucid.isDisplayed());


        Assert.assertTrue(sumeyyePage.nameForTestHeader.isDisplayed());
        Assert.assertTrue(sumeyyePage.sonucNameForTest.isDisplayed());


        Assert.assertTrue(sumeyyePage.defaultMinValueHeader.isDisplayed());
        Assert.assertTrue(sumeyyePage.sonucDefaultMinValue.isDisplayed());


        Assert.assertTrue(sumeyyePage.defaultMaxValueHeader.isDisplayed());
        Assert.assertTrue(sumeyyePage.sonucDefaultMaxValue.isDisplayed());



    }
    @When("Description ve Date'in gorunur oldugunu test eder")
    public void description_ve_date_in_gorunur_oldugunu_test_eder() {

        Assert.assertTrue(sumeyyePage.descriptionHeader.isDisplayed());
        Assert.assertTrue(sumeyyePage.sonucDescription.isDisplayed());


        Assert.assertTrue(sumeyyePage.dateHeader.isDisplayed());
        Assert.assertTrue(sumeyyePage.sonucDate.isDisplayed());

    }


    @Then("Hasta Show Invoice butonunun gorunur oldugunu test eder")
    public void hasta_show_invoice_butonunun_gorunur_oldugunu_test_eder() {
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();

        Assert.assertTrue(sumeyyePage.showInvoiceButton.isDisplayed());

    }
    @When("Hasta Show Invoice butonuna tiklar")
    public void hasta_show_invoice_butonuna_tiklar() {
        sumeyyePage.showInvoiceButton.click();

    }
    @Then("Hasta faturanin gorunur oldugunu test eder")
    public void hasta_faturanin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(sumeyyePage.patientShowInvoice.isDisplayed());
    }



}

     */





    /////////////////////////////////
    /*

    @When("Hasta ilk sign in butonuna tiklar")
    public void hastaIlkSignInButonunaTiklar() {
        sumeyyePage.ilkSignInButton.click();
    }

    @And("Hasta patient sign in butonuna tiklar")
    public void hastaPatientSignInButonunaTiklar() {
        sumeyyePage.patientSignButton.click();
    }


    *******************


     */
}
