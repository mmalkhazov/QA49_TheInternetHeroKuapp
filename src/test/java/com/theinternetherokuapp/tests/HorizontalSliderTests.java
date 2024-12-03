package com.theinternetherokuapp.tests;

import com.theinternetherokuapp.pages.HomePage;
import com.theinternetherokuapp.pages.HorizontalSliderPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HorizontalSliderTests extends TestBase{

    @BeforeMethod
    public void precondtition() {
        new HomePage(driver).selectHorizontalSliderPage();
    }

    @Test
    public void selectHorizontalSliderTest(){
        new HorizontalSliderPage(driver).moveSliderInHorizontalDirection().verifySliderValue("5");
    }
}
