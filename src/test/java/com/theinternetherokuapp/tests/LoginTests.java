package com.theinternetherokuapp.tests;

import com.theinternetherokuapp.pages.HomePage;
import com.theinternetherokuapp.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).selectLoginPage();
    }


    @Test
    public void loginTest(){
        new LoginPage(driver)
                .enterPersonalData("tomsmith", "SuperSecretPassword!")
                .clickLoginButton();
    }


    @AfterMethod
    public void postcondition(){
        new LoginPage(driver).clickLogoutButton();

    }
}
