package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class HomePage extends WebAPI {
    //Web elements/locators
    @FindBy(xpath = "//body/div[@id='nav__plain-header']/div/div[@id='nav']/header[@id='header-nav-container']/div/div/div/div/button[1]//*[local-name()='svg']")
    public WebElement cnnSearchSymbol;

    @FindBy(xpath = "//input[@id='header-search-bar']")
    public WebElement cnnSearchBar;

    @FindBy(xpath = "//div[@id='edition-picker-toggle-desktop']//span[contains(text(),'Edition')]")
    public WebElement cnnEditionButton;

    @FindBy(xpath = "//div[@id='edition-picker-desktop']//div//a[@name='domestic'][contains(text(),'U.S.')]")
    public WebElement cnnUSEdition;

    @FindBy(xpath = "//div[@id='edition-picker-desktop']//div//a[@name='international'][contains(text(),'International')]")
    public WebElement cnnInternationalEdition;

    @FindBy(xpath = "//div[@id='edition-picker-desktop']//div//a[@name='international'][contains(text(),'International')]")
    public WebElement cnnArabicEdition;

    @FindBy(xpath = "//div[@id='edition-picker-desktop']//div//a[@name='espanol'][contains(text(),'Español')]")
    public WebElement cnnSpanishEdition;

    @FindBy(xpath = "//input[@id='covid-zip-code']")
    public WebElement cnnZipCodeSearch;

    @FindBy(xpath = "//button[@id='covid-submit-button']")
    public WebElement cnnSetLocation;

    @FindBy(xpath = "//body//div[@id='nav']//div//div//div[2]//nav[1]//ul[1]//li[1]//a[1]")
    public WebElement cnnUSNews;

    @FindBy(xpath = "//body//div[@id='nav']//div//div//div[2]//nav[1]//ul[1]//li[2]//a[1]")
    public WebElement cnnWorldNews;

    @FindBy(xpath = "//body//div[@id='nav']//div//div//div[2]//nav[1]//ul[1]//li[8]//a[1]")
    public WebElement cnnStyleNews;


    public void clickCNNSearchSymbol(){
        cnnSearchSymbol.click();
    }

    public void clickCNNSearchBar(){
        cnnSearchBar.click();
    }

    public void CNNEditionList(){
        cnnEditionButton.click();
    }

    public void clickCNNUSEdition(){
        cnnUSEdition.click();
    }

    public void clickCNNIntEdition(){
        cnnInternationalEdition.click();
    }

    public void clickCNNArabEdition(){
        cnnArabicEdition.click();
    }

    public void clickCNNSpanEdition(){
        cnnSpanishEdition.click();
    }

    public void CNNEZipCode(){
        cnnZipCodeSearch.click();
    }

    public void cnnSetLocation(){
        cnnSetLocation.click();
    }

    public void usCNNEdition(){
        cnnUSNews.click();
    }

    public void worldCNNEdition(){
        cnnWorldNews.click();
    }

    public void styleCNNEdition(){
        cnnStyleNews.click();
    }

    public void clickCnnUS() throws InterruptedException, IOException {
        setUp(true, "", "windows", "", "chrome", "", "https://www.cnn.com");
        cnnUSNews.click();
        sleepFor(2);
    }

    public void clickCnnInt() throws InterruptedException, IOException {
        setUp(true, "", "windows", "", "chrome", "", "https://www.cnn.com");
        cnnWorldNews.click();
        sleepFor(2);
    }

    public void clickCnnSpan() throws InterruptedException, IOException {
        setUp(true, "", "windows", "", "chrome", "", "https://www.cnn.com");
        CNNEditionList();
        sleepFor(2);
        clickCNNSpanEdition();
        sleepFor(1);
    }

    public void clickCnnUnited() throws InterruptedException, IOException {
        setUp(true, "", "windows", "", "chrome", "", "https://www.cnn.com");
        CNNEditionList();
        sleepFor(2);
        clickCNNUSEdition();
        sleepFor(1);
    }

    public void clickCnnArab() throws InterruptedException, IOException {
        setUp(true, "", "windows", "", "chrome", "", "https://www.cnn.com");
        CNNEditionList();
        sleepFor(2);
        clickCNNArabEdition();
        sleepFor(1);
    }

    public void clickCnnSpanish() throws InterruptedException, IOException {
        setUp(true, "", "windows", "", "chrome", "", "https://www.cnn.com");
        CNNEditionList();
        sleepFor(2);
        clickCNNArabEdition();
        sleepFor(1);
    }

    public void enterZipCode(String key) {
        cnnZipCodeSearch.sendKeys(key);
    }


}
