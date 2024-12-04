package com.theinternetherokuapp.pages.RedirectLinks;

import com.theinternetherokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RedirectLinkPage extends BasePage {
    public RedirectLinkPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "redirect")
    WebElement statusCodes;


    public StatusCodesPage selectStatusCodesPage() {
        click(statusCodes);
        return new StatusCodesPage(driver);
    }
}
