package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.yaml.snakeyaml.events.Event;

import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {

    @FindBy(xpath = topMenuWebElement)
    public WebElement topMenu;
    @FindBy(xpath = navigationMenuWebElement)
    public WebElement navigationMenu;
    @FindBy(css = serviceMenuWebElement)
    public WebElement serviceMenu;
    @FindBy(className = transportServiceWebElement)
    public WebElement transportService;
    @FindBy(xpath = quickServiceWebElement)
    public WebElement quickService;
    @FindBy(xpath = userAccessLinkWebElement)
    public WebElement userAccessLink;
    //Setup Method
    public void topMenuSet() { topMenu.click();}
    public void navigationMenuSet() {
        navigationMenu.click();
    }
    public void serviceMenuSet() {
        serviceMenu.click();
    }
    public void transportServiceSet() {
        transportService.click();
    }
    public void quickServiceSet() {
        quickService.click();
    }
    public void userAccessLInkSet() { userAccessLink.click(); }
    //Test Cases
    public void menuTop() throws InterruptedException {topMenuSet();}
    public void menuNavigation() {navigationMenuSet();}
    public void menuService() throws InterruptedException {serviceMenuSet();}
    public void transportService() throws InterruptedException {transportServiceSet();}
    public void serviceQuick() throws InterruptedException {quickServiceSet();}
    public void accessUser() throws InterruptedException {userAccessLInkSet();}
}



