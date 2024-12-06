package com.theinternetherokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="username")
    WebElement username;
    @FindBy(id="password")
    WebElement userPassword;

    @FindBy(xpath= "//button[@class='radius']")
    WebElement loginButton;

    @FindBy(xpath= "//a[@href='/logout']")
    WebElement logoutButton;




    public LoginPage enterPersonalData(String name, String password) {
        type(username,name);
        type(userPassword,password);
        return this;

    }

    public LoginPage clickLoginButton() {
        click(loginButton);
        return this;
    }

    public LoginPage clickLogoutButton() {
        click(logoutButton);
        return this;
    }



}
