package com.theinternetherokuapp.tests;

import com.theinternetherokuapp.pages.DropdownListPage;
import com.theinternetherokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownListTests extends TestBase{

    @BeforeMethod
    public void precondtition() {
        new HomePage(driver).selectDropdownListPage();

    }


    @Test
    public void selectDropdownListTest(){
        new DropdownListPage(driver).selectDropdownMenu("Option 2").verifyOption();
    }


}
