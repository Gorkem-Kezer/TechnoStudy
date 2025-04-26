package Pages;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_504_POM {
    public US_504_POM() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "(//a[text()='Blogs'])[1]")
    public WebElement blogs;

    @FindBy(css = "[class='t-feed__col-grid__post-wrapper']")
    public List<WebElement> blogPosts;

    @FindBy(css = "[class='t-feed__link js-feed-post-link']")
    public List<WebElement>blogsTitle;


}
