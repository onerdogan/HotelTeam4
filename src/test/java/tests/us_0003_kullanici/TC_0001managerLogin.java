package tests.us_0003_kullanici;

import org.testng.annotations.Test;
import pages.US_0003page;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_0001managerLogin {
    @Test
    public void test() {

        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
        US_0003page us_0003page=new US_0003page();
        us_0003page.ilkLoginLinki.click();
        us_0003page.usenameKutusu.sendKeys(ConfigReader.getProperty("CHQAValidUsarname"));
        us_0003page.passwordKutusu.sendKeys(ConfigReader.getProperty("CHQAValidPassword"));
        us_0003page.login.click();



    }
}