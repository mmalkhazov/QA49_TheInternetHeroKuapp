package com.theinternetherokuapp.pages;

import com.theinternetherokuapp.pages.FramesPage.FramesPage;
import com.theinternetherokuapp.pages.RedirectLinks.RedirectLinkPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    WebElement homePageComponent;

    public boolean isHomeComponentPresent() {
        return isElementPresent(homePageComponent);
    }


    @FindBy(xpath = "//a[@href='/javascript_alerts']")
    WebElement javascriptAlerts;

    public JavascriptAlertsPage selectJavascriptAlerts() {
        click(javascriptAlerts);
        return new JavascriptAlertsPage(driver);
    }


    @FindBy(xpath = "//a[@href='/frames']")
    WebElement frames;

    public FramesPage selectFrames() {
        click(frames);
        return new FramesPage(driver);
    }

    @FindBy(xpath = "//a[@href='/windows']")
    WebElement multipleWindows;

    public MultipleWindowsPage selectWindows() {
        click(multipleWindows);
        return new MultipleWindowsPage(driver);
    }


    @FindBy(xpath = "//a[@href='/dropdown']")
    WebElement dropdown;

    public DropdownListPage selectDropdownListPage() {
        click(dropdown);
        return new DropdownListPage(driver);
    }

    @FindBy(xpath = "//a[@href='/jqueryui/menu']")
    WebElement jqueryuiMenu;

    public JQueryUIMenuPage selectJQueryUIMenuPage() {
        click(jqueryuiMenu);
        return new JQueryUIMenuPage(driver);
    }

    @FindBy(xpath = "//a[@href='/horizontal_slider']")
    WebElement horizontalSlider;

    public HorizontalSliderPage selectHorizontalSliderPage() {
        click(horizontalSlider);
        return new HorizontalSliderPage(driver);
    }

    @FindBy(xpath = "//a[@href='/drag_and_drop']")
    WebElement dragAndDrop;

    public DragAndDropPage selectDragAndDropPage() {
        click(dragAndDrop);
        return new DragAndDropPage(driver);
    }


    @FindBy(xpath = "//a[@href='/hovers']")
    WebElement hovers;

    public HoversPage selectHoversPage() {
        click(hovers);
        return new HoversPage(driver);
    }

    @FindBy(xpath = "//a[@href='/broken_images']")
    WebElement brokenImages;

    public BrokenImagesPage selectBrokenImagesPage() {
        click(brokenImages);
        return new BrokenImagesPage(driver);
    }

    @FindBy(xpath = "//a[@href='/redirector']")
    WebElement redirectLink;


    public RedirectLinkPage selectRedirectLinkPage() {
        click(redirectLink);
        return new RedirectLinkPage(driver);
    }

    @FindBy(xpath = "//a[@href='/checkboxes']")
    WebElement checkboxes;


    public CheckboxesPage selectCheckboxesPage() {
        click(checkboxes);
        return new CheckboxesPage(driver);
    }

    @FindBy(xpath = "//a[@href='/upload']")
    WebElement fileUpload;


    public FileUploaderPage selectFileUploaderPage() {
        click(fileUpload);
        return new FileUploaderPage(driver);
    }

    @FindBy(xpath = "//a[@href='/login']")
    WebElement login;

    public LoginPage selectLoginPage() {
        click(login);
        return new LoginPage(driver);
    }

}
