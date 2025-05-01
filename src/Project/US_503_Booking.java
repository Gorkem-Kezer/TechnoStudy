package Project;

import Pages.US_503_508_POM;
import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class US_503_Booking extends BaseDriver{
    @Test(groups = "Smoke Test")
    public void test3() {
        US_503_508_POM elements=new US_503_508_POM();
        driver.get("https://techno.study/");

        wait.until(ExpectedConditions.elementToBeClickable(elements.ApplyNow)).click();
        elements.Fullname.sendKeys("Test Ayşe Yılmaz");
        elements.Eposta.sendKeys("test_a.yilmaz@gmail.com");
        elements.Number.sendKeys("1111111111");
        elements.Country.sendKeys("Andorra");
        elements.Sdet.sendKeys("Sdet");
        elements.Other.sendKeys("Other");
        elements.PromoCode.sendKeys("abc1234");
        wait.until(ExpectedConditions.elementToBeClickable(elements.TermsofUse)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.Button)).click();

        wait.until(ExpectedConditions.visibilityOf(elements.thankYouMessage));
        Assert.assertTrue(elements.thankYouMessage.getText().contains("Thank"));

        TearDown();
    }
}
