package com.theinternetherokuapp.tests;

import com.theinternetherokuapp.pages.CheckboxesPage;
import com.theinternetherokuapp.pages.HomePage;
import com.theinternetherokuapp.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxesTests extends TestBase{
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).selectCheckboxesPage();
    }


    @Test
    public void checkboxTest(){
        new CheckboxesPage(driver).selectCheckbox(new String[]{"checkbox 1", "checkbox 2"});
    }

}
