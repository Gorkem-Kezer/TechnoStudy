package Project;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utility.BaseDriver.driver;

public class US_501_DropdownMenu {

        public US_501_DropdownMenu() { PageFactory.initElements(driver, this);}

        @FindBy(css = "[href='#submenu:programs']")
        public WebElement programs;

        @FindBy(xpath = "//*[text()='Software Development Engineer in Test']")
        public WebElement SDET;

        @FindBy(xpath = "(//*[text()='Data Science Bootcamp'])[1]")
        public WebElement DBS;

        @FindBy(xpath = "(//*[text()='Artificial Intelligence'])[1]")
        public WebElement artificialIntelligence;

        @FindBy(xpath = "(//*[text()='Android Developer Bootcamp'])[1]")
        public WebElement ADB;

        @FindBy(xpath = "//*[@class='t966__menu-list']/div[5]")
        public WebElement mastersProgram;

}

//        @Test
//    public void DropDownMenu(){
//
//
//            WebElement programs= driver.findElement(By.cssSelector("[href='#submenu:programs']"));
//            programs.click();
//
//
//            WebElement SDET= driver.findElement(By.xpath("//*[text()='Software Development Engineer in Test']"));
//            SDET.click();
//
//            driver.navigate().back();
//            MyFunc.wait(2);
//
//            WebElement DSB= driver.findElement(By.xpath("(//*[text()='Data Science Bootcamp'])[1]"));
//            DSB.click();
//
//            driver.navigate().back();
//            MyFunc.wait(2);
//
//            WebElement artificialIntelligence= driver.findElement(By.xpath("(//*[text()='Artificial Intelligence'])[1]"));
//            artificialIntelligence.click();
//
//            driver.navigate().back();
//            MyFunc.wait(2);
//
//            WebElement ADB= driver.findElement(By.xpath("(//*[text()='Android Developer Bootcamp'])[1]"));
//            ADB.click();
//
//            driver.navigate().back();
//            MyFunc.wait(2);
//
//            WebElement mastersProgram= driver.findElement(By.xpath("//*[@class='t966__menu-list']/div[5]"));
//            mastersProgram.click();
//
//            driver.navigate().back();
//            MyFunc.wait(2);
//        }
//}
