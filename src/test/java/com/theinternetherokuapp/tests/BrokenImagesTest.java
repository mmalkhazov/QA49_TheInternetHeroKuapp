package com.theinternetherokuapp.tests;

import com.theinternetherokuapp.pages.BrokenImagesPage;
import com.theinternetherokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenImagesTest extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).selectBrokenImagesPage();
    }


    @Test
    public void checkBrokenImagesTest() {
        new BrokenImagesPage(driver).checkBrokenImages();
    }
}
