package com.theinternetherokuapp.pages;

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


}
