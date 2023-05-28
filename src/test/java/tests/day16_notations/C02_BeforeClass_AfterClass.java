package tests.day16_notations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C02_BeforeClass_AfterClass extends TestBase {

    // JUnit'te @BeforeClass ve @AfterClass notasyonuna sahip
    // method'lar static olmak ZORUNDAYDI
    // TestNG bbu ZORUNLULUK'tan bizi kurtariyor


    /*
        TestNG bize daha fazla before ve after notasyonlari sunar
        diger before/after notasyonlari tanimlayacagimiz
        grp, test veya suit'den once ve sonra calisirlar
        ileride xml dosyalari ile birlikte bunu gorecegiz
     */
    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClassMethod(){
        System.out.println("After Class");
    }

    @Test
    public void amazonTesti(){      // calisirken before methodunu burada goremeyip parend classinda (TestBase) oldugu icin BeforeMethod'unu calistiracak
        driver.get("https://www.amazon.com");   // bitince de ayni sekilde AfterMethod'u calisacak
        System.out.println(driver.getCurrentUrl());

    }

    @Test
    public void test02(){
        driver.get("https://www.bestbuy.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void techproedTesti(){
        driver.get("https://www.techproeducation.com");
        System.out.println(driver.getCurrentUrl());
    }



}
