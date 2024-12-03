package com.theinternetherokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HorizontalSliderPage extends BasePage{
    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="input[type='range']")
    WebElement sliderInput;


    public HorizontalSliderPage moveSliderInHorizontalDirection() {
        pause(1000);
        new Actions(driver).dragAndDropBy(sliderInput,70,0).perform();
        return this;
    }

    @FindBy(id="range")
    WebElement sliderValue;

    public HorizontalSliderPage verifySliderValue(String expectedValue) {
        String actualValue = sliderValue.getText();
        Assert.assertEquals(actualValue, expectedValue);
        return this;
    }
}
