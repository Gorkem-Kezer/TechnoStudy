package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utility.BaseDriver.driver;

public class US_501_POM {

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

    public US_501_POM() {
        PageFactory.initElements(driver, this);
    }

}

