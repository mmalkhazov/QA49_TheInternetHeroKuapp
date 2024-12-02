package com.theinternetherokuapp.tests;

import com.theinternetherokuapp.pages.HomePage;
import com.theinternetherokuapp.pages.MultipleWindowsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindowsTests extends TestBase{

    @BeforeMethod
    public void precondtition() {
        new HomePage(driver).selectWindows();

    }

    @Test
    public void newWindowTest() {
        new MultipleWindowsPage(driver).selectNewWindows(1).verifyNewTabTitle("New Window");
    }
}
