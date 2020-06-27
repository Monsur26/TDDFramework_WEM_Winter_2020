package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = wirelessWebElements) public WebElement wireless;
    @FindBy(xpath = phonesWebElements) public WebElement phones;
    @FindBy(xpath = smartPhonesWebElements) public WebElement smartPhones;
    @FindBy(xpath = appleIphone11ProMaxWebElement) public WebElement appleIphone11ProMax;
    @FindBy(xpath = quickViewAppleIphone11ProMaxWebElement) public WebElement quickViewAppleIphone11ProMax;
    @FindBy(xpath = colorAppleIphone11ProMaxWebElement) public WebElement colorAppleIphone11ProMax;
    @FindBy(xpath = addToCartAppleIphone11ProMaxWebElement) public WebElement addToCartAppleIphone11ProMax;
    @FindBy(xpath = zipCodeAppleIphone11ProMaxWebElement) public WebElement zipCodeAppleIphone11ProMax;
    @FindBy(xpath = confirmZipCodeAppleIphone11ProMaxWebElement) public WebElement confirmZipCodeAppleIphone11ProMax;
    @FindBy(className = dealsWebElement) public WebElement deals;
    @FindBy(xpath = shopDealsWebElement) public WebElement shopDeals;
    @FindBy(xpath = verizonWirelessWebElement) public WebElement verizonWireless;
    @FindBy(xpath = searchBarWebElement) public WebElement searchBar;
    @FindBy(xpath = searchButtonWebElement) public WebElement searchButton;
    @FindBy(xpath = signInMouseHoverWebElement) public WebElement signInMouseHover;
    @FindBy(xpath = myAccountWebElement) public WebElement myAccount;
    @FindBy(xpath = motorolaEdgePlusWebElement) public WebElement motorolaEdgePlus;

    public void shop(){
        wireless.click();
    }
    public void phonesMouseHover(){
        Actions actions=new Actions(driver);
        actions.moveToElement(phones).perform();
    }
    public void smartPhones(){
        smartPhones.click();
    }
    public void colorAppleIphone11ProMax(){
        colorAppleIphone11ProMax.click();
    }
    public void appleIphone11ProMax(){
        Actions actions=new Actions(driver);
        actions.moveToElement(appleIphone11ProMax).perform();
    }
    public void quickViewAppleIphoneProMax(){
        quickViewAppleIphone11ProMax.click();
    }
    public void addToCartAppleIphone11ProMax(){
        addToCartAppleIphone11ProMax.click();
    }
    public void zipCodeAppleIphone11ProMax(String Keyword){
        zipCodeAppleIphone11ProMax.sendKeys(Keyword);
    }
    public void confirmZipCodeAppleIphone11ProMax(){
        confirmZipCodeAppleIphone11ProMax.click();
    }
    public void dealsMouseHover(){
        Actions actions=new Actions(driver);
        actions.moveToElement(deals).perform();
    }
    public void shopDeals(){
        shopDeals.click();
    }
    public void verizonWireless(){
        verizonWireless.click();
    }
    public void searchBar(String Keywords){
        searchBar.sendKeys(Keywords);
    }
    public void searchButton(){
        searchButton.click();
    }
    public void signInMouseHover(){
        Actions actions=new Actions(driver);
        actions.moveToElement(signInMouseHover).perform();
    }
    public void myAccount(){
        myAccount.click();
    }
    public void motorolaEdgePlus(){
        motorolaEdgePlus.click();
    }

    public void wirelessVerizon() throws InterruptedException {
        driver.manage().window().maximize();
        sleepFor(2);
        shop();
        sleepFor(2);
        cleanUp();
    }
    public void phonesVerizon() throws InterruptedException {
        driver.manage().window().maximize();
        sleepFor(2);
        shop();
        sleepFor(2);
        phonesMouseHover();
        sleepFor(2);
        smartPhones();
        cleanUp();

    }
    public void appleIphone11ProMaxVerizon() throws InterruptedException {
        driver.manage().window().maximize();
        sleepFor(2);
        shop();
        sleepFor(2);
        phonesMouseHover();
        sleepFor(2);
        smartPhones();
        sleepFor(2);
        appleIphone11ProMax();
        sleepFor(2);
        quickViewAppleIphoneProMax();
        sleepFor(2);
        cleanUp();
    }

    public void colorAppleIphone11ProMaxVerizon() throws InterruptedException {
        driver.manage().window().maximize();
        sleepFor(2);
        shop();
        sleepFor(2);
        phonesMouseHover();
        sleepFor(2);
        smartPhones();
        sleepFor(2);
        appleIphone11ProMax();
        sleepFor(2);
        quickViewAppleIphoneProMax();
        sleepFor(2);
        colorAppleIphone11ProMax();
        sleepFor(2);
        cleanUp();
    }
    public void addToCartAppleIphone11ProMaxVerizon() throws InterruptedException {
        driver.manage().window().maximize();
        sleepFor(2);
        shop();
        sleepFor(2);
        phonesMouseHover();
        sleepFor(2);
        smartPhones();
        sleepFor(2);
        appleIphone11ProMax();
        sleepFor(2);
        quickViewAppleIphoneProMax();
        sleepFor(2);
        colorAppleIphone11ProMax();
        sleepFor(2);
        addToCartAppleIphone11ProMax();
        sleepFor(2);
        cleanUp();
    }
    public void zipCodeAppleIphone11ProMaxVerizon() throws InterruptedException {
        driver.manage().window().maximize();
        sleepFor(2);
        shop();
        sleepFor(2);
        phonesMouseHover();
        sleepFor(2);
        smartPhones();
        sleepFor(2);
        appleIphone11ProMax();
        sleepFor(2);
        quickViewAppleIphoneProMax();
        sleepFor(2);
        colorAppleIphone11ProMax();
        sleepFor(2);
        addToCartAppleIphone11ProMax();
        sleepFor(2);
        zipCodeAppleIphone11ProMax("11360");
        sleepFor(2);
        confirmZipCodeAppleIphone11ProMax();
        sleepFor(2);
        cleanUp();

    }
    public void dealsVerizon() throws InterruptedException {
        driver.manage().window().maximize();
        sleepFor(2);
        verizonWireless();
        sleepFor(2);
        dealsMouseHover();
        sleepFor(2);
        shopDeals();
        sleepFor(2);
        cleanUp();
    }
    public void searchVerizon() throws InterruptedException {
        driver.manage().window().maximize();
        sleepFor(2);
        verizonWireless();
        sleepFor(2);
        searchBar("Iphone 11 Pro Max");
        sleepFor(2);
        searchButton();
        sleepFor(2);
        cleanUp();
    }
    public void signInVerizon() throws InterruptedException {
        driver.manage().window().maximize();
        sleepFor(2);
        verizonWireless();
        sleepFor(2);
        myAccount();
        sleepFor(2);
        cleanUp();
    }
    public void motorolaEdgePlusVerizon() throws InterruptedException {
        driver.manage().window().maximize();
        sleepFor(2);
        verizonWireless();
        sleepFor(2);
        motorolaEdgePlus();
        sleepFor(2);
        cleanUp();
    }
}
