package com.theinternetherokuapp.pages.FramesPage;

import com.theinternetherokuapp.pages.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesPage extends BasePage {
    public FramesPage(WebDriver driver) {
        super(driver);
    }



@FindBy(xpath = "//a[contains(text(),'Nested Frames')]")
    WebElement nestedFrames;

    public NestedFramesPage selectNestedFramesPage() {
        click(nestedFrames);
        return new NestedFramesPage (driver);
    }


    @FindBy(xpath = "//a[contains(text(),'iFrame')]")
    WebElement iframe;

    public IframePage selectIframe() {
        click(iframe);
        return new IframePage (driver);
    }


}
