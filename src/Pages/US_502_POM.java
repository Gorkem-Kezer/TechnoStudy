package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class US_502_POM {
    WebDriver driver;

    public US_502_POM(WebDriver driver) {
        this.driver = driver;
    }

    By signInButton = By.linkText("SIGN IN");

    public boolean isSignInDisplayed() {
        return driver.findElement(signInButton).isDisplayed();
    }

    public void clickSignIn() {
        driver.findElement(signInButton).click();
    }

    public boolean isCampusLoginPage() {
        return driver.getCurrentUrl().contains("campus.techno.study");
    }
}
