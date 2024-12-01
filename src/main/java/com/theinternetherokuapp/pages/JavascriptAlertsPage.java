package com.theinternetherokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class JavascriptAlertsPage extends BasePage {
    public JavascriptAlertsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "result")
    WebElement resultOfJsAlerts;

    public JavascriptAlertsPage verifyJsAlertsResult(String text) {
        Assert.assertTrue(resultOfJsAlerts.getText().contains(text));
        return this;
    }


    @FindBy(xpath = "//button[@onclick='jsAlert()']")
    WebElement jsAlertButton;

    public JavascriptAlertsPage jsAlert() {
        click(jsAlertButton);
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.alertIsPresent()).accept();
        return this;

    }

    @FindBy(xpath = "//button[@onclick='jsConfirm()']")
    WebElement jsAlertConfirmButton;

    public JavascriptAlertsPage jsAlertConfirm(String result) {
        click(jsAlertConfirmButton);
        if (result != null && result.equals("OK")) {
            driver.switchTo().alert().accept();
        } else if (result != null && result.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }


    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    WebElement jsAlertPromptButton;

    public JavascriptAlertsPage jsAlertPrompt(String message, String result) {
        click(jsAlertPromptButton);
        if (message != null) {
            driver.switchTo().alert().sendKeys(message);
        }

        if (result.equals("OK")) {
            driver.switchTo().alert().accept();
        } else if (result.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }


        return this;
    }
}
