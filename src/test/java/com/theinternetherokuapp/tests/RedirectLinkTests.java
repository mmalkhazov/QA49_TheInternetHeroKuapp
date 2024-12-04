package com.theinternetherokuapp.tests;

import com.theinternetherokuapp.pages.HomePage;
import com.theinternetherokuapp.pages.RedirectLinks.RedirectLinkPage;
import com.theinternetherokuapp.pages.RedirectLinks.StatusCodesPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedirectLinkTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).selectRedirectLinkPage();
        new RedirectLinkPage(driver).selectStatusCodesPage();
    }


    @Test
    public void checkRedirectLinksTest() {
        new StatusCodesPage(driver).checkAllLinks();
    }

    @Test
    public void checkBrokenRedirectLinksTest() {
        new StatusCodesPage(driver).checkAllBrokenLinks();
    }
}

