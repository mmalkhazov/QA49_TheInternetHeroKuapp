package com.theinternetherokuapp.pages;

import com.theinternetherokuapp.pages.FramesPage.FramesPage;
import com.theinternetherokuapp.pages.FramesPage.IframePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    WebElement homePageComponent;

    public boolean isHomeComponentPresent() {
        return isElementPresent(homePageComponent);
    }


    @FindBy(xpath = "//a[@href='/javascript_alerts']")
    WebElement javascriptAlerts;

    public JavascriptAlertsPage selectJavascriptAlerts() {
        click(javascriptAlerts);
        return new JavascriptAlertsPage(driver);
    }


    @FindBy(xpath = "//a[@href='/frames']")
    WebElement frames;

    public FramesPage selectFrames() {
        click(frames);
        return new FramesPage(driver);
    }

    @FindBy(xpath = "//a[@href='/windows']")
    WebElement multipleWindows;

    public MultipleWindowsPage selectWindows() {
        click(multipleWindows);
        return new MultipleWindowsPage(driver);
    }


    @FindBy(xpath = "//a[@href='/dropdown']")
    WebElement dropdown;

    public DropdownListPage selectDropdownListPage() {
        click(dropdown);
        return new DropdownListPage(driver);
    }

    @FindBy(xpath = "//a[@href='/jqueryui/menu']")
    WebElement jqueryuiMenu;

    public JQueryUIMenuPage selectJQueryUIMenuPage() {
        click(jqueryuiMenu);
        return new JQueryUIMenuPage(driver);
    }



}
