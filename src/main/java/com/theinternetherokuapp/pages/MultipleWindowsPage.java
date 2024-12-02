package com.theinternetherokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class MultipleWindowsPage extends BasePage{
    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/windows/new']")
    WebElement openNewWindow;

    public MultipleWindowsPage selectNewWindows(int index) {
        click(openNewWindow);
        List<String> tabs =new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        return new MultipleWindowsPage (driver);
    }


    @FindBy(xpath = "//h3[text()='New Window']")
    WebElement sampleHeading;

    public MultipleWindowsPage verifyNewTabTitle(String text) {
        Assert.assertTrue(shouldHaveText(sampleHeading,text,5));
        return this;
    }



}
