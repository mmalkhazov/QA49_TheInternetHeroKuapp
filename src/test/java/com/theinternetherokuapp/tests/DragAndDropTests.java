package com.theinternetherokuapp.tests;

import com.theinternetherokuapp.pages.DragAndDropPage;
import com.theinternetherokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropTests extends TestBase{
    @BeforeMethod
    public void precondtition() {
        new HomePage(driver).selectDragAndDropPage();
    }

    @Test
    public void actionDragMeFromAToBTest() {

        new DragAndDropPage(driver)
                .actionDragMe("A","B")
                .verifyDropped("A");
    }

    @Test
    public void actionDragMeFromBToATest() {

        new DragAndDropPage(driver)
                .actionDragMe("B","A")
                .verifyDropped("B");
    }
}
