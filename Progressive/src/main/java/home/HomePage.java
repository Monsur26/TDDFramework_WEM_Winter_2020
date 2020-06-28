package home;

import common.WebAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.Iterator;
import java.util.Set;

import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH,using = progressiveAutoWebElement) public WebElement progressiveAuto;
    @FindBy(how = How.CSS,using = progressiveExploreWebElement) public WebElement progressiveExplore;
    @FindBy(how = How.CSS,using = exploreAutoWebElement) public WebElement exploreAuto;
//    @FindBy(how = How.CSS,using = addPropertyWebElement) public WebElement addProperty;
    @FindBy(how = How.CSS,using = AutoNHomeWebElement) public WebElement autoNHome;
    @FindBy(how = How.XPATH,using = exploreHomeownerWebElement) public WebElement exploreHomeowner;
    @FindBy(how = How.XPATH,using = exploreHomeownerdropdownWebElement) public WebElement exploreHomeownerdropdown;
    @FindBy(how = How.CSS,using = exploreHomeownersMouseHWebElement) public WebElement exploreHomeownerMouseH;
    @FindBy(how = How.CSS,using = exploreHomeownersCoverageWebElement) public WebElement exploreHomeownersCoverage;
    @FindBy(how = How.CSS,using = moreChoiceWebElement) public WebElement moreChoice;
    @FindBy(how = How.XPATH,using = moreChoiceCarShoppingWebElement) public WebElement moreChoiceCarShopping;
    @FindBy(how = How.CSS,using = autoWebElement) public WebElement auto;
    @FindBy(how = How.CSS,using = enterZipWebElement) public WebElement enterZip;
    @FindBy(how = How.XPATH,using = learnMoreWebElement) public WebElement learnMore;
    @FindBy(how = How.CSS,using = allProductsWebElement) public WebElement allProducts;


    public void ProgressiveAuto(){ progressiveAuto.click();}
    public void ProgressiveExploreProducts(){ progressiveExplore.click();}
    public void multiWindowsHandling(){
        Set<String> windowIds =driver.getWindowHandles();
        Iterator<String> iter=windowIds.iterator();
        String mainWindow=iter.next();
        String childWindow=iter.next();
        driver.switchTo().window(childWindow);
    }
    public void ProgressiveAutoInfopage() throws InterruptedException {
      progressiveExplore.click();
      implicitWait(5);
            exploreAuto.click();
    }
    public void addProperty(){
        getWindowsMaximize();
        progressiveExplore.click();
        exploreAuto.click();
        implicitWait(5);
        mouseHoverByCSS("#LocalnavTrigger");
        implicitWait(5);
    }
    public void exploreHomeowner(){
        progressiveExplore.click();
        exploreHomeowner.click();
        implicitWait(5);
    }
    public void exploreHomeownersMouseHover() throws InterruptedException {
       progressiveExplore.click();
       exploreHomeowner.click();
       implicitWait(10);
       mouseHoverByCSS("#LocalnavTrigger");
       implicitWait(10);
    }
    public void exploreHomeownerCoverage() throws InterruptedException {
        exploreHomeownersMouseHover();
        exploreHomeownersCoverage.click();
    }
    public void moreChoices(){
        moreChoice.click();
        implicitWait(5);
        moreChoiceCarShopping.click();
    }
    public void autoQuote(){
        auto.click();
        implicitWait(10);
    }
    public void exploreAllProducts(){
        progressiveExplore.click();
        allProducts.click();
    }
    public void exploreAllProductsScrollDown(){
        progressiveExplore.click();
        allProducts.click();
        implicitWait(10);
        scrollDownVertically();
        implicitWait(10);
    }
    public void exploreAllProductsScrollDownNUp() throws InterruptedException {
        progressiveExplore.click();
        allProducts.click();
        implicitWait(10);
        scrollDownVertically();
        sleepFor(5);
        scrollUpVertically();
        implicitWait(10);
    }
}
