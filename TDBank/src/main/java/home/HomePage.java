package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {

    @FindBy(how = How.CSS, using = productlinkWebElement) public WebElement productlink;
    @FindBy(how = How.LINK_TEXT, using = findUsWebElement) public WebElement findUs;
    @FindBy(how = How.CSS, using = submitButtonWebelement) public WebElement submitButton;


    public void MouseHoverOnProductsToServices() throws InterruptedException {
        getWindowsMaximize();
        sleepFor(2);
        mouseHoverByCSS("#td-desktop-nav-dropdown-link-2");
        sleepFor(3);
//        mouseHoverByCSS("#td-desktop-nav-dropdown-link-3");
//        sleepFor(3);
    }
    public void TryToFindLocation() throws InterruptedException {
        getWindowsMaximize();
        sleepFor(2);
        findUs.click();
        sleepFor(5);
        typeByCss("#q","Queens, NY, USA");
        sleepFor(2);
        clickOnElement("button.Locator-button--search");
        sleepFor(2);
    }
}
