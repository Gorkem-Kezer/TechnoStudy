package Pages;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class US_507_POM {
        public WebElement logo;

        public US_507_POM() {
            PageFactory.initElements(BaseDriver.driver, this);
        }

        @FindBy(xpath = "(//a[text()='Course Details'])[1]")
        public WebElement courseDetailsButton;
    }

