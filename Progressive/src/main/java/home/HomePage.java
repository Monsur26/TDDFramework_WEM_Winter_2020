package home;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(xpath = topMenuWebElement) public WebElement topMenu;
    @FindBy(css = logMenuWebElement) public WebElement logMenu;
    @FindBy(xpath = serviceMenuWebElement) public WebElement serviceMenu;
    @FindBy(xpath = exploreAutoWebElement) public WebElement exploreAuto;
    @FindBy(xpath = discountButtonWebElement) public WebElement discountButton;
    @FindBy(xpath = coverageButtonWebElement) public WebElement coverageButton;
    @FindBy(xpath = quickServiceWebElement) public WebElement quickService;
    @FindBy(xpath = searchBarWebElement) public WebElement searchBar;
    @FindBy(xpath = searchButtonWebElement) public WebElement searchButton;
    //Setup Methods
    public void setTopMenu() {topMenu.click();}
    public void setLogMenu(){logMenu.click();}
    public void setServiceMenu() {
        Select select = new Select(driver.findElement(By.xpath(serviceMenuWebElement)));
        select.selectByValue("Homeoweners");
    }
    public void setExploreAuto() {
        Actions actions = new Actions(driver);
        actions.moveToElement(exploreAuto).perform();
    }
    public void setDiscountButton() {discountButton.click();}
    public void setCoverageButton() {coverageButton.click();}
    public void setQuickService() {quickService.click();}
    public void setSearchBar(String keyword) {
        searchButton.sendKeys(keyword);
    }
    public void setSearchButton() {searchButton.click();}
    //Test Cases
    public void menuTop() throws InterruptedException{setTopMenu();}
    public void menuLog() throws InterruptedException{setLogMenu();}
    public void menuService() throws InterruptedException{
        setServiceMenu();
        sleepFor(3);
    }
    public void autoExplore() throws InterruptedException{
        setExploreAuto();
        sleepFor(3);
    }
    public void buttonDiscount()throws InterruptedException {setDiscountButton();}
    public void buttonCoverage()throws InterruptedException {setCoverageButton();}
    public void serviceQuick()throws InterruptedException {setQuickService();}
    public void barSearch()throws InterruptedException{
        setSearchBar("ford");
    }
    public void buttonsearch()throws InterruptedException{searchButton.click();}

}
