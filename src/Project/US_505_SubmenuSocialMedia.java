package Project;

import Pages.US_505_POM;
import Utility.BaseDriverParameter;
import Utility.MyFunc;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;


public class US_505_SubmenuSocialMedia extends BaseDriverParameter {

    @Test(groups = {"smoke "})
    public void socialMedia() {
        US_505_POM elements = new US_505_POM(driver);

        driver.get("https://techno.study/");
        String homePage = driver.getWindowHandle();

        List<WebElement> socialMediaLinks = Arrays.asList(elements.facebook, elements.instagram, elements.youTube,
                elements.linkedIn);

        for (WebElement link : socialMediaLinks) {
            MyFunc.scrollToElement(link);
            MyFunc.clickElement(link);
        }

        Set<String> windowHandles = driver.getWindowHandles();
        for (String window : windowHandles) {
            if (!window.equals(homePage)) {

                driver.switchTo().window(window);
                String windowUrl = driver.getCurrentUrl();

                if (windowUrl.contains("facebook"))
                    Assert.assertTrue(windowUrl.contains("facebook.com/technostudy"));
                else if (windowUrl.contains("instagram"))
                    Assert.assertTrue(windowUrl.contains("instagram.com/techno.study/"));
                else if (windowUrl.contains("youtube"))
                    Assert.assertTrue(windowUrl.contains("youtube.com/c/TechnoStudyInc"));
                else if (windowUrl.contains("linkedin"))
                    Assert.assertTrue(windowUrl.contains("linkedin.com/company/techno-study-inc/"));

                driver.close();
                driver.switchTo().window(homePage);
            }
        }

        TearDown();
    }
}

