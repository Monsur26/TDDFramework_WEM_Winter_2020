package home;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(xpath = topMenuWebElement) public WebElement topMenu;
    @FindBy(id = navigationMenuWebElement) public WebElement navigationMenu;
    @FindBy(id = logInMenuWebElement) public WebElement logInMenu;
    @FindBy(xpath = searchButtonWebElement) public WebElement searchButton;
    @FindBy(xpath = userAccessWebElement) public WebElement userAccess;
    @FindBy(xpath = quickServiceWebElement) public WebElement quickService;
    @FindBy(xpath = serviceMenuWebElement) public WebElement serviceMenu;
    @FindBy(xpath = creditCardNewWindowWebElement) public WebElement creditCard;
    //Setup Method
    public void topMenuSet() {
        topMenu.click();
    }
    public void navigationMenuSet()
    {
        navigationMenu.click();
    }
    public void logInMenuSet() {
        mouseHover(logInMenu);
    }
    public void searchButtonSet(String keyword) {
    searchButton.sendKeys(keyword);
        searchButton.sendKeys(keyword);
        searchButton.sendKeys(Keys.ENTER);
    }
    public void userAccessSet() {
        userAccess.click();
    }
    public void quickServiceSet() {
        quickService.click();
    }
    public void serviceMenuSet() {
        serviceMenu.click();
    }
    public void setCreditCard() {
        creditCard.click();
    }

    //Test Cases
    public void menuTop() throws InterruptedException {topMenuSet();}
    public void menuNavigation() throws InterruptedException {navigationMenuSet();}
    public void menuLogIn() throws InterruptedException {
        logInMenuSet();
    }
    public void switchingToNewWindowLogin(){
        logInMenuSet();
        setCreditCard();
        switchToNewWindow();
    }
    public void buttonSearch() throws InterruptedException {searchButtonSet("Apply for a credit card online");}
    public void accessUser() throws InterruptedException {userAccessSet();}
    public void serviceQuick() throws InterruptedException {quickServiceSet();}
    public void menuService() throws InterruptedException {serviceMenuSet();}
}

