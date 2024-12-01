package com.theinternetherokuapp.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.theinternetherokuapp.pages.HomePage;

public class HomePageTests extends TestBase {

    HomePage homePage;

    @BeforeMethod
    public void precondtition() {
        homePage = new HomePage(driver);

    }

    @Test
    public void isHomeComponentPresentTest() {
        boolean isPresent = homePage.isHomeComponentPresent();

        // Утверждаем результат
        Assert.assertTrue(isPresent, "Home page component is not present!");
    }

}
