package com.theinternetherokuapp.tests;

import com.theinternetherokuapp.pages.DropdownListPage;
import com.theinternetherokuapp.pages.HomePage;
import com.theinternetherokuapp.pages.JQueryUIMenuPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JQueryUIMenuTests extends TestBase{


    @BeforeMethod
    public void precondtition() {
        new HomePage(driver).selectJQueryUIMenuPage();
    }

    @Test
    public void selectJQueryUIMenuTest(){
        new JQueryUIMenuPage(driver).selectSubMenu().verifySubMenu();
    }
}
