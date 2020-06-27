package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static webelements.HomePageWebElements.*;
public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = autoWebElements) public WebElement auto;
    @FindBy(xpath = zipCodeWebElements) public WebElement zipCode;
    @FindBy(xpath = homeWebElements) public WebElement home;
    @FindBy(xpath = exploreWebElements) public WebElement explore;
    @FindBy(xpath = atvWebElements) public WebElement atv;
    @FindBy(xpath = atvZipCodeWebElements) public WebElement atvZipCode;
    @FindBy(xpath = getAQuoteWebElements) public WebElement getAQuote;
    @FindBy(xpath = firstNameWebElements) public WebElement firstName;
    @FindBy(xpath = lastNameWebElements) public WebElement lastName;

    public void auto(){
        auto.click();
    }
    public void zipCode(String Keyword){
        zipCode.sendKeys(Keyword);
    }
    public void home(){
        home.click();
    }
    public void explore(){
        explore.click();
    }
    public void atv(){
        atv.click();
    }
    public void atvZipCode(String Keyword){
        atvZipCode.sendKeys(Keyword);
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

    public void autoProgressive() throws InterruptedException {
        sleepFor(2);
        auto();
        sleepFor(2);
        cleanUp();
    }
    public void quoteProgressive() throws InterruptedException {
        sleepFor(2);
        auto();
        sleepFor(2);
        zipCode("11360");
    }
    public void homeProgressive() throws InterruptedException {
        sleepFor(2);
        auto();
        sleepFor(2);
        home();
        sleepFor(2);
        cleanUp();
    }
    public void exploreProgressive() throws InterruptedException {
        sleepFor(2);
        explore();
        sleepFor(2);
        cleanUp();
    }
    public void atvProgressive() throws InterruptedException {
        sleepFor(2);
        explore();
        sleepFor(2);
        atv();
        sleepFor(2);
        cleanUp();
    }
    public void atvZipCodeProgressive() throws InterruptedException {
        sleepFor(2);
        explore();
        sleepFor(2);
        atv();
        sleepFor(2);
        atvZipCode("11360");
        sleepFor(2);
        cleanUp();
    }
    public void getAQuoteProgressive() throws InterruptedException {
        sleepFor(2);
        explore();
        sleepFor(2);
        atv();
        sleepFor(2);
        atvZipCode("11360");
        sleepFor(2);
        getAQuote();
        sleepFor(2);
        cleanUp();
    }
    public void dataProgressive() throws InterruptedException {
        sleepFor(2);
        explore();
        sleepFor(2);
        atv();
        sleepFor(2);
        atvZipCode("11360");
        sleepFor(2);
        getAQuote();
        sleepFor(2);
        firstName("Hassaan");
        sleepFor(2);
        lastName("Nizam");
        sleepFor(2);
        cleanUp();
    }

}
