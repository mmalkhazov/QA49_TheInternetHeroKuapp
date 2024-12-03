package com.theinternetherokuapp.tests;

import com.theinternetherokuapp.pages.HomePage;
import com.theinternetherokuapp.pages.HoversPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoversTests extends TestBase {
    @BeforeMethod
    public void precondtition() {
        new HomePage(driver).selectHoversPage();
    }


    @Test
    public void hooversTest() {
        new HoversPage(driver).hoverToolTips()
                .verifyToolTips("name: user1");
    }
}
