package Project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import Pages.US_502_POM;

import static org.testng.Assert.*;

public class US_502_CrossCampus {
    WebDriver driver;
    US_502_POM US_502_POM;

    @Parameters("browser")
    @BeforeMethod
    public void setup(@Optional("chrome") String browser) {
        if (browser.equalsIgnoreCase("firefox")) {
            driver = new org.openqa.selenium.firefox.FirefoxDriver();
        } else {
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.get("https://techno.study/");
        US_502_POM = new US_502_POM(driver);
    }

    @Test(groups = {"smoke"})
    public void verifySignInLinkAndNavigation() {
        assertTrue(US_502_POM.isSignInDisplayed(), "SIGN IN link is not displayed");
        US_502_POM.clickSignIn();
        assertTrue(US_502_POM.isCampusLoginPage(), "Did not navigate to Campus login page");
    }

    @AfterMethod
    public void teardown() {
        if (driver != null)
            driver.quit();
    }
}
