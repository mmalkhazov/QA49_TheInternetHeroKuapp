package com.theinternetherokuapp.tests;

import com.theinternetherokuapp.pages.FileUploaderPage;
import com.theinternetherokuapp.pages.HomePage;
import com.theinternetherokuapp.pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploaderTests extends TestBase{
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).selectFileUploaderPage();
    }

    @Test
    public void FileUploaderTest(){
        new FileUploaderPage(driver)
                .selectFileUploader("C:\\QA\\img\\massiveattack.jpeg")
                .clickOnSubmitButton()
                .verifyUpload("massiveattack.jpeg")
        ;

    }




}
