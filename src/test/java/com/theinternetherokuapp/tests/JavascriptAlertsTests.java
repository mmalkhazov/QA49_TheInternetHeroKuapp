package com.theinternetherokuapp.tests;

import com.theinternetherokuapp.pages.HomePage;
import com.theinternetherokuapp.pages.JavascriptAlertsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavascriptAlertsTests extends TestBase {

    @BeforeMethod
    public void precondtition() {
        new HomePage(driver).selectJavascriptAlerts();

    }

    @Test
    public void jsAlertResultTest() {
        new JavascriptAlertsPage(driver).jsAlert()
                .verifyJsAlertsResult("You successfully clicked an alert");
    }

    @Test
    public void jsAlertConfirmResultWithOkTest() {
        new JavascriptAlertsPage(driver)
                .jsAlertConfirm("OK")
                .verifyJsAlertsResult("You clicked: Ok");
    }



    @Test
    public void jsAlertConfirmResultWithCancelTest() {
        new JavascriptAlertsPage(driver)
                .jsAlertConfirm("Cancel")
                .verifyJsAlertsResult("You clicked: Cancel");
    }


    @Test
    public void jsAlertPromptResultWithOkTest() {
        new JavascriptAlertsPage(driver)
                .jsAlertPrompt("My name is, chka-chka, Slim Shady", "OK")
                .verifyJsAlertsResult("My name is, chka-chka, Slim Shady");
    }

    @Test
    public void jsAlertPromptResultWithCancelTest() {
        new JavascriptAlertsPage(driver)
                .jsAlertPrompt("My name is, chka-chka, Slim Shady", "Cancel")
                .verifyJsAlertsResult("null");
    }



}
