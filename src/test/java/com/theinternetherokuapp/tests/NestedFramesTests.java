package com.theinternetherokuapp.tests;


import com.theinternetherokuapp.pages.FramesPage.NestedFramesPage;
import com.theinternetherokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NestedFramesTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectFrames().selectNestedFramesPage();
    }

    @Test
    public void nestedLeftFrameTest(){
        new NestedFramesPage(driver).handleNestedIframes("LEFT").verifyNestedFrameText("LEFT");

    }

    @Test
    public void nestedMiddleFrameTest(){
        new NestedFramesPage(driver).handleNestedIframes("MIDDLE").verifyNestedFrameText("MIDDLE");

    }
    @Test
    public void nestedRightFrameTest(){
        new NestedFramesPage(driver).handleNestedIframes("RIGHT").verifyNestedFrameText("RIGHT");

    }
    @Test
    public void nestedBottonFrameTest(){
        new NestedFramesPage(driver).handleNestedIframes("BOTTOM").verifyNestedFrameText("BOTTOM");

    }
}
