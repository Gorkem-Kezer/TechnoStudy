package Project;

import Pages.US_504_POM;
import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class US_504_BlogPage extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://techno.study/");
        US_504_POM pom = new US_504_POM();
        Actions actions = new Actions(driver);
        wait.until(ExpectedConditions.elementToBeClickable(pom.blogs));
        actions.click(pom.blogs).build().perform();
        String originalTab = driver.getWindowHandle();
        String[] blogsText = {"Importance", "STLC", "Evolution", "Apple", "SDLC", "Successful", "Navigating", "Highest", "Software Testing Trends", "Get A Job", "Impact", "Compelling",
                "Extensions", "Attain", "Software Testing", "Comprehensive", "Ultimate", "The Role of an SDET:", "QA Testing", "Coder", "Computer Programmer Skills:",
                "How to Become a Coder", "What is Coding?", "Significance", "Android Basics", "Integration", "Unit Testing", "No Experience", "Data Scientist",
                "Differences", "Test Plan", "Opportunities", "Survive", "Significance", "Test Case", "Tackling"};
        for (int i = 0; i < 17; i++) {
            String title = pom.blogsTitle.get(i).getText();
            actions.click(pom.blogPosts.get(i)).build().perform();
            for (String tab : driver.getWindowHandles()) {
                if (!tab.equals(originalTab)) {
                    driver.switchTo().window(tab);
                    break;
                }
            }

            List<WebElement> elements = driver.findElements(By.xpath("//h1[@class='t986__title t-title t-title_lg']//strong"));
            List<WebElement> elements2 = driver.findElements(By.xpath("//h1[@class='t001__title t-title t-title_xl']//strong"));

            if (i == 8) {
                Assert.assertTrue(elements2.size() > 0, "Başlık sayfada bulunamadı!");
                Assert.assertTrue(title.contains(blogsText[i]) && elements2.get(0).getText().contains(blogsText[i]), "Başlık eşleşmiyor!");

            } else {
                Assert.assertTrue(elements.size() > 0, "Başlık sayfada bulunamadı!");
                Assert.assertTrue(title.contains(blogsText[i]) && elements.get(0).getText().contains(blogsText[i]), "Başlık eşleşmiyor!");

            }
            driver.navigate().back();
            wait.until(ExpectedConditions.elementToBeClickable(pom.blogs));

        }
    }
}

