package com.theinternetherokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxesPage extends BasePage{
    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//*[@id='checkboxes']/input[1]")
    WebElement checkbox1;

    @FindBy(xpath="//*[@id='checkboxes']/input[2]")
    WebElement checkbox2;



    public CheckboxesPage selectCheckbox(String[] checkbox) {
        pause(1000);
        for (int i = 0; i <checkbox.length ; i++) {
            if(checkbox[i].equals("checkbox 1")){
                click(checkbox1);
            }if(checkbox[i].equals("checkbox 2")){
                click(checkbox2);
            }
        }
        pause(1000);
        return this;
    }
}
