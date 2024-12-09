package com.theinternetherokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class JQueryUIMenuPage extends BasePage{
    public JQueryUIMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//a[text()='Enabled']")
    WebElement mainItem2;

    @FindBy(xpath="//a[text()='Downloads']")
    WebElement subSubList;


    @FindBy(xpath="//a[text()='Excel' and @href='/download/jqueryui/menu/menu.xls']")
    WebElement subItem1;

    public JQueryUIMenuPage selectSubMenu() {
        pause(1000);
        Actions actions=new Actions(driver);
        actions.moveToElement(mainItem2).perform();
        actions.moveToElement(subSubList).perform();


        return this;
    }

    public JQueryUIMenuPage verifySubMenu() {
        Assert.assertTrue(isElementDisplayed(subItem1));
        return this;
    }
}
