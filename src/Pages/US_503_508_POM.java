package Pages;


import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_503_508_POM {
    public US_503_508_POM() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//a[@class='tn-atom js-click-zero-stat']")
    public WebElement ApplyNow;
    
    @FindBy(xpath = "//input[@aria-label='name']")
    public WebElement Fullname;

    @FindBy(xpath = "//input[@aria-label='email']")
    public WebElement Eposta;

    @FindBy(xpath = "//input[@type='tel']")
    public WebElement Number;

    @FindBy(xpath = "//select[@id='sb-1667664755026']")
    public WebElement Country;

    @FindBy(xpath = "//select[@id='sb-1663337581601']")
    public WebElement Sdet;

    @FindBy(xpath = "//select[@id='sb-1670425500925']")
    public WebElement Other;

    @FindBy(xpath = "//input[@aria-label='oneline']")
    public WebElement PromoCode;

    @FindBy(xpath = "//div[@class='t-checkbox__indicator']")
    public WebElement TermsofUse;

    @FindBy(xpath = "//button[@style='padding: 0px 15px; display: block; width: 160px; font-weight: 600; height: 50px; margin-left: auto; margin-right: auto;']")
    public WebElement Button;

    @FindBy(xpath = "//div[@class='t-form-success-popup__text t-descr t-descr_sm']")
    public WebElement thankYouMessage;

    @FindBy(xpath = "//span[@class='t-checkbox__labeltext']/a")
    public WebElement TermsofUse2;
}











