package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_505_POM {

    public US_505_POM(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@aria-label='facebook']")
    public WebElement facebook;

    @FindBy(xpath = "//a[@aria-label='instagram']")
    public WebElement instagram;

    @FindBy(xpath = "//a[@aria-label='youtube']")
    public WebElement youTube;

    @FindBy(xpath = "//a[@aria-label='linkedin']")
    public WebElement linkedIn;
}
