package tests.day16_notations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C04_DependsOnMethods {

    /*
        DependsOnMethods test method'larinin calisma sirasina karismaz
        Sadece bagli olan test, baglandigi testin sonucuna bakar
        baglandigi test PASSED olmazsa, baglanan test hic calismaz
     */


        WebDriver driver;

        @BeforeClass
        public void setUp(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

        @AfterClass
        public void tearDown(){
            driver.close();
        }

        // bu class'ta priority yaparsak sirali calismaz
        // amazon sayfasina gitmeden aramaKutusu'da Nutella aratamayiz

        // extends TestBase dersek sorun olur cunku amazon'a gidecek ve kapatacak
        // Ikinci method'ta amazon olmadigi icin sorun olusacak
        // bu yuzden yazmadik
        // onun yerine @BeforeClass ve @AfterClass'i olusturup o methodlari bunlara koymaliyiz
        // driver'lari olusturduk ve de.



        @Test
        public void test01(){
            // amazon sayfasina gidelim
            driver.get("https://www.amazon.com");
        }


        @Test (dependsOnMethods ="test01" , priority = 0)   // birden fazla yazilabilir mi?'ye ornek
        public void test02(){
            // nutella aratalim
            WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
            aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        }


        @Test (dependsOnMethods ="test02")
        public void test03(){
            // Sonuc yazisinin Nutella icerdigini test edelim
            WebElement sonucYaziElementi=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

            Assert.assertTrue(sonucYaziElementi.getText().contains("Nutella"));

        }

        @Test (groups = {"grup1","grup2"})
    public void test04() { System.out.println("bak bu calisti"); }

}




