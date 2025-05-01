package Project;

import Pages.US_507_POM;
import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_507_CourseDetails extends BaseDriver {
    @Test
    public void courseDetailsButtonNavigatesCorrectly() {

        driver.get("https://techno.study/");
        US_507_POM pom = new US_507_POM();
        wait.until(ExpectedConditions.elementToBeClickable(pom.courseDetailsButton));
        pom.courseDetailsButton.click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("course-details"), "Course Details sayfasına yönlenilmedi!");
    }
}