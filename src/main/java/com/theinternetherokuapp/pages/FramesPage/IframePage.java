package com.theinternetherokuapp.pages.FramesPage;

import com.theinternetherokuapp.pages.BasePage;
import com.theinternetherokuapp.pages.FramesPage.FramesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class IframePage extends BasePage {

    public IframePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName="iframe")
    List<WebElement>iframe;

    public IframePage returnListOfFrames(){
        System.out.println("The total number of iframes are " + iframe.size());
        return this;


    }

    public IframePage switchToIframeByIndex(int index) {
        driver.switchTo().frame(index);
        return this;
    }


    @FindBy(xpath = "//p[contains(text(),'Your content goes here')]")
    WebElement sampleText;

    public IframePage verifyIframeByText(String text) {
        Assert.assertTrue(shouldHaveText(sampleText,text,1));
        return this;
    }

}
