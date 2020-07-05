package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static webelements.HomePageWebElements.*;
public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = autoWebElements) public WebElement auto;
    @FindBy(id = logInWebElements) public WebElement logIn;
    @FindBy(xpath = homeWebElements) public WebElement home;
    @FindBy(xpath = exploreWebElements) public WebElement explore;
    @FindBy(xpath = motorCycleWebElements) public WebElement motorCycle;
    @FindBy(xpath = motorCycleZipCodeWebElements) public WebElement motorCycleZipCode;
    @FindBy(xpath = getAQuoteWebElements) public WebElement getAQuote;
    @FindBy(xpath = firstNameWebElements) public WebElement firstName;
    @FindBy(xpath = lastNameWebElements) public WebElement lastName;
    @FindBy(xpath = trailerWebElements) public WebElement trailer;
    @FindBy(xpath = moreChoicesWebElements) public WebElement moreChoices;

    public void auto(){
        auto.click();
    }
    public void logIn(){
        logIn.click();
    }
    public void home(){
        home.click();
    }
    public void explore(){
        explore.click();
    }
    public void motorCycle(){
        motorCycle.click();
    }
    public void motorCycleZipCode(String Keyword){
        motorCycleZipCode.sendKeys(Keyword);
    }
    public void getAQuote(){
        getAQuote.click();
    }
    public void firstName(String Keyword){
        firstName.sendKeys(Keyword);
    }

    public void lastName(String Keyword){
        lastName.sendKeys(Keyword);
    }
    public void trailer(){
        trailer.click();
    }
    public void moreChoices(){
        moreChoices.click();
    }

    public void autoProgressive() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        auto();
        sleepFor(2);
        cleanUp();
    }
    public void logInProgressive() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        logIn();
        sleepFor(2);
        cleanUp();
    }
    public void homeProgressive() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        home();
        sleepFor(2);
        cleanUp();
    }
    public void exploreProgressive() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        explore();
        sleepFor(2);
        cleanUp();
    }
    public void motorCycleProgressive() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        explore();
        sleepFor(2);
        motorCycle();
        sleepFor(2);
        cleanUp();
    }
    public void motorCycleZipCodeProgressive() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        explore();
        sleepFor(2);
        motorCycle();
        sleepFor(2);
        motorCycleZipCode("11360");
        sleepFor(2);
        cleanUp();
    }
    public void getAQuoteProgressive() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        explore();
        sleepFor(2);
        motorCycle();
        sleepFor(2);
        motorCycleZipCode("11360");
        sleepFor(2);
        getAQuote();
        sleepFor(2);
        cleanUp();
    }
    public void dataProgressive() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        explore();
        sleepFor(2);
        motorCycle();
        sleepFor(2);
        motorCycleZipCode("11360");
        sleepFor(2);
        getAQuote();
        sleepFor(2);
        firstName("Hassaan");
        sleepFor(2);
        lastName("Nizam");
        sleepFor(2);
        cleanUp();
    }
    public void trailerProgressive() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        trailer();
        sleepFor(2);
        cleanUp();
    }
    public void moreChoicesProgressive() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        moreChoices();
        sleepFor(2);
        cleanUp();
    }

}
