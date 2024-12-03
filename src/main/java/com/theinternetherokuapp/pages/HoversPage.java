package com.theinternetherokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HoversPage extends BasePage{
    public HoversPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//img[@src='/img/avatar-blank.jpg']")
    WebElement hooversImage;

    public HoversPage hoverToolTips() {
        pause(1000);


        new Actions(driver).moveToElement(hooversImage).perform();
        pause(1000);
        return this;
    }

    @FindBy(xpath = "//div[@class='figcaption']")
    WebElement figCaption;
    public HoversPage verifyToolTips(String expectedResult) {
        Assert.assertTrue(figCaption.isDisplayed(), "Tooltip is not displayed");
        Assert.assertTrue(figCaption.getText().contains(expectedResult));


        return this;
    }
}
