package Pages;

import Project.US_501_DropdownMenu;
import Utility.BaseDriver;
import org.testng.annotations.Test;

public class US_501_POM extends BaseDriver {

    @Test
    public void DropDownMenu(){

        driver.get("https://techno.study/");
        US_501_DropdownMenu elements=new US_501_DropdownMenu();

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
