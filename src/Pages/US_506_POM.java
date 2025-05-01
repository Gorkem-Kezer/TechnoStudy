package Pages;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_506_POM {

    public US_506_POM() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(css = "a.t228__imgwrapper")
    public WebElement logo;
}