package com.theinternetherokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DragAndDropPage extends BasePage {
    public DragAndDropPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(id = "column-a")
    WebElement columnA;

    @FindBy(id = "column-b")
    WebElement columnB;

    public DragAndDropPage actionDragMe(String fromColumn, String toColumn) {

        WebElement dragMe;
        WebElement dropHere;


        if (fromColumn.equals("A")) {
            dragMe = columnA;
            dropHere = columnB;
        } else {
            dragMe = columnB;
            dropHere = columnA;

        }
        pause(1000);

        new Actions(driver).dragAndDrop(dragMe, dropHere).perform();
        return this;
    }

    public DragAndDropPage verifyDropped(String expectedResult) {
        WebElement targetColumn;
        if (expectedResult.equals("A")) {
            targetColumn = columnB;
        } else {
            targetColumn = columnA;

        }

        Assert.assertTrue(shouldHaveText(targetColumn, expectedResult, 5));
        return this;
    }
}

