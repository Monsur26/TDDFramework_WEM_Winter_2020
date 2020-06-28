package home;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(xpath = logButtonWebElements) public WebElement logButton;
    @FindBy(xpath = menuButtonWebElement) public WebElement menuButton;
    @FindBy(xpath = paymentMethodWebElement) public WebElement paymentMethod;
    @FindBy(id = currencyButtonWebElement) public WebElement currencyButton;
    @FindBy(xpath = languageButtonWSebElement) public WebElement languageButton;
    @FindBy(xpath = searchBarWebElement) public WebElement searchBar;
    @FindBy(xpath = searchButtonWebElement) public WebElement searchButton;
    @FindBy(xpath = bottomBarWebElement) public WebElement bottomBar;
    //Setup Methods
    public void logButtonSet() {logButton.click();}
    public void menuButtonSet() {
        Actions actions=new Actions(driver);
        actions.moveToElement(menuButton).perform();
    }
    public void paymentMethodSet() {paymentMethod.click();}
    public void currencyButtonSet() {
        Select select = new Select(driver.findElement(By.id(currencyButtonWebElement)));
        select.selectByValue("OMR");
    }
    public void languageButtonSet() {
        languageButton.click();
    }
    public void searchBarSet(String keyword) {
        searchBar.sendKeys(keyword);
    }
    public void searchButtonSet() {
        searchButton.click();
    }
    public void bottomBarSet() {
        Select select = new Select(driver.findElement(By.xpath(bottomBarWebElement)));
        select.selectByIndex(0);
    }
    //Test Cases
    public void buttonLog() throws InterruptedException {
        logButtonSet();
    }
    public void buttonMenu() throws InterruptedException {
        menuButtonSet();
    }
    public void methodPayment() throws InterruptedException{
        menuButtonSet();
        paymentMethodSet();}
    public void buttonCurrency() throws InterruptedException {
        currencyButtonSet();
        sleepFor(5);
    }
    public void buttonLanguage() throws InterruptedException {
        languageButtonSet();
    }
    public void barSearch() throws InterruptedException {
        searchBarSet("Fun trip-Summer scent");
    }
    public void buttonSearch() throws InterruptedException {
        searchButtonSet();
    }
    public void barBottom() throws InterruptedException {
        bottomBarSet();
        sleepFor(5);
    }

}
