package com.theinternetherokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownListPage extends BasePage{
    public DropdownListPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="dropdown")
    WebElement dropdownMenu;

    public DropdownListPage selectDropdownMenu(String option) {
        Select select = new Select(dropdownMenu);
        select.selectByVisibleText(option);
        return this;
    }

    public DropdownListPage verifyOption() {
        String firstSelectedOption=new Select(dropdownMenu).getFirstSelectedOption().getText();
        Assert.assertTrue(shouldHaveText(dropdownMenu,firstSelectedOption,5 ));
        return this;
    }

}
