package tests.day16_notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_BeforeMethod_AfterMethod extends TestBase {

    // @BeforeMethod ve @AfterMethod notasyonlari
    // JUnit'teki @Before ve @After gibidir
    // her test method'undan once ve sonra calisirlar


    @Test
    public void amazonTesti(){ // calisirken before methodunu burada goremeyip parend classinda (TestBase) oldugu icin BeforeMethod'unu calistiracak
        driver.get("https://www.amazon.com");   // bitince de ayni sekilde AfterMethod'u calisacak
    }

    @Test
    public void test02(){
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void techproedTesti(){
        driver.get("https://www.techproeducation.com");
    }

}
