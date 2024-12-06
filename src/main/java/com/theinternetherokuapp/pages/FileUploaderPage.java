package com.theinternetherokuapp.pages;

import com.theinternetherokuapp.pages.FramesPage.IframePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class FileUploaderPage extends BasePage {
    public FileUploaderPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "file-upload")
    WebElement fileUpload;

    public FileUploaderPage selectFileUploader(String path) {
        fileUpload.sendKeys(path);
        return this;
    }

    @FindBy(id = "file-submit")
    WebElement submitButton;
//

    public FileUploaderPage clickOnSubmitButton() {
        click(submitButton);
        return this;
    }

    @FindBy(id = "uploaded-files")
    WebElement uploadedFiles;


    public FileUploaderPage verifyUpload(String text) {
        Assert.assertTrue(shouldHaveText(uploadedFiles, text, 1));
        return this;
    }


}
