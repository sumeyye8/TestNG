package tests.day16_notations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C03_Priority extends TestBase {

    /*
        TestNG test methodlarini isim sirasina gore calistirir
        eger isim siralamasinin disinda bir siralama ile calismasini istersek
        o zaman test methodlarina oncelik (priority) tanimlayabiliriz

        priority kucukten buyuge gore calisir
        eger bir test methoduna priority atanmamissa
        default olarak priority=0 kabul edilir
     */


    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClassMethod(){
        System.out.println("After Class");
    }

    @Test (priority = -5)
    public void amazonTesti(){      // calisirken before methodunu burada goremeyip parend classinda (TestBase) oldugu icin BeforeMethod'unu calistiracak
        driver.get("https://www.amazon.com");   // bitince de ayni sekilde AfterMethod'u calisacak
        System.out.println(driver.getCurrentUrl());

    }

    @Test (priority = -2)
    public void test02(){
        driver.get("https://www.bestbuy.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test (groups = "grup1")
    public void techproedTesti(){
        driver.get("https://www.techproeducation.com");
        System.out.println(driver.getCurrentUrl());
    }







}
