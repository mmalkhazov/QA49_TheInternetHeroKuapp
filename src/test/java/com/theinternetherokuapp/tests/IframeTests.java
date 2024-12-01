package com.theinternetherokuapp.tests;

import com.theinternetherokuapp.pages.FramesPage.IframePage;
import com.theinternetherokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframeTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).selectFrames().selectIframe();
    }

    @Test
    public void iframeTest() {
        new IframePage(driver).returnListOfFrames().switchToIframeByIndex(0)
                .verifyIframeByText("Your content goes here.");

    }

}
