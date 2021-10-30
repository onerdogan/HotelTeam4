package tests.us_0003_kullanici;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class Raporlama extends TestBaseRapor {

    @Test
    public void test1(){
        //amazon, nutella, sonuc sayisini 1000 az

         extentTest = extentReports.createTest("amazon nutella testi", "nutella sayisi 1000 az olmali");
        Driver.getDriver().get("https://www.amazon.com");
        extentTest.info("link acildi");

        WebElement aramaKutusu=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys(("nutella")+ Keys.ENTER);
        extentTest.info("arama cubuguna nutella girildi");

        WebElement sonucYazisi=Driver.getDriver().findElement(By.xpath("(//span[@dir='auto'])[1]"));
        String sonuc=sonucYazisi.getText();
        String sonucArray[]=sonuc.split(" ");
        int sonucSayisi=Integer.parseInt(sonucArray[2]);
        extentTest.info("sonuc yazisi integer haline getirildi");

        Assert.assertTrue(sonucSayisi<1000);
        extentTest.pass("sonuc sayisinin 1000 az oldugu test edildi");

    }

}
