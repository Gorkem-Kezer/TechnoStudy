package Project;

import Utility.BaseDriver;
import org.testng.annotations.Test;

public class US_501_DropdownMenu extends BaseDriver {

    @Test
    public void DropDownMenu(){

        driver.get("https://techno.study/");
        Pages.US_501_POM elements=new Pages.US_501_POM();

        elements.programs.click();
        elements.SDET.click();
        driver.navigate().back();

        elements.programs.click();
        elements.DBS.click();
        driver.navigate().back();

        elements.programs.click();
        elements.artificialIntelligence.click();
        driver.navigate().back();

        elements.programs.click();
        elements.ADB.click();
        driver.navigate().back();

        elements.programs.click();
        elements.mastersProgram.click();
        driver.navigate().back();

        TearDown();
    }
}
