package com.theinternetherokuapp.pages.FramesPage;

import com.theinternetherokuapp.pages.BasePage;
import com.theinternetherokuapp.pages.FramesPage.FramesPage;
import com.theinternetherokuapp.pages.JavascriptAlertsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class NestedFramesPage extends BasePage {
    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//body[contains(text(),'LEFT')]")
    WebElement sampleLeftText;
    @FindBy(xpath = "//div[@id='content' and contains(text(),'MIDDLE')]")
    WebElement sampleMiddleText;
    @FindBy(xpath = "//body[contains(text(),'RIGHT')]")
    WebElement sampleRightText;
    @FindBy(xpath = "//body[contains(text(),'BOTTOM')]")
    WebElement sampleBottomText;


    @FindBy(xpath= "//frame[@name='frame-top']")
    WebElement frameTop;

    @FindBy(xpath= "//frame[@name='frame-left']")
    WebElement frameLeft;

    @FindBy(xpath= "//frame[@name='frame-middle']")
    WebElement frameMiddle;

    @FindBy(xpath= "//frame[@name='frame-right']")
    WebElement frameRight;

    @FindBy(xpath= "//frame[@name='frame-bottom']")
    WebElement frameBottom;

    public NestedFramesPage handleNestedIframes(String frameName) {
        if(frameName.equals("LEFT")){
            driver.switchTo().frame(frameTop);
            driver.switchTo().frame(frameLeft);
            System.out.println("The Text of Left Frame is: " + sampleLeftText.getText());

        }else if(frameName.equals("MIDDLE")) {
            driver.switchTo().frame(frameTop);
            driver.switchTo().frame(frameMiddle);
            System.out.println("The Text of Middle Frame is: " + sampleMiddleText.getText());
        }else if(frameName.equals("RIGHT")) {
            driver.switchTo().frame(frameTop);
            driver.switchTo().frame(frameRight);
            System.out.println("The Text of Right Frame is: " + sampleRightText.getText());
        }else if(frameName.equals("BOTTOM")) {
            driver.switchTo().frame(frameBottom);
            System.out.println("The Text of Bottom Frame is: " + sampleBottomText.getText());
        }
        return this;
    }

    public NestedFramesPage verifyNestedFrameText(String textOfFrame) {
        WebElement textElement=null;
        if(textOfFrame.equals("LEFT")){
            textElement=sampleLeftText;
        }else if(textOfFrame.equals("MIDDLE")){
            textElement=sampleMiddleText;
        }else if(textOfFrame.equals("RIGHT")){
            textElement=sampleRightText;
        }else if(textOfFrame.equals("BOTTOM")){
            textElement=sampleBottomText;
        }

        Assert.assertTrue(textElement != null && textElement.getText().contains(textOfFrame));
        return this;
    }
}
