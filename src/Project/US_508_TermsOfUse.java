package Project;

import Pages.US_503_508_POM;
import Utility.BaseDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class US_508_TermsOfUse extends BaseDriver{
    @Test(groups = "Regression")
    public void test8() throws IOException {
        US_503_508_POM elements = new US_503_508_POM();
        driver.get("https://techno.study/");

        wait.until(ExpectedConditions.elementToBeClickable(elements.ApplyNow)).click();
        elements.Fullname.sendKeys("Test Ayşe Yılmaz");
        elements.Eposta.sendKeys("test_a.yilmaz@gmail.com");
        elements.Number.sendKeys("1111111111");
        elements.Country.sendKeys("Andorra");
        elements.Sdet.sendKeys("Sdet");
        elements.Other.sendKeys("Other");
        elements.PromoCode.sendKeys("abc1234");
        wait.until(ExpectedConditions.elementToBeClickable(elements.TermsofUse2)).click();

        wait.until(ExpectedConditions.urlContains("terms"));
        Assert.assertTrue(driver.getCurrentUrl().contains("terms"));

        TearDown();

}
}