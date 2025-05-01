package Project;

import Pages.US_507_POM;
import Utility.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class US_506_LogoToHomepage extends BaseDriverParameter {
    @Test
    public void logoClickNavigatesToHomepage() {

        driver.get("https://techno.study/");

        US_507_POM pom = new US_507_POM();
        wait.until(ExpectedConditions.elementToBeClickable(pom.logo));

        pom.logo.click();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://techno.study/", "Logo tıklanınca ana sayfaya dönülmedi!");
    }
}